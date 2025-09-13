/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.util;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage
 * @generated
 */
public class ViewsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsSwitch<Adapter> modelSwitch =
		new ViewsSwitch<Adapter>() {
			@Override
			public Adapter caseCaseContainerView(CaseContainerView object) {
				return createCaseContainerViewAdapter();
			}
			@Override
			public Adapter caseDriveContainerView(DriveContainerView object) {
				return createDriveContainerViewAdapter();
			}
			@Override
			public Adapter caseDriveNodeView(DriveNodeView object) {
				return createDriveNodeViewAdapter();
			}
			@Override
			public Adapter casePSUContainerView(PSUContainerView object) {
				return createPSUContainerViewAdapter();
			}
			@Override
			public Adapter casePSUNodeView(PSUNodeView object) {
				return createPSUNodeViewAdapter();
			}
			@Override
			public Adapter casePCMainboardContainerView(PCMainboardContainerView object) {
				return createPCMainboardContainerViewAdapter();
			}
			@Override
			public Adapter caseMainboardNodeView(MainboardNodeView object) {
				return createMainboardNodeViewAdapter();
			}
			@Override
			public Adapter casePCCPUNodeView(PCCPUNodeView object) {
				return createPCCPUNodeViewAdapter();
			}
			@Override
			public Adapter casePCGPUNodeView(PCGPUNodeView object) {
				return createPCGPUNodeViewAdapter();
			}
			@Override
			public Adapter casePCRAMNodeView(PCRAMNodeView object) {
				return createPCRAMNodeViewAdapter();
			}
			@Override
			public Adapter casePCRAMSlotView(PCRAMSlotView object) {
				return createPCRAMSlotViewAdapter();
			}
			@Override
			public Adapter casePCView(PCView object) {
				return createPCViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView <em>Case Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView
	 * @generated
	 */
	public Adapter createCaseContainerViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveContainerView <em>Drive Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveContainerView
	 * @generated
	 */
	public Adapter createDriveContainerViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView <em>Drive Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView
	 * @generated
	 */
	public Adapter createDriveNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUContainerView <em>PSU Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUContainerView
	 * @generated
	 */
	public Adapter createPSUContainerViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView <em>PSU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView
	 * @generated
	 */
	public Adapter createPSUNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCMainboardContainerView <em>PC Mainboard Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCMainboardContainerView
	 * @generated
	 */
	public Adapter createPCMainboardContainerViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView <em>Mainboard Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView
	 * @generated
	 */
	public Adapter createMainboardNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView <em>PCCPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView
	 * @generated
	 */
	public Adapter createPCCPUNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView <em>PCGPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView
	 * @generated
	 */
	public Adapter createPCGPUNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMNodeView <em>PCRAM Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMNodeView
	 * @generated
	 */
	public Adapter createPCRAMNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView <em>PCRAM Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView
	 * @generated
	 */
	public Adapter createPCRAMSlotViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView <em>PC View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView
	 * @generated
	 */
	public Adapter createPCViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ViewsAdapterFactory
