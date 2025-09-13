/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage
 * @generated
 */
public class InternalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
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
	protected InternalSwitch<Adapter> modelSwitch =
		new InternalSwitch<Adapter>() {
			@Override
			public Adapter caseInternalMainboardContainer(InternalMainboardContainer object) {
				return createInternalMainboardContainerAdapter();
			}
			@Override
			public Adapter caseInternalCPUSlot(InternalCPUSlot object) {
				return createInternalCPUSlotAdapter();
			}
			@Override
			public Adapter caseInternalRAMSlot(InternalRAMSlot object) {
				return createInternalRAMSlotAdapter();
			}
			@Override
			public Adapter caseInternalGPUSlot(InternalGPUSlot object) {
				return createInternalGPUSlotAdapter();
			}
			@Override
			public Adapter caseInternalCPUNode(InternalCPUNode object) {
				return createInternalCPUNodeAdapter();
			}
			@Override
			public Adapter caseInternalRAMNode(InternalRAMNode object) {
				return createInternalRAMNodeAdapter();
			}
			@Override
			public Adapter caseInternalGPUNode(InternalGPUNode object) {
				return createInternalGPUNodeAdapter();
			}
			@Override
			public Adapter caseInternalMainboard(InternalMainboard object) {
				return createInternalMainboardAdapter();
			}
			@Override
			public Adapter caseInternalIdentifiableElement(InternalIdentifiableElement object) {
				return createInternalIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseInternalModelElement(InternalModelElement object) {
				return createInternalModelElementAdapter();
			}
			@Override
			public Adapter caseInternalNode(InternalNode object) {
				return createInternalNodeAdapter();
			}
			@Override
			public Adapter caseInternalModelElementContainer(InternalModelElementContainer object) {
				return createInternalModelElementContainerAdapter();
			}
			@Override
			public Adapter caseInternalContainer(InternalContainer object) {
				return createInternalContainerAdapter();
			}
			@Override
			public Adapter caseInternalGraphModel(InternalGraphModel object) {
				return createInternalGraphModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboardContainer <em>Mainboard Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboardContainer
	 * @generated
	 */
	public Adapter createInternalMainboardContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUSlot <em>CPU Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUSlot
	 * @generated
	 */
	public Adapter createInternalCPUSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMSlot <em>RAM Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMSlot
	 * @generated
	 */
	public Adapter createInternalRAMSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUSlot <em>GPU Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUSlot
	 * @generated
	 */
	public Adapter createInternalGPUSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode <em>CPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode
	 * @generated
	 */
	public Adapter createInternalCPUNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode <em>RAM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode
	 * @generated
	 */
	public Adapter createInternalRAMNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode <em>GPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode
	 * @generated
	 */
	public Adapter createInternalGPUNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboard
	 * @generated
	 */
	public Adapter createInternalMainboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalIdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalIdentifiableElement
	 * @generated
	 */
	public Adapter createInternalIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElement
	 * @generated
	 */
	public Adapter createInternalModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalNode
	 * @generated
	 */
	public Adapter createInternalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalModelElementContainer <em>Model Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalModelElementContainer
	 * @generated
	 */
	public Adapter createInternalModelElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalContainer
	 * @generated
	 */
	public Adapter createInternalContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graphmodel.internal.InternalGraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graphmodel.internal.InternalGraphModel
	 * @generated
	 */
	public Adapter createInternalGraphModelAdapter() {
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

} //InternalAdapterFactory
