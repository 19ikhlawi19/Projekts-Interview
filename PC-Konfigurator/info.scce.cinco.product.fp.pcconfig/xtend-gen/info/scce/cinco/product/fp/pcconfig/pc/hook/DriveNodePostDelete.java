package info.scce.cinco.product.fp.pcconfig.pc.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostDeleteHook;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class DriveNodePostDelete extends CincoPostDeleteHook<DriveNode> {
  @Override
  public Runnable getPostDeleteFunction(final DriveNode node) {
    final DriveContainer driveContainer = node.getContainer();
    final int driveNodeHeight = node.getHeight();
    final Runnable _function = () -> {
      int counter = 0;
      EList<DriveNode> _driveNodes = driveContainer.getDriveNodes();
      for (final DriveNode driveNode : _driveNodes) {
        {
          driveNode.resize(230, driveNodeHeight);
          driveNode.setX(10);
          driveNode.setY((10 + ((driveNodeHeight + 10) * counter)));
          counter = (counter + 1);
        }
      }
    };
    return _function;
  }
}
