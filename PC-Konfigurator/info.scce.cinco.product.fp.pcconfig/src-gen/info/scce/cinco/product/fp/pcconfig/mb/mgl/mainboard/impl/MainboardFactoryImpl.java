/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.*;

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
public class MainboardFactoryImpl extends EFactoryImpl implements MainboardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MainboardFactory init() {
		try {
			MainboardFactory theMainboardFactory = (MainboardFactory)EPackage.Registry.INSTANCE.getEFactory(MainboardPackage.eNS_URI);
			if (theMainboardFactory != null) {
				return theMainboardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MainboardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainboardFactoryImpl() {
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
			case MainboardPackage.MAINBOARD_CONTAINER: return createMainboardContainer();
			case MainboardPackage.CPU_SLOT: return createCPUSlot();
			case MainboardPackage.RAM_SLOT: return createRAMSlot();
			case MainboardPackage.GPU_SLOT: return createGPUSlot();
			case MainboardPackage.CPU_NODE: return createCPUNode();
			case MainboardPackage.RAM_NODE: return createRAMNode();
			case MainboardPackage.GPU_NODE: return createGPUNode();
			case MainboardPackage.MAINBOARD: return createMainboard();
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
	public MainboardContainer createMainboardContainer() {
		MainboardContainerImpl mainboardContainer = new MainboardContainerImpl();
		return mainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUSlot createCPUSlot() {
		CPUSlotImpl cpuSlot = new CPUSlotImpl();
		return cpuSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMSlot createRAMSlot() {
		RAMSlotImpl ramSlot = new RAMSlotImpl();
		return ramSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPUSlot createGPUSlot() {
		GPUSlotImpl gpuSlot = new GPUSlotImpl();
		return gpuSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUNode createCPUNode() {
		CPUNodeImpl cpuNode = new CPUNodeImpl();
		return cpuNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMNode createRAMNode() {
		RAMNodeImpl ramNode = new RAMNodeImpl();
		return ramNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPUNode createGPUNode() {
		GPUNodeImpl gpuNode = new GPUNodeImpl();
		return gpuNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mainboard createMainboard() {
		MainboardImpl mainboard = new MainboardImpl();
		return mainboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardPackage getMainboardPackage() {
		return (MainboardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MainboardPackage getPackage() {
		return MainboardPackage.eINSTANCE;
	}

} //MainboardFactoryImpl
