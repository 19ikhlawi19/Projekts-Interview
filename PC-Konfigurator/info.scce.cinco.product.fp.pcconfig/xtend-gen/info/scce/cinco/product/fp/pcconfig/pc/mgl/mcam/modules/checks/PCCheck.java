package info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks;

import de.jabc.cinco.meta.plugin.mcam.runtime.core.CincoCheckModule;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.adapter.PCAdapter;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.adapter.PCId;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;

@SuppressWarnings("all")
public abstract class PCCheck extends CincoCheckModule<PCId, PC, PCAdapter> {
  @Override
  public abstract void check(final PC model);
}
