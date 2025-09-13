package info.scce.cinco.product.fp.pcconfig.pc.check;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks.PCCheck;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class NumberOfDriveNodesCheck extends PCCheck {
  @Override
  public void check(final PC model) {
    final EList<CaseContainer> caseContianers = model.getCaseContainers();
    for (final CaseContainer caseContainer : caseContianers) {
      {
        final PCMainboardContainer mbContaniner = caseContainer.getPCMainboardContainers().get(0);
        final int numOfInstalledDrives = caseContainer.getDriveContainers().get(0).getDriveNodes().size();
        EList<MainboardNode> _mainboardNodes = mbContaniner.getMainboardNodes();
        for (final MainboardNode mainBoard : _mainboardNodes) {
          {
            final Mainboard referencedMBModel = mainBoard.getReferencedMB();
            final MainboardContainer referencedMBContainer = referencedMBModel.getMainboardContainers().get(0);
            final int numSATASLots = referencedMBContainer.getNumSataPorts();
            if ((numOfInstalledDrives > numSATASLots)) {
              final DriveContainer driveContainer = caseContainer.getDriveContainers().get(0);
              this.addError(driveContainer, ("Maximum number of SATA Slots is " + Integer.valueOf(numSATASLots)));
            }
          }
        }
      }
    }
  }
}
