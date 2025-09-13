package info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.cli;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.adapter.PCId;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.adapter.PCAdapter;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;

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

public class PCExecution extends de.jabc.cinco.meta.plugin.mcam.runtime.core.FrameworkExecution<PCId, PC, PCAdapter> {

	@Override
	public PCAdapter initApiAdapter(File file) {
		PCAdapter model = new PCAdapter();
		model.readModel(file);
		return model;
	}

	@Override
	public PCAdapter initApiAdapterFromResource(Resource resource, File file) {
		PCAdapter model = new PCAdapter();
		model.readModel(resource, file);
		return model;
	}

	@Override
	public ChangeModuleRegistry<PCId, PCAdapter> getChangeModuleRegistry() {
		ChangeModuleRegistry<PCId, PCAdapter> reg = new ChangeModuleRegistryClassTreeBased<>();
		

		return reg;
	}

	@Override
	public CheckModuleRegistry<PCId, PCAdapter> getCheckModuleRegistry() {
		CheckModuleRegistry<PCId, PCAdapter> reg = new CheckModuleRegistryListBased<>();

		reg.add(new info.scce.cinco.product.fp.pcconfig.pc.check.PowerConsumptionCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.pc.check.NumberOfDriveNodesCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.pc.check.FormFactorCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks.PCContainmentCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks.PCIncomingCheck());
		reg.add(new info.scce.cinco.product.fp.pcconfig.pc.mgl.mcam.modules.checks.PCOutgoingCheck());

		return reg;
	}

	@Override
	public MergeProcess<PCId, PCAdapter> createMergePhase(
			CompareProcess<PCId, PCAdapter> localCompare,
			CompareProcess<PCId, PCAdapter> remoteCompare,
			PCAdapter mergeModel) {

		MergeProcess<PCId, PCAdapter> mergeProcess = new MergeProcess<>(
				mergeModel, localCompare, remoteCompare);
		mergeProcess.setMergeStrategy(new _CincoMergeStrategy<PCId, PCAdapter>());
		return mergeProcess;
	}

}
