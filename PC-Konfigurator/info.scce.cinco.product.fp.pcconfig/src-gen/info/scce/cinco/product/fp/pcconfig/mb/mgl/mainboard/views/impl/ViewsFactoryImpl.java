/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.*;

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
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW: return createMainboardContainerView();
			case ViewsPackage.CPU_SLOT_VIEW: return createCPUSlotView();
			case ViewsPackage.RAM_SLOT_VIEW: return createRAMSlotView();
			case ViewsPackage.GPU_SLOT_VIEW: return createGPUSlotView();
			case ViewsPackage.CPU_NODE_VIEW: return createCPUNodeView();
			case ViewsPackage.RAM_NODE_VIEW: return createRAMNodeView();
			case ViewsPackage.GPU_NODE_VIEW: return createGPUNodeView();
			case ViewsPackage.MAINBOARD_VIEW: return createMainboardView();
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
	public MainboardContainerView createMainboardContainerView() {
		MainboardContainerViewImpl mainboardContainerView = new MainboardContainerViewImpl();
		return mainboardContainerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUSlotView createCPUSlotView() {
		CPUSlotViewImpl cpuSlotView = new CPUSlotViewImpl();
		return cpuSlotView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMSlotView createRAMSlotView() {
		RAMSlotViewImpl ramSlotView = new RAMSlotViewImpl();
		return ramSlotView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPUSlotView createGPUSlotView() {
		GPUSlotViewImpl gpuSlotView = new GPUSlotViewImpl();
		return gpuSlotView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUNodeView createCPUNodeView() {
		CPUNodeViewImpl cpuNodeView = new CPUNodeViewImpl();
		return cpuNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMNodeView createRAMNodeView() {
		RAMNodeViewImpl ramNodeView = new RAMNodeViewImpl();
		return ramNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPUNodeView createGPUNodeView() {
		GPUNodeViewImpl gpuNodeView = new GPUNodeViewImpl();
		return gpuNodeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardView createMainboardView() {
		MainboardViewImpl mainboardView = new MainboardViewImpl();
		return mainboardView;
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
