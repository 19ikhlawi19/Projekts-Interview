package info.scce.cinco.product.fp.pcconfig.mb.check;

import com.google.common.base.Objects;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks.MainboardCheck;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RAMTypeCheck extends MainboardCheck {
  @Override
  public void check(final Mainboard model) {
    final EList<MainboardContainer> mbContainers = model.getMainboardContainers();
    for (final MainboardContainer mbContainer : mbContainers) {
      {
        final String mainboardRamType = mbContainer.getTypeMemorySlots();
        final Function1<RAMSlot, RAMNode> _function = (RAMSlot it) -> {
          RAMNode _xifexpression = null;
          boolean _isEmpty = it.getRAMNodes().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _xifexpression = it.getRAMNodes().get(0);
          } else {
            _xifexpression = null;
          }
          return _xifexpression;
        };
        final List<RAMNode> RAMs = ListExtensions.<RAMSlot, RAMNode>map(mbContainer.getRAMSlots(), _function);
        final Consumer<RAMNode> _function_1 = (RAMNode it) -> {
          if ((this._graphModelExtension.operator_notEquals(it, null) && (!Objects.equal(it.getRamType(), mainboardRamType)))) {
            this.addError(it, "This RAM has not the same RAM type of the Main-board!");
          }
        };
        RAMs.forEach(_function_1);
      }
    }
  }
}
