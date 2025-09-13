/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.*;

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
			case InternalPackage.INTERNAL_CASE_CONTAINER: return createInternalCaseContainer();
			case InternalPackage.INTERNAL_DRIVE_CONTAINER: return createInternalDriveContainer();
			case InternalPackage.INTERNAL_DRIVE_NODE: return createInternalDriveNode();
			case InternalPackage.INTERNAL_PSU_CONTAINER: return createInternalPSUContainer();
			case InternalPackage.INTERNAL_PSU_NODE: return createInternalPSUNode();
			case InternalPackage.INTERNAL_PC_MAINBOARD_CONTAINER: return createInternalPCMainboardContainer();
			case InternalPackage.INTERNAL_MAINBOARD_NODE: return createInternalMainboardNode();
			case InternalPackage.INTERNAL_PCCPU_NODE: return createInternalPCCPUNode();
			case InternalPackage.INTERNAL_PCGPU_NODE: return createInternalPCGPUNode();
			case InternalPackage.INTERNAL_PCRAM_NODE: return createInternalPCRAMNode();
			case InternalPackage.INTERNAL_PCRAM_SLOT: return createInternalPCRAMSlot();
			case InternalPackage.INTERNAL_PC: return createInternalPC();
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
	public InternalCaseContainer createInternalCaseContainer() {
		InternalCaseContainerImpl internalCaseContainer = new InternalCaseContainerImpl();
		return internalCaseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDriveContainer createInternalDriveContainer() {
		InternalDriveContainerImpl internalDriveContainer = new InternalDriveContainerImpl();
		return internalDriveContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDriveNode createInternalDriveNode() {
		InternalDriveNodeImpl internalDriveNode = new InternalDriveNodeImpl();
		return internalDriveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPSUContainer createInternalPSUContainer() {
		InternalPSUContainerImpl internalPSUContainer = new InternalPSUContainerImpl();
		return internalPSUContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPSUNode createInternalPSUNode() {
		InternalPSUNodeImpl internalPSUNode = new InternalPSUNodeImpl();
		return internalPSUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCMainboardContainer createInternalPCMainboardContainer() {
		InternalPCMainboardContainerImpl internalPCMainboardContainer = new InternalPCMainboardContainerImpl();
		return internalPCMainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboardNode createInternalMainboardNode() {
		InternalMainboardNodeImpl internalMainboardNode = new InternalMainboardNodeImpl();
		return internalMainboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCCPUNode createInternalPCCPUNode() {
		InternalPCCPUNodeImpl internalPCCPUNode = new InternalPCCPUNodeImpl();
		return internalPCCPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCGPUNode createInternalPCGPUNode() {
		InternalPCGPUNodeImpl internalPCGPUNode = new InternalPCGPUNodeImpl();
		return internalPCGPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCRAMNode createInternalPCRAMNode() {
		InternalPCRAMNodeImpl internalPCRAMNode = new InternalPCRAMNodeImpl();
		return internalPCRAMNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCRAMSlot createInternalPCRAMSlot() {
		InternalPCRAMSlotImpl internalPCRAMSlot = new InternalPCRAMSlotImpl();
		return internalPCRAMSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPC createInternalPC() {
		InternalPCImpl internalPC = new InternalPCImpl();
		return internalPC;
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
