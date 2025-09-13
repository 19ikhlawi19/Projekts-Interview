/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalFactoryImpl extends EFactoryImpl implements InternalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InternalFactory init() {
		try {
			InternalFactory theInternalFactory = (InternalFactory)EPackage.Registry.INSTANCE.getEFactory(InternalPackage.eNS_URI);
			if (theInternalFactory != null) {
				return theInternalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InternalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER: return createInternalMainboardContainer();
			case InternalPackage.INTERNAL_CPU_SLOT: return createInternalCPUSlot();
			case InternalPackage.INTERNAL_RAM_SLOT: return createInternalRAMSlot();
			case InternalPackage.INTERNAL_GPU_SLOT: return createInternalGPUSlot();
			case InternalPackage.INTERNAL_CPU_NODE: return createInternalCPUNode();
			case InternalPackage.INTERNAL_RAM_NODE: return createInternalRAMNode();
			case InternalPackage.INTERNAL_GPU_NODE: return createInternalGPUNode();
			case InternalPackage.INTERNAL_MAINBOARD: return createInternalMainboard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboardContainer createInternalMainboardContainer() {
		InternalMainboardContainerImpl internalMainboardContainer = new InternalMainboardContainerImpl();
		return internalMainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCPUSlot createInternalCPUSlot() {
		InternalCPUSlotImpl internalCPUSlot = new InternalCPUSlotImpl();
		return internalCPUSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRAMSlot createInternalRAMSlot() {
		InternalRAMSlotImpl internalRAMSlot = new InternalRAMSlotImpl();
		return internalRAMSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalGPUSlot createInternalGPUSlot() {
		InternalGPUSlotImpl internalGPUSlot = new InternalGPUSlotImpl();
		return internalGPUSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCPUNode createInternalCPUNode() {
		InternalCPUNodeImpl internalCPUNode = new InternalCPUNodeImpl();
		return internalCPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRAMNode createInternalRAMNode() {
		InternalRAMNodeImpl internalRAMNode = new InternalRAMNodeImpl();
		return internalRAMNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalGPUNode createInternalGPUNode() {
		InternalGPUNodeImpl internalGPUNode = new InternalGPUNodeImpl();
		return internalGPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboard createInternalMainboard() {
		InternalMainboardImpl internalMainboard = new InternalMainboardImpl();
		return internalMainboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPackage getInternalPackage() {
		return (InternalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InternalPackage getPackage() {
		return InternalPackage.eINSTANCE;
	}

} //InternalFactoryImpl
