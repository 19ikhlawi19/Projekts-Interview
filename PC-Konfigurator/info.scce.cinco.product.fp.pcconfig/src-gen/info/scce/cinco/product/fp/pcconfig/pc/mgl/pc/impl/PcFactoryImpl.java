/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.*;

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
public class PcFactoryImpl extends EFactoryImpl implements PcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcFactory init() {
		try {
			PcFactory thePcFactory = (PcFactory)EPackage.Registry.INSTANCE.getEFactory(PcPackage.eNS_URI);
			if (thePcFactory != null) {
				return thePcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcFactoryImpl() {
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
			case PcPackage.CASE_CONTAINER: return createCaseContainer();
			case PcPackage.DRIVE_CONTAINER: return createDriveContainer();
			case PcPackage.DRIVE_NODE: return createDriveNode();
			case PcPackage.PSU_CONTAINER: return createPSUContainer();
			case PcPackage.PSU_NODE: return createPSUNode();
			case PcPackage.PC_MAINBOARD_CONTAINER: return createPCMainboardContainer();
			case PcPackage.MAINBOARD_NODE: return createMainboardNode();
			case PcPackage.PCCPU_NODE: return createPCCPUNode();
			case PcPackage.PCGPU_NODE: return createPCGPUNode();
			case PcPackage.PCRAM_NODE: return createPCRAMNode();
			case PcPackage.PCRAM_SLOT: return createPCRAMSlot();
			case PcPackage.PC: return createPC();
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
	public CaseContainer createCaseContainer() {
		CaseContainerImpl caseContainer = new CaseContainerImpl();
		return caseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveContainer createDriveContainer() {
		DriveContainerImpl driveContainer = new DriveContainerImpl();
		return driveContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveNode createDriveNode() {
		DriveNodeImpl driveNode = new DriveNodeImpl();
		return driveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUContainer createPSUContainer() {
		PSUContainerImpl psuContainer = new PSUContainerImpl();
		return psuContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUNode createPSUNode() {
		PSUNodeImpl psuNode = new PSUNodeImpl();
		return psuNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMainboardContainer createPCMainboardContainer() {
		PCMainboardContainerImpl pcMainboardContainer = new PCMainboardContainerImpl();
		return pcMainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardNode createMainboardNode() {
		MainboardNodeImpl mainboardNode = new MainboardNodeImpl();
		return mainboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCCPUNode createPCCPUNode() {
		PCCPUNodeImpl pccpuNode = new PCCPUNodeImpl();
		return pccpuNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCGPUNode createPCGPUNode() {
		PCGPUNodeImpl pcgpuNode = new PCGPUNodeImpl();
		return pcgpuNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMNode createPCRAMNode() {
		PCRAMNodeImpl pcramNode = new PCRAMNodeImpl();
		return pcramNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMSlot createPCRAMSlot() {
		PCRAMSlotImpl pcramSlot = new PCRAMSlotImpl();
		return pcramSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PC createPC() {
		PCImpl pc = new PCImpl();
		return pc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PcPackage getPcPackage() {
		return (PcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcPackage getPackage() {
		return PcPackage.eINSTANCE;
	}

} //PcFactoryImpl
