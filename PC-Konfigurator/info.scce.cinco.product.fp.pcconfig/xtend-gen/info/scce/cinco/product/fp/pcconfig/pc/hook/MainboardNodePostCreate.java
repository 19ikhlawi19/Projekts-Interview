package info.scce.cinco.product.fp.pcconfig.pc.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class MainboardNodePostCreate extends CincoPostCreateHook<MainboardNode> {
  /**
   * Used to know if there is at least one RAM installed on the Main board model
   */
  private boolean containRams;
  
  /**
   * Post Create Hook.
   * checks if the referenced Main board Graph Model contains CPU, GPU and at least one RAM.
   * It creates then a CPU, GPU and RAM nodes and add them to the [MainboardNode] in the PC Graph Model.
   * 
   * @param mainboardNode: new created MainboardNode in the PC Model
   * @throws IllegalArgumentException when the chosen Main board model does not contain
   *  a CPU or GPU or at least on RAM
   */
  @Override
  public void postCreate(final MainboardNode mainboardNode) {
    final EList<MainboardContainer> referencedMBContainers = mainboardNode.getReferencedMB().getMainboardContainers();
    boolean _isEmpty = referencedMBContainers.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final CPUSlot cpuSlot = referencedMBContainers.get(0).getCPUSlots().get(0);
      final GPUSlot gpuSlot = referencedMBContainers.get(0).getGPUSlots().get(0);
      final EList<RAMSlot> ramSlots = referencedMBContainers.get(0).getRAMSlots();
      this.containRams = false;
      final Function1<RAMSlot, Boolean> _function = (RAMSlot it) -> {
        boolean _isEmpty_1 = it.getRAMNodes().isEmpty();
        return Boolean.valueOf((!_isEmpty_1));
      };
      final List<Boolean> rams = ListExtensions.<RAMSlot, Boolean>map(ramSlots, _function);
      final Consumer<Boolean> _function_1 = (Boolean it) -> {
        if ((it).booleanValue()) {
          this.containRams = true;
        }
      };
      rams.forEach(_function_1);
      if (((cpuSlot.getCPUNodes().isEmpty() || gpuSlot.getGPUNodes().isEmpty()) || (!this.containRams))) {
        throw new IllegalArgumentException("Please finish Modeling the Main board.\n Install CPU, GPU and RAMs");
      }
      mainboardNode.setX(5);
      mainboardNode.setY(5);
      mainboardNode.resize(490, 490);
      mainboardNode.setName(referencedMBContainers.get(0).getName());
      this.changeLyaout(mainboardNode);
      this.createComponentNodes(mainboardNode, referencedMBContainers.get(0));
      return;
    }
    throw new IllegalArgumentException("Please finish Modeling the Main board.");
  }
  
  private void changeLyaout(final MainboardNode mainboardNode) {
    final MainboardContainer referencedMBContainer = mainboardNode.getReferencedMB().getMainboardContainers().get(0);
    final int numSATAPorts = referencedMBContainer.getNumSataPorts();
    final DriveContainer DriveContainer = mainboardNode.getContainer().getContainer().getDriveContainers().get(0);
    final PSUContainer PSUContainer = mainboardNode.getContainer().getContainer().getPSUContainers().get(0);
    if ((numSATAPorts < 5)) {
      PSUContainer.setX(50);
      PSUContainer.setY(30);
      PSUContainer.resize(770, 150);
      DriveContainer.setX(570);
      DriveContainer.setY(200);
      DriveContainer.resize(250, 500);
    } else {
      PSUContainer.setX(50);
      PSUContainer.setY(30);
      PSUContainer.resize(500, 150);
      DriveContainer.resize(250, 670);
      DriveContainer.setX(570);
      DriveContainer.setY(30);
    }
    EList<PSUNode> _pSUNodes = PSUContainer.getPSUNodes();
    for (final PSUNode PSUNode : _pSUNodes) {
      int _width = PSUContainer.getWidth();
      int _minus = (_width - 20);
      int _height = PSUContainer.getHeight();
      int _minus_1 = (_height - 20);
      PSUNode.resize(_minus, _minus_1);
    }
  }
  
  /**
   * Create Main board components as in the referenced Main board model. CPU,GPU,Rams
   * @param mainboardNode: is a container in the PC Model.
   * @param referencedMainboardContainer: refers to the Main board container in the Main board model.
   */
  private void createComponentNodes(final MainboardNode mainboardNode, final MainboardContainer referencedMainboardContainer) {
    final CPUSlot referencedCPUSlot = referencedMainboardContainer.getCPUSlots().get(0);
    final PCCPUNode cpuNode = mainboardNode.newPCCPUNode(referencedCPUSlot.getX(), referencedCPUSlot.getY());
    cpuNode.resize(referencedCPUSlot.getWidth(), referencedCPUSlot.getHeight());
    cpuNode.setName(referencedCPUSlot.getCPUNodes().get(0).getName());
    final GPUSlot referencedGPUSlot = referencedMainboardContainer.getGPUSlots().get(0);
    final PCGPUNode gpuNode = mainboardNode.newPCGPUNode(referencedGPUSlot.getX(), referencedGPUSlot.getY());
    gpuNode.resize(referencedGPUSlot.getWidth(), referencedGPUSlot.getHeight());
    gpuNode.setName(referencedGPUSlot.getGPUNodes().get(0).getName());
    final EList<RAMSlot> referencedRAMSlots = referencedMainboardContainer.getRAMSlots();
    final Function1<RAMSlot, RAMNode> _function = (RAMSlot it) -> {
      RAMNode _xifexpression = null;
      boolean _isEmpty = it.getRAMNodes().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _xifexpression = it.getRAMNodes().get(0);
      }
      return _xifexpression;
    };
    final List<RAMNode> referencedRAMs = ListExtensions.<RAMSlot, RAMNode>map(referencedRAMSlots, _function);
    int index = 0;
    for (final RAMNode referencedRAM : referencedRAMs) {
      {
        final RAMSlot referencedRAMSlot = referencedRAMSlots.get(index);
        boolean _isEmpty = referencedRAMSlot.getRAMNodes().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          final PCRAMNode ramNode = mainboardNode.newPCRAMNode(referencedRAMSlot.getX(), referencedRAMSlot.getY());
          ramNode.resize(referencedRAMSlot.getWidth(), referencedRAMSlot.getHeight());
        } else {
          final PCRAMSlot emptyRAMSlot = mainboardNode.newPCRAMSlot(referencedRAMSlot.getX(), referencedRAMSlot.getY());
          emptyRAMSlot.resize(referencedRAMSlot.getWidth(), referencedRAMSlot.getHeight());
          emptyRAMSlot.setSlotType(referencedMainboardContainer.getTypeMemorySlots());
        }
        index = (index + 1);
      }
    }
  }
}
