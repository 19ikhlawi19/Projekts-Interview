package info.scce.cinco.product.fp.pcconfig.pc.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.fp.compdsl.componentDsl.Case;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class CaseContainerPostCreate extends CincoPostCreateHook<CaseContainer> {
  /**
   * Post Create Hook for CaseContainer.
   * Create PSU, Main board and Drive slots.
   * @param case_container: new created CaseContainer.
   */
  @Override
  public void postCreate(final CaseContainer case_container) {
    case_container.resize(850, 760);
    final PSUContainer psu = case_container.newPSUContainer(50, 30);
    psu.resize(770, 150);
    final PCMainboardContainer mainboardContainer = case_container.newPCMainboardContainer(50, 200);
    mainboardContainer.resize(500, 500);
    final DriveContainer driveContainer = case_container.newDriveContainer(570, 200);
    driveContainer.resize(250, 500);
    this.setAttributes(case_container);
  }
  
  /**
   * @param drive_node: set attributes of drive_node.
   */
  private void setAttributes(final CaseContainer case_container) {
    EObject _referencedCase = case_container.getReferencedCase();
    final Case referencedCase = ((Case) _referencedCase);
    case_container.setCaseName(referencedCase.getName());
    case_container.setCaseFormFactor(referencedCase.getFormFactor().toString());
    case_container.setCaseInternalSlots(referencedCase.getInternalSlots());
    case_container.setCaseExternalSlots(referencedCase.getExternalSlots());
    case_container.setCasePrice(referencedCase.getPrice());
  }
}
