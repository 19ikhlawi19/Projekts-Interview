package info.scce.cinco.product.fp.pcconfig.pc.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.fp.compdsl.componentDsl.PowerSupply;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class PSUNodePostCreate extends CincoPostCreateHook<PSUNode> {
  /**
   * Post Create Hook for PSUNodes.
   * change position of [node] and resize it to fill the container
   * @param psuNode: created PSUNode
   */
  @Override
  public void postCreate(final PSUNode psu_node) {
    psu_node.setX(10);
    psu_node.setY(10);
    int _width = psu_node.getContainer().getWidth();
    int _minus = (_width - 20);
    int _height = psu_node.getContainer().getHeight();
    int _minus_1 = (_height - 20);
    psu_node.resize(_minus, _minus_1);
    this.setAttributes(psu_node);
  }
  
  /**
   * @param psu_node: set attributes of psu_node.
   */
  private void setAttributes(final PSUNode psu_node) {
    EObject _referencedPSU = psu_node.getReferencedPSU();
    final PowerSupply referencedPSU = ((PowerSupply) _referencedPSU);
    psu_node.setPsuName(referencedPSU.getName());
    psu_node.setPsuPower(referencedPSU.getPower());
    psu_node.setPsuPrice(referencedPSU.getPrice());
  }
}
