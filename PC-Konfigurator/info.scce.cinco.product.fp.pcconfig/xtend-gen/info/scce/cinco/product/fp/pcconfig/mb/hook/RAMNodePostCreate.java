package info.scce.cinco.product.fp.pcconfig.mb.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.fp.compdsl.componentDsl.Ram;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class RAMNodePostCreate extends CincoPostCreateHook<RAMNode> {
  @Override
  public void postCreate(final RAMNode ram_node) {
    ram_node.setX(3);
    ram_node.setY(3);
    int _width = ram_node.getContainer().getWidth();
    int _minus = (_width - 6);
    int _height = ram_node.getContainer().getHeight();
    int _minus_1 = (_height - 6);
    ram_node.resize(_minus, _minus_1);
    this.setAttributes(ram_node);
  }
  
  /**
   * @param ram_node: set attributes of ram_node.
   */
  private void setAttributes(final RAMNode ram_node) {
    EObject _referencedRAM = ram_node.getReferencedRAM();
    final Ram ram = ((Ram) _referencedRAM);
    ram_node.setName(ram.getName());
    ram_node.setRamType(ram.getType().toString());
    ram_node.setCapacity(ram.getCapacity());
    ram_node.setPowerConsumption(ram.getPowerConsumption());
    ram_node.setPrice(ram.getPrice());
  }
}
