/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc;

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
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcFactory
 * @model kind="package"
 * @generated
 */
public interface PcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/fp/pcconfig/pc/mgl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcPackage eINSTANCE = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.CaseContainerImpl <em>Case Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.CaseContainerImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getCaseContainer()
	 * @generated
	 */
	int CASE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Case Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Case Internal Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CASE_INTERNAL_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Case Internal Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_CASE_INTERNAL_SLOTS__INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Case Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CASE_PRICE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Case Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_CASE_PRICE__FLOAT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Case External Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CASE_EXTERNAL_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Case External Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_CASE_EXTERNAL_SLOTS__INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Case Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CASE_NAME = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Case Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_CASE_NAME__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Case Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CASE_FORM_FACTOR = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Case Form Factor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_CASE_FORM_FACTOR__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Internal Case Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_INTERNAL_CASE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Exactly Case Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___IS_EXACTLY_CASE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Drive Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_DRIVE_CONTAINERS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can New Drive Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_NEW_DRIVE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>New Drive Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_DRIVE_CONTAINER__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>New Drive Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_DRIVE_CONTAINER__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>New Drive Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_DRIVE_CONTAINER__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>New Drive Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_DRIVE_CONTAINER__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get PSU Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_PSU_CONTAINERS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Can New PSU Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_NEW_PSU_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>New PSU Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PSU_CONTAINER__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>New PSU Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PSU_CONTAINER__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>New PSU Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PSU_CONTAINER__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>New PSU Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PSU_CONTAINER__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Get PC Mainboard Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_PC_MAINBOARD_CONTAINERS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Can New PC Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_NEW_PC_MAINBOARD_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>New PC Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>New PC Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>New PC Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>New PC Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___CAN_MOVE_TO__PC_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___MOVE_TO__PC_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SMOVE_TO__PC_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Get Referenced Case</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_REFERENCED_CASE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Get Case Container View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER___GET_CASE_CONTAINER_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 49;

	/**
	 * The number of operations of the '<em>Case Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONTAINER_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 50;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.DriveContainerImpl <em>Drive Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.DriveContainerImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getDriveContainer()
	 * @generated
	 */
	int DRIVE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Drive Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Internal Drive Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_INTERNAL_DRIVE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly Drive Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___IS_EXACTLY_DRIVE_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Drive Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_DRIVE_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Can New Drive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_NEW_DRIVE_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>New Drive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___NEW_DRIVE_NODE__EOBJECT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>New Drive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___NEW_DRIVE_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New Drive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___NEW_DRIVE_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New Drive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___NEW_DRIVE_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___CAN_MOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___MOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___SMOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Drive Container View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER___GET_DRIVE_CONTAINER_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>Drive Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_CONTAINER_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.DriveNodeImpl <em>Drive Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.DriveNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getDriveNode()
	 * @generated
	 */
	int DRIVE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Drive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Drive Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_DRIVE_DESCRIPTION = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Drive Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_DRIVE_DESCRIPTION__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Drive Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_DRIVE_POWER_CONSUMPTION = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Drive Power Consumption</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_DRIVE_POWER_CONSUMPTION__INT = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Drive Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_DRIVE_PRICE = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Drive Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_DRIVE_PRICE__FLOAT = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Drive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_DRIVE_TYPE = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set Drive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_DRIVE_TYPE__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Drive Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_DRIVE_NAME = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Set Drive Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_DRIVE_NAME__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Internal Drive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_INTERNAL_DRIVE_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Exactly Drive Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___IS_EXACTLY_DRIVE_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___CAN_MOVE_TO__DRIVECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___MOVE_TO__DRIVECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SMOVE_TO__DRIVECONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Referenced Drive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_REFERENCED_DRIVE = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.NODE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Drive Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE___GET_DRIVE_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Drive Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PSUContainerImpl <em>PSU Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PSUContainerImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPSUContainer()
	 * @generated
	 */
	int PSU_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PSU Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Internal PSU Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_INTERNAL_PSU_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly PSU Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___IS_EXACTLY_PSU_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get PSU Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_PSU_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Can New PSU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_NEW_PSU_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>New PSU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___NEW_PSU_NODE__EOBJECT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>New PSU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___NEW_PSU_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New PSU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___NEW_PSU_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New PSU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___NEW_PSU_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___CAN_MOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___MOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___SMOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get PSU Container View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER___GET_PSU_CONTAINER_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>PSU Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_CONTAINER_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PSUNodeImpl <em>PSU Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PSUNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPSUNode()
	 * @generated
	 */
	int PSU_NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PSU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Psu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_PSU_NAME = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Psu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_PSU_NAME__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Psu Power</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_PSU_POWER = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Psu Power</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_PSU_POWER__INT = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Psu Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_PSU_PRICE = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Psu Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_PSU_PRICE__FLOAT = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Internal PSU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_INTERNAL_PSU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Exactly PSU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___IS_EXACTLY_PSU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___CAN_MOVE_TO__PSUCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___MOVE_TO__PSUCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SMOVE_TO__PSUCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Referenced PSU</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_REFERENCED_PSU = GraphmodelPackage.NODE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.NODE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get PSU Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE___GET_PSU_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>PSU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSU_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCMainboardContainerImpl <em>PC Mainboard Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCMainboardContainerImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPCMainboardContainer()
	 * @generated
	 */
	int PC_MAINBOARD_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PC Mainboard Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Internal PC Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_INTERNAL_PC_MAINBOARD_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly PC Mainboard Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___IS_EXACTLY_PC_MAINBOARD_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Mainboard Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_MAINBOARD_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Can New Mainboard Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_NEW_MAINBOARD_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>New Mainboard Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___NEW_MAINBOARD_NODE__EOBJECT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>New Mainboard Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___NEW_MAINBOARD_NODE__EOBJECT_STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New Mainboard Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___NEW_MAINBOARD_NODE__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New Mainboard Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___NEW_MAINBOARD_NODE__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___CAN_MOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___MOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___SMOVE_TO__CASECONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get PC Mainboard Container View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER___GET_PC_MAINBOARD_CONTAINER_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The number of operations of the '<em>PC Mainboard Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MAINBOARD_CONTAINER_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.MainboardNodeImpl <em>Mainboard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.MainboardNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getMainboardNode()
	 * @generated
	 */
	int MAINBOARD_NODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE__ID = GraphmodelPackage.CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE__INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Mainboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE_FEATURE_COUNT = GraphmodelPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___EQUALS__OBJECT = GraphmodelPackage.CONTAINER___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___HASH_CODE = GraphmodelPackage.CONTAINER___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SAVE = GraphmodelPackage.CONTAINER___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.CONTAINER___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_ALL_NODES = GraphmodelPackage.CONTAINER___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_ALL_EDGES = GraphmodelPackage.CONTAINER___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_ALL_CONTAINERS = GraphmodelPackage.CONTAINER___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_CONTAIN__ELIST = GraphmodelPackage.CONTAINER___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_CONTAIN__CLASS = GraphmodelPackage.CONTAINER___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_CONTAINABLE_TYPES = GraphmodelPackage.CONTAINER___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_EDGES__CLASS = GraphmodelPackage.CONTAINER___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_NODES__CLASS = GraphmodelPackage.CONTAINER___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.CONTAINER___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___HIGHLIGHT = GraphmodelPackage.CONTAINER___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___UPDATE = GraphmodelPackage.CONTAINER___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.CONTAINER___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_SUCCESSORS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_PREDECESSORS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.CONTAINER___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_INCOMING__CLASS = GraphmodelPackage.CONTAINER___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.CONTAINER___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.CONTAINER___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.CONTAINER___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_START__CLASS = GraphmodelPackage.CONTAINER___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_END__CLASS = GraphmodelPackage.CONTAINER___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___MOVE__INT_INT = GraphmodelPackage.CONTAINER___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___RESIZE__INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_X = GraphmodelPackage.CONTAINER___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_Y = GraphmodelPackage.CONTAINER___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_WIDTH = GraphmodelPackage.CONTAINER___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_HEIGHT = GraphmodelPackage.CONTAINER___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.CONTAINER___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SET_X__INT = GraphmodelPackage.CONTAINER___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SET_Y__INT = GraphmodelPackage.CONTAINER___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SET_WIDTH__INT = GraphmodelPackage.CONTAINER___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SET_HEIGHT__INT = GraphmodelPackage.CONTAINER___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_LAYER = GraphmodelPackage.CONTAINER___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_INCOMING = GraphmodelPackage.CONTAINER___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_OUTGOING = GraphmodelPackage.CONTAINER___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.CONTAINER___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.CONTAINER___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___DELETE = GraphmodelPackage.CONTAINER___DELETE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_NAME = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SET_NAME__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal Mainboard Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_INTERNAL_MAINBOARD_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly Mainboard Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___IS_EXACTLY_MAINBOARD_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___PRE_DELETE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___PRE_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___POST_SAVE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get PCGPU Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_PCGPU_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Can New PCGPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_NEW_PCGPU_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New PCGPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCGPU_NODE__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New PCGPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCGPU_NODE__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>New PCGPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCGPU_NODE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>New PCGPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCGPU_NODE__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get PCCPU Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_PCCPU_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Can New PCCPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_NEW_PCCPU_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>New PCCPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCCPU_NODE__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>New PCCPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCCPU_NODE__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>New PCCPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCCPU_NODE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>New PCCPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCCPU_NODE__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get PCRAM Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_PCRAM_NODES = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Can New PCRAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_NEW_PCRAM_NODE = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>New PCRAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_NODE__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>New PCRAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_NODE__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>New PCRAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_NODE__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>New PCRAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_NODE__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get PCRAM Slots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_PCRAM_SLOTS = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Can New PCRAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_NEW_PCRAM_SLOT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>New PCRAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_SLOT__INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>New PCRAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_SLOT__STRING_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>New PCRAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_SLOT__INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>New PCRAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___NEW_PCRAM_SLOT__STRING_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___CAN_MOVE_TO__PCMAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___MOVE_TO__PCMAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SMOVE_TO__PCMAINBOARDCONTAINER_INT_INT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_CONTAINER = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Get Referenced MB</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_REFERENCED_MB = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Get Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_LIBRARY_COMPONENT_UID = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Set Library Component UID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___SET_LIBRARY_COMPONENT_UID__STRING = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Mainboard Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE___GET_MAINBOARD_NODE_VIEW = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 47;

	/**
	 * The number of operations of the '<em>Mainboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_NODE_OPERATION_COUNT = GraphmodelPackage.CONTAINER_OPERATION_COUNT + 48;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCCPUNodeImpl <em>PCCPU Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCCPUNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPCCPUNode()
	 * @generated
	 */
	int PCCPU_NODE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PCCPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_NAME = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SET_NAME__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal PCCPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_INTERNAL_PCCPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly PCCPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___IS_EXACTLY_PCCPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___CAN_MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___SMOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get PCCPU Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE___GET_PCCPU_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The number of operations of the '<em>PCCPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCCPU_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCGPUNodeImpl <em>PCGPU Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCGPUNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPCGPUNode()
	 * @generated
	 */
	int PCGPU_NODE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PCGPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_NAME = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SET_NAME__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal PCGPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_INTERNAL_PCGPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly PCGPU Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___IS_EXACTLY_PCGPU_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___CAN_MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___SMOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get PCGPU Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE___GET_PCGPU_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The number of operations of the '<em>PCGPU Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCGPU_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCRAMNodeImpl <em>PCRAM Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCRAMNodeImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPCRAMNode()
	 * @generated
	 */
	int PCRAM_NODE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PCRAM Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Internal PCRAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_INTERNAL_PCRAM_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly PCRAM Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___IS_EXACTLY_PCRAM_NODE = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___CAN_MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___SMOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get PCRAM Node View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE___GET_PCRAM_NODE_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The number of operations of the '<em>PCRAM Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_NODE_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCRAMSlotImpl <em>PCRAM Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCRAMSlotImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPCRAMSlot()
	 * @generated
	 */
	int PCRAM_SLOT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT__ID = GraphmodelPackage.NODE__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT__INTERNAL_ELEMENT = GraphmodelPackage.NODE__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PCRAM Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT_FEATURE_COUNT = GraphmodelPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___EQUALS__OBJECT = GraphmodelPackage.NODE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___HASH_CODE = GraphmodelPackage.NODE___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SAVE = GraphmodelPackage.NODE___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_INTERNAL_ELEMENT = GraphmodelPackage.NODE___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.NODE___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Highlight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___HIGHLIGHT = GraphmodelPackage.NODE___HIGHLIGHT;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___UPDATE = GraphmodelPackage.NODE___UPDATE;

	/**
	 * The operation id for the '<em>Update Graph Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___UPDATE_GRAPH_MODEL = GraphmodelPackage.NODE___UPDATE_GRAPH_MODEL;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_SUCCESSORS = GraphmodelPackage.NODE___GET_SUCCESSORS;

	/**
	 * The operation id for the '<em>Get Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_SUCCESSORS__CLASS = GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_PREDECESSORS = GraphmodelPackage.NODE___GET_PREDECESSORS;

	/**
	 * The operation id for the '<em>Get Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_PREDECESSORS__CLASS = GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_INCOMING__CLASS = GraphmodelPackage.NODE___GET_INCOMING__CLASS;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_OUTGOING__CLASS = GraphmodelPackage.NODE___GET_OUTGOING__CLASS;

	/**
	 * The operation id for the '<em>Can Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___CAN_CONNECT__EDGE_NODE = GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE;

	/**
	 * The operation id for the '<em>Get Outgoing Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_OUTGOING_CONSTRAINTS = GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Get Incoming Constraints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_INCOMING_CONSTRAINTS = GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___CAN_START__CLASS = GraphmodelPackage.NODE___CAN_START__CLASS;

	/**
	 * The operation id for the '<em>Can End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___CAN_END__CLASS = GraphmodelPackage.NODE___CAN_END__CLASS;

	/**
	 * The operation id for the '<em>Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___MOVE__INT_INT = GraphmodelPackage.NODE___MOVE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___RESIZE__INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___RESIZE__INT_INT_INT_INT = GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___DELETE = GraphmodelPackage.NODE___DELETE;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___CAN_MOVE_TO__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___MOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;

	/**
	 * The operation id for the '<em>Can Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___CAN_CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___CLONE__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Get X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_X = GraphmodelPackage.NODE___GET_X;

	/**
	 * The operation id for the '<em>Get Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_Y = GraphmodelPackage.NODE___GET_Y;

	/**
	 * The operation id for the '<em>Get Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_WIDTH = GraphmodelPackage.NODE___GET_WIDTH;

	/**
	 * The operation id for the '<em>Get Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_HEIGHT = GraphmodelPackage.NODE___GET_HEIGHT;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___COPY__MODELELEMENTCONTAINER = GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER;

	/**
	 * The operation id for the '<em>Set X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SET_X__INT = GraphmodelPackage.NODE___SET_X__INT;

	/**
	 * The operation id for the '<em>Set Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SET_Y__INT = GraphmodelPackage.NODE___SET_Y__INT;

	/**
	 * The operation id for the '<em>Set Width</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SET_WIDTH__INT = GraphmodelPackage.NODE___SET_WIDTH__INT;

	/**
	 * The operation id for the '<em>Set Height</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SET_HEIGHT__INT = GraphmodelPackage.NODE___SET_HEIGHT__INT;

	/**
	 * The operation id for the '<em>Get Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_LAYER = GraphmodelPackage.NODE___GET_LAYER;

	/**
	 * The operation id for the '<em>Get Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_INCOMING = GraphmodelPackage.NODE___GET_INCOMING;

	/**
	 * The operation id for the '<em>Get Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_OUTGOING = GraphmodelPackage.NODE___GET_OUTGOING;

	/**
	 * The operation id for the '<em>Get Untyped Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_UNTYPED_INCOMING = GraphmodelPackage.NODE___GET_UNTYPED_INCOMING;

	/**
	 * The operation id for the '<em>Get Untyped Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_UNTYPED_OUTGOING = GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING;

	/**
	 * The operation id for the '<em>Get Slot Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_SLOT_TYPE = GraphmodelPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Slot Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SET_SLOT_TYPE__STRING = GraphmodelPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Internal PCRAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_INTERNAL_PCRAM_SLOT = GraphmodelPackage.NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Exactly PCRAM Slot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___IS_EXACTLY_PCRAM_SLOT = GraphmodelPackage.NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___PRE_DELETE = GraphmodelPackage.NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_POST_DELETE_FUNCTION = GraphmodelPackage.NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_POST_DELETE_EVENT = GraphmodelPackage.NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___PRE_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___POST_SAVE = GraphmodelPackage.NODE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_ROOT_ELEMENT = GraphmodelPackage.NODE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Pre Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Post Move</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Pre Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Post Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___POST_RESIZE__INT_INT_INT_INT_DIRECTION = GraphmodelPackage.NODE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Can Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___CAN_MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___MOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Smove To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___SMOVE_TO__MAINBOARDNODE_INT_INT = GraphmodelPackage.NODE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_CONTAINER = GraphmodelPackage.NODE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get PCRAM Slot View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT___GET_PCRAM_SLOT_VIEW = GraphmodelPackage.NODE_OPERATION_COUNT + 19;

	/**
	 * The number of operations of the '<em>PCRAM Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCRAM_SLOT_OPERATION_COUNT = GraphmodelPackage.NODE_OPERATION_COUNT + 20;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCImpl <em>PC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PCImpl
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcPackageImpl#getPC()
	 * @generated
	 */
	int PC = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__ID = GraphmodelPackage.GRAPH_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_FEATURE_COUNT = GraphmodelPackage.GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___EQUALS__OBJECT = GraphmodelPackage.GRAPH_MODEL___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___HASH_CODE = GraphmodelPackage.GRAPH_MODEL___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___SAVE = GraphmodelPackage.GRAPH_MODEL___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.GRAPH_MODEL___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_ALL_NODES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_ALL_EDGES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_ALL_CONTAINERS = GraphmodelPackage.GRAPH_MODEL___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___CAN_CONTAIN__ELIST = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___CAN_CONTAIN__CLASS = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_CONTAINABLE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_EDGES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_NODES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get All Node Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_ALL_NODE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODE_TYPES;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Get Internal PC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_INTERNAL_PC = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Exactly PC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___IS_EXACTLY_PC = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Pre Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___PRE_DELETE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Post Delete Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_POST_DELETE_FUNCTION = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Post Delete Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_POST_DELETE_EVENT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Pre Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___PRE_SAVE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___POST_SAVE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_ROOT_ELEMENT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_NODES = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Case Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_CASE_CONTAINERS = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Can New Case Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___CAN_NEW_CASE_CONTAINER = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>New Case Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___NEW_CASE_CONTAINER__EOBJECT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>New Case Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___NEW_CASE_CONTAINER__EOBJECT_STRING_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>New Case Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___NEW_CASE_CONTAINER__EOBJECT_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>New Case Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___NEW_CASE_CONTAINER__EOBJECT_STRING_INT_INT_INT_INT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>New PC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___NEW_PC__STRING_STRING_BOOLEAN = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get PC View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC___GET_PC_VIEW = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 16;

	/**
	 * The number of operations of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_OPERATION_COUNT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 17;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer <em>Case Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer
	 * @generated
	 */
	EClass getCaseContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseInternalSlots() <em>Get Case Internal Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Internal Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseInternalSlots()
	 * @generated
	 */
	EOperation getCaseContainer__GetCaseInternalSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseInternalSlots(int) <em>Set Case Internal Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Internal Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseInternalSlots(int)
	 * @generated
	 */
	EOperation getCaseContainer__SetCaseInternalSlots__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCasePrice() <em>Get Case Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCasePrice()
	 * @generated
	 */
	EOperation getCaseContainer__GetCasePrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCasePrice(float) <em>Set Case Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCasePrice(float)
	 * @generated
	 */
	EOperation getCaseContainer__SetCasePrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseExternalSlots() <em>Get Case External Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case External Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseExternalSlots()
	 * @generated
	 */
	EOperation getCaseContainer__GetCaseExternalSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseExternalSlots(int) <em>Set Case External Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case External Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseExternalSlots(int)
	 * @generated
	 */
	EOperation getCaseContainer__SetCaseExternalSlots__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseName() <em>Get Case Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseName()
	 * @generated
	 */
	EOperation getCaseContainer__GetCaseName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseName(java.lang.String) <em>Set Case Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseName(java.lang.String)
	 * @generated
	 */
	EOperation getCaseContainer__SetCaseName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseFormFactor() <em>Get Case Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseFormFactor()
	 * @generated
	 */
	EOperation getCaseContainer__GetCaseFormFactor();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseFormFactor(java.lang.String) <em>Set Case Form Factor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Case Form Factor</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setCaseFormFactor(java.lang.String)
	 * @generated
	 */
	EOperation getCaseContainer__SetCaseFormFactor__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getInternalCaseContainer() <em>Get Internal Case Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Case Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getInternalCaseContainer()
	 * @generated
	 */
	EOperation getCaseContainer__GetInternalCaseContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#isExactlyCaseContainer() <em>Is Exactly Case Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Case Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#isExactlyCaseContainer()
	 * @generated
	 */
	EOperation getCaseContainer__IsExactlyCaseContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preDelete()
	 * @generated
	 */
	EOperation getCaseContainer__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getCaseContainer__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getCaseContainer__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preSave()
	 * @generated
	 */
	EOperation getCaseContainer__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#postSave()
	 * @generated
	 */
	EOperation getCaseContainer__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getRootElement()
	 * @generated
	 */
	EOperation getCaseContainer__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getNodes()
	 * @generated
	 */
	EOperation getCaseContainer__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getDriveContainers() <em>Get Drive Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Containers</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getDriveContainers()
	 * @generated
	 */
	EOperation getCaseContainer__GetDriveContainers();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canNewDriveContainer() <em>Can New Drive Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Drive Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canNewDriveContainer()
	 * @generated
	 */
	EOperation getCaseContainer__CanNewDriveContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(int, int) <em>New Drive Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewDriveContainer__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(java.lang.String, int, int) <em>New Drive Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewDriveContainer__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(int, int, int, int) <em>New Drive Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(int, int, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewDriveContainer__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(java.lang.String, int, int, int, int) <em>New Drive Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newDriveContainer(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewDriveContainer__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPSUContainers() <em>Get PSU Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PSU Containers</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPSUContainers()
	 * @generated
	 */
	EOperation getCaseContainer__GetPSUContainers();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canNewPSUContainer() <em>Can New PSU Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New PSU Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canNewPSUContainer()
	 * @generated
	 */
	EOperation getCaseContainer__CanNewPSUContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(int, int) <em>New PSU Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPSUContainer__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(java.lang.String, int, int) <em>New PSU Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPSUContainer__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(int, int, int, int) <em>New PSU Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(int, int, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPSUContainer__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(java.lang.String, int, int, int, int) <em>New PSU Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPSUContainer(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPSUContainer__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPCMainboardContainers() <em>Get PC Mainboard Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PC Mainboard Containers</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getPCMainboardContainers()
	 * @generated
	 */
	EOperation getCaseContainer__GetPCMainboardContainers();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canNewPCMainboardContainer() <em>Can New PC Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New PC Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canNewPCMainboardContainer()
	 * @generated
	 */
	EOperation getCaseContainer__CanNewPCMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(int, int) <em>New PC Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PC Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPCMainboardContainer__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(java.lang.String, int, int) <em>New PC Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PC Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPCMainboardContainer__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(int, int, int, int) <em>New PC Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PC Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(int, int, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPCMainboardContainer__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(java.lang.String, int, int, int, int) <em>New PC Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PC Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#newPCMainboardContainer(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__NewPCMainboardContainer__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getCaseContainer__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getCaseContainer__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__CanMoveTo__PC_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__MoveTo__PC_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC, int, int)
	 * @generated
	 */
	EOperation getCaseContainer__S_moveTo__PC_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getContainer()
	 * @generated
	 */
	EOperation getCaseContainer__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getReferencedCase() <em>Get Referenced Case</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced Case</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getReferencedCase()
	 * @generated
	 */
	EOperation getCaseContainer__GetReferencedCase();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getCaseContainer__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getCaseContainer__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseContainerView() <em>Get Case Container View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Container View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer#getCaseContainerView()
	 * @generated
	 */
	EOperation getCaseContainer__GetCaseContainerView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer <em>Drive Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drive Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer
	 * @generated
	 */
	EClass getDriveContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getInternalDriveContainer() <em>Get Internal Drive Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Drive Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getInternalDriveContainer()
	 * @generated
	 */
	EOperation getDriveContainer__GetInternalDriveContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#isExactlyDriveContainer() <em>Is Exactly Drive Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Drive Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#isExactlyDriveContainer()
	 * @generated
	 */
	EOperation getDriveContainer__IsExactlyDriveContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preDelete()
	 * @generated
	 */
	EOperation getDriveContainer__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getDriveContainer__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getDriveContainer__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preSave()
	 * @generated
	 */
	EOperation getDriveContainer__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#postSave()
	 * @generated
	 */
	EOperation getDriveContainer__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getRootElement()
	 * @generated
	 */
	EOperation getDriveContainer__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getNodes()
	 * @generated
	 */
	EOperation getDriveContainer__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getDriveNodes() <em>Get Drive Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getDriveNodes()
	 * @generated
	 */
	EOperation getDriveContainer__GetDriveNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#canNewDriveNode() <em>Can New Drive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Drive Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#canNewDriveNode()
	 * @generated
	 */
	EOperation getDriveContainer__CanNewDriveNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, int, int) <em>New Drive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__NewDriveNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New Drive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__NewDriveNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New Drive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__NewDriveNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New Drive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Drive Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#newDriveNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__NewDriveNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getDriveContainer__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getDriveContainer__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__CanMoveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__MoveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getDriveContainer__S_moveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getContainer()
	 * @generated
	 */
	EOperation getDriveContainer__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getDriveContainerView() <em>Get Drive Container View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Container View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer#getDriveContainerView()
	 * @generated
	 */
	EOperation getDriveContainer__GetDriveContainerView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode <em>Drive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drive Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode
	 * @generated
	 */
	EClass getDriveNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveDescription() <em>Get Drive Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Description</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveDescription()
	 * @generated
	 */
	EOperation getDriveNode__GetDriveDescription();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDriveDescription(java.lang.String) <em>Set Drive Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Description</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDriveDescription(java.lang.String)
	 * @generated
	 */
	EOperation getDriveNode__SetDriveDescription__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDrivePowerConsumption() <em>Get Drive Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDrivePowerConsumption()
	 * @generated
	 */
	EOperation getDriveNode__GetDrivePowerConsumption();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDrivePowerConsumption(int) <em>Set Drive Power Consumption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Power Consumption</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDrivePowerConsumption(int)
	 * @generated
	 */
	EOperation getDriveNode__SetDrivePowerConsumption__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDrivePrice() <em>Get Drive Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDrivePrice()
	 * @generated
	 */
	EOperation getDriveNode__GetDrivePrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDrivePrice(float) <em>Set Drive Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDrivePrice(float)
	 * @generated
	 */
	EOperation getDriveNode__SetDrivePrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveType() <em>Get Drive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveType()
	 * @generated
	 */
	EOperation getDriveNode__GetDriveType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDriveType(java.lang.String) <em>Set Drive Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDriveType(java.lang.String)
	 * @generated
	 */
	EOperation getDriveNode__SetDriveType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveName() <em>Get Drive Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveName()
	 * @generated
	 */
	EOperation getDriveNode__GetDriveName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDriveName(java.lang.String) <em>Set Drive Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Drive Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setDriveName(java.lang.String)
	 * @generated
	 */
	EOperation getDriveNode__SetDriveName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getInternalDriveNode() <em>Get Internal Drive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Drive Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getInternalDriveNode()
	 * @generated
	 */
	EOperation getDriveNode__GetInternalDriveNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#isExactlyDriveNode() <em>Is Exactly Drive Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Drive Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#isExactlyDriveNode()
	 * @generated
	 */
	EOperation getDriveNode__IsExactlyDriveNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preDelete()
	 * @generated
	 */
	EOperation getDriveNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getDriveNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getDriveNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preSave()
	 * @generated
	 */
	EOperation getDriveNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#postSave()
	 * @generated
	 */
	EOperation getDriveNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getRootElement()
	 * @generated
	 */
	EOperation getDriveNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getDriveNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getDriveNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getDriveNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getDriveNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getDriveNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer, int, int)
	 * @generated
	 */
	EOperation getDriveNode__CanMoveTo__DriveContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer, int, int)
	 * @generated
	 */
	EOperation getDriveNode__MoveTo__DriveContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer, int, int)
	 * @generated
	 */
	EOperation getDriveNode__S_moveTo__DriveContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getContainer()
	 * @generated
	 */
	EOperation getDriveNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getReferencedDrive() <em>Get Referenced Drive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced Drive</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getReferencedDrive()
	 * @generated
	 */
	EOperation getDriveNode__GetReferencedDrive();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getDriveNode__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getDriveNode__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveNodeView() <em>Get Drive Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Drive Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode#getDriveNodeView()
	 * @generated
	 */
	EOperation getDriveNode__GetDriveNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer <em>PSU Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSU Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer
	 * @generated
	 */
	EClass getPSUContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getInternalPSUContainer() <em>Get Internal PSU Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PSU Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getInternalPSUContainer()
	 * @generated
	 */
	EOperation getPSUContainer__GetInternalPSUContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#isExactlyPSUContainer() <em>Is Exactly PSU Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PSU Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#isExactlyPSUContainer()
	 * @generated
	 */
	EOperation getPSUContainer__IsExactlyPSUContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preDelete()
	 * @generated
	 */
	EOperation getPSUContainer__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPSUContainer__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPSUContainer__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preSave()
	 * @generated
	 */
	EOperation getPSUContainer__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#postSave()
	 * @generated
	 */
	EOperation getPSUContainer__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getRootElement()
	 * @generated
	 */
	EOperation getPSUContainer__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getNodes()
	 * @generated
	 */
	EOperation getPSUContainer__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPSUNodes() <em>Get PSU Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PSU Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPSUNodes()
	 * @generated
	 */
	EOperation getPSUContainer__GetPSUNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#canNewPSUNode() <em>Can New PSU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New PSU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#canNewPSUNode()
	 * @generated
	 */
	EOperation getPSUContainer__CanNewPSUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, int, int) <em>New PSU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__NewPSUNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New PSU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__NewPSUNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New PSU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__NewPSUNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New PSU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PSU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#newPSUNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__NewPSUNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPSUContainer__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPSUContainer__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__CanMoveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__MoveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getPSUContainer__S_moveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getContainer()
	 * @generated
	 */
	EOperation getPSUContainer__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPSUContainerView() <em>Get PSU Container View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PSU Container View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer#getPSUContainerView()
	 * @generated
	 */
	EOperation getPSUContainer__GetPSUContainerView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode <em>PSU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode
	 * @generated
	 */
	EClass getPSUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPsuName() <em>Get Psu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Psu Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPsuName()
	 * @generated
	 */
	EOperation getPSUNode__GetPsuName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setPsuName(java.lang.String) <em>Set Psu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Psu Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setPsuName(java.lang.String)
	 * @generated
	 */
	EOperation getPSUNode__SetPsuName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPsuPower() <em>Get Psu Power</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Psu Power</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPsuPower()
	 * @generated
	 */
	EOperation getPSUNode__GetPsuPower();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setPsuPower(int) <em>Set Psu Power</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Psu Power</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setPsuPower(int)
	 * @generated
	 */
	EOperation getPSUNode__SetPsuPower__int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPsuPrice() <em>Get Psu Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Psu Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPsuPrice()
	 * @generated
	 */
	EOperation getPSUNode__GetPsuPrice();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setPsuPrice(float) <em>Set Psu Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Psu Price</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setPsuPrice(float)
	 * @generated
	 */
	EOperation getPSUNode__SetPsuPrice__float();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getInternalPSUNode() <em>Get Internal PSU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PSU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getInternalPSUNode()
	 * @generated
	 */
	EOperation getPSUNode__GetInternalPSUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#isExactlyPSUNode() <em>Is Exactly PSU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PSU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#isExactlyPSUNode()
	 * @generated
	 */
	EOperation getPSUNode__IsExactlyPSUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preDelete()
	 * @generated
	 */
	EOperation getPSUNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPSUNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPSUNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preSave()
	 * @generated
	 */
	EOperation getPSUNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#postSave()
	 * @generated
	 */
	EOperation getPSUNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getRootElement()
	 * @generated
	 */
	EOperation getPSUNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPSUNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPSUNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getPSUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPSUNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPSUNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer, int, int)
	 * @generated
	 */
	EOperation getPSUNode__CanMoveTo__PSUContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer, int, int)
	 * @generated
	 */
	EOperation getPSUNode__MoveTo__PSUContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer, int, int)
	 * @generated
	 */
	EOperation getPSUNode__S_moveTo__PSUContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getContainer()
	 * @generated
	 */
	EOperation getPSUNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getReferencedPSU() <em>Get Referenced PSU</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced PSU</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getReferencedPSU()
	 * @generated
	 */
	EOperation getPSUNode__GetReferencedPSU();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getPSUNode__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getPSUNode__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPSUNodeView() <em>Get PSU Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PSU Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode#getPSUNodeView()
	 * @generated
	 */
	EOperation getPSUNode__GetPSUNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer <em>PC Mainboard Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC Mainboard Container</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer
	 * @generated
	 */
	EClass getPCMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getInternalPCMainboardContainer() <em>Get Internal PC Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PC Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getInternalPCMainboardContainer()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetInternalPCMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#isExactlyPCMainboardContainer() <em>Is Exactly PC Mainboard Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PC Mainboard Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#isExactlyPCMainboardContainer()
	 * @generated
	 */
	EOperation getPCMainboardContainer__IsExactlyPCMainboardContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preDelete()
	 * @generated
	 */
	EOperation getPCMainboardContainer__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preSave()
	 * @generated
	 */
	EOperation getPCMainboardContainer__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#postSave()
	 * @generated
	 */
	EOperation getPCMainboardContainer__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getRootElement()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getNodes()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getMainboardNodes() <em>Get Mainboard Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mainboard Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getMainboardNodes()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetMainboardNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#canNewMainboardNode() <em>Can New Mainboard Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Mainboard Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#canNewMainboardNode()
	 * @generated
	 */
	EOperation getPCMainboardContainer__CanNewMainboardNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, int, int) <em>New Mainboard Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__NewMainboardNode__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New Mainboard Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__NewMainboardNode__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New Mainboard Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__NewMainboardNode__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New Mainboard Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Mainboard Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#newMainboardNode(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__NewMainboardNode__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCMainboardContainer__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCMainboardContainer__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__CanMoveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__MoveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer, int, int)
	 * @generated
	 */
	EOperation getPCMainboardContainer__S_moveTo__CaseContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getContainer()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getPCMainboardContainerView() <em>Get PC Mainboard Container View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PC Mainboard Container View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer#getPCMainboardContainerView()
	 * @generated
	 */
	EOperation getPCMainboardContainer__GetPCMainboardContainerView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode <em>Mainboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainboard Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode
	 * @generated
	 */
	EClass getMainboardNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getName()
	 * @generated
	 */
	EOperation getMainboardNode__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#setName(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardNode__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getInternalMainboardNode() <em>Get Internal Mainboard Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal Mainboard Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getInternalMainboardNode()
	 * @generated
	 */
	EOperation getMainboardNode__GetInternalMainboardNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#isExactlyMainboardNode() <em>Is Exactly Mainboard Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly Mainboard Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#isExactlyMainboardNode()
	 * @generated
	 */
	EOperation getMainboardNode__IsExactlyMainboardNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preDelete()
	 * @generated
	 */
	EOperation getMainboardNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getMainboardNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getMainboardNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preSave()
	 * @generated
	 */
	EOperation getMainboardNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#postSave()
	 * @generated
	 */
	EOperation getMainboardNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getRootElement()
	 * @generated
	 */
	EOperation getMainboardNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getNodes()
	 * @generated
	 */
	EOperation getMainboardNode__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCGPUNodes() <em>Get PCGPU Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCGPU Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCGPUNodes()
	 * @generated
	 */
	EOperation getMainboardNode__GetPCGPUNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCGPUNode() <em>Can New PCGPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New PCGPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCGPUNode()
	 * @generated
	 */
	EOperation getMainboardNode__CanNewPCGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(int, int) <em>New PCGPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCGPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCGPUNode__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(java.lang.String, int, int) <em>New PCGPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCGPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCGPUNode__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(int, int, int, int) <em>New PCGPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCGPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCGPUNode__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(java.lang.String, int, int, int, int) <em>New PCGPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCGPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCGPUNode(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCGPUNode__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCCPUNodes() <em>Get PCCPU Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCCPU Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCCPUNodes()
	 * @generated
	 */
	EOperation getMainboardNode__GetPCCPUNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCCPUNode() <em>Can New PCCPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New PCCPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCCPUNode()
	 * @generated
	 */
	EOperation getMainboardNode__CanNewPCCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(int, int) <em>New PCCPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCCPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCCPUNode__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(java.lang.String, int, int) <em>New PCCPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCCPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCCPUNode__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(int, int, int, int) <em>New PCCPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCCPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCCPUNode__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(java.lang.String, int, int, int, int) <em>New PCCPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCCPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCCPUNode(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCCPUNode__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCRAMNodes() <em>Get PCRAM Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCRAM Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCRAMNodes()
	 * @generated
	 */
	EOperation getMainboardNode__GetPCRAMNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCRAMNode() <em>Can New PCRAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New PCRAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCRAMNode()
	 * @generated
	 */
	EOperation getMainboardNode__CanNewPCRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(int, int) <em>New PCRAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMNode__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(java.lang.String, int, int) <em>New PCRAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMNode__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(int, int, int, int) <em>New PCRAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMNode__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(java.lang.String, int, int, int, int) <em>New PCRAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMNode(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMNode__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCRAMSlots() <em>Get PCRAM Slots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCRAM Slots</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getPCRAMSlots()
	 * @generated
	 */
	EOperation getMainboardNode__GetPCRAMSlots();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCRAMSlot() <em>Can New PCRAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New PCRAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canNewPCRAMSlot()
	 * @generated
	 */
	EOperation getMainboardNode__CanNewPCRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(int, int) <em>New PCRAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMSlot__int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(java.lang.String, int, int) <em>New PCRAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMSlot__String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(int, int, int, int) <em>New PCRAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMSlot__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(java.lang.String, int, int, int, int) <em>New PCRAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PCRAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#newPCRAMSlot(java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__NewPCRAMSlot__String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getMainboardNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getMainboardNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__CanMoveTo__PCMainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__MoveTo__PCMainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer, int, int)
	 * @generated
	 */
	EOperation getMainboardNode__S_moveTo__PCMainboardContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getContainer()
	 * @generated
	 */
	EOperation getMainboardNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getReferencedMB() <em>Get Referenced MB</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced MB</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getReferencedMB()
	 * @generated
	 */
	EOperation getMainboardNode__GetReferencedMB();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getLibraryComponentUID() <em>Get Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getLibraryComponentUID()
	 * @generated
	 */
	EOperation getMainboardNode__GetLibraryComponentUID();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#setLibraryComponentUID(java.lang.String) <em>Set Library Component UID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Library Component UID</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#setLibraryComponentUID(java.lang.String)
	 * @generated
	 */
	EOperation getMainboardNode__SetLibraryComponentUID__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getMainboardNodeView() <em>Get Mainboard Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mainboard Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode#getMainboardNodeView()
	 * @generated
	 */
	EOperation getMainboardNode__GetMainboardNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode <em>PCCPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCCPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode
	 * @generated
	 */
	EClass getPCCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getName()
	 * @generated
	 */
	EOperation getPCCPUNode__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#setName(java.lang.String)
	 * @generated
	 */
	EOperation getPCCPUNode__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getInternalPCCPUNode() <em>Get Internal PCCPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PCCPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getInternalPCCPUNode()
	 * @generated
	 */
	EOperation getPCCPUNode__GetInternalPCCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#isExactlyPCCPUNode() <em>Is Exactly PCCPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PCCPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#isExactlyPCCPUNode()
	 * @generated
	 */
	EOperation getPCCPUNode__IsExactlyPCCPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preDelete()
	 * @generated
	 */
	EOperation getPCCPUNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPCCPUNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPCCPUNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preSave()
	 * @generated
	 */
	EOperation getPCCPUNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#postSave()
	 * @generated
	 */
	EOperation getPCCPUNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getRootElement()
	 * @generated
	 */
	EOperation getPCCPUNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCCPUNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCCPUNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getPCCPUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCCPUNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCCPUNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCCPUNode__CanMoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCCPUNode__MoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCCPUNode__S_moveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getContainer()
	 * @generated
	 */
	EOperation getPCCPUNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getPCCPUNodeView() <em>Get PCCPU Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCCPU Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode#getPCCPUNodeView()
	 * @generated
	 */
	EOperation getPCCPUNode__GetPCCPUNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode <em>PCGPU Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCGPU Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode
	 * @generated
	 */
	EClass getPCGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getName()
	 * @generated
	 */
	EOperation getPCGPUNode__GetName();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#setName(java.lang.String)
	 * @generated
	 */
	EOperation getPCGPUNode__SetName__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getInternalPCGPUNode() <em>Get Internal PCGPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PCGPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getInternalPCGPUNode()
	 * @generated
	 */
	EOperation getPCGPUNode__GetInternalPCGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#isExactlyPCGPUNode() <em>Is Exactly PCGPU Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PCGPU Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#isExactlyPCGPUNode()
	 * @generated
	 */
	EOperation getPCGPUNode__IsExactlyPCGPUNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preDelete()
	 * @generated
	 */
	EOperation getPCGPUNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPCGPUNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPCGPUNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preSave()
	 * @generated
	 */
	EOperation getPCGPUNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#postSave()
	 * @generated
	 */
	EOperation getPCGPUNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getRootElement()
	 * @generated
	 */
	EOperation getPCGPUNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCGPUNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCGPUNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getPCGPUNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCGPUNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCGPUNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCGPUNode__CanMoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCGPUNode__MoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCGPUNode__S_moveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getContainer()
	 * @generated
	 */
	EOperation getPCGPUNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getPCGPUNodeView() <em>Get PCGPU Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCGPU Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode#getPCGPUNodeView()
	 * @generated
	 */
	EOperation getPCGPUNode__GetPCGPUNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode <em>PCRAM Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCRAM Node</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode
	 * @generated
	 */
	EClass getPCRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getInternalPCRAMNode() <em>Get Internal PCRAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PCRAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getInternalPCRAMNode()
	 * @generated
	 */
	EOperation getPCRAMNode__GetInternalPCRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#isExactlyPCRAMNode() <em>Is Exactly PCRAM Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PCRAM Node</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#isExactlyPCRAMNode()
	 * @generated
	 */
	EOperation getPCRAMNode__IsExactlyPCRAMNode();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preDelete()
	 * @generated
	 */
	EOperation getPCRAMNode__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPCRAMNode__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPCRAMNode__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preSave()
	 * @generated
	 */
	EOperation getPCRAMNode__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#postSave()
	 * @generated
	 */
	EOperation getPCRAMNode__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getRootElement()
	 * @generated
	 */
	EOperation getPCRAMNode__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCRAMNode__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCRAMNode__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getPCRAMNode__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCRAMNode__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCRAMNode__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCRAMNode__CanMoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCRAMNode__MoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCRAMNode__S_moveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getContainer()
	 * @generated
	 */
	EOperation getPCRAMNode__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getPCRAMNodeView() <em>Get PCRAM Node View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCRAM Node View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode#getPCRAMNodeView()
	 * @generated
	 */
	EOperation getPCRAMNode__GetPCRAMNodeView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot <em>PCRAM Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCRAM Slot</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot
	 * @generated
	 */
	EClass getPCRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getSlotType() <em>Get Slot Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slot Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getSlotType()
	 * @generated
	 */
	EOperation getPCRAMSlot__GetSlotType();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#setSlotType(java.lang.String) <em>Set Slot Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Slot Type</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#setSlotType(java.lang.String)
	 * @generated
	 */
	EOperation getPCRAMSlot__SetSlotType__String();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getInternalPCRAMSlot() <em>Get Internal PCRAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PCRAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getInternalPCRAMSlot()
	 * @generated
	 */
	EOperation getPCRAMSlot__GetInternalPCRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#isExactlyPCRAMSlot() <em>Is Exactly PCRAM Slot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PCRAM Slot</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#isExactlyPCRAMSlot()
	 * @generated
	 */
	EOperation getPCRAMSlot__IsExactlyPCRAMSlot();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preDelete()
	 * @generated
	 */
	EOperation getPCRAMSlot__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPCRAMSlot__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPCRAMSlot__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preSave()
	 * @generated
	 */
	EOperation getPCRAMSlot__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#postSave()
	 * @generated
	 */
	EOperation getPCRAMSlot__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getRootElement()
	 * @generated
	 */
	EOperation getPCRAMSlot__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#s_moveTo(graphmodel.ModelElementContainer, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#s_moveTo(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCRAMSlot__S_moveTo__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preMove(graphmodel.ModelElementContainer, int, int) <em>Pre Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preMove(graphmodel.ModelElementContainer, int, int)
	 * @generated
	 */
	EOperation getPCRAMSlot__PreMove__ModelElementContainer_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int) <em>Post Move</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Move</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#postMove(graphmodel.ModelElementContainer, graphmodel.ModelElementContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getPCRAMSlot__PostMove__ModelElementContainer_ModelElementContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preResize(int, int, int, int, graphmodel.Direction) <em>Pre Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#preResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCRAMSlot__PreResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#postResize(int, int, int, int, graphmodel.Direction) <em>Post Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Resize</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#postResize(int, int, int, int, graphmodel.Direction)
	 * @generated
	 */
	EOperation getPCRAMSlot__PostResize__int_int_int_int_Direction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Can Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#canMoveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCRAMSlot__CanMoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCRAMSlot__MoveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int) <em>Smove To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smove To</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#s_moveTo(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode, int, int)
	 * @generated
	 */
	EOperation getPCRAMSlot__S_moveTo__MainboardNode_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getContainer()
	 * @generated
	 */
	EOperation getPCRAMSlot__GetContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getPCRAMSlotView() <em>Get PCRAM Slot View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PCRAM Slot View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot#getPCRAMSlotView()
	 * @generated
	 */
	EOperation getPCRAMSlot__GetPCRAMSlotView();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC <em>PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC</em>'.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC
	 * @generated
	 */
	EClass getPC();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getInternalPC() <em>Get Internal PC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal PC</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getInternalPC()
	 * @generated
	 */
	EOperation getPC__GetInternalPC();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#isExactlyPC() <em>Is Exactly PC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly PC</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#isExactlyPC()
	 * @generated
	 */
	EOperation getPC__IsExactlyPC();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#preDelete() <em>Pre Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Delete</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#preDelete()
	 * @generated
	 */
	EOperation getPC__PreDelete();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getPostDeleteFunction() <em>Get Post Delete Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Function</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getPostDeleteFunction()
	 * @generated
	 */
	EOperation getPC__GetPostDeleteFunction();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getPostDeleteEvent() <em>Get Post Delete Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Post Delete Event</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getPostDeleteEvent()
	 * @generated
	 */
	EOperation getPC__GetPostDeleteEvent();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#preSave() <em>Pre Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pre Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#preSave()
	 * @generated
	 */
	EOperation getPC__PreSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#postSave()
	 * @generated
	 */
	EOperation getPC__PostSave();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getRootElement()
	 * @generated
	 */
	EOperation getPC__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getNodes()
	 * @generated
	 */
	EOperation getPC__GetNodes();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getCaseContainers() <em>Get Case Containers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Case Containers</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getCaseContainers()
	 * @generated
	 */
	EOperation getPC__GetCaseContainers();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#canNewCaseContainer() <em>Can New Case Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can New Case Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#canNewCaseContainer()
	 * @generated
	 */
	EOperation getPC__CanNewCaseContainer();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, int, int) <em>New Case Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Case Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, int, int)
	 * @generated
	 */
	EOperation getPC__NewCaseContainer__EObject_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int) <em>New Case Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Case Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getPC__NewCaseContainer__EObject_String_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, int, int, int, int) <em>New Case Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Case Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, int, int, int, int)
	 * @generated
	 */
	EOperation getPC__NewCaseContainer__EObject_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int) <em>New Case Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Case Container</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newCaseContainer(org.eclipse.emf.ecore.EObject, java.lang.String, int, int, int, int)
	 * @generated
	 */
	EOperation getPC__NewCaseContainer__EObject_String_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newPC(java.lang.String, java.lang.String, boolean) <em>New PC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New PC</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#newPC(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getPC__NewPC__String_String_boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getPCView() <em>Get PC View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PC View</em>' operation.
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC#getPCView()
	 * @generated
	 */
	EOperation getPC__GetPCView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcFactory getPcFactory();

} //PcPackage
