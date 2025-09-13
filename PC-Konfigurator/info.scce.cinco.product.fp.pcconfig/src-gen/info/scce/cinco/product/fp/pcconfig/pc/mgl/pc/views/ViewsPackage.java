/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/fp/pcconfig/pc/mgl/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pc-views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.CaseContainerViewImpl <em>Case Container View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.CaseContainerViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getCaseContainerView()
	 * @generated
	 */
	int CASE_CONTAINER_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Internal Case Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Case Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Case Internal Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___GET_CASE_INTERNAL_SLOTS = 0;

	/**
	 * The operation id for the '<em>Set Case Internal Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___SET_CASE_INTERNAL_SLOTS__INT = 1;

	/**
	 * The operation id for the '<em>Get Case Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___GET_CASE_PRICE = 2;

	/**
	 * The operation id for the '<em>Set Case Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___SET_CASE_PRICE__FLOAT = 3;

	/**
	 * The operation id for the '<em>Get Case External Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___GET_CASE_EXTERNAL_SLOTS = 4;

	/**
	 * The operation id for the '<em>Set Case External Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___SET_CASE_EXTERNAL_SLOTS__INT = 5;

	/**
	 * The operation id for the '<em>Get Case Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___GET_CASE_NAME = 6;

	/**
	 * The operation id for the '<em>Set Case Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___SET_CASE_NAME__STRING = 7;

	/**
	 * The operation id for the '<em>Get Case Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___GET_CASE_FORM_FACTOR = 8;

	/**
	 * The operation id for the '<em>Set Case Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW___SET_CASE_FORM_FACTOR__STRING = 9;

	/**
	 * The number of operations of the '<em>Case Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_VIEW_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveContainerViewImpl <em>Drive Container View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveContainerViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getDriveContainerView()
	 * @generated
	 */
	int DRIVE_CONTAINER_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Internal Drive Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Drive Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Drive Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveNodeViewImpl <em>Drive Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getDriveNodeView()
	 * @generated
	 */
	int DRIVE_NODE_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Internal Drive Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE = 0;

	/**
	 * The number of structural features of the '<em>Drive Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Drive Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___GET_DRIVE_DESCRIPTION = 0;

	/**
	 * The operation id for the '<em>Set Drive Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___SET_DRIVE_DESCRIPTION__STRING = 1;

	/**
	 * The operation id for the '<em>Get Drive Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___GET_DRIVE_POWER_CONSUMPTION = 2;

	/**
	 * The operation id for the '<em>Set Drive Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___SET_DRIVE_POWER_CONSUMPTION__INT = 3;

	/**
	 * The operation id for the '<em>Get Drive Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___GET_DRIVE_PRICE = 4;

	/**
	 * The operation id for the '<em>Set Drive Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___SET_DRIVE_PRICE__FLOAT = 5;

	/**
	 * The operation id for the '<em>Get Drive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___GET_DRIVE_TYPE = 6;

	/**
	 * The operation id for the '<em>Set Drive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___SET_DRIVE_TYPE__STRING = 7;

	/**
	 * The operation id for the '<em>Get Drive Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___GET_DRIVE_NAME = 8;

	/**
	 * The operation id for the '<em>Set Drive Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW___SET_DRIVE_NAME__STRING = 9;

	/**
	 * The number of operations of the '<em>Drive Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_VIEW_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUContainerViewImpl <em>PSU Container View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUContainerViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPSUContainerView()
	 * @generated
	 */
	int PSU_CONTAINER_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Internal PSU Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>PSU Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PSU Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUNodeViewImpl <em>PSU Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPSUNodeView()
	 * @generated
	 */
	int PSU_NODE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Internal PSU Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW__INTERNAL_PSU_NODE = 0;

	/**
	 * The number of structural features of the '<em>PSU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Psu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW___GET_PSU_NAME = 0;

	/**
	 * The operation id for the '<em>Set Psu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW___SET_PSU_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Get Psu Power</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW___GET_PSU_POWER = 2;

	/**
	 * The operation id for the '<em>Set Psu Power</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW___SET_PSU_POWER__INT = 3;

	/**
	 * The operation id for the '<em>Get Psu Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW___GET_PSU_PRICE = 4;

	/**
	 * The operation id for the '<em>Set Psu Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW___SET_PSU_PRICE__FLOAT = 5;

	/**
	 * The number of operations of the '<em>PSU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_VIEW_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCMainboardContainerViewImpl <em>PC Mainboard Container View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCMainboardContainerViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCMainboardContainerView()
	 * @generated
	 */
	int PC_MAINBOARD_CONTAINER_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Internal PC Mainboard Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>PC Mainboard Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PC Mainboard Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.MainboardNodeViewImpl <em>Mainboard Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.MainboardNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getMainboardNodeView()
	 * @generated
	 */
	int MAINBOARD_NODE_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Internal Mainboard Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE = 0;

	/**
	 * The number of structural features of the '<em>Mainboard Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE_VIEW___SET_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>Mainboard Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCCPUNodeViewImpl <em>PCCPU Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCCPUNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCCPUNodeView()
	 * @generated
	 */
	int PCCPU_NODE_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Internal PCCPU Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE = 0;

	/**
	 * The number of structural features of the '<em>PCCPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE_VIEW___SET_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>PCCPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCGPUNodeViewImpl <em>PCGPU Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCGPUNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCGPUNodeView()
	 * @generated
	 */
	int PCGPU_NODE_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Internal PCGPU Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE = 0;

	/**
	 * The number of structural features of the '<em>PCGPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE_VIEW___GET_NAME = 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE_VIEW___SET_NAME__STRING = 1;

	/**
	 * The number of operations of the '<em>PCGPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMNodeViewImpl <em>PCRAM Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCRAMNodeView()
	 * @generated
	 */
	int PCRAM_NODE_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Internal PCRAM Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE = 0;

	/**
	 * The number of structural features of the '<em>PCRAM Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PCRAM Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMSlotViewImpl <em>PCRAM Slot View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMSlotViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCRAMSlotView()
	 * @generated
	 */
	int PCRAM_SLOT_VIEW = 10;

	/**
	 * The feature id for the '<em><b>Internal PCRAM Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT = 0;

	/**
	 * The number of structural features of the '<em>PCRAM Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Slot Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT_VIEW___GET_SLOT_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Slot Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT_VIEW___SET_SLOT_TYPE__STRING = 1;

	/**
	 * The number of operations of the '<em>PCRAM Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCViewImpl <em>PC View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCView()
	 * @generated
	 */
	int PC_VIEW = 11;

	/**
	 * The feature id for the '<em><b>Internal PC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_VIEW__INTERNAL_PC = 0;

	/**
	 * The number of structural features of the '<em>PC View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PC View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_VIEW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView <em>Case Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Container View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView
	 * @generated
	 */
	EClass getCaseContainerView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getInternalCaseContainer <em>Internal Case Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Case Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getInternalCaseContainer()
	 * @see #getCaseContainerView()
	 * @generated
	 */
	EReference getCaseContainerView_InternalCaseContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseInternalSlots() <em>Get Case Internal Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Internal Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseInternalSlots()
	 * @generated
	 */
	EOperation getCaseContainerView__GetCaseInternalSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseInternalSlots(int) <em>Set Case Internal Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Internal Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseInternalSlots(int)
	 * @generated
	 */
	EOperation getCaseContainerView__SetCaseInternalSlots__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCasePrice() <em>Get Case Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCasePrice()
	 * @generated
	 */
	EOperation getCaseContainerView__GetCasePrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCasePrice(float) <em>Set Case Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCasePrice(float)
	 * @generated
	 */
	EOperation getCaseContainerView__SetCasePrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseExternalSlots() <em>Get Case External Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case External Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseExternalSlots()
	 * @generated
	 */
	EOperation getCaseContainerView__GetCaseExternalSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseExternalSlots(int) <em>Set Case External Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case External Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseExternalSlots(int)
	 * @generated
	 */
	EOperation getCaseContainerView__SetCaseExternalSlots__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseName() <em>Get Case Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseName()
	 * @generated
	 */
	EOperation getCaseContainerView__GetCaseName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseName(java.lang.String) <em>Set Case Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseName(java.lang.String)
	 * @generated
	 */
	EOperation getCaseContainerView__SetCaseName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseFormFactor() <em>Get Case Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getCaseFormFactor()
	 * @generated
	 */
	EOperation getCaseContainerView__GetCaseFormFactor();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseFormFactor(java.lang.String) <em>Set Case Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#setCaseFormFactor(java.lang.String)
	 * @generated
	 */
	EOperation getCaseContainerView__SetCaseFormFactor__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveContainerView <em>Drive Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drive Container View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveContainerView
	 * @generated
	 */
	EClass getDriveContainerView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveContainerView#getInternalDriveContainer <em>Internal Drive Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Drive Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveContainerView#getInternalDriveContainer()
	 * @see #getDriveContainerView()
	 * @generated
	 */
	EReference getDriveContainerView_InternalDriveContainer();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView <em>Drive Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drive Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView
	 * @generated
	 */
	EClass getDriveNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getInternalDriveNode <em>Internal Drive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Drive Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getInternalDriveNode()
	 * @see #getDriveNodeView()
	 * @generated
	 */
	EReference getDriveNodeView_InternalDriveNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDriveDescription() <em>Get Drive Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Description</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDriveDescription()
	 * @generated
	 */
	EOperation getDriveNodeView__GetDriveDescription();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDriveDescription(java.lang.String) <em>Set Drive Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Description</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDriveDescription(java.lang.String)
	 * @generated
	 */
	EOperation getDriveNodeView__SetDriveDescription__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDrivePowerConsumption() <em>Get Drive Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDrivePowerConsumption()
	 * @generated
	 */
	EOperation getDriveNodeView__GetDrivePowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDrivePowerConsumption(int) <em>Set Drive Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDrivePowerConsumption(int)
	 * @generated
	 */
	EOperation getDriveNodeView__SetDrivePowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDrivePrice() <em>Get Drive Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDrivePrice()
	 * @generated
	 */
	EOperation getDriveNodeView__GetDrivePrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDrivePrice(float) <em>Set Drive Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDrivePrice(float)
	 * @generated
	 */
	EOperation getDriveNodeView__SetDrivePrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDriveType() <em>Get Drive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDriveType()
	 * @generated
	 */
	EOperation getDriveNodeView__GetDriveType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDriveType(java.lang.String) <em>Set Drive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDriveType(java.lang.String)
	 * @generated
	 */
	EOperation getDriveNodeView__SetDriveType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDriveName() <em>Get Drive Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#getDriveName()
	 * @generated
	 */
	EOperation getDriveNodeView__GetDriveName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDriveName(java.lang.String) <em>Set Drive Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView#setDriveName(java.lang.String)
	 * @generated
	 */
	EOperation getDriveNodeView__SetDriveName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUContainerView <em>PSU Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSU Container View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUContainerView
	 * @generated
	 */
	EClass getPSUContainerView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUContainerView#getInternalPSUContainer <em>Internal PSU Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PSU Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUContainerView#getInternalPSUContainer()
	 * @see #getPSUContainerView()
	 * @generated
	 */
	EReference getPSUContainerView_InternalPSUContainer();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView <em>PSU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSU Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView
	 * @generated
	 */
	EClass getPSUNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getInternalPSUNode <em>Internal PSU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PSU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getInternalPSUNode()
	 * @see #getPSUNodeView()
	 * @generated
	 */
	EReference getPSUNodeView_InternalPSUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getPsuName() <em>Get Psu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Psu Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getPsuName()
	 * @generated
	 */
	EOperation getPSUNodeView__GetPsuName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#setPsuName(java.lang.String) <em>Set Psu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Psu Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#setPsuName(java.lang.String)
	 * @generated
	 */
	EOperation getPSUNodeView__SetPsuName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getPsuPower() <em>Get Psu Power</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Psu Power</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getPsuPower()
	 * @generated
	 */
	EOperation getPSUNodeView__GetPsuPower();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#setPsuPower(int) <em>Set Psu Power</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Psu Power</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#setPsuPower(int)
	 * @generated
	 */
	EOperation getPSUNodeView__SetPsuPower__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getPsuPrice() <em>Get Psu Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Psu Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#getPsuPrice()
	 * @generated
	 */
	EOperation getPSUNodeView__GetPsuPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#setPsuPrice(float) <em>Set Psu Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Psu Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView#setPsuPrice(float)
	 * @generated
	 */
	EOperation getPSUNodeView__SetPsuPrice__float();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCMainboardContainerView <em>PC Mainboard Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC Mainboard Container View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCMainboardContainerView
	 * @generated
	 */
	EClass getPCMainboardContainerView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCMainboardContainerView#getInternalPCMainboardContainer <em>Internal PC Mainboard Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PC Mainboard Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCMainboardContainerView#getInternalPCMainboardContainer()
	 * @see #getPCMainboardContainerView()
	 * @generated
	 */
	EReference getPCMainboardContainerView_InternalPCMainboardContainer();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView <em>Mainboard Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainboard Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView
	 * @generated
	 */
	EClass getMainboardNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#getInternalMainboardNode <em>Internal Mainboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Mainboard Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#getInternalMainboardNode()
	 * @see #getMainboardNodeView()
	 * @generated
	 */
	EReference getMainboardNodeView_InternalMainboardNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#getName()
	 * @generated
	 */
	EOperation getMainboardNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardNodeView__SetName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView <em>PCCPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCCPU Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView
	 * @generated
	 */
	EClass getPCCPUNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#getInternalPCCPUNode <em>Internal PCCPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PCCPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#getInternalPCCPUNode()
	 * @see #getPCCPUNodeView()
	 * @generated
	 */
	EReference getPCCPUNodeView_InternalPCCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#getName()
	 * @generated
	 */
	EOperation getPCCPUNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getPCCPUNodeView__SetName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView <em>PCGPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCGPU Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView
	 * @generated
	 */
	EClass getPCGPUNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#getInternalPCGPUNode <em>Internal PCGPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PCGPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#getInternalPCGPUNode()
	 * @see #getPCGPUNodeView()
	 * @generated
	 */
	EReference getPCGPUNodeView_InternalPCGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#getName()
	 * @generated
	 */
	EOperation getPCGPUNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getPCGPUNodeView__SetName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMNodeView <em>PCRAM Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCRAM Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMNodeView
	 * @generated
	 */
	EClass getPCRAMNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMNodeView#getInternalPCRAMNode <em>Internal PCRAM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PCRAM Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMNodeView#getInternalPCRAMNode()
	 * @see #getPCRAMNodeView()
	 * @generated
	 */
	EReference getPCRAMNodeView_InternalPCRAMNode();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView <em>PCRAM Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCRAM Slot View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView
	 * @generated
	 */
	EClass getPCRAMSlotView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#getInternalPCRAMSlot <em>Internal PCRAM Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PCRAM Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#getInternalPCRAMSlot()
	 * @see #getPCRAMSlotView()
	 * @generated
	 */
	EReference getPCRAMSlotView_InternalPCRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#getSlotType() <em>Get Slot Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slot Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#getSlotType()
	 * @generated
	 */
	EOperation getPCRAMSlotView__GetSlotType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#setSlotType(java.lang.String) <em>Set Slot Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Slot Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#setSlotType(java.lang.String)
	 * @generated
	 */
	EOperation getPCRAMSlotView__SetSlotType__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView <em>PC View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView
	 * @generated
	 */
	EClass getPCView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView#getInternalPC <em>Internal PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal PC</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView#getInternalPC()
	 * @see #getPCView()
	 * @generated
	 */
	EReference getPCView_InternalPC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.CaseContainerViewImpl <em>Case Container View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.CaseContainerViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getCaseContainerView()
		 * @generated
		 */
		EClass CASE_CONTAINER_VIEW = eINSTANCE.getCaseContainerView();

		/**
		 * The meta object literal for the '<em><b>Internal Case Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER = eINSTANCE.getCaseContainerView_InternalCaseContainer();

		/**
		 * The meta object literal for the '<em><b>Get Case Internal Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___GET_CASE_INTERNAL_SLOTS = eINSTANCE.getCaseContainerView__GetCaseInternalSlots();

		/**
		 * The meta object literal for the '<em><b>Set Case Internal Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___SET_CASE_INTERNAL_SLOTS__INT = eINSTANCE.getCaseContainerView__SetCaseInternalSlots__int();

		/**
		 * The meta object literal for the '<em><b>Get Case Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___GET_CASE_PRICE = eINSTANCE.getCaseContainerView__GetCasePrice();

		/**
		 * The meta object literal for the '<em><b>Set Case Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___SET_CASE_PRICE__FLOAT = eINSTANCE.getCaseContainerView__SetCasePrice__float();

		/**
		 * The meta object literal for the '<em><b>Get Case External Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___GET_CASE_EXTERNAL_SLOTS = eINSTANCE.getCaseContainerView__GetCaseExternalSlots();

		/**
		 * The meta object literal for the '<em><b>Set Case External Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___SET_CASE_EXTERNAL_SLOTS__INT = eINSTANCE.getCaseContainerView__SetCaseExternalSlots__int();

		/**
		 * The meta object literal for the '<em><b>Get Case Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___GET_CASE_NAME = eINSTANCE.getCaseContainerView__GetCaseName();

		/**
		 * The meta object literal for the '<em><b>Set Case Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___SET_CASE_NAME__STRING = eINSTANCE.getCaseContainerView__SetCaseName__String();

		/**
		 * The meta object literal for the '<em><b>Get Case Form Factor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___GET_CASE_FORM_FACTOR = eINSTANCE.getCaseContainerView__GetCaseFormFactor();

		/**
		 * The meta object literal for the '<em><b>Set Case Form Factor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASE_CONTAINER_VIEW___SET_CASE_FORM_FACTOR__STRING = eINSTANCE.getCaseContainerView__SetCaseFormFactor__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveContainerViewImpl <em>Drive Container View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveContainerViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getDriveContainerView()
		 * @generated
		 */
		EClass DRIVE_CONTAINER_VIEW = eINSTANCE.getDriveContainerView();

		/**
		 * The meta object literal for the '<em><b>Internal Drive Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER = eINSTANCE.getDriveContainerView_InternalDriveContainer();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveNodeViewImpl <em>Drive Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getDriveNodeView()
		 * @generated
		 */
		EClass DRIVE_NODE_VIEW = eINSTANCE.getDriveNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal Drive Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE = eINSTANCE.getDriveNodeView_InternalDriveNode();

		/**
		 * The meta object literal for the '<em><b>Get Drive Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___GET_DRIVE_DESCRIPTION = eINSTANCE.getDriveNodeView__GetDriveDescription();

		/**
		 * The meta object literal for the '<em><b>Set Drive Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___SET_DRIVE_DESCRIPTION__STRING = eINSTANCE.getDriveNodeView__SetDriveDescription__String();

		/**
		 * The meta object literal for the '<em><b>Get Drive Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___GET_DRIVE_POWER_CONSUMPTION = eINSTANCE.getDriveNodeView__GetDrivePowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Set Drive Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___SET_DRIVE_POWER_CONSUMPTION__INT = eINSTANCE.getDriveNodeView__SetDrivePowerConsumption__int();

		/**
		 * The meta object literal for the '<em><b>Get Drive Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___GET_DRIVE_PRICE = eINSTANCE.getDriveNodeView__GetDrivePrice();

		/**
		 * The meta object literal for the '<em><b>Set Drive Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___SET_DRIVE_PRICE__FLOAT = eINSTANCE.getDriveNodeView__SetDrivePrice__float();

		/**
		 * The meta object literal for the '<em><b>Get Drive Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___GET_DRIVE_TYPE = eINSTANCE.getDriveNodeView__GetDriveType();

		/**
		 * The meta object literal for the '<em><b>Set Drive Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___SET_DRIVE_TYPE__STRING = eINSTANCE.getDriveNodeView__SetDriveType__String();

		/**
		 * The meta object literal for the '<em><b>Get Drive Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___GET_DRIVE_NAME = eINSTANCE.getDriveNodeView__GetDriveName();

		/**
		 * The meta object literal for the '<em><b>Set Drive Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRIVE_NODE_VIEW___SET_DRIVE_NAME__STRING = eINSTANCE.getDriveNodeView__SetDriveName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUContainerViewImpl <em>PSU Container View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUContainerViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPSUContainerView()
		 * @generated
		 */
		EClass PSU_CONTAINER_VIEW = eINSTANCE.getPSUContainerView();

		/**
		 * The meta object literal for the '<em><b>Internal PSU Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER = eINSTANCE.getPSUContainerView_InternalPSUContainer();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUNodeViewImpl <em>PSU Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPSUNodeView()
		 * @generated
		 */
		EClass PSU_NODE_VIEW = eINSTANCE.getPSUNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal PSU Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSU_NODE_VIEW__INTERNAL_PSU_NODE = eINSTANCE.getPSUNodeView_InternalPSUNode();

		/**
		 * The meta object literal for the '<em><b>Get Psu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSU_NODE_VIEW___GET_PSU_NAME = eINSTANCE.getPSUNodeView__GetPsuName();

		/**
		 * The meta object literal for the '<em><b>Set Psu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSU_NODE_VIEW___SET_PSU_NAME__STRING = eINSTANCE.getPSUNodeView__SetPsuName__String();

		/**
		 * The meta object literal for the '<em><b>Get Psu Power</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSU_NODE_VIEW___GET_PSU_POWER = eINSTANCE.getPSUNodeView__GetPsuPower();

		/**
		 * The meta object literal for the '<em><b>Set Psu Power</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSU_NODE_VIEW___SET_PSU_POWER__INT = eINSTANCE.getPSUNodeView__SetPsuPower__int();

		/**
		 * The meta object literal for the '<em><b>Get Psu Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSU_NODE_VIEW___GET_PSU_PRICE = eINSTANCE.getPSUNodeView__GetPsuPrice();

		/**
		 * The meta object literal for the '<em><b>Set Psu Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSU_NODE_VIEW___SET_PSU_PRICE__FLOAT = eINSTANCE.getPSUNodeView__SetPsuPrice__float();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCMainboardContainerViewImpl <em>PC Mainboard Container View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCMainboardContainerViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCMainboardContainerView()
		 * @generated
		 */
		EClass PC_MAINBOARD_CONTAINER_VIEW = eINSTANCE.getPCMainboardContainerView();

		/**
		 * The meta object literal for the '<em><b>Internal PC Mainboard Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER = eINSTANCE.getPCMainboardContainerView_InternalPCMainboardContainer();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.MainboardNodeViewImpl <em>Mainboard Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.MainboardNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getMainboardNodeView()
		 * @generated
		 */
		EClass MAINBOARD_NODE_VIEW = eINSTANCE.getMainboardNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal Mainboard Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE = eINSTANCE.getMainboardNodeView_InternalMainboardNode();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_NODE_VIEW___GET_NAME = eINSTANCE.getMainboardNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getMainboardNodeView__SetName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCCPUNodeViewImpl <em>PCCPU Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCCPUNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCCPUNodeView()
		 * @generated
		 */
		EClass PCCPU_NODE_VIEW = eINSTANCE.getPCCPUNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal PCCPU Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE = eINSTANCE.getPCCPUNodeView_InternalPCCPUNode();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCCPU_NODE_VIEW___GET_NAME = eINSTANCE.getPCCPUNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCCPU_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getPCCPUNodeView__SetName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCGPUNodeViewImpl <em>PCGPU Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCGPUNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCGPUNodeView()
		 * @generated
		 */
		EClass PCGPU_NODE_VIEW = eINSTANCE.getPCGPUNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal PCGPU Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE = eINSTANCE.getPCGPUNodeView_InternalPCGPUNode();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCGPU_NODE_VIEW___GET_NAME = eINSTANCE.getPCGPUNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCGPU_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getPCGPUNodeView__SetName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMNodeViewImpl <em>PCRAM Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCRAMNodeView()
		 * @generated
		 */
		EClass PCRAM_NODE_VIEW = eINSTANCE.getPCRAMNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal PCRAM Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE = eINSTANCE.getPCRAMNodeView_InternalPCRAMNode();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMSlotViewImpl <em>PCRAM Slot View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMSlotViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCRAMSlotView()
		 * @generated
		 */
		EClass PCRAM_SLOT_VIEW = eINSTANCE.getPCRAMSlotView();

		/**
		 * The meta object literal for the '<em><b>Internal PCRAM Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT = eINSTANCE.getPCRAMSlotView_InternalPCRAMSlot();

		/**
		 * The meta object literal for the '<em><b>Get Slot Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCRAM_SLOT_VIEW___GET_SLOT_TYPE = eINSTANCE.getPCRAMSlotView__GetSlotType();

		/**
		 * The meta object literal for the '<em><b>Set Slot Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PCRAM_SLOT_VIEW___SET_SLOT_TYPE__STRING = eINSTANCE.getPCRAMSlotView__SetSlotType__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCViewImpl <em>PC View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsPackageImpl#getPCView()
		 * @generated
		 */
		EClass PC_VIEW = eINSTANCE.getPCView();

		/**
		 * The meta object literal for the '<em><b>Internal PC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PC_VIEW__INTERNAL_PC = eINSTANCE.getPCView_InternalPC();

	}

} //ViewsPackage
