package info.scce.cinco.product.fp.pcconfig.mb.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.fp.compdsl.componentDsl.Gpu;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class GPUNodePostCreate extends CincoPostCreateHook<GPUNode> {
  @Override
  public void postCreate(final GPUNode gpu_node) {
    gpu_node.setX(5);
    gpu_node.setY(5);
    int _width = gpu_node.getContainer().getWidth();
    int _minus = (_width - 10);
    int _height = gpu_node.getContainer().getHeight();
    int _minus_1 = (_height - 10);
    gpu_node.resize(_minus, _minus_1);
    this.setAttributes(gpu_node);
  }
  
  /**
   * @param gpu_node: set attributes of gpu_node.
   */
  private void setAttributes(final GPUNode gpu_node) {
    EObject _referencedGPU = gpu_node.getReferencedGPU();
    final Gpu gpu = ((Gpu) _referencedGPU);
    gpu_node.setName(gpu.getName());
    gpu_node.setChip(gpu.getChip());
    gpu_node.setMemory(gpu.getMemory());
    gpu_node.setPowerConsumption(gpu.getPowerConsumption());
    gpu_node.setPrice(gpu.getPrice());
  }
}
