package info.scce.cinco.product.fp.pcconfig.mb.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.fp.compdsl.componentDsl.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class MainboardContainerPostCreate extends CincoPostCreateHook<MainboardContainer> {
  @Override
  public void postCreate(final MainboardContainer mainboard_container) {
    final CPUSlot cpuSlot = mainboard_container.newCPUSlot(20, 20);
    cpuSlot.resize(200, 200);
    final GPUSlot gpuSlot = mainboard_container.newGPUSlot(20, 240);
    gpuSlot.resize(200, 200);
    EObject _referencedMB = mainboard_container.getReferencedMB();
    final Mainboard referencedMB = ((Mainboard) _referencedMB);
    cpuSlot.setSocket(referencedMB.getSocket().toString());
    this.setAttributes(mainboard_container);
    final int numMemorySlots = referencedMB.getNumMemorySlots();
    for (int i = 1; (i <= numMemorySlots); i++) {
      {
        final RAMSlot ramSlot = mainboard_container.newRAMSlot((240 + (60 * (i - 1))), 20);
        ramSlot.resize(50, 420);
        ramSlot.setRamType(referencedMB.getTypeMemorySlots().toString());
      }
    }
    if ((numMemorySlots == 2)) {
      mainboard_container.resize(370, 480);
    } else {
      mainboard_container.resize(490, 480);
    }
  }
  
  /**
   * @param mainboard_container: set attributes of mainboard_container.
   */
  private void setAttributes(final MainboardContainer mainboard_container) {
    EObject _referencedMB = mainboard_container.getReferencedMB();
    final Mainboard referencedMB = ((Mainboard) _referencedMB);
    mainboard_container.setName(referencedMB.getName());
    mainboard_container.setSocket(referencedMB.getSocket().toString());
    mainboard_container.setChipset(referencedMB.getChipset());
    mainboard_container.setTypeMemorySlots(referencedMB.getTypeMemorySlots().toString());
    mainboard_container.setNumMemorySlots(referencedMB.getNumMemorySlots());
    mainboard_container.setNumPCIe16Slots(referencedMB.getNumPCIe16Slots());
    mainboard_container.setNumSataPorts(referencedMB.getNumSataPorts());
    mainboard_container.setPowerConsumption(referencedMB.getPowerConsumption());
    mainboard_container.setFormFactor(referencedMB.getFormFactor().toString());
    mainboard_container.setPrice(referencedMB.getPrice());
  }
}
