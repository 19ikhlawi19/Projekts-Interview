# main.py

import argparse
import logging
import os
import sys # Für sys.exit
import time # Zeitmessung verschoben für bessere Gruppierung

# Third-party libraries
import numpy as np # <--- HIER HINZUGEFÜGT

# Local modules
import config
import utils
import data_preparation
import image_preprocessing
# import data_augmentation # Wird intern von Dataset genutzt
import training_offline
import evaluation_offline
import inference_offline

# -----------------------------------------------------------------------------
# main.py - Steuerzentrale der OCR Pipeline
# -----------------------------------------------------------------------------
# Steuert den Ablauf: Daten vorbereiten, vorverarbeiten, Splits erstellen,
# trainieren, evaluieren, inferieren.
# Mit Character-Level Metriken und konsistenter Split-Evaluation.
# -----------------------------------------------------------------------------

# Logging zentral hier oder in training_offline.py einrichten
# Wir verwenden die Funktion aus training_offline
logger = training_offline.setup_logging()

def main():
    start_time = time.time()
    parser = argparse.ArgumentParser(description="Offline OCR-Pipeline (Wort-basiert) mit CRNN + CTC (PyTorch)")

    # Pipeline Stages
    parser.add_argument('--prepare_data', action='store_true', help="Entpackt IAM + generiert initiale Words-CSV (falls benötigt).")
    parser.add_argument('--preprocess_images', action='store_true', help="Führt Bild-Vorverarbeitung aus (Deskew etc.). ACHTUNG: Überschreibt ggf. Originalbilder oder erfordert separaten Output-Ordner.")
    parser.add_argument('--create_splits', action='store_true', help="Erstellt Train/Val/Test-Splits (z.B. 80/10/10) und speichert sie als CSV.")
    parser.add_argument('--train', action='store_true', help="Trainiert das Offline-Modell (CRNN/CTC) unter Verwendung der Splits.")
    parser.add_argument('--evaluate', action='store_true', help="Führt die finale Evaluation des besten Modells auf allen Splits (Train, Val, Test) durch.")
    parser.add_argument('--infer', type=str, default=None, metavar="IMAGE_PATH", help="Pfad zu einem Bild für eine einzelne Inferenz.")

    # Alias-Argumente für Klarheit (optional)
    parser.add_argument('--train_offline', action='store_true', help=argparse.SUPPRESS) # Alias für --train
    parser.add_argument('--evaluate_offline', action='store_true', help=argparse.SUPPRESS) # Alias für --evaluate

    # Kombinierte Aktionen (Legacy, könnten entfernt werden)
    parser.add_argument('--evaluate_splits', action='store_true', help=argparse.SUPPRESS) # Veraltet, wird durch --evaluate abgedeckt
    parser.add_argument('--compute_metrics', action='store_true', help=argparse.SUPPRESS) # Veraltet, wird durch --evaluate abgedeckt

    # Konfigurations-Überschreibungen
    parser.add_argument('--lr', type=float, default=None, help=f"Lernrate (überschreibt config: {config.LEARNING_RATE}).")
    parser.add_argument('--batch_size', type=int, default=None, help=f"Batch-Größe (überschreibt config: {config.BATCH_SIZE}).")
    parser.add_argument('--epochs', type=int, default=None, help=f"Anzahl Epochen (überschreibt config: {config.EPOCHS}).")
    parser.add_argument('--train_split', type=float, default=None, help=f"Anteil Training (überschreibt config: {config.TRAIN_SPLIT}).")
    parser.add_argument('--val_split', type=float, default=None, help=f"Anteil Validierung (überschreibt config: {config.VAL_SPLIT}).")
    parser.add_argument('--test_split', type=float, default=None, help=f"Anteil Test (überschreibt config: {config.TEST_SPLIT}).")
    parser.add_argument('--checkpoint', type=str, default=None, metavar="PATH", help="Pfad zu einem spezifischen Checkpoint (.pth) für Evaluation/Inferenz.")
    parser.add_argument('--model_version', type=str, default=None, metavar="YYYYMMDD-HHMMSS", help="Spezifische Modellversion laden/verwenden (überschreibt aktuelle Zeit).")

    args = parser.parse_args()

    # Aliase verarbeiten
    args.train = args.train or args.train_offline
    args.evaluate = args.evaluate or args.evaluate_offline or args.evaluate_splits or args.compute_metrics


    # --- Modellversion setzen ---
    # Wenn eine spezifische Version angegeben ist, überschreibe die generierte
    # und setze die Pfade neu, BEVOR etwas anderes passiert.
    if args.model_version:
        logger.info(f"Verwende spezifische Modellversion: {args.model_version}")
        config.MODEL_VERSION = args.model_version
        # Pfade neu definieren basierend auf der geladenen Version
        config.MODEL_SAVE_PATH = os.path.join(config.BASE_PATH, "models", config.MODEL_VERSION)
        config.CHECKPOINT_PATH = os.path.join(config.BASE_PATH, "checkpoints", config.MODEL_VERSION)
        config.RESULTS_PATH    = os.path.join(config.BASE_PATH, "results", config.MODEL_VERSION)
        config.METRICS_PATH    = os.path.join(config.BASE_PATH, "metrics", config.MODEL_VERSION)
        # Ordner für diese spezifische Version erstellen, falls nicht vorhanden
        for path in [config.MODEL_SAVE_PATH, config.CHECKPOINT_PATH, config.RESULTS_PATH, config.METRICS_PATH]:
             utils.create_directory(path)
        # Logging ggf. neu konfigurieren, um in den richtigen Ordner zu schreiben (komplex, lassen wir erstmal weg)
        logger.warning(f"Pfade wurden auf Version '{config.MODEL_VERSION}' gesetzt. Logdatei bleibt ggf. im zuerst generierten Pfad.")

    logger.info(f"Aktuelle Modellversion: {config.MODEL_VERSION}")
    logger.info(f"Verwende Checkpoint-Pfad: {config.CHECKPOINT_PATH}")
    logger.info(f"Verwende Ergebnis-Pfad: {config.RESULTS_PATH}")


    # --- Konfigurations-Überschreibungen ---
    config_updated = False
    if args.lr is not None: config.LEARNING_RATE = args.lr; config_updated = True
    if args.batch_size is not None: config.BATCH_SIZE = args.batch_size; config_updated = True
    if args.epochs is not None: config.EPOCHS = args.epochs; config_updated = True
    if args.train_split is not None: config.TRAIN_SPLIT = args.train_split; config_updated = True
    if args.val_split is not None: config.VAL_SPLIT = args.val_split; config_updated = True
    if args.test_split is not None: config.TEST_SPLIT = args.test_split; config_updated = True
    if config_updated:
        logger.info("Konfigurationswerte wurden durch Kommandozeilenargumente aktualisiert.")
        # Logge die neuen Werte
        logger.info(f"  LR: {config.LEARNING_RATE}, Batch: {config.BATCH_SIZE}, Epochs: {config.EPOCHS}")
        logger.info(f"  Splits: Train={config.TRAIN_SPLIT:.2f}, Val={config.VAL_SPLIT:.2f}, Test={config.TEST_SPLIT:.2f}")
        # Split-Validierung
        total_split = config.TRAIN_SPLIT + config.VAL_SPLIT + config.TEST_SPLIT
        if not np.isclose(total_split, 1.0):
             logger.warning(f"Die Summe der Split-Anteile ({total_split:.2f}) ist nicht 1.0!")


    # --- Checkpoint Handling ---
    # Wenn ein spezifischer Checkpoint übergeben wird, kopiere ihn an den erwarteten Ort
    # des "besten" Modells für die aktuelle (ggf. überschriebene) Modellversion.
    if args.checkpoint:
        if os.path.exists(args.checkpoint):
            logger.info(f"Verwende spezifischen Checkpoint: {args.checkpoint}")
            # Zielpfad für das beste Modell der aktuellen Version
            checkpoint_dest = os.path.join(config.CHECKPOINT_PATH, "best_crnn_model.pth")
            try:
                os.makedirs(config.CHECKPOINT_PATH, exist_ok=True)
                import shutil
                shutil.copy(args.checkpoint, checkpoint_dest)
                logger.info(f"Checkpoint kopiert nach {checkpoint_dest} für Evaluation/Inferenz.")
            except Exception as e:
                logger.error(f"Fehler beim Kopieren des Checkpoints von {args.checkpoint} nach {checkpoint_dest}: {e}")
                sys.exit(1) # Abbruch, da Checkpoint nicht verwendet werden kann
        else:
            logger.error(f"Angegebener Checkpoint nicht gefunden: {args.checkpoint}")
            sys.exit(1) # Abbruch, da Checkpoint fehlt


    # --- Pipeline Stages Ausführen ---
    try:
        if args.prepare_data:
            logger.info("=== Starte Datenvorbereitung ===")
            data_preparation.prepare_data()
            logger.info("=== Datenvorbereitung beendet ===")

        if args.preprocess_images:
            logger.info("=== Starte Bild-Vorverarbeitung ===")
            # WICHTIG: Diese Funktion muss angepasst werden, um Input/Output-Pfade zu verwenden!
            # Aktuell ist sie ein Platzhalter.
            logger.warning("Bild-Vorverarbeitung (preprocess_images) ist aktuell ein Platzhalter und muss konfiguriert werden!")
            # image_preprocessing.preprocess_all_datasets() # Auskommentiert, da nicht implementiert
            logger.info("=== Bild-Vorverarbeitung (Platzhalter) beendet ===")

        if args.create_splits:
            logger.info("=== Starte Erstellung der Datensplits ===")
            # Lädt die Gesamtdaten und erstellt/speichert die Splits
            full_paths, full_labels = training_offline.load_data_for_ctc(config.WORDS_CSV, config.WORDS_FOLDER)
            if full_paths:
                training_offline.create_data_splits(full_paths, full_labels)
            else:
                 logger.error(f"Keine Daten in {config.WORDS_CSV} gefunden. Splits können nicht erstellt werden.")
            logger.info("=== Erstellung der Datensplits beendet ===")

        if args.train:
            # Vor dem Training prüfen, ob Splits existieren
            if not os.path.exists(config.TRAIN_LABELS_FILE) or \
               not os.path.exists(config.VAL_LABELS_FILE) or \
               not os.path.exists(config.TEST_LABELS_FILE):
                logger.warning("Train/Val/Test-Splits nicht gefunden. Versuche, sie zu erstellen...")
                args.create_splits = True # Erzwinge Split-Erstellung
                # Erneuter Aufruf der Split-Erstellung (falls nicht schon oben passiert)
                full_paths, full_labels = training_offline.load_data_for_ctc(config.WORDS_CSV, config.WORDS_FOLDER)
                if full_paths:
                    training_offline.create_data_splits(full_paths, full_labels)
                else:
                    logger.error(f"Keine Daten in {config.WORDS_CSV} gefunden. Splits können nicht erstellt werden. Training abgebrochen.")
                    sys.exit(1)
                # Nochmal prüfen
                if not os.path.exists(config.TRAIN_LABELS_FILE):
                     logger.error("Konnte Trainings-Split auch nach Erstellung nicht finden. Training abgebrochen.")
                     sys.exit(1)

            logger.info("=== Starte Offline-Training ===")
            training_offline.train_offline_model()
            logger.info("=== Offline-Training beendet ===")

        if args.evaluate:
            logger.info("=== Starte Finale Evaluation ===")
            evaluation_offline.evaluate_offline_model()
            logger.info("=== Finale Evaluation beendet ===")

        if args.infer:
            logger.info(f"=== Starte Inferenz für Bild: {args.infer} ===")
            if not os.path.exists(args.infer):
                logger.error(f"Inferenzbild nicht gefunden: {args.infer}")
            else:
                # Stelle sicher, dass ein Modell geladen werden kann (bestes der Version oder spezifisches)
                model_path_for_infer = os.path.join(config.CHECKPOINT_PATH, "best_crnn_model.pth")
                if not os.path.exists(model_path_for_infer):
                     logger.error(f"Kein Modell unter {model_path_for_infer} für Inferenz gefunden. Bitte trainieren oder Checkpoint angeben.")
                else:
                     recognized_text = inference_offline.run_inference(args.infer, model_path_for_infer)
                     if recognized_text is not None:
                         print(f"--- Ergebnis der Inferenz ---")
                         print(f"Bild: {args.infer}")
                         print(f"Erkannt: '{recognized_text}'")
                         print(f"-----------------------------")
                         logger.info(f"Erkanntes Wort: '{recognized_text}'")
                     else:
                         logger.error("Inferenz fehlgeschlagen.")
            logger.info("=== Inferenz beendet ===")

        # Fallback, wenn keine Aktion ausgewählt wurde
        active_actions = [k for k, v in vars(args).items() if v is True and k not in ['train_offline', 'evaluate_offline', 'evaluate_splits', 'compute_metrics']]
        if not active_actions and not args.infer:
             logger.warning("Keine Aktion ausgewählt. Bitte geben Sie eine Aktion an (z.B. --train, --evaluate, --infer).")
             parser.print_help()


    except Exception as e:
        logger.critical(f"Ein unerwarteter Fehler ist aufgetreten: {e}", exc_info=True)
        sys.exit(1) # Mit Fehlercode beenden
    finally:
        end_time = time.time()
        total_duration = end_time - start_time
        logger.info(f"Gesamtlaufzeit des Skripts: {total_duration:.2f} Sekunden.")

if __name__ == "__main__":
    main()