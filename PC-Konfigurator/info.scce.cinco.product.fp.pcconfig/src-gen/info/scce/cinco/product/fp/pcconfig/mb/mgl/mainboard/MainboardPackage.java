/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard;

import graphmodel.GraphmodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardFactory
 * @model kind="package"
 * @generated
 */
public interface MainboardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mainboard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/fp/pcconfig/mb/mgl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mainboard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MainboardPackage eINSTANCE = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardContainerImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getMainboardContainer()
	 * @generated
	 */
	int MAINBOARD_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Num PC Ie16 Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_NUM_PC_IE16_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Num PC Ie16 Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_NUM_PC_IE16_SLOTS__INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_POWER_CONSUMPTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_POWER_CONSUMPTION__INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_FORM_FACTOR = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_FORM_FACTOR__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_PRICE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_PRICE__FLOAT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Num Sata Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_NUM_SATA_PORTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Num Sata Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_NUM_SATA_PORTS__INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_NAME = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_NAME__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_SOCKET = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Set Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_SOCKET__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Chipset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_CHIPSET = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Set Chipset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_CHIPSET__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Type Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_TYPE_MEMORY_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Set Type Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_TYPE_MEMORY_SLOTS__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Num Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_NUM_MEMORY_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Set Num Memory Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_NUM_MEMORY_SLOTS__INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Internal Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_INTERNAL_MAINBOARD_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Exactly Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___IS_EXACTLY_MAINBOARD_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get GPU Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_GPU_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Can New GPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_NEW_GPU_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>New GPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_GPU_SLOT__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>New GPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_GPU_SLOT__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>New GPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_GPU_SLOT__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>New GPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_GPU_SLOT__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Get CPU Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_CPU_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Can New CPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_NEW_CPU_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>New CPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_CPU_SLOT__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>New CPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_CPU_SLOT__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>New CPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_CPU_SLOT__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>New CPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_CPU_SLOT__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Get RAM Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_RAM_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Can New RAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_NEW_RAM_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>New RAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_RAM_SLOT__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>New RAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_RAM_SLOT__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>New RAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_RAM_SLOT__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>New RAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___NEW_RAM_SLOT__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___CAN_MOVE_TO__MAINBOARD_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___MOVE_TO__MAINBOARD_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SMOVE_TO__MAINBOARD_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Get Referenced MB</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_REFERENCED_MB = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Get Mainboard Container View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER___GET_MAINBOARD_CONTAINER_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 59;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_CONTAINER_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 60;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.CPUSlotImpl <em>CPU Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.CPUSlotImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getCPUSlot()
	 * @generated
	 */
	int CPU_SLOT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>CPU Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_SOCKET = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SET_SOCKET__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal CPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_INTERNAL_CPU_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly CPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___IS_EXACTLY_CPU_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get CPU Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_CPU_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Can New CPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_NEW_CPU_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New CPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___NEW_CPU_NODE__EOBJECT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New CPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___NEW_CPU_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>New CPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___NEW_CPU_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>New CPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___NEW_CPU_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___CAN_MOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___MOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___SMOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get CPU Slot View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT___GET_CPU_SLOT_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>CPU Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_SLOT_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.RAMSlotImpl <em>RAM Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.RAMSlotImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getRAMSlot()
	 * @generated
	 */
	int RAM_SLOT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>RAM Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_RAM_TYPE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SET_RAM_TYPE__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal RAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_INTERNAL_RAM_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly RAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___IS_EXACTLY_RAM_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get RAM Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_RAM_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Can New RAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_NEW_RAM_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New RAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___NEW_RAM_NODE__EOBJECT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New RAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___NEW_RAM_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>New RAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___NEW_RAM_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>New RAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___NEW_RAM_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___CAN_MOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___MOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___SMOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get RAM Slot View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT___GET_RAM_SLOT_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>RAM Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_SLOT_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.GPUSlotImpl <em>GPU Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.GPUSlotImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getGPUSlot()
	 * @generated
	 */
	int GPU_SLOT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>GPU Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Internal GPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_INTERNAL_GPU_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly GPU Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___IS_EXACTLY_GPU_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get GPU Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_GPU_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Can New GPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_NEW_GPU_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>New GPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___NEW_GPU_NODE__EOBJECT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>New GPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___NEW_GPU_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New GPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___NEW_GPU_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New GPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___NEW_GPU_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___CAN_MOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___MOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___SMOVE_TO__MAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get GPU Slot View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT___GET_GPU_SLOT_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>GPU Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_SLOT_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.CPUNodeImpl <em>CPU Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.CPUNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getCPUNode()
	 * @generated
	 */
	int CPU_NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>CPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Cpu Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_CPU_TYPE = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Cpu Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_CPU_TYPE__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_POWER_CONSUMPTION = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_POWER_CONSUMPTION__INT = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_PRICE = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_PRICE__FLOAT = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_NAME = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_NAME__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_SOCKET = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Socket</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_SOCKET__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Internal CPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_INTERNAL_CPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Exactly CPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___IS_EXACTLY_CPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___CAN_MOVE_TO__CPUSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___MOVE_TO__CPUSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SMOVE_TO__CPUSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Referenced CPU</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_REFERENCED_CPU = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.NODE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get CPU Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE___GET_CPU_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>CPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.RAMNodeImpl <em>RAM Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.RAMNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getRAMNode()
	 * @generated
	 */
	int RAM_NODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>RAM Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_POWER_CONSUMPTION = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_POWER_CONSUMPTION__INT = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_PRICE = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_PRICE__FLOAT = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_NAME = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_NAME__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_RAM_TYPE = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Ram Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_RAM_TYPE__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_CAPACITY = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_CAPACITY__INT = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Internal RAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_INTERNAL_RAM_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Exactly RAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___IS_EXACTLY_RAM_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___CAN_MOVE_TO__RAMSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___MOVE_TO__RAMSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SMOVE_TO__RAMSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Referenced RAM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_REFERENCED_RAM = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.NODE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get RAM Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE___GET_RAM_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>RAM Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.GPUNodeImpl <em>GPU Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.GPUNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getGPUNode()
	 * @generated
	 */
	int GPU_NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>GPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Chip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_CHIP = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Chip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_CHIP__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Memory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_MEMORY = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Memory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_MEMORY__INT = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_POWER_CONSUMPTION = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_POWER_CONSUMPTION__INT = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_PRICE = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_PRICE__FLOAT = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_NAME = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_NAME__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Internal GPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_INTERNAL_GPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Exactly GPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___IS_EXACTLY_GPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___CAN_MOVE_TO__GPUSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___MOVE_TO__GPUSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SMOVE_TO__GPUSLOT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Referenced GPU</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_REFERENCED_GPU = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.NODE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get GPU Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE___GET_GPU_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>GPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPU_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardImpl <em>Mainboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardImpl
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardPackageImpl#getMainboard()
	 * @generated
	 */
	int MAINBOARD = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD__ID = GraphmodelPackage.GRAPH_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD__INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Mainboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_FEATURE_COUNT = GraphmodelPackage.GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___EQUALS__OBJECT = GraphmodelPackage.GRAPH_MODEL___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___HASH_CODE = GraphmodelPackage.GRAPH_MODEL___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___SAVE = GraphmodelPackage.GRAPH_MODEL___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.GRAPH_MODEL___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_ALL_NODES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_ALL_EDGES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_ALL_CONTAINERS = GraphmodelPackage.GRAPH_MODEL___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___CAN_CONTAIN__ELIST = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___CAN_CONTAIN__CLASS = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_CONTAINABLE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_EDGES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_NODES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Node Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_ALL_NODE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODE_TYPES;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Get Internal Mainboard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_INTERNAL_MAINBOARD = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly Mainboard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___IS_EXACTLY_MAINBOARD = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___PRE_DELETE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_POST_DELETE_FUNCTION = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_POST_DELETE_EVENT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___PRE_SAVE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___POST_SAVE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_ROOT_ELEMENT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_NODES = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Mainboard Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_MAINBOARD_CONTAINERS = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Can New Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___CAN_NEW_MAINBOARD_CONTAINER = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>New Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>New Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_STRING_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>New Mainboard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___NEW_MAINBOARD__STRING_STRING_BOOLEAN = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Mainboard View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_MAINBOARD_VIEW = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>Mainboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_OPERATION_COUNT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 17;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer
	 * @generated
	 */
	EClass getMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNumPCIe16Slots() <em>Get Num PC Ie16 Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num PC Ie16 Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNumPCIe16Slots()
	 * @generated
	 */
	EOperation getMainboardContainer__GetNumPCIe16Slots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setNumPCIe16Slots(int) <em>Set Num PC Ie16 Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Num PC Ie16 Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setNumPCIe16Slots(int)
	 * @generated
	 */
	EOperation getMainboardContainer__SetNumPCIe16Slots__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPowerConsumption()
	 * @generated
	 */
	EOperation getMainboardContainer__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getMainboardContainer__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getFormFactor() <em>Get Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getFormFactor()
	 * @generated
	 */
	EOperation getMainboardContainer__GetFormFactor();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setFormFactor(java.lang.String) <em>Set Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setFormFactor(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainer__SetFormFactor__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPrice()
	 * @generated
	 */
	EOperation getMainboardContainer__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setPrice(float)
	 * @generated
	 */
	EOperation getMainboardContainer__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNumSataPorts() <em>Get Num Sata Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num Sata Ports</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNumSataPorts()
	 * @generated
	 */
	EOperation getMainboardContainer__GetNumSataPorts();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setNumSataPorts(int) <em>Set Num Sata Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Num Sata Ports</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setNumSataPorts(int)
	 * @generated
	 */
	EOperation getMainboardContainer__SetNumSataPorts__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getName()
	 * @generated
	 */
	EOperation getMainboardContainer__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setName(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainer__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getSocket() <em>Get Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getSocket()
	 * @generated
	 */
	EOperation getMainboardContainer__GetSocket();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setSocket(java.lang.String) <em>Set Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setSocket(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainer__SetSocket__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getChipset() <em>Get Chipset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Chipset</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getChipset()
	 * @generated
	 */
	EOperation getMainboardContainer__GetChipset();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setChipset(java.lang.String) <em>Set Chipset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Chipset</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setChipset(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainer__SetChipset__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getTypeMemorySlots() <em>Get Type Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getTypeMemorySlots()
	 * @generated
	 */
	EOperation getMainboardContainer__GetTypeMemorySlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setTypeMemorySlots(java.lang.String) <em>Set Type Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Type Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setTypeMemorySlots(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainer__SetTypeMemorySlots__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNumMemorySlots() <em>Get Num Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNumMemorySlots()
	 * @generated
	 */
	EOperation getMainboardContainer__GetNumMemorySlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setNumMemorySlots(int) <em>Set Num Memory Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Num Memory Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setNumMemorySlots(int)
	 * @generated
	 */
	EOperation getMainboardContainer__SetNumMemorySlots__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getInternalMainboardContainer() <em>Get Internal Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getInternalMainboardContainer()
	 * @generated
	 */
	EOperation getMainboardContainer__GetInternalMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#isExactlyMainboardContainer() <em>Is Exactly Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#isExactlyMainboardContainer()
	 * @generated
	 */
	EOperation getMainboardContainer__IsExactlyMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preDelete()
	 * @generated
	 */
	EOperation getMainboardContainer__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getMainboardContainer__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getMainboardContainer__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preSave()
	 * @generated
	 */
	EOperation getMainboardContainer__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#postSave()
	 * @generated
	 */
	EOperation getMainboardContainer__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getRootElement()
	 * @generated
	 */
	EOperation getMainboardContainer__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getNodes()
	 * @generated
	 */
	EOperation getMainboardContainer__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getGPUSlots() <em>Get GPU Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GPU Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getGPUSlots()
	 * @generated
	 */
	EOperation getMainboardContainer__GetGPUSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canNewGPUSlot() <em>Can New GPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New GPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canNewGPUSlot()
	 * @generated
	 */
	EOperation getMainboardContainer__CanNewGPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(int, int) <em>New GPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewGPUSlot__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(java.lang.String, int, int) <em>New GPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewGPUSlot__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(int, int, int, int) <em>New GPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewGPUSlot__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(java.lang.String, int, int, int, int) <em>New GPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newGPUSlot(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewGPUSlot__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getCPUSlots() <em>Get CPU Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CPU Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getCPUSlots()
	 * @generated
	 */
	EOperation getMainboardContainer__GetCPUSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canNewCPUSlot() <em>Can New CPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New CPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canNewCPUSlot()
	 * @generated
	 */
	EOperation getMainboardContainer__CanNewCPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(int, int) <em>New CPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewCPUSlot__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(java.lang.String, int, int) <em>New CPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewCPUSlot__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(int, int, int, int) <em>New CPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewCPUSlot__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(java.lang.String, int, int, int, int) <em>New CPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newCPUSlot(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewCPUSlot__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getRAMSlots() <em>Get RAM Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RAM Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getRAMSlots()
	 * @generated
	 */
	EOperation getMainboardContainer__GetRAMSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canNewRAMSlot() <em>Can New RAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New RAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canNewRAMSlot()
	 * @generated
	 */
	EOperation getMainboardContainer__CanNewRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(int, int) <em>New RAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewRAMSlot__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(java.lang.String, int, int) <em>New RAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewRAMSlot__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(int, int, int, int) <em>New RAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewRAMSlot__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(java.lang.String, int, int, int, int) <em>New RAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#newRAMSlot(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__NewRAMSlot__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getMainboardContainer__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getMainboardContainer__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__CanMoveTo__Mainboard_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__MoveTo__Mainboard_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard, int, int)
	 * @generated
	 */
	EOperation getMainboardContainer__S_moveTo__Mainboard_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getContainer()
	 * @generated
	 */
	EOperation getMainboardContainer__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getReferencedMB() <em>Get Referenced MB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced MB</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getReferencedMB()
	 * @generated
	 */
	EOperation getMainboardContainer__GetReferencedMB();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getMainboardContainer__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardContainer__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getMainboardContainerView() <em>Get Mainboard Container View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mainboard Container View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer#getMainboardContainerView()
	 * @generated
	 */
	EOperation getMainboardContainer__GetMainboardContainerView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot <em>CPU Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot
	 * @generated
	 */
	EClass getCPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getSocket() <em>Get Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getSocket()
	 * @generated
	 */
	EOperation getCPUSlot__GetSocket();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#setSocket(java.lang.String) <em>Set Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#setSocket(java.lang.String)
	 * @generated
	 */
	EOperation getCPUSlot__SetSocket__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getInternalCPUSlot() <em>Get Internal CPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal CPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getInternalCPUSlot()
	 * @generated
	 */
	EOperation getCPUSlot__GetInternalCPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#isExactlyCPUSlot() <em>Is Exactly CPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly CPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#isExactlyCPUSlot()
	 * @generated
	 */
	EOperation getCPUSlot__IsExactlyCPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preDelete()
	 * @generated
	 */
	EOperation getCPUSlot__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getCPUSlot__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getCPUSlot__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preSave()
	 * @generated
	 */
	EOperation getCPUSlot__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#postSave()
	 * @generated
	 */
	EOperation getCPUSlot__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getRootElement()
	 * @generated
	 */
	EOperation getCPUSlot__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getNodes()
	 * @generated
	 */
	EOperation getCPUSlot__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getCPUNodes() <em>Get CPU Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CPU Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getCPUNodes()
	 * @generated
	 */
	EOperation getCPUSlot__GetCPUNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#canNewCPUNode() <em>Can New CPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New CPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#canNewCPUNode()
	 * @generated
	 */
	EOperation getCPUSlot__CanNewCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, int, int) <em>New CPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__NewCPUNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New CPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__NewCPUNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New CPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__NewCPUNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New CPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New CPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#newCPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__NewCPUNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getCPUSlot__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getCPUSlot__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__CanMoveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__MoveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getCPUSlot__S_moveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getContainer()
	 * @generated
	 */
	EOperation getCPUSlot__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getCPUSlotView() <em>Get CPU Slot View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CPU Slot View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot#getCPUSlotView()
	 * @generated
	 */
	EOperation getCPUSlot__GetCPUSlotView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot <em>RAM Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot
	 * @generated
	 */
	EClass getRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRamType() <em>Get Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRamType()
	 * @generated
	 */
	EOperation getRAMSlot__GetRamType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#setRamType(java.lang.String) <em>Set Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#setRamType(java.lang.String)
	 * @generated
	 */
	EOperation getRAMSlot__SetRamType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getInternalRAMSlot() <em>Get Internal RAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal RAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getInternalRAMSlot()
	 * @generated
	 */
	EOperation getRAMSlot__GetInternalRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#isExactlyRAMSlot() <em>Is Exactly RAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly RAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#isExactlyRAMSlot()
	 * @generated
	 */
	EOperation getRAMSlot__IsExactlyRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preDelete()
	 * @generated
	 */
	EOperation getRAMSlot__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getRAMSlot__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getRAMSlot__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preSave()
	 * @generated
	 */
	EOperation getRAMSlot__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#postSave()
	 * @generated
	 */
	EOperation getRAMSlot__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRootElement()
	 * @generated
	 */
	EOperation getRAMSlot__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getNodes()
	 * @generated
	 */
	EOperation getRAMSlot__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRAMNodes() <em>Get RAM Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RAM Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRAMNodes()
	 * @generated
	 */
	EOperation getRAMSlot__GetRAMNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#canNewRAMNode() <em>Can New RAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New RAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#canNewRAMNode()
	 * @generated
	 */
	EOperation getRAMSlot__CanNewRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, int, int) <em>New RAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__NewRAMNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New RAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__NewRAMNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New RAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__NewRAMNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New RAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New RAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#newRAMNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__NewRAMNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getRAMSlot__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getRAMSlot__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__CanMoveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__MoveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getRAMSlot__S_moveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getContainer()
	 * @generated
	 */
	EOperation getRAMSlot__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRAMSlotView() <em>Get RAM Slot View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RAM Slot View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot#getRAMSlotView()
	 * @generated
	 */
	EOperation getRAMSlot__GetRAMSlotView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot <em>GPU Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPU Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot
	 * @generated
	 */
	EClass getGPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getInternalGPUSlot() <em>Get Internal GPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal GPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getInternalGPUSlot()
	 * @generated
	 */
	EOperation getGPUSlot__GetInternalGPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#isExactlyGPUSlot() <em>Is Exactly GPU Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly GPU Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#isExactlyGPUSlot()
	 * @generated
	 */
	EOperation getGPUSlot__IsExactlyGPUSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preDelete()
	 * @generated
	 */
	EOperation getGPUSlot__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getGPUSlot__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getGPUSlot__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preSave()
	 * @generated
	 */
	EOperation getGPUSlot__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#postSave()
	 * @generated
	 */
	EOperation getGPUSlot__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getRootElement()
	 * @generated
	 */
	EOperation getGPUSlot__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getNodes()
	 * @generated
	 */
	EOperation getGPUSlot__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getGPUNodes() <em>Get GPU Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GPU Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getGPUNodes()
	 * @generated
	 */
	EOperation getGPUSlot__GetGPUNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#canNewGPUNode() <em>Can New GPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New GPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#canNewGPUNode()
	 * @generated
	 */
	EOperation getGPUSlot__CanNewGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, int, int) <em>New GPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__NewGPUNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New GPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__NewGPUNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New GPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__NewGPUNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New GPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#newGPUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__NewGPUNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getGPUSlot__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getGPUSlot__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__CanMoveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__MoveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer, int, int)
	 * @generated
	 */
	EOperation getGPUSlot__S_moveTo__MainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getContainer()
	 * @generated
	 */
	EOperation getGPUSlot__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getGPUSlotView() <em>Get GPU Slot View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GPU Slot View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot#getGPUSlotView()
	 * @generated
	 */
	EOperation getGPUSlot__GetGPUSlotView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode <em>CPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode
	 * @generated
	 */
	EClass getCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getCpuType() <em>Get Cpu Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cpu Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getCpuType()
	 * @generated
	 */
	EOperation getCPUNode__GetCpuType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setCpuType(java.lang.String) <em>Set Cpu Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Cpu Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setCpuType(java.lang.String)
	 * @generated
	 */
	EOperation getCPUNode__SetCpuType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPowerConsumption()
	 * @generated
	 */
	EOperation getCPUNode__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getCPUNode__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPrice()
	 * @generated
	 */
	EOperation getCPUNode__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setPrice(float)
	 * @generated
	 */
	EOperation getCPUNode__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getName()
	 * @generated
	 */
	EOperation getCPUNode__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setName(java.lang.String)
	 * @generated
	 */
	EOperation getCPUNode__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getSocket() <em>Get Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getSocket()
	 * @generated
	 */
	EOperation getCPUNode__GetSocket();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setSocket(java.lang.String) <em>Set Socket</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Socket</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setSocket(java.lang.String)
	 * @generated
	 */
	EOperation getCPUNode__SetSocket__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getInternalCPUNode() <em>Get Internal CPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal CPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getInternalCPUNode()
	 * @generated
	 */
	EOperation getCPUNode__GetInternalCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#isExactlyCPUNode() <em>Is Exactly CPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly CPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#isExactlyCPUNode()
	 * @generated
	 */
	EOperation getCPUNode__IsExactlyCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preDelete()
	 * @generated
	 */
	EOperation getCPUNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getCPUNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getCPUNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preSave()
	 * @generated
	 */
	EOperation getCPUNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#postSave()
	 * @generated
	 */
	EOperation getCPUNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getRootElement()
	 * @generated
	 */
	EOperation getCPUNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getCPUNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getCPUNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getCPUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getCPUNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getCPUNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot, int, int)
	 * @generated
	 */
	EOperation getCPUNode__CanMoveTo__CPUSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot, int, int)
	 * @generated
	 */
	EOperation getCPUNode__MoveTo__CPUSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot, int, int)
	 * @generated
	 */
	EOperation getCPUNode__S_moveTo__CPUSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getContainer()
	 * @generated
	 */
	EOperation getCPUNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getReferencedCPU() <em>Get Referenced CPU</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced CPU</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getReferencedCPU()
	 * @generated
	 */
	EOperation getCPUNode__GetReferencedCPU();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getCPUNode__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getCPUNode__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getCPUNodeView() <em>Get CPU Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CPU Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode#getCPUNodeView()
	 * @generated
	 */
	EOperation getCPUNode__GetCPUNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode <em>RAM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode
	 * @generated
	 */
	EClass getRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPowerConsumption()
	 * @generated
	 */
	EOperation getRAMNode__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getRAMNode__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPrice()
	 * @generated
	 */
	EOperation getRAMNode__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setPrice(float)
	 * @generated
	 */
	EOperation getRAMNode__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getName()
	 * @generated
	 */
	EOperation getRAMNode__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setName(java.lang.String)
	 * @generated
	 */
	EOperation getRAMNode__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getRamType() <em>Get Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getRamType()
	 * @generated
	 */
	EOperation getRAMNode__GetRamType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setRamType(java.lang.String) <em>Set Ram Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ram Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setRamType(java.lang.String)
	 * @generated
	 */
	EOperation getRAMNode__SetRamType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getCapacity() <em>Get Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Capacity</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getCapacity()
	 * @generated
	 */
	EOperation getRAMNode__GetCapacity();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setCapacity(int) <em>Set Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Capacity</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setCapacity(int)
	 * @generated
	 */
	EOperation getRAMNode__SetCapacity__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getInternalRAMNode() <em>Get Internal RAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal RAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getInternalRAMNode()
	 * @generated
	 */
	EOperation getRAMNode__GetInternalRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#isExactlyRAMNode() <em>Is Exactly RAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly RAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#isExactlyRAMNode()
	 * @generated
	 */
	EOperation getRAMNode__IsExactlyRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preDelete()
	 * @generated
	 */
	EOperation getRAMNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getRAMNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getRAMNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preSave()
	 * @generated
	 */
	EOperation getRAMNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#postSave()
	 * @generated
	 */
	EOperation getRAMNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getRootElement()
	 * @generated
	 */
	EOperation getRAMNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getRAMNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getRAMNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getRAMNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getRAMNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getRAMNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot, int, int)
	 * @generated
	 */
	EOperation getRAMNode__CanMoveTo__RAMSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot, int, int)
	 * @generated
	 */
	EOperation getRAMNode__MoveTo__RAMSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot, int, int)
	 * @generated
	 */
	EOperation getRAMNode__S_moveTo__RAMSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getContainer()
	 * @generated
	 */
	EOperation getRAMNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getReferencedRAM() <em>Get Referenced RAM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced RAM</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getReferencedRAM()
	 * @generated
	 */
	EOperation getRAMNode__GetReferencedRAM();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getRAMNode__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getRAMNode__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getRAMNodeView() <em>Get RAM Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RAM Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode#getRAMNodeView()
	 * @generated
	 */
	EOperation getRAMNode__GetRAMNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode <em>GPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode
	 * @generated
	 */
	EClass getGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getChip() <em>Get Chip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Chip</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getChip()
	 * @generated
	 */
	EOperation getGPUNode__GetChip();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setChip(java.lang.String) <em>Set Chip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Chip</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setChip(java.lang.String)
	 * @generated
	 */
	EOperation getGPUNode__SetChip__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getMemory() <em>Get Memory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Memory</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getMemory()
	 * @generated
	 */
	EOperation getGPUNode__GetMemory();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setMemory(int) <em>Set Memory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Memory</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setMemory(int)
	 * @generated
	 */
	EOperation getGPUNode__SetMemory__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPowerConsumption() <em>Get Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPowerConsumption()
	 * @generated
	 */
	EOperation getGPUNode__GetPowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setPowerConsumption(int) <em>Set Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setPowerConsumption(int)
	 * @generated
	 */
	EOperation getGPUNode__SetPowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPrice()
	 * @generated
	 */
	EOperation getGPUNode__GetPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setPrice(float) <em>Set Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setPrice(float)
	 * @generated
	 */
	EOperation getGPUNode__SetPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getName()
	 * @generated
	 */
	EOperation getGPUNode__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setName(java.lang.String)
	 * @generated
	 */
	EOperation getGPUNode__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getInternalGPUNode() <em>Get Internal GPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal GPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getInternalGPUNode()
	 * @generated
	 */
	EOperation getGPUNode__GetInternalGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#isExactlyGPUNode() <em>Is Exactly GPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly GPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#isExactlyGPUNode()
	 * @generated
	 */
	EOperation getGPUNode__IsExactlyGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preDelete()
	 * @generated
	 */
	EOperation getGPUNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getGPUNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getGPUNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preSave()
	 * @generated
	 */
	EOperation getGPUNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#postSave()
	 * @generated
	 */
	EOperation getGPUNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getRootElement()
	 * @generated
	 */
	EOperation getGPUNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getGPUNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getGPUNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getGPUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getGPUNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getGPUNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot, int, int)
	 * @generated
	 */
	EOperation getGPUNode__CanMoveTo__GPUSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot, int, int)
	 * @generated
	 */
	EOperation getGPUNode__MoveTo__GPUSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot, int, int)
	 * @generated
	 */
	EOperation getGPUNode__S_moveTo__GPUSlot_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getContainer()
	 * @generated
	 */
	EOperation getGPUNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getReferencedGPU() <em>Get Referenced GPU</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced GPU</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getReferencedGPU()
	 * @generated
	 */
	EOperation getGPUNode__GetReferencedGPU();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getGPUNode__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getGPUNode__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getGPUNodeView() <em>Get GPU Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GPU Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode#getGPUNodeView()
	 * @generated
	 */
	EOperation getGPUNode__GetGPUNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainboard</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard
	 * @generated
	 */
	EClass getMainboard();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getInternalMainboard() <em>Get Internal Mainboard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Mainboard</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getInternalMainboard()
	 * @generated
	 */
	EOperation getMainboard__GetInternalMainboard();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#isExactlyMainboard() <em>Is Exactly Mainboard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Mainboard</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#isExactlyMainboard()
	 * @generated
	 */
	EOperation getMainboard__IsExactlyMainboard();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#preDelete()
	 * @generated
	 */
	EOperation getMainboard__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getMainboard__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getMainboard__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#preSave()
	 * @generated
	 */
	EOperation getMainboard__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#postSave()
	 * @generated
	 */
	EOperation getMainboard__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getRootElement()
	 * @generated
	 */
	EOperation getMainboard__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getNodes()
	 * @generated
	 */
	EOperation getMainboard__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getMainboardContainers() <em>Get Mainboard Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mainboard Containers</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getMainboardContainers()
	 * @generated
	 */
	EOperation getMainboard__GetMainboardContainers();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#canNewMainboardContainer() <em>Can New Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#canNewMainboardContainer()
	 * @generated
	 */
	EOperation getMainboard__CanNewMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, int, int) <em>New Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getMainboard__NewMainboardContainer__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboard__NewMainboardContainer__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboard__NewMainboardContainer__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboardContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboard__NewMainboardContainer__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboard(java.lang.String, java.lang.String, boolean) <em>New Mainboard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#newMainboard(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getMainboard__NewMainboard__String_String_boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getMainboardView() <em>Get Mainboard View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mainboard View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard#getMainboardView()
	 * @generated
	 */
	EOperation getMainboard__GetMainboardView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MainboardFactory getMainboardFactory();

} //MainboardPackage
