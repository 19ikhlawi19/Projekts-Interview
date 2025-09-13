package info.scce.cinco.product.fp.pcconfig.pc.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostCreateHook;
import info.scce.cinco.fp.compdsl.componentDsl.Drive;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class DriveNodePostCreate extends CincoPostCreateHook<DriveNode> {
  /**
   * Post Create Hook for DriveNode.
   * Resize and calculate the position of [node] in the DriveContainer
   * @param drive_node: new created DriveNode
   * @throws IllegalArgumentException when no Main board model is installed
   */
  @Override
  public void postCreate(final DriveNode drive_node) {
    final EList<MainboardNode> mainBoardNodes = drive_node.getContainer().getContainer().getPCMainboardContainers().get(0).getMainboardNodes();
    boolean _isEmpty = mainBoardNodes.isEmpty();
    if (_isEmpty) {
      throw new IllegalArgumentException("You can not add Hard drives until you install a Main board model\n");
    }
    final MainboardContainer referencedMBContainer = mainBoardNodes.get(0).getReferencedMB().getMainboardContainers().get(0);
    final int numSATAPorts = referencedMBContainer.getNumSataPorts();
    final DriveContainer container = drive_node.getContainer();
    final int numDrives = container.getDriveNodes().size();
    int _height = container.getHeight();
    int _minus = (_height - 100);
    final int driveNodeHeight = (_minus / numSATAPorts);
    drive_node.resize(230, driveNodeHeight);
    drive_node.setY((10 + ((driveNodeHeight + 10) * (numDrives - 1))));
    drive_node.setX(10);
    this.setAttributes(drive_node);
  }
  
  /**
   * @param drive_node: set attributes of drive_node.
   */
  private void setAttributes(final DriveNode drive_node) {
    EObject _referencedDrive = drive_node.getReferencedDrive();
    final Drive referencedDrive = ((Drive) _referencedDrive);
    drive_node.setDriveName(referencedDrive.getName());
    drive_node.setDriveType(referencedDrive.getType().toString());
    drive_node.setDriveDescription(referencedDrive.getDescription());
    drive_node.setDrivePowerConsumption(referencedDrive.getPowerConsumption());
    drive_node.setDrivePrice(referencedDrive.getPrice());
  }
}
