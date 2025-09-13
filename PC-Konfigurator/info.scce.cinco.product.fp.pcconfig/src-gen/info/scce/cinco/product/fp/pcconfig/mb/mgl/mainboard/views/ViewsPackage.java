/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views;

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
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsFactory
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
	String eNS_URI = "http://cinco.scce.info/product/fp/pcconfig/mb/mgl/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mainboard-views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardContainerViewImpl <em>Mainboard Container View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardContainerViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getMainboardContainerView()
	 * @generated
	 */
	int MAINBOARD_CONTAINER_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Internal Mainboard Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Mainboard Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Num PC Ie16 Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_NUM_PC_IE16_SLOTS = 0;

	/**
	 * The operation id for the '<em>Set Num PC Ie16 Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_NUM_PC_IE16_SLOTS__INT = 1;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_POWER_CONSUMPTION = 2;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_POWER_CONSUMPTION__INT = 3;

	/**
	 * The operation id for the '<em>Get Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_FORM_FACTOR = 4;

	/**
	 * The operation id for the '<em>Set Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_FORM_FACTOR__STRING = 5;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_PRICE = 6;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_PRICE__FLOAT = 7;

	/**
	 * The operation id for the '<em>Get Num Sata Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_NUM_SATA_PORTS = 8;

	/**
	 * The operation id for the '<em>Set Num Sata Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_NUM_SATA_PORTS__INT = 9;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_NAME = 10;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_NAME__STRING = 11;

	/**
	 * The operation id for the '<em>Get Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_SOCKET = 12;

	/**
	 * The operation id for the '<em>Set Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_SOCKET__STRING = 13;

	/**
	 * The operation id for the '<em>Get Chipset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_CHIPSET = 14;

	/**
	 * The operation id for the '<em>Set Chipset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_CHIPSET__STRING = 15;

	/**
	 * The operation id for the '<em>Get Type Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_TYPE_MEMORY_SLOTS = 16;

	/**
	 * The operation id for the '<em>Set Type Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_TYPE_MEMORY_SLOTS__STRING = 17;

	/**
	 * The operation id for the '<em>Get Num Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___GET_NUM_MEMORY_SLOTS = 18;

	/**
	 * The operation id for the '<em>Set Num Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW___SET_NUM_MEMORY_SLOTS__INT = 19;

	/**
	 * The number of operations of the '<em>Mainboard Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_VIEW_OPERATION_COUNT = 20;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUSlotViewImpl <em>CPU Slot View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUSlotViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getCPUSlotView()
	 * @generated
	 */
	int CPU_SLOT_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Internal CPU Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT_VIEW__INTERNAL_CPU_SLOT = 0;

	/**
	 * The number of structural features of the '<em>CPU Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT_VIEW___GET_SOCKET = 0;

	/**
	 * The operation id for the '<em>Set Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT_VIEW___SET_SOCKET__STRING = 1;

	/**
	 * The number of operations of the '<em>CPU Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMSlotViewImpl <em>RAM Slot View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMSlotViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getRAMSlotView()
	 * @generated
	 */
	int RAM_SLOT_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Internal RAM Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT_VIEW__INTERNAL_RAM_SLOT = 0;

	/**
	 * The number of structural features of the '<em>RAM Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT_VIEW___GET_RAM_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT_VIEW___SET_RAM_TYPE__STRING = 1;

	/**
	 * The number of operations of the '<em>RAM Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT_VIEW_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUSlotViewImpl <em>GPU Slot View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUSlotViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getGPUSlotView()
	 * @generated
	 */
	int GPU_SLOT_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Internal GPU Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT_VIEW__INTERNAL_GPU_SLOT = 0;

	/**
	 * The number of structural features of the '<em>GPU Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GPU Slot View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUNodeViewImpl <em>CPU Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getCPUNodeView()
	 * @generated
	 */
	int CPU_NODE_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Internal CPU Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW__INTERNAL_CPU_NODE = 0;

	/**
	 * The number of structural features of the '<em>CPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Cpu Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___GET_CPU_TYPE = 0;

	/**
	 * The operation id for the '<em>Set Cpu Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___SET_CPU_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___GET_POWER_CONSUMPTION = 2;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___SET_POWER_CONSUMPTION__INT = 3;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___GET_PRICE = 4;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___SET_PRICE__FLOAT = 5;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___GET_NAME = 6;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___SET_NAME__STRING = 7;

	/**
	 * The operation id for the '<em>Get Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___GET_SOCKET = 8;

	/**
	 * The operation id for the '<em>Set Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW___SET_SOCKET__STRING = 9;

	/**
	 * The number of operations of the '<em>CPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_VIEW_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMNodeViewImpl <em>RAM Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getRAMNodeView()
	 * @generated
	 */
	int RAM_NODE_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Internal RAM Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW__INTERNAL_RAM_NODE = 0;

	/**
	 * The number of structural features of the '<em>RAM Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___GET_POWER_CONSUMPTION = 0;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___SET_POWER_CONSUMPTION__INT = 1;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___GET_PRICE = 2;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___SET_PRICE__FLOAT = 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___GET_NAME = 4;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___SET_NAME__STRING = 5;

	/**
	 * The operation id for the '<em>Get Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___GET_RAM_TYPE = 6;

	/**
	 * The operation id for the '<em>Set Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___SET_RAM_TYPE__STRING = 7;

	/**
	 * The operation id for the '<em>Get Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___GET_CAPACITY = 8;

	/**
	 * The operation id for the '<em>Set Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW___SET_CAPACITY__INT = 9;

	/**
	 * The number of operations of the '<em>RAM Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_VIEW_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUNodeViewImpl <em>GPU Node View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUNodeViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getGPUNodeView()
	 * @generated
	 */
	int GPU_NODE_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Internal GPU Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW__INTERNAL_GPU_NODE = 0;

	/**
	 * The number of structural features of the '<em>GPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Chip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___GET_CHIP = 0;

	/**
	 * The operation id for the '<em>Set Chip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___SET_CHIP__STRING = 1;

	/**
	 * The operation id for the '<em>Get Memory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___GET_MEMORY = 2;

	/**
	 * The operation id for the '<em>Set Memory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___SET_MEMORY__INT = 3;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___GET_POWER_CONSUMPTION = 4;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___SET_POWER_CONSUMPTION__INT = 5;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___GET_PRICE = 6;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___SET_PRICE__FLOAT = 7;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___GET_NAME = 8;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW___SET_NAME__STRING = 9;

	/**
	 * The number of operations of the '<em>GPU Node View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_VIEW_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardViewImpl <em>Mainboard View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardViewImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getMainboardView()
	 * @generated
	 */
	int MAINBOARD_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Internal Mainboard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_VIEW__INTERNAL_MAINBOARD = 0;

	/**
	 * The number of structural features of the '<em>Mainboard View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mainboard View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_VIEW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView <em>Mainboard Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainboard Container View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView
	 * @generated
	 */
	EClass getMainboardContainerView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getInternalMainboardContainer <em>Internal Mainboard Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Mainboard Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getInternalMainboardContainer()
	 * @see #getMainboardContainerView()
	 * @generated
	 */
	EReference getMainboardContainerView_InternalMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getNumPCIe16Slots() <em>Get Num PC Ie16 Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num PC Ie16 Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getNumPCIe16Slots()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetNumPCIe16Slots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setNumPCIe16Slots(int) <em>Set Num PC Ie16 Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Num PC Ie16 Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setNumPCIe16Slots(int)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetNumPCIe16Slots__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getPowerConsumption()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getFormFactor() <em>Get Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getFormFactor()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetFormFactor();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setFormFactor(java.lang.String) <em>Set Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setFormFactor(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetFormFactor__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getPrice()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setPrice(float)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getNumSataPorts() <em>Get Num Sata Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num Sata Ports</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getNumSataPorts()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetNumSataPorts();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setNumSataPorts(int) <em>Set Num Sata Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Num Sata Ports</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setNumSataPorts(int)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetNumSataPorts__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getName()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getSocket() <em>Get Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getSocket()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetSocket();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setSocket(java.lang.String) <em>Set Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setSocket(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetSocket__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getChipset() <em>Get Chipset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Chipset</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getChipset()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetChipset();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setChipset(java.lang.String) <em>Set Chipset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Chipset</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setChipset(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetChipset__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getTypeMemorySlots() <em>Get Type Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getTypeMemorySlots()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetTypeMemorySlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setTypeMemorySlots(java.lang.String) <em>Set Type Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Type Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setTypeMemorySlots(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetTypeMemorySlots__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getNumMemorySlots() <em>Get Num Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#getNumMemorySlots()
	 * @generated
	 */
	EOperation getMainboardContainerView__GetNumMemorySlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setNumMemorySlots(int) <em>Set Num Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Num Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView#setNumMemorySlots(int)
	 * @generated
	 */
	EOperation getMainboardContainerView__SetNumMemorySlots__int();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView <em>CPU Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Slot View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView
	 * @generated
	 */
	EClass getCPUSlotView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#getInternalCPUSlot <em>Internal CPU Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal CPU Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#getInternalCPUSlot()
	 * @see #getCPUSlotView()
	 * @generated
	 */
	EReference getCPUSlotView_InternalCPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#getSocket() <em>Get Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#getSocket()
	 * @generated
	 */
	EOperation getCPUSlotView__GetSocket();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#setSocket(java.lang.String) <em>Set Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#setSocket(java.lang.String)
	 * @generated
	 */
	EOperation getCPUSlotView__SetSocket__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView <em>RAM Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM Slot View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView
	 * @generated
	 */
	EClass getRAMSlotView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#getInternalRAMSlot <em>Internal RAM Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal RAM Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#getInternalRAMSlot()
	 * @see #getRAMSlotView()
	 * @generated
	 */
	EReference getRAMSlotView_InternalRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#getRamType() <em>Get Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#getRamType()
	 * @generated
	 */
	EOperation getRAMSlotView__GetRamType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#setRamType(java.lang.String) <em>Set Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#setRamType(java.lang.String)
	 * @generated
	 */
	EOperation getRAMSlotView__SetRamType__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUSlotView <em>GPU Slot View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPU Slot View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUSlotView
	 * @generated
	 */
	EClass getGPUSlotView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUSlotView#getInternalGPUSlot <em>Internal GPU Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal GPU Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUSlotView#getInternalGPUSlot()
	 * @see #getGPUSlotView()
	 * @generated
	 */
	EReference getGPUSlotView_InternalGPUSlot();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView <em>CPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView
	 * @generated
	 */
	EClass getCPUNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getInternalCPUNode <em>Internal CPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal CPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getInternalCPUNode()
	 * @see #getCPUNodeView()
	 * @generated
	 */
	EReference getCPUNodeView_InternalCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getCpuType() <em>Get Cpu Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cpu Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getCpuType()
	 * @generated
	 */
	EOperation getCPUNodeView__GetCpuType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setCpuType(java.lang.String) <em>Set Cpu Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cpu Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setCpuType(java.lang.String)
	 * @generated
	 */
	EOperation getCPUNodeView__SetCpuType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getPowerConsumption()
	 * @generated
	 */
	EOperation getCPUNodeView__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getCPUNodeView__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getPrice()
	 * @generated
	 */
	EOperation getCPUNodeView__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setPrice(float)
	 * @generated
	 */
	EOperation getCPUNodeView__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getName()
	 * @generated
	 */
	EOperation getCPUNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getCPUNodeView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getSocket() <em>Get Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#getSocket()
	 * @generated
	 */
	EOperation getCPUNodeView__GetSocket();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setSocket(java.lang.String) <em>Set Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView#setSocket(java.lang.String)
	 * @generated
	 */
	EOperation getCPUNodeView__SetSocket__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView <em>RAM Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView
	 * @generated
	 */
	EClass getRAMNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getInternalRAMNode <em>Internal RAM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal RAM Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getInternalRAMNode()
	 * @see #getRAMNodeView()
	 * @generated
	 */
	EReference getRAMNodeView_InternalRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getPowerConsumption()
	 * @generated
	 */
	EOperation getRAMNodeView__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getRAMNodeView__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getPrice()
	 * @generated
	 */
	EOperation getRAMNodeView__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setPrice(float)
	 * @generated
	 */
	EOperation getRAMNodeView__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getName()
	 * @generated
	 */
	EOperation getRAMNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRAMNodeView__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getRamType() <em>Get Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getRamType()
	 * @generated
	 */
	EOperation getRAMNodeView__GetRamType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setRamType(java.lang.String) <em>Set Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setRamType(java.lang.String)
	 * @generated
	 */
	EOperation getRAMNodeView__SetRamType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getCapacity() <em>Get Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Capacity</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getCapacity()
	 * @generated
	 */
	EOperation getRAMNodeView__GetCapacity();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setCapacity(int) <em>Set Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Capacity</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#setCapacity(int)
	 * @generated
	 */
	EOperation getRAMNodeView__SetCapacity__int();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView <em>GPU Node View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPU Node View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView
	 * @generated
	 */
	EClass getGPUNodeView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getInternalGPUNode <em>Internal GPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal GPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getInternalGPUNode()
	 * @see #getGPUNodeView()
	 * @generated
	 */
	EReference getGPUNodeView_InternalGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getChip() <em>Get Chip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Chip</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getChip()
	 * @generated
	 */
	EOperation getGPUNodeView__GetChip();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setChip(java.lang.String) <em>Set Chip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Chip</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setChip(java.lang.String)
	 * @generated
	 */
	EOperation getGPUNodeView__SetChip__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getMemory() <em>Get Memory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Memory</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getMemory()
	 * @generated
	 */
	EOperation getGPUNodeView__GetMemory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setMemory(int) <em>Set Memory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Memory</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setMemory(int)
	 * @generated
	 */
	EOperation getGPUNodeView__SetMemory__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getPowerConsumption()
	 * @generated
	 */
	EOperation getGPUNodeView__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getGPUNodeView__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getPrice()
	 * @generated
	 */
	EOperation getGPUNodeView__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setPrice(float)
	 * @generated
	 */
	EOperation getGPUNodeView__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#getName()
	 * @generated
	 */
	EOperation getGPUNodeView__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView#setName(java.lang.String)
	 * @generated
	 */
	EOperation getGPUNodeView__SetName__String();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView <em>Mainboard View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainboard View</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView
	 * @generated
	 */
	EClass getMainboardView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView#getInternalMainboard <em>Internal Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Mainboard</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView#getInternalMainboard()
	 * @see #getMainboardView()
	 * @generated
	 */
	EReference getMainboardView_InternalMainboard();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardContainerViewImpl <em>Mainboard Container View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardContainerViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getMainboardContainerView()
		 * @generated
		 */
		EClass MAINBOARD_CONTAINER_VIEW = eINSTANCE.getMainboardContainerView();

		/**
		 * The meta object literal for the '<em><b>Internal Mainboard Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER = eINSTANCE.getMainboardContainerView_InternalMainboardContainer();

		/**
		 * The meta object literal for the '<em><b>Get Num PC Ie16 Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_NUM_PC_IE16_SLOTS = eINSTANCE.getMainboardContainerView__GetNumPCIe16Slots();

		/**
		 * The meta object literal for the '<em><b>Set Num PC Ie16 Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_NUM_PC_IE16_SLOTS__INT = eINSTANCE.getMainboardContainerView__SetNumPCIe16Slots__int();

		/**
		 * The meta object literal for the '<em><b>Get Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_POWER_CONSUMPTION = eINSTANCE.getMainboardContainerView__GetPowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Set Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_POWER_CONSUMPTION__INT = eINSTANCE.getMainboardContainerView__SetPowerConsumption__int();

		/**
		 * The meta object literal for the '<em><b>Get Form Factor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_FORM_FACTOR = eINSTANCE.getMainboardContainerView__GetFormFactor();

		/**
		 * The meta object literal for the '<em><b>Set Form Factor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_FORM_FACTOR__STRING = eINSTANCE.getMainboardContainerView__SetFormFactor__String();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_PRICE = eINSTANCE.getMainboardContainerView__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_PRICE__FLOAT = eINSTANCE.getMainboardContainerView__SetPrice__float();

		/**
		 * The meta object literal for the '<em><b>Get Num Sata Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_NUM_SATA_PORTS = eINSTANCE.getMainboardContainerView__GetNumSataPorts();

		/**
		 * The meta object literal for the '<em><b>Set Num Sata Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_NUM_SATA_PORTS__INT = eINSTANCE.getMainboardContainerView__SetNumSataPorts__int();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_NAME = eINSTANCE.getMainboardContainerView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_NAME__STRING = eINSTANCE.getMainboardContainerView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Socket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_SOCKET = eINSTANCE.getMainboardContainerView__GetSocket();

		/**
		 * The meta object literal for the '<em><b>Set Socket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_SOCKET__STRING = eINSTANCE.getMainboardContainerView__SetSocket__String();

		/**
		 * The meta object literal for the '<em><b>Get Chipset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_CHIPSET = eINSTANCE.getMainboardContainerView__GetChipset();

		/**
		 * The meta object literal for the '<em><b>Set Chipset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_CHIPSET__STRING = eINSTANCE.getMainboardContainerView__SetChipset__String();

		/**
		 * The meta object literal for the '<em><b>Get Type Memory Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_TYPE_MEMORY_SLOTS = eINSTANCE.getMainboardContainerView__GetTypeMemorySlots();

		/**
		 * The meta object literal for the '<em><b>Set Type Memory Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_TYPE_MEMORY_SLOTS__STRING = eINSTANCE.getMainboardContainerView__SetTypeMemorySlots__String();

		/**
		 * The meta object literal for the '<em><b>Get Num Memory Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___GET_NUM_MEMORY_SLOTS = eINSTANCE.getMainboardContainerView__GetNumMemorySlots();

		/**
		 * The meta object literal for the '<em><b>Set Num Memory Slots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD_CONTAINER_VIEW___SET_NUM_MEMORY_SLOTS__INT = eINSTANCE.getMainboardContainerView__SetNumMemorySlots__int();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUSlotViewImpl <em>CPU Slot View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUSlotViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getCPUSlotView()
		 * @generated
		 */
		EClass CPU_SLOT_VIEW = eINSTANCE.getCPUSlotView();

		/**
		 * The meta object literal for the '<em><b>Internal CPU Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPU_SLOT_VIEW__INTERNAL_CPU_SLOT = eINSTANCE.getCPUSlotView_InternalCPUSlot();

		/**
		 * The meta object literal for the '<em><b>Get Socket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_SLOT_VIEW___GET_SOCKET = eINSTANCE.getCPUSlotView__GetSocket();

		/**
		 * The meta object literal for the '<em><b>Set Socket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_SLOT_VIEW___SET_SOCKET__STRING = eINSTANCE.getCPUSlotView__SetSocket__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMSlotViewImpl <em>RAM Slot View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMSlotViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getRAMSlotView()
		 * @generated
		 */
		EClass RAM_SLOT_VIEW = eINSTANCE.getRAMSlotView();

		/**
		 * The meta object literal for the '<em><b>Internal RAM Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAM_SLOT_VIEW__INTERNAL_RAM_SLOT = eINSTANCE.getRAMSlotView_InternalRAMSlot();

		/**
		 * The meta object literal for the '<em><b>Get Ram Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_SLOT_VIEW___GET_RAM_TYPE = eINSTANCE.getRAMSlotView__GetRamType();

		/**
		 * The meta object literal for the '<em><b>Set Ram Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_SLOT_VIEW___SET_RAM_TYPE__STRING = eINSTANCE.getRAMSlotView__SetRamType__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUSlotViewImpl <em>GPU Slot View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUSlotViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getGPUSlotView()
		 * @generated
		 */
		EClass GPU_SLOT_VIEW = eINSTANCE.getGPUSlotView();

		/**
		 * The meta object literal for the '<em><b>Internal GPU Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPU_SLOT_VIEW__INTERNAL_GPU_SLOT = eINSTANCE.getGPUSlotView_InternalGPUSlot();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUNodeViewImpl <em>CPU Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getCPUNodeView()
		 * @generated
		 */
		EClass CPU_NODE_VIEW = eINSTANCE.getCPUNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal CPU Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPU_NODE_VIEW__INTERNAL_CPU_NODE = eINSTANCE.getCPUNodeView_InternalCPUNode();

		/**
		 * The meta object literal for the '<em><b>Get Cpu Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___GET_CPU_TYPE = eINSTANCE.getCPUNodeView__GetCpuType();

		/**
		 * The meta object literal for the '<em><b>Set Cpu Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___SET_CPU_TYPE__STRING = eINSTANCE.getCPUNodeView__SetCpuType__String();

		/**
		 * The meta object literal for the '<em><b>Get Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___GET_POWER_CONSUMPTION = eINSTANCE.getCPUNodeView__GetPowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Set Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___SET_POWER_CONSUMPTION__INT = eINSTANCE.getCPUNodeView__SetPowerConsumption__int();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___GET_PRICE = eINSTANCE.getCPUNodeView__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___SET_PRICE__FLOAT = eINSTANCE.getCPUNodeView__SetPrice__float();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___GET_NAME = eINSTANCE.getCPUNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getCPUNodeView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Socket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___GET_SOCKET = eINSTANCE.getCPUNodeView__GetSocket();

		/**
		 * The meta object literal for the '<em><b>Set Socket</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU_NODE_VIEW___SET_SOCKET__STRING = eINSTANCE.getCPUNodeView__SetSocket__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMNodeViewImpl <em>RAM Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getRAMNodeView()
		 * @generated
		 */
		EClass RAM_NODE_VIEW = eINSTANCE.getRAMNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal RAM Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAM_NODE_VIEW__INTERNAL_RAM_NODE = eINSTANCE.getRAMNodeView_InternalRAMNode();

		/**
		 * The meta object literal for the '<em><b>Get Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___GET_POWER_CONSUMPTION = eINSTANCE.getRAMNodeView__GetPowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Set Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___SET_POWER_CONSUMPTION__INT = eINSTANCE.getRAMNodeView__SetPowerConsumption__int();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___GET_PRICE = eINSTANCE.getRAMNodeView__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___SET_PRICE__FLOAT = eINSTANCE.getRAMNodeView__SetPrice__float();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___GET_NAME = eINSTANCE.getRAMNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getRAMNodeView__SetName__String();

		/**
		 * The meta object literal for the '<em><b>Get Ram Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___GET_RAM_TYPE = eINSTANCE.getRAMNodeView__GetRamType();

		/**
		 * The meta object literal for the '<em><b>Set Ram Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___SET_RAM_TYPE__STRING = eINSTANCE.getRAMNodeView__SetRamType__String();

		/**
		 * The meta object literal for the '<em><b>Get Capacity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___GET_CAPACITY = eINSTANCE.getRAMNodeView__GetCapacity();

		/**
		 * The meta object literal for the '<em><b>Set Capacity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RAM_NODE_VIEW___SET_CAPACITY__INT = eINSTANCE.getRAMNodeView__SetCapacity__int();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUNodeViewImpl <em>GPU Node View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUNodeViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getGPUNodeView()
		 * @generated
		 */
		EClass GPU_NODE_VIEW = eINSTANCE.getGPUNodeView();

		/**
		 * The meta object literal for the '<em><b>Internal GPU Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPU_NODE_VIEW__INTERNAL_GPU_NODE = eINSTANCE.getGPUNodeView_InternalGPUNode();

		/**
		 * The meta object literal for the '<em><b>Get Chip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___GET_CHIP = eINSTANCE.getGPUNodeView__GetChip();

		/**
		 * The meta object literal for the '<em><b>Set Chip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___SET_CHIP__STRING = eINSTANCE.getGPUNodeView__SetChip__String();

		/**
		 * The meta object literal for the '<em><b>Get Memory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___GET_MEMORY = eINSTANCE.getGPUNodeView__GetMemory();

		/**
		 * The meta object literal for the '<em><b>Set Memory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___SET_MEMORY__INT = eINSTANCE.getGPUNodeView__SetMemory__int();

		/**
		 * The meta object literal for the '<em><b>Get Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___GET_POWER_CONSUMPTION = eINSTANCE.getGPUNodeView__GetPowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Set Power Consumption</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___SET_POWER_CONSUMPTION__INT = eINSTANCE.getGPUNodeView__SetPowerConsumption__int();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___GET_PRICE = eINSTANCE.getGPUNodeView__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Set Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___SET_PRICE__FLOAT = eINSTANCE.getGPUNodeView__SetPrice__float();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___GET_NAME = eINSTANCE.getGPUNodeView__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GPU_NODE_VIEW___SET_NAME__STRING = eINSTANCE.getGPUNodeView__SetName__String();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardViewImpl <em>Mainboard View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardViewImpl
		 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsPackageImpl#getMainboardView()
		 * @generated
		 */
		EClass MAINBOARD_VIEW = eINSTANCE.getMainboardView();

		/**
		 * The meta object literal for the '<em><b>Internal Mainboard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINBOARD_VIEW__INTERNAL_MAINBOARD = eINSTANCE.getMainboardView_InternalMainboard();

	}

} //ViewsPackage
