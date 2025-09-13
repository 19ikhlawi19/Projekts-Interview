package info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.cli;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.adapter.MainboardId;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.adapter.MainboardAdapter;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;

import info.scce.mcam.framework.processes.CheckProcess;
import info.scce.mcam.framework.processes.CompareProcess;
import info.scce.mcam.framework.processes.MergeProcess;
import info.scce.mcam.framework.registry.change.ChangeModuleRegistry;
import info.scce.mcam.framework.registry.change.ChangeModuleRegistryClassTreeBased;
import info.scce.mcam.framework.registry.check.CheckModuleRegistry;
import info.scce.mcam.framework.registry.check.CheckModuleRegistryListBased;

import java.io.File;
import org.eclipse.emf.ecore.resource.Resource;

import de.jabc.cinco.meta.plugin.mcam.runtime.core._CincoMergeStrategy;

public class MainboardExecution extends de.jabc.cinco.meta.plugin.mcam.runtime.core.FrameworkExecution<MainboardId, Mainboard, MainboardAdapter> {

	@Override
	public MainboardAdapter initApiAdapter(File file) {
		MainboardAdapter model = new MainboardAdapter();
		model.readModel(file);
		return model;
	}

	@Override
	public MainboardAdapter initApiAdapterFromResource(Resource resource, File file) {
		MainboardAdapter model = new MainboardAdapter();
		model.readModel(resource, file);
		return model;
	}

	@Override
	public ChangeModuleRegistry<MainboardId, MainboardAdapter> getChangeModuleRegistry() {
		ChangeModuleRegistry<MainboardId, MainboardAdapter> reg = new ChangeModuleRegistryClassTreeBased<>();
		

		return reg;
	}

	@Override
	public CheckModuleRegistry<MainboardId, MainboardAdapter> getCheckModuleRegistry() {
		CheckModuleRegistry<MainboardId, MainboardAdapter> reg = new CheckModuleRegistryListBased<>();

		reg.add(new info.scce.cinco.product.fp.pcconfig.mb.check.CPUSocketTypeCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.mb.check.RAMTypeCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks.MainboardContainmentCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks.MainboardIncomingCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.modules.checks.MainboardOutgoingCheck());

		return reg;
	}

	@Override
	public MergeProcess<MainboardId, MainboardAdapter> createMergePhase(
			CompareProcess<MainboardId, MainboardAdapter> localCompare,
			CompareProcess<MainboardId, MainboardAdapter> remoteCompare,
			MainboardAdapter mergeModel) {

		MergeProcess<MainboardId, MainboardAdapter> mergeProcess = new MergeProcess<>(
				mergeModel, localCompare, remoteCompare);
		mergeProcess.setMergeStrategy(new _CincoMergeStrategy<MainboardId, MainboardAdapter>());
		return mergeProcess;
	}

}
