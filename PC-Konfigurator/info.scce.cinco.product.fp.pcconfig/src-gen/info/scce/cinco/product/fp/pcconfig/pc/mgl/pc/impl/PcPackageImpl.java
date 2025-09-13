/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalPackageImpl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcFactory;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcPackageImpl extends EPackageImpl implements PcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "pc.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driveContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driveNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psuContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psuNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcMainboardContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainboardNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pccpuNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcgpuNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcramNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcramSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcEClass = null;

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
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcPackageImpl() {
		super(eNS_URI, PcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PcPackage init() {
		if (isInited) return (PcPackage)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPcPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PcPackageImpl thePcPackage = registeredPcPackage instanceof PcPackageImpl ? (PcPackageImpl)registeredPcPackage : new PcPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MainboardPackage.eNS_URI);
		MainboardPackageImpl theMainboardPackage = (MainboardPackageImpl)(registeredPackage instanceof MainboardPackageImpl ? registeredPackage : MainboardPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);
		InternalPackageImpl theInternalPackage = (InternalPackageImpl)(registeredPackage instanceof InternalPackageImpl ? registeredPackage : InternalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage.eNS_URI);
		info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPackageImpl theInternalPackage_1 = (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPackageImpl)(registeredPackage instanceof info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPackageImpl ? registeredPackage : info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage.eNS_URI);
		info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl theViewsPackage_1 = (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl)(registeredPackage instanceof info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl ? registeredPackage : info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage.eINSTANCE);

		// Load packages
		thePcPackage.loadPackage();
		theMainboardPackage.loadPackage();

		// Fix loaded packages
		thePcPackage.fixPackageContents();
		theMainboardPackage.fixPackageContents();
		theInternalPackage.fixPackageContents();
		theViewsPackage.fixPackageContents();
		theInternalPackage_1.fixPackageContents();
		theViewsPackage_1.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcPackage.eNS_URI, thePcPackage);
		return thePcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaseContainer() {
		if (caseContainerEClass == null) {
			caseContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(0);
		}
		return caseContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetCaseInternalSlots() {
        return getCaseContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__SetCaseInternalSlots__int() {
        return getCaseContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetCasePrice() {
        return getCaseContainer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__SetCasePrice__float() {
        return getCaseContainer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetCaseExternalSlots() {
        return getCaseContainer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__SetCaseExternalSlots__int() {
        return getCaseContainer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetCaseName() {
        return getCaseContainer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__SetCaseName__String() {
        return getCaseContainer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetCaseFormFactor() {
        return getCaseContainer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__SetCaseFormFactor__String() {
        return getCaseContainer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetInternalCaseContainer() {
        return getCaseContainer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__IsExactlyCaseContainer() {
        return getCaseContainer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__PreDelete() {
        return getCaseContainer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetPostDeleteFunction() {
        return getCaseContainer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetPostDeleteEvent() {
        return getCaseContainer().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__PreSave() {
        return getCaseContainer().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__PostSave() {
        return getCaseContainer().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetRootElement() {
        return getCaseContainer().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetNodes() {
        return getCaseContainer().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetDriveContainers() {
        return getCaseContainer().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__CanNewDriveContainer() {
        return getCaseContainer().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewDriveContainer__int_int() {
        return getCaseContainer().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewDriveContainer__String_int_int() {
        return getCaseContainer().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewDriveContainer__int_int_int_int() {
        return getCaseContainer().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewDriveContainer__String_int_int_int_int() {
        return getCaseContainer().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetPSUContainers() {
        return getCaseContainer().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__CanNewPSUContainer() {
        return getCaseContainer().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPSUContainer__int_int() {
        return getCaseContainer().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPSUContainer__String_int_int() {
        return getCaseContainer().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPSUContainer__int_int_int_int() {
        return getCaseContainer().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPSUContainer__String_int_int_int_int() {
        return getCaseContainer().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetPCMainboardContainers() {
        return getCaseContainer().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__CanNewPCMainboardContainer() {
        return getCaseContainer().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPCMainboardContainer__int_int() {
        return getCaseContainer().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPCMainboardContainer__String_int_int() {
        return getCaseContainer().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPCMainboardContainer__int_int_int_int() {
        return getCaseContainer().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__NewPCMainboardContainer__String_int_int_int_int() {
        return getCaseContainer().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__S_moveTo__ModelElementContainer_int_int() {
        return getCaseContainer().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__PreMove__ModelElementContainer_int_int() {
        return getCaseContainer().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getCaseContainer().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__PreResize__int_int_int_int_Direction() {
        return getCaseContainer().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__PostResize__int_int_int_int_Direction() {
        return getCaseContainer().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__CanMoveTo__PC_int_int() {
        return getCaseContainer().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__MoveTo__PC_int_int() {
        return getCaseContainer().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__S_moveTo__PC_int_int() {
        return getCaseContainer().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetContainer() {
        return getCaseContainer().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetReferencedCase() {
        return getCaseContainer().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetLibraryComponentUID() {
        return getCaseContainer().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__SetLibraryComponentUID__String() {
        return getCaseContainer().getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCaseContainer__GetCaseContainerView() {
        return getCaseContainer().getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDriveContainer() {
		if (driveContainerEClass == null) {
			driveContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(1);
		}
		return driveContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetInternalDriveContainer() {
        return getDriveContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__IsExactlyDriveContainer() {
        return getDriveContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__PreDelete() {
        return getDriveContainer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetPostDeleteFunction() {
        return getDriveContainer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetPostDeleteEvent() {
        return getDriveContainer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__PreSave() {
        return getDriveContainer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__PostSave() {
        return getDriveContainer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetRootElement() {
        return getDriveContainer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetNodes() {
        return getDriveContainer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetDriveNodes() {
        return getDriveContainer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__CanNewDriveNode() {
        return getDriveContainer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__NewDriveNode__EObject_int_int() {
        return getDriveContainer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__NewDriveNode__EObject_String_int_int() {
        return getDriveContainer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__NewDriveNode__EObject_int_int_int_int() {
        return getDriveContainer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__NewDriveNode__EObject_String_int_int_int_int() {
        return getDriveContainer().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__S_moveTo__ModelElementContainer_int_int() {
        return getDriveContainer().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__PreMove__ModelElementContainer_int_int() {
        return getDriveContainer().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getDriveContainer().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__PreResize__int_int_int_int_Direction() {
        return getDriveContainer().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__PostResize__int_int_int_int_Direction() {
        return getDriveContainer().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__CanMoveTo__CaseContainer_int_int() {
        return getDriveContainer().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__MoveTo__CaseContainer_int_int() {
        return getDriveContainer().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__S_moveTo__CaseContainer_int_int() {
        return getDriveContainer().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetContainer() {
        return getDriveContainer().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveContainer__GetDriveContainerView() {
        return getDriveContainer().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDriveNode() {
		if (driveNodeEClass == null) {
			driveNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(2);
		}
		return driveNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetDriveDescription() {
        return getDriveNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__SetDriveDescription__String() {
        return getDriveNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetDrivePowerConsumption() {
        return getDriveNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__SetDrivePowerConsumption__int() {
        return getDriveNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetDrivePrice() {
        return getDriveNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__SetDrivePrice__float() {
        return getDriveNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetDriveType() {
        return getDriveNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__SetDriveType__String() {
        return getDriveNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetDriveName() {
        return getDriveNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__SetDriveName__String() {
        return getDriveNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetInternalDriveNode() {
        return getDriveNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__IsExactlyDriveNode() {
        return getDriveNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__PreDelete() {
        return getDriveNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetPostDeleteFunction() {
        return getDriveNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetPostDeleteEvent() {
        return getDriveNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__PreSave() {
        return getDriveNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__PostSave() {
        return getDriveNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetRootElement() {
        return getDriveNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__S_moveTo__ModelElementContainer_int_int() {
        return getDriveNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__PreMove__ModelElementContainer_int_int() {
        return getDriveNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getDriveNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__PreResize__int_int_int_int_Direction() {
        return getDriveNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__PostResize__int_int_int_int_Direction() {
        return getDriveNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__CanMoveTo__DriveContainer_int_int() {
        return getDriveNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__MoveTo__DriveContainer_int_int() {
        return getDriveNode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__S_moveTo__DriveContainer_int_int() {
        return getDriveNode().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetContainer() {
        return getDriveNode().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetReferencedDrive() {
        return getDriveNode().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetLibraryComponentUID() {
        return getDriveNode().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__SetLibraryComponentUID__String() {
        return getDriveNode().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDriveNode__GetDriveNodeView() {
        return getDriveNode().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPSUContainer() {
		if (psuContainerEClass == null) {
			psuContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(3);
		}
		return psuContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetInternalPSUContainer() {
        return getPSUContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__IsExactlyPSUContainer() {
        return getPSUContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__PreDelete() {
        return getPSUContainer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetPostDeleteFunction() {
        return getPSUContainer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetPostDeleteEvent() {
        return getPSUContainer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__PreSave() {
        return getPSUContainer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__PostSave() {
        return getPSUContainer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetRootElement() {
        return getPSUContainer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetNodes() {
        return getPSUContainer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetPSUNodes() {
        return getPSUContainer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__CanNewPSUNode() {
        return getPSUContainer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__NewPSUNode__EObject_int_int() {
        return getPSUContainer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__NewPSUNode__EObject_String_int_int() {
        return getPSUContainer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__NewPSUNode__EObject_int_int_int_int() {
        return getPSUContainer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__NewPSUNode__EObject_String_int_int_int_int() {
        return getPSUContainer().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__S_moveTo__ModelElementContainer_int_int() {
        return getPSUContainer().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__PreMove__ModelElementContainer_int_int() {
        return getPSUContainer().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getPSUContainer().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__PreResize__int_int_int_int_Direction() {
        return getPSUContainer().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__PostResize__int_int_int_int_Direction() {
        return getPSUContainer().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__CanMoveTo__CaseContainer_int_int() {
        return getPSUContainer().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__MoveTo__CaseContainer_int_int() {
        return getPSUContainer().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__S_moveTo__CaseContainer_int_int() {
        return getPSUContainer().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetContainer() {
        return getPSUContainer().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUContainer__GetPSUContainerView() {
        return getPSUContainer().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPSUNode() {
		if (psuNodeEClass == null) {
			psuNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(4);
		}
		return psuNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetPsuName() {
        return getPSUNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__SetPsuName__String() {
        return getPSUNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetPsuPower() {
        return getPSUNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__SetPsuPower__int() {
        return getPSUNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetPsuPrice() {
        return getPSUNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__SetPsuPrice__float() {
        return getPSUNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetInternalPSUNode() {
        return getPSUNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__IsExactlyPSUNode() {
        return getPSUNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__PreDelete() {
        return getPSUNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetPostDeleteFunction() {
        return getPSUNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetPostDeleteEvent() {
        return getPSUNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__PreSave() {
        return getPSUNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__PostSave() {
        return getPSUNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetRootElement() {
        return getPSUNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__S_moveTo__ModelElementContainer_int_int() {
        return getPSUNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__PreMove__ModelElementContainer_int_int() {
        return getPSUNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getPSUNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__PreResize__int_int_int_int_Direction() {
        return getPSUNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__PostResize__int_int_int_int_Direction() {
        return getPSUNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__CanMoveTo__PSUContainer_int_int() {
        return getPSUNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__MoveTo__PSUContainer_int_int() {
        return getPSUNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__S_moveTo__PSUContainer_int_int() {
        return getPSUNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetContainer() {
        return getPSUNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetReferencedPSU() {
        return getPSUNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetLibraryComponentUID() {
        return getPSUNode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__SetLibraryComponentUID__String() {
        return getPSUNode().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPSUNode__GetPSUNodeView() {
        return getPSUNode().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMainboardContainer() {
		if (pcMainboardContainerEClass == null) {
			pcMainboardContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(5);
		}
		return pcMainboardContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetInternalPCMainboardContainer() {
        return getPCMainboardContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__IsExactlyPCMainboardContainer() {
        return getPCMainboardContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__PreDelete() {
        return getPCMainboardContainer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetPostDeleteFunction() {
        return getPCMainboardContainer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetPostDeleteEvent() {
        return getPCMainboardContainer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__PreSave() {
        return getPCMainboardContainer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__PostSave() {
        return getPCMainboardContainer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetRootElement() {
        return getPCMainboardContainer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetNodes() {
        return getPCMainboardContainer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetMainboardNodes() {
        return getPCMainboardContainer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__CanNewMainboardNode() {
        return getPCMainboardContainer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__NewMainboardNode__EObject_int_int() {
        return getPCMainboardContainer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__NewMainboardNode__EObject_String_int_int() {
        return getPCMainboardContainer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__NewMainboardNode__EObject_int_int_int_int() {
        return getPCMainboardContainer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__NewMainboardNode__EObject_String_int_int_int_int() {
        return getPCMainboardContainer().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__S_moveTo__ModelElementContainer_int_int() {
        return getPCMainboardContainer().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__PreMove__ModelElementContainer_int_int() {
        return getPCMainboardContainer().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getPCMainboardContainer().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__PreResize__int_int_int_int_Direction() {
        return getPCMainboardContainer().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__PostResize__int_int_int_int_Direction() {
        return getPCMainboardContainer().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__CanMoveTo__CaseContainer_int_int() {
        return getPCMainboardContainer().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__MoveTo__CaseContainer_int_int() {
        return getPCMainboardContainer().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__S_moveTo__CaseContainer_int_int() {
        return getPCMainboardContainer().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetContainer() {
        return getPCMainboardContainer().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCMainboardContainer__GetPCMainboardContainerView() {
        return getPCMainboardContainer().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMainboardNode() {
		if (mainboardNodeEClass == null) {
			mainboardNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(6);
		}
		return mainboardNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetName() {
        return getMainboardNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__SetName__String() {
        return getMainboardNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetInternalMainboardNode() {
        return getMainboardNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__IsExactlyMainboardNode() {
        return getMainboardNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__PreDelete() {
        return getMainboardNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetPostDeleteFunction() {
        return getMainboardNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetPostDeleteEvent() {
        return getMainboardNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__PreSave() {
        return getMainboardNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__PostSave() {
        return getMainboardNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetRootElement() {
        return getMainboardNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetNodes() {
        return getMainboardNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetPCGPUNodes() {
        return getMainboardNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__CanNewPCGPUNode() {
        return getMainboardNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCGPUNode__int_int() {
        return getMainboardNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCGPUNode__String_int_int() {
        return getMainboardNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCGPUNode__int_int_int_int() {
        return getMainboardNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCGPUNode__String_int_int_int_int() {
        return getMainboardNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetPCCPUNodes() {
        return getMainboardNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__CanNewPCCPUNode() {
        return getMainboardNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCCPUNode__int_int() {
        return getMainboardNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCCPUNode__String_int_int() {
        return getMainboardNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCCPUNode__int_int_int_int() {
        return getMainboardNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCCPUNode__String_int_int_int_int() {
        return getMainboardNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetPCRAMNodes() {
        return getMainboardNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__CanNewPCRAMNode() {
        return getMainboardNode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMNode__int_int() {
        return getMainboardNode().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMNode__String_int_int() {
        return getMainboardNode().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMNode__int_int_int_int() {
        return getMainboardNode().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMNode__String_int_int_int_int() {
        return getMainboardNode().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetPCRAMSlots() {
        return getMainboardNode().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__CanNewPCRAMSlot() {
        return getMainboardNode().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMSlot__int_int() {
        return getMainboardNode().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMSlot__String_int_int() {
        return getMainboardNode().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMSlot__int_int_int_int() {
        return getMainboardNode().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__NewPCRAMSlot__String_int_int_int_int() {
        return getMainboardNode().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__S_moveTo__ModelElementContainer_int_int() {
        return getMainboardNode().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__PreMove__ModelElementContainer_int_int() {
        return getMainboardNode().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getMainboardNode().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__PreResize__int_int_int_int_Direction() {
        return getMainboardNode().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__PostResize__int_int_int_int_Direction() {
        return getMainboardNode().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__CanMoveTo__PCMainboardContainer_int_int() {
        return getMainboardNode().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__MoveTo__PCMainboardContainer_int_int() {
        return getMainboardNode().getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__S_moveTo__PCMainboardContainer_int_int() {
        return getMainboardNode().getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetContainer() {
        return getMainboardNode().getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetReferencedMB() {
        return getMainboardNode().getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetLibraryComponentUID() {
        return getMainboardNode().getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__SetLibraryComponentUID__String() {
        return getMainboardNode().getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMainboardNode__GetMainboardNodeView() {
        return getMainboardNode().getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCCPUNode() {
		if (pccpuNodeEClass == null) {
			pccpuNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(7);
		}
		return pccpuNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__GetName() {
        return getPCCPUNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__SetName__String() {
        return getPCCPUNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__GetInternalPCCPUNode() {
        return getPCCPUNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__IsExactlyPCCPUNode() {
        return getPCCPUNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__PreDelete() {
        return getPCCPUNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__GetPostDeleteFunction() {
        return getPCCPUNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__GetPostDeleteEvent() {
        return getPCCPUNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__PreSave() {
        return getPCCPUNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__PostSave() {
        return getPCCPUNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__GetRootElement() {
        return getPCCPUNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__S_moveTo__ModelElementContainer_int_int() {
        return getPCCPUNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__PreMove__ModelElementContainer_int_int() {
        return getPCCPUNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getPCCPUNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__PreResize__int_int_int_int_Direction() {
        return getPCCPUNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__PostResize__int_int_int_int_Direction() {
        return getPCCPUNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__CanMoveTo__MainboardNode_int_int() {
        return getPCCPUNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__MoveTo__MainboardNode_int_int() {
        return getPCCPUNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__S_moveTo__MainboardNode_int_int() {
        return getPCCPUNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__GetContainer() {
        return getPCCPUNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCCPUNode__GetPCCPUNodeView() {
        return getPCCPUNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCGPUNode() {
		if (pcgpuNodeEClass == null) {
			pcgpuNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(8);
		}
		return pcgpuNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__GetName() {
        return getPCGPUNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__SetName__String() {
        return getPCGPUNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__GetInternalPCGPUNode() {
        return getPCGPUNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__IsExactlyPCGPUNode() {
        return getPCGPUNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__PreDelete() {
        return getPCGPUNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__GetPostDeleteFunction() {
        return getPCGPUNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__GetPostDeleteEvent() {
        return getPCGPUNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__PreSave() {
        return getPCGPUNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__PostSave() {
        return getPCGPUNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__GetRootElement() {
        return getPCGPUNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__S_moveTo__ModelElementContainer_int_int() {
        return getPCGPUNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__PreMove__ModelElementContainer_int_int() {
        return getPCGPUNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getPCGPUNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__PreResize__int_int_int_int_Direction() {
        return getPCGPUNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__PostResize__int_int_int_int_Direction() {
        return getPCGPUNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__CanMoveTo__MainboardNode_int_int() {
        return getPCGPUNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__MoveTo__MainboardNode_int_int() {
        return getPCGPUNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__S_moveTo__MainboardNode_int_int() {
        return getPCGPUNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__GetContainer() {
        return getPCGPUNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCGPUNode__GetPCGPUNodeView() {
        return getPCGPUNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCRAMNode() {
		if (pcramNodeEClass == null) {
			pcramNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(9);
		}
		return pcramNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__GetInternalPCRAMNode() {
        return getPCRAMNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__IsExactlyPCRAMNode() {
        return getPCRAMNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__PreDelete() {
        return getPCRAMNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__GetPostDeleteFunction() {
        return getPCRAMNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__GetPostDeleteEvent() {
        return getPCRAMNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__PreSave() {
        return getPCRAMNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__PostSave() {
        return getPCRAMNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__GetRootElement() {
        return getPCRAMNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__S_moveTo__ModelElementContainer_int_int() {
        return getPCRAMNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__PreMove__ModelElementContainer_int_int() {
        return getPCRAMNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getPCRAMNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__PreResize__int_int_int_int_Direction() {
        return getPCRAMNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__PostResize__int_int_int_int_Direction() {
        return getPCRAMNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__CanMoveTo__MainboardNode_int_int() {
        return getPCRAMNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__MoveTo__MainboardNode_int_int() {
        return getPCRAMNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__S_moveTo__MainboardNode_int_int() {
        return getPCRAMNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__GetContainer() {
        return getPCRAMNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMNode__GetPCRAMNodeView() {
        return getPCRAMNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCRAMSlot() {
		if (pcramSlotEClass == null) {
			pcramSlotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(10);
		}
		return pcramSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__GetSlotType() {
        return getPCRAMSlot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__SetSlotType__String() {
        return getPCRAMSlot().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__GetInternalPCRAMSlot() {
        return getPCRAMSlot().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__IsExactlyPCRAMSlot() {
        return getPCRAMSlot().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__PreDelete() {
        return getPCRAMSlot().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__GetPostDeleteFunction() {
        return getPCRAMSlot().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__GetPostDeleteEvent() {
        return getPCRAMSlot().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__PreSave() {
        return getPCRAMSlot().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__PostSave() {
        return getPCRAMSlot().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__GetRootElement() {
        return getPCRAMSlot().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__S_moveTo__ModelElementContainer_int_int() {
        return getPCRAMSlot().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__PreMove__ModelElementContainer_int_int() {
        return getPCRAMSlot().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int() {
        return getPCRAMSlot().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__PreResize__int_int_int_int_Direction() {
        return getPCRAMSlot().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__PostResize__int_int_int_int_Direction() {
        return getPCRAMSlot().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__CanMoveTo__MainboardNode_int_int() {
        return getPCRAMSlot().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__MoveTo__MainboardNode_int_int() {
        return getPCRAMSlot().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__S_moveTo__MainboardNode_int_int() {
        return getPCRAMSlot().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__GetContainer() {
        return getPCRAMSlot().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPCRAMSlot__GetPCRAMSlotView() {
        return getPCRAMSlot().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPC() {
		if (pcEClass == null) {
			pcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PcPackage.eNS_URI).getEClassifiers().get(11);
		}
		return pcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__GetInternalPC() {
        return getPC().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__IsExactlyPC() {
        return getPC().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__PreDelete() {
        return getPC().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__GetPostDeleteFunction() {
        return getPC().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__GetPostDeleteEvent() {
        return getPC().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__PreSave() {
        return getPC().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__PostSave() {
        return getPC().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__GetRootElement() {
        return getPC().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__GetNodes() {
        return getPC().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__GetCaseContainers() {
        return getPC().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__CanNewCaseContainer() {
        return getPC().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__NewCaseContainer__EObject_int_int() {
        return getPC().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__NewCaseContainer__EObject_String_int_int() {
        return getPC().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__NewCaseContainer__EObject_int_int_int_int() {
        return getPC().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__NewCaseContainer__EObject_String_int_int_int_int() {
        return getPC().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__NewPC__String_String_boolean() {
        return getPC().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPC__GetPCView() {
        return getPC().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PcFactory getPcFactory() {
		return (PcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
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
			eClassifier.setInstanceClassName("info.scce.cinco.product.fp.pcconfig.pc.mgl.pc." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PcPackageImpl
