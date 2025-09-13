/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalFactory;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalPackageImpl extends EPackageImpl implements InternalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalMainboardContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalCPUSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalRAMSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalGPUSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalCPUNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalRAMNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalGPUNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalMainboardEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InternalPackageImpl() {
		super(eNS_URI, InternalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InternalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InternalPackage init() {
		if (isInited) return (InternalPackage)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInternalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InternalPackageImpl theInternalPackage = registeredInternalPackage instanceof InternalPackageImpl ? (InternalPackageImpl)registeredInternalPackage : new InternalPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainboardPackage.eNS_URI);
		MainboardPackageImpl theMainboardPackage = (MainboardPackageImpl)(registeredPackage instanceof MainboardPackageImpl ? registeredPackage : MainboardPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI);
		PcPackageImpl thePcPackage = (PcPackageImpl)(registeredPackage instanceof PcPackageImpl ? registeredPackage : PcPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage.eNS_URI);
		info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPackageImpl theInternalPackage_1 = (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPackageImpl)(registeredPackage instanceof info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPackageImpl ? registeredPackage : info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage.eNS_URI);
		info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl theViewsPackage_1 = (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl)(registeredPackage instanceof info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl ? registeredPackage : info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage.eINSTANCE);

		// Load packages
		theMainboardPackage.loadPackage();
		thePcPackage.loadPackage();

		// Fix loaded packages
		theInternalPackage.fixPackageContents();
		theMainboardPackage.fixPackageContents();
		theViewsPackage.fixPackageContents();
		thePcPackage.fixPackageContents();
		theInternalPackage_1.fixPackageContents();
		theViewsPackage_1.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theInternalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InternalPackage.eNS_URI, theInternalPackage);
		return theInternalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalMainboardContainer() {
		if (internalMainboardContainerEClass == null) {
			internalMainboardContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(0);
		}
		return internalMainboardContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_NumPCIe16Slots() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_PowerConsumption() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_FormFactor() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_Price() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_NumSataPorts() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_Name() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_Socket() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_Chipset() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_TypeMemorySlots() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_NumMemorySlots() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalMainboardContainer_LibraryComponentUID() {
        return (EAttribute)getInternalMainboardContainer().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalMainboardContainer__GetContainmentConstraints() {
        return getInternalMainboardContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalMainboardContainer__GetReferencedMB() {
        return getInternalMainboardContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalCPUSlot() {
		if (internalCPUSlotEClass == null) {
			internalCPUSlotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(1);
		}
		return internalCPUSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalCPUSlot_Socket() {
        return (EAttribute)getInternalCPUSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCPUSlot__GetContainmentConstraints() {
        return getInternalCPUSlot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalRAMSlot() {
		if (internalRAMSlotEClass == null) {
			internalRAMSlotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(2);
		}
		return internalRAMSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRAMSlot_RamType() {
        return (EAttribute)getInternalRAMSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRAMSlot__GetContainmentConstraints() {
        return getInternalRAMSlot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalGPUSlot() {
		if (internalGPUSlotEClass == null) {
			internalGPUSlotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(3);
		}
		return internalGPUSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalGPUSlot__GetContainmentConstraints() {
        return getInternalGPUSlot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalCPUNode() {
		if (internalCPUNodeEClass == null) {
			internalCPUNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(4);
		}
		return internalCPUNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalCPUNode_CpuType() {
        return (EAttribute)getInternalCPUNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalCPUNode_PowerConsumption() {
        return (EAttribute)getInternalCPUNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalCPUNode_Price() {
        return (EAttribute)getInternalCPUNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalCPUNode_Name() {
        return (EAttribute)getInternalCPUNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalCPUNode_Socket() {
        return (EAttribute)getInternalCPUNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalCPUNode_LibraryComponentUID() {
        return (EAttribute)getInternalCPUNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalCPUNode__GetReferencedCPU() {
        return getInternalCPUNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalRAMNode() {
		if (internalRAMNodeEClass == null) {
			internalRAMNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(5);
		}
		return internalRAMNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRAMNode_PowerConsumption() {
        return (EAttribute)getInternalRAMNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRAMNode_Price() {
        return (EAttribute)getInternalRAMNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRAMNode_Name() {
        return (EAttribute)getInternalRAMNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRAMNode_RamType() {
        return (EAttribute)getInternalRAMNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRAMNode_Capacity() {
        return (EAttribute)getInternalRAMNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalRAMNode_LibraryComponentUID() {
        return (EAttribute)getInternalRAMNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalRAMNode__GetReferencedRAM() {
        return getInternalRAMNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalGPUNode() {
		if (internalGPUNodeEClass == null) {
			internalGPUNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(6);
		}
		return internalGPUNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalGPUNode_Chip() {
        return (EAttribute)getInternalGPUNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalGPUNode_Memory() {
        return (EAttribute)getInternalGPUNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalGPUNode_PowerConsumption() {
        return (EAttribute)getInternalGPUNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalGPUNode_Price() {
        return (EAttribute)getInternalGPUNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalGPUNode_Name() {
        return (EAttribute)getInternalGPUNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalGPUNode_LibraryComponentUID() {
        return (EAttribute)getInternalGPUNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalGPUNode__GetReferencedGPU() {
        return getInternalGPUNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalMainboard() {
		if (internalMainboardEClass == null) {
			internalMainboardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI).getEClassifiers().get(7);
		}
		return internalMainboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInternalMainboard__GetContainmentConstraints() {
        return getInternalMainboard().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalFactory getInternalFactory() {
		return (InternalFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InternalPackageImpl
