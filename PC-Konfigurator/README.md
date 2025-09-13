PC-Konfigurator 🖥️

Ein Eclipse-Plugin, um PCs visuell zu konfigurieren und automatisch auf Kompatibilität zu prüfen. Das Projekt entstand im Rahmen einer Uni-Arbeit mit dem Cinco-Framework.
Kernfunktionen

    🖥️ Visuell bauen: Komponenten einfach per Drag & Drop zusammenziehen.

    ✅ Automatische Prüfung: Das Tool warnt dich sofort, wenn Teile nicht zusammenpassen (z.B. falscher CPU-Sockel).

    📄 Export als HTML: Erstelle eine übersichtliche Zusammenfassung deiner PC-Konfiguration mit allen Teilen und Preisen.

Wie funktioniert's?

    Komponenten definieren: In einer einfachen Textdatei (.comp) legst du fest, welche Hardware (CPU, Mainboard etc.) zur Auswahl steht.

    Grafisch zusammenbauen: In einem visuellen Editor ziehst du die Komponenten per Drag & Drop zusammen, um deinen PC zu erstellen.

Einrichtung

Voraussetzungen: Eclipse IDE, Java 11+, Xtext Plugin.

    Projekt klonen und in Eclipse als "Existing Project" importieren.

    Im Projekt info.scce.cinco.fp.compdsl die Datei ComponentDsl.xtext rechtsklicken und Run As > Generate Xtext Artifacts ausführen.

    Das war's! Jetzt kannst du loslegen.

Kurzanleitung

    Neues Projekt erstellen: File > New > Other > Cinco > New Cinco Project.

    Komponenten anlegen: Erstelle eine .comp-Datei. Du kannst den eingebauten Generator nutzen, um sie mit Beispielen zu füllen (Rechtsklick auf die Datei → Component Generator).

    PC bauen: Erstelle eine .pc-Datei und ziehe Gehäuse, Mainboard und die restlichen Komponenten aus der Palette hinein. Fehler werden dir direkt angezeigt.