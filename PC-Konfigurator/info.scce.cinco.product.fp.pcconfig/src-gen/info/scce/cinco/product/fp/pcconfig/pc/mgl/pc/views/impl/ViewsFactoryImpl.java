/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.*;

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
public class ViewsFactoryImpl extends EFactoryImpl implements ViewsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewsFactory init() {
		try {
			ViewsFactory theViewsFactory = (ViewsFactory)EPackage.Registry.INSTANCE.getEFactory(ViewsPackage.eNS_URI);
			if (theViewsFactory != null) {
				return theViewsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactoryImpl() {
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
			case ViewsPackage.CASE_CONTAINER_VIEW: return createCaseContainerView();
			case ViewsPackage.DRIVE_CONTAINER_VIEW: return createDriveContainerView();
			case ViewsPackage.DRIVE_NODE_VIEW: return createDriveNodeView();
			case ViewsPackage.PSU_CONTAINER_VIEW: return createPSUContainerView();
			case ViewsPackage.PSU_NODE_VIEW: return createPSUNodeView();
			case ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW: return createPCMainboardContainerView();
			case ViewsPackage.MAINBOARD_NODE_VIEW: return createMainboardNodeView();
			case ViewsPackage.PCCPU_NODE_VIEW: return createPCCPUNodeView();
			case ViewsPackage.PCGPU_NODE_VIEW: return createPCGPUNodeView();
			case ViewsPackage.PCRAM_NODE_VIEW: return createPCRAMNodeView();
			case ViewsPackage.PCRAM_SLOT_VIEW: return createPCRAMSlotView();
			case ViewsPackage.PC_VIEW: return createPCView();
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
	public CaseContainerView createCaseContainerView() {
		CaseContainerViewImpl caseContainerView = new CaseContainerViewImpl();
		return caseContainerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveContainerView createDriveContainerView() {
		DriveContainerViewImpl driveContainerView = new DriveContainerViewImpl();
		return driveContainerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveNodeView createDriveNodeView() {
		DriveNodeViewImpl driveNodeView = new DriveNodeViewImpl();
		return driveNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUContainerView createPSUContainerView() {
		PSUContainerViewImpl psuContainerView = new PSUContainerViewImpl();
		return psuContainerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUNodeView createPSUNodeView() {
		PSUNodeViewImpl psuNodeView = new PSUNodeViewImpl();
		return psuNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMainboardContainerView createPCMainboardContainerView() {
		PCMainboardContainerViewImpl pcMainboardContainerView = new PCMainboardContainerViewImpl();
		return pcMainboardContainerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardNodeView createMainboardNodeView() {
		MainboardNodeViewImpl mainboardNodeView = new MainboardNodeViewImpl();
		return mainboardNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCCPUNodeView createPCCPUNodeView() {
		PCCPUNodeViewImpl pccpuNodeView = new PCCPUNodeViewImpl();
		return pccpuNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCGPUNodeView createPCGPUNodeView() {
		PCGPUNodeViewImpl pcgpuNodeView = new PCGPUNodeViewImpl();
		return pcgpuNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMNodeView createPCRAMNodeView() {
		PCRAMNodeViewImpl pcramNodeView = new PCRAMNodeViewImpl();
		return pcramNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMSlotView createPCRAMSlotView() {
		PCRAMSlotViewImpl pcramSlotView = new PCRAMSlotViewImpl();
		return pcramSlotView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCView createPCView() {
		PCViewImpl pcView = new PCViewImpl();
		return pcView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewsPackage getViewsPackage() {
		return (ViewsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewsPackage getPackage() {
		return ViewsPackage.eINSTANCE;
	}

} //ViewsFactoryImpl
