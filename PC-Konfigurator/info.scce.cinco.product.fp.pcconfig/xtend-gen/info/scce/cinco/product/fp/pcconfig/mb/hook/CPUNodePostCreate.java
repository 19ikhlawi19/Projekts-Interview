package info.scce.cinco.product.fp.pcconfig.mb.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.fp.compdsl.componentDsl.Cpu;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class CPUNodePostCreate extends CincoPostCreateHook<CPUNode> {
  @Override
  public void postCreate(final CPUNode cpu_node) {
    cpu_node.setX(5);
    cpu_node.setY(5);
    int _width = cpu_node.getContainer().getWidth();
    int _minus = (_width - 10);
    int _height = cpu_node.getContainer().getHeight();
    int _minus_1 = (_height - 10);
    cpu_node.resize(_minus, _minus_1);
    this.setAttributes(cpu_node);
  }
  
  /**
   * @param cpu_node: set attributes of cpu_node.
   */
  private void setAttributes(final CPUNode cpu_node) {
    EObject _referencedCPU = cpu_node.getReferencedCPU();
    final Cpu cpu = ((Cpu) _referencedCPU);
    cpu_node.setName(cpu.getName());
    cpu_node.setCpuType(cpu.getType());
    cpu_node.setPowerConsumption(cpu.getPowerConsumption());
    cpu_node.setSocket(cpu.getSocket().toString());
    cpu_node.setPrice(cpu.getPrice());
  }
}
