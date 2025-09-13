package info.scce.cinco.product.fp.pcconfig.pc.hook;

import de.jabc.cinco.meta.runtime.hook.CincoPostDeleteHook;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MainboardNodePostDelete extends CincoPostDeleteHook<MainboardNode> {
  @Override
  public Runnable getPostDeleteFunction(final MainboardNode mainboardNode) {
    final DriveContainer driveContainer = mainboardNode.getContainer().getContainer().getDriveContainers().get(0);
    final Runnable _function = () -> {
      EList<DriveNode> _driveNodes = driveContainer.getDriveNodes();
      for (final DriveNode driveNode : _driveNodes) {
        driveNode.delete();
      }
    };
    return _function;
  }
}
