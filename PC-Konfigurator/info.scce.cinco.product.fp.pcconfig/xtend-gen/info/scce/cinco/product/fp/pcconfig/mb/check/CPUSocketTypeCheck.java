package info.scce.cinco.product.fp.pcconfig.mb.check;

import info.scce.cinco.fp.compdsl.componentDsl.Cpu;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks.MainboardCheck;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class CPUSocketTypeCheck extends MainboardCheck {
  @Override
  public void check(final Mainboard model) {
    EList<MainboardContainer> _mainboardContainers = model.getMainboardContainers();
    for (final MainboardContainer mbcontainer : _mainboardContainers) {
      {
        final String socket = mbcontainer.getCPUSlots().get(0).getSocket();
        EList<CPUNode> _cPUNodes = mbcontainer.getCPUSlots().get(0).getCPUNodes();
        for (final CPUNode cpu : _cPUNodes) {
          {
            EObject _referencedCPU = cpu.getReferencedCPU();
            final Cpu referencedCPU = ((Cpu) _referencedCPU);
            boolean _equals = referencedCPU.getSocket().toString().equals(socket);
            boolean _not = (!_equals);
            if (_not) {
              this.addError(cpu, "The socket does not pass to this CPU");
            }
          }
        }
      }
    }
  }
}
