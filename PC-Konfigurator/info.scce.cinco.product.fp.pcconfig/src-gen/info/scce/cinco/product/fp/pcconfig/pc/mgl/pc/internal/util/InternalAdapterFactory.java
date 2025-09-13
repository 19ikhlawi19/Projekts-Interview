/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage
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
			public Adapter caseInternalCaseContainer(InternalCaseContainer object) {
				return createInternalCaseContainerAdapter();
			}
			@Override
			public Adapter caseInternalDriveContainer(InternalDriveContainer object) {
				return createInternalDriveContainerAdapter();
			}
			@Override
			public Adapter caseInternalDriveNode(InternalDriveNode object) {
				return createInternalDriveNodeAdapter();
			}
			@Override
			public Adapter caseInternalPSUContainer(InternalPSUContainer object) {
				return createInternalPSUContainerAdapter();
			}
			@Override
			public Adapter caseInternalPSUNode(InternalPSUNode object) {
				return createInternalPSUNodeAdapter();
			}
			@Override
			public Adapter caseInternalPCMainboardContainer(InternalPCMainboardContainer object) {
				return createInternalPCMainboardContainerAdapter();
			}
			@Override
			public Adapter caseInternalMainboardNode(InternalMainboardNode object) {
				return createInternalMainboardNodeAdapter();
			}
			@Override
			public Adapter caseInternalPCCPUNode(InternalPCCPUNode object) {
				return createInternalPCCPUNodeAdapter();
			}
			@Override
			public Adapter caseInternalPCGPUNode(InternalPCGPUNode object) {
				return createInternalPCGPUNodeAdapter();
			}
			@Override
			public Adapter caseInternalPCRAMNode(InternalPCRAMNode object) {
				return createInternalPCRAMNodeAdapter();
			}
			@Override
			public Adapter caseInternalPCRAMSlot(InternalPCRAMSlot object) {
				return createInternalPCRAMSlotAdapter();
			}
			@Override
			public Adapter caseInternalPC(InternalPC object) {
				return createInternalPCAdapter();
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
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer <em>Case Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer
	 * @generated
	 */
	public Adapter createInternalCaseContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveContainer <em>Drive Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveContainer
	 * @generated
	 */
	public Adapter createInternalDriveContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode <em>Drive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode
	 * @generated
	 */
	public Adapter createInternalDriveNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUContainer <em>PSU Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUContainer
	 * @generated
	 */
	public Adapter createInternalPSUContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode <em>PSU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode
	 * @generated
	 */
	public Adapter createInternalPSUNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCMainboardContainer <em>PC Mainboard Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCMainboardContainer
	 * @generated
	 */
	public Adapter createInternalPCMainboardContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode <em>Mainboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode
	 * @generated
	 */
	public Adapter createInternalMainboardNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCCPUNode <em>PCCPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCCPUNode
	 * @generated
	 */
	public Adapter createInternalPCCPUNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCGPUNode <em>PCGPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCGPUNode
	 * @generated
	 */
	public Adapter createInternalPCGPUNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMNode <em>PCRAM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMNode
	 * @generated
	 */
	public Adapter createInternalPCRAMNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot <em>PCRAM Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot
	 * @generated
	 */
	public Adapter createInternalPCRAMSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPC <em>PC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPC
	 * @generated
	 */
	public Adapter createInternalPCAdapter() {
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
