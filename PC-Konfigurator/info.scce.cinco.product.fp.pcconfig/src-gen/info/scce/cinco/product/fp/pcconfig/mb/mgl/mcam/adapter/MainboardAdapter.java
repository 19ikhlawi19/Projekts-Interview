package info.scce.cinco.product.fp.pcconfig.mb.mgl.mcam.adapter;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.graphiti.mm.pictograms.PictogramsPackage;

import de.jabc.cinco.meta.plugin.mcam.runtime.core._CincoAdapter;
import graphmodel.ModelElement;
import graphmodel.IdentifiableElement;
import graphmodel.internal.InternalGraphModel;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;

public class MainboardAdapter extends _CincoAdapter<MainboardId,Mainboard> {

	
	@Override
	protected MainboardId createId(IdentifiableElement obj) {
		return new MainboardId(obj);
	}

	@Override
	public String getLabel(ModelElement element) {
		return null;
	}

	@Override
	public void readModel(java.io.File arg0) {
		modelName = arg0.getName();
		this.path = arg0.getPath();

		// Initialize the model
		MainboardPackage.eINSTANCE.eClass();
		PictogramsPackage.eINSTANCE.eClass();

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		resource = resSet.getResource(
				URI.createFileURI(arg0.getAbsolutePath()), true);
	}

}
