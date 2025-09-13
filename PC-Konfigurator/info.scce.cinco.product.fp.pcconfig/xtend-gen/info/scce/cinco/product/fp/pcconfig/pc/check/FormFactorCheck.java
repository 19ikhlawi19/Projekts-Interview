package info.scce.cinco.product.fp.pcconfig.pc.check;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks.PCCheck;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class FormFactorCheck extends PCCheck {
  @Override
  public void check(final PC model) {
    final EList<CaseContainer> caseContianers = model.getCaseContainers();
    for (final CaseContainer caseContainer : caseContianers) {
      {
        final String caseContainerFormFactor = caseContainer.getCaseFormFactor();
        final PCMainboardContainer mbContaniner = caseContainer.getPCMainboardContainers().get(0);
        final Consumer<MainboardNode> _function = (MainboardNode it) -> {
          final Mainboard referencedMBModel = it.getReferencedMB();
          final MainboardContainer referencedMBContainer = referencedMBModel.getMainboardContainers().get(0);
          final String mainBoardFormFactor = referencedMBContainer.getFormFactor();
          boolean _equals = caseContainerFormFactor.equals(mainBoardFormFactor);
          boolean _not = (!_equals);
          if (_not) {
            this.addError(it, "Main board size does not pass to the case size!");
          }
        };
        mbContaniner.getMainboardNodes().forEach(_function);
      }
    }
  }
}
