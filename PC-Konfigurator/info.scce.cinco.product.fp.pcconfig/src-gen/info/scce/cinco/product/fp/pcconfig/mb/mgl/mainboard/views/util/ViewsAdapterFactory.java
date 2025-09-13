/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.util;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage
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
			public Adapter caseMainboardContainerView(MainboardContainerView object) {
				return createMainboardContainerViewAdapter();
			}
			@Override
			public Adapter caseCPUSlotView(CPUSlotView object) {
				return createCPUSlotViewAdapter();
			}
			@Override
			public Adapter caseRAMSlotView(RAMSlotView object) {
				return createRAMSlotViewAdapter();
			}
			@Override
			public Adapter caseGPUSlotView(GPUSlotView object) {
				return createGPUSlotViewAdapter();
			}
			@Override
			public Adapter caseCPUNodeView(CPUNodeView object) {
				return createCPUNodeViewAdapter();
			}
			@Override
			public Adapter caseRAMNodeView(RAMNodeView object) {
				return createRAMNodeViewAdapter();
			}
			@Override
			public Adapter caseGPUNodeView(GPUNodeView object) {
				return createGPUNodeViewAdapter();
			}
			@Override
			public Adapter caseMainboardView(MainboardView object) {
				return createMainboardViewAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView <em>Mainboard Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView
	 * @generated
	 */
	public Adapter createMainboardContainerViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView <em>CPU Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView
	 * @generated
	 */
	public Adapter createCPUSlotViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView <em>RAM Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView
	 * @generated
	 */
	public Adapter createRAMSlotViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUSlotView <em>GPU Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUSlotView
	 * @generated
	 */
	public Adapter createGPUSlotViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView <em>CPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView
	 * @generated
	 */
	public Adapter createCPUNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView <em>RAM Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView
	 * @generated
	 */
	public Adapter createRAMNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView <em>GPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView
	 * @generated
	 */
	public Adapter createGPUNodeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView <em>Mainboard View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView
	 * @generated
	 */
	public Adapter createMainboardViewAdapter() {
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
