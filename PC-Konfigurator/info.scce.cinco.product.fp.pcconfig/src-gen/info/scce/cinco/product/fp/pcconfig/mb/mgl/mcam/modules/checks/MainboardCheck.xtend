package info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks;

import de.jabc.cinco.meta.plugin.mcam.runtime.core.CincoCheckModule
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.adapter.MainboardId;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.adapter.MainboardAdapter;

abstract class MainboardCheck extends CincoCheckModule<MainboardId, Mainboard, MainboardAdapter> {
	
	override check(Mainboard model)
}
