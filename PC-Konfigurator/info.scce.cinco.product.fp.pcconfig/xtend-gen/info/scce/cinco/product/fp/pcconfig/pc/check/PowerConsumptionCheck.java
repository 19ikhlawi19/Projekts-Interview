package info.scce.cinco.product.fp.pcconfig.pc.check;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks.PCCheck;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class PowerConsumptionCheck extends PCCheck {
  @Override
  public void check(final PC model) {
    final EList<CaseContainer> caseContianers = model.getCaseContainers();
    for (final CaseContainer caseContainer : caseContianers) {
      {
        final PSUContainer psuContainer = caseContainer.getPSUContainers().get(0);
        EList<PSUNode> _pSUNodes = psuContainer.getPSUNodes();
        for (final PSUNode psuNode : _pSUNodes) {
          {
            final int power = psuNode.getPsuPower();
            final int compnentsPowerConsumption = this.calculatePCPowerConsumption(caseContainer);
            final double requieredPower = (1.25 * compnentsPowerConsumption);
            if ((power < requieredPower)) {
              this.addError(psuNode, "Power of this PSU does not satisfy the power requirement for this PC");
            }
          }
        }
      }
    }
  }
  
  private int powerConsumption = 0;
  
  private int calculatePCPowerConsumption(final CaseContainer caseContainer) {
    this.powerConsumption = 0;
    final PCMainboardContainer mbContaniner = caseContainer.getPCMainboardContainers().get(0);
    EList<MainboardNode> _mainboardNodes = mbContaniner.getMainboardNodes();
    for (final MainboardNode mainBoard : _mainboardNodes) {
      {
        final Mainboard referencedMBModel = mainBoard.getReferencedMB();
        final MainboardContainer referencedMBContainer = referencedMBModel.getMainboardContainers().get(0);
        int _powerConsumption = this.powerConsumption;
        int _powerConsumption_1 = referencedMBContainer.getPowerConsumption();
        this.powerConsumption = (_powerConsumption + _powerConsumption_1);
        final Consumer<CPUNode> _function = (CPUNode it) -> {
          int _powerConsumption_2 = it.getPowerConsumption();
          int _plus = (this.powerConsumption + _powerConsumption_2);
          this.powerConsumption = _plus;
        };
        referencedMBContainer.getCPUSlots().get(0).getCPUNodes().forEach(_function);
        final Consumer<GPUNode> _function_1 = (GPUNode it) -> {
          int _powerConsumption_2 = it.getPowerConsumption();
          int _plus = (this.powerConsumption + _powerConsumption_2);
          this.powerConsumption = _plus;
        };
        referencedMBContainer.getGPUSlots().get(0).getGPUNodes().forEach(_function_1);
        final Consumer<RAMSlot> _function_2 = (RAMSlot it) -> {
          boolean _isEmpty = it.getRAMNodes().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            int _powerConsumption_2 = it.getRAMNodes().get(0).getPowerConsumption();
            int _plus = (this.powerConsumption + _powerConsumption_2);
            this.powerConsumption = _plus;
          }
        };
        referencedMBContainer.getRAMSlots().forEach(_function_2);
        final Consumer<DriveNode> _function_3 = (DriveNode it) -> {
          int _drivePowerConsumption = it.getDrivePowerConsumption();
          int _plus = (this.powerConsumption + _drivePowerConsumption);
          this.powerConsumption = _plus;
        };
        caseContainer.getDriveContainers().get(0).getDriveNodes().forEach(_function_3);
      }
    }
    return this.powerConsumption;
  }
}
