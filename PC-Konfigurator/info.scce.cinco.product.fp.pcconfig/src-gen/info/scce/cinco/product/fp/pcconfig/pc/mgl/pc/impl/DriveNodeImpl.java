/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl;

import graphmodel.Direction;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.NodeImpl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DriveNodeImpl extends NodeImpl implements DriveNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcPackage.eINSTANCE.getDriveNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveDescription() {
		return getInternalDriveNode().getDriveDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveDescription(final String _arg) {
		getInternalDriveNode().getElement().transact("Set DriveDescription", () -> {
			getInternalDriveNode().setDriveDescription(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDrivePowerConsumption() {
		return getInternalDriveNode().getDrivePowerConsumption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrivePowerConsumption(final int _arg) {
		getInternalDriveNode().getElement().transact("Set DrivePowerConsumption", () -> {
			getInternalDriveNode().setDrivePowerConsumption(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDrivePrice() {
		return getInternalDriveNode().getDrivePrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrivePrice(final float _arg) {
		getInternalDriveNode().getElement().transact("Set DrivePrice", () -> {
			getInternalDriveNode().setDrivePrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveType() {
		return getInternalDriveNode().getDriveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveType(final String _arg) {
		getInternalDriveNode().getElement().transact("Set DriveType", () -> {
			getInternalDriveNode().setDriveType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveName() {
		return getInternalDriveNode().getDriveName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveName(final String _arg) {
		getInternalDriveNode().getElement().transact("Set DriveName", () -> {
			getInternalDriveNode().setDriveName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDriveNode getInternalDriveNode() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyDriveNode() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteFunction() {
		de.jabc.cinco.meta.runtime.hook.CincoPostDeleteHook<? super info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode> postDeleteHook = new info.scce.cinco.product.fp.pcconfig.pc.hook.DriveNodePostDelete();
		return postDeleteHook.getPostDeleteFunction(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteEvent() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PC getRootElement() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC) this.getInternalElement().getRootElement().getElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final ModelElementContainer container, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preMove(final ModelElementContainer newContainer, final int newX, final int newY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final DriveContainer driveContainer, final int x, final int y) {
		return driveContainer.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final DriveContainer driveContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(driveContainer, x, y);
			driveContainer.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final DriveContainer driveContainer, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveContainer getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedDrive() {
		String uid = ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode)getInternalElement()).getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode) this.getInternalElement()).getLibraryComponentUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(final String id) {
		((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode) this.getInternalElement()).setLibraryComponentUID(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveNodeView getDriveNodeView() {
		DriveNodeView driveNodeView = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsFactory.eINSTANCE.createDriveNodeView();
		driveNodeView.setInternalDriveNode((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode)getInternalElement());
		return driveNodeView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return PcPackage.DRIVE_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return PcPackage.DRIVE_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return PcPackage.DRIVE_NODE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return PcPackage.DRIVE_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return PcPackage.DRIVE_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return PcPackage.DRIVE_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return PcPackage.DRIVE_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return PcPackage.DRIVE_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return PcPackage.DRIVE_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return PcPackage.DRIVE_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return PcPackage.DRIVE_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.DRIVE_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.DRIVE_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return PcPackage.DRIVE_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PcPackage.DRIVE_NODE___GET_DRIVE_DESCRIPTION:
				return getDriveDescription();
			case PcPackage.DRIVE_NODE___SET_DRIVE_DESCRIPTION__STRING:
				setDriveDescription((String)arguments.get(0));
				return null;
			case PcPackage.DRIVE_NODE___GET_DRIVE_POWER_CONSUMPTION:
				return getDrivePowerConsumption();
			case PcPackage.DRIVE_NODE___SET_DRIVE_POWER_CONSUMPTION__INT:
				setDrivePowerConsumption((Integer)arguments.get(0));
				return null;
			case PcPackage.DRIVE_NODE___GET_DRIVE_PRICE:
				return getDrivePrice();
			case PcPackage.DRIVE_NODE___SET_DRIVE_PRICE__FLOAT:
				setDrivePrice((Float)arguments.get(0));
				return null;
			case PcPackage.DRIVE_NODE___GET_DRIVE_TYPE:
				return getDriveType();
			case PcPackage.DRIVE_NODE___SET_DRIVE_TYPE__STRING:
				setDriveType((String)arguments.get(0));
				return null;
			case PcPackage.DRIVE_NODE___GET_DRIVE_NAME:
				return getDriveName();
			case PcPackage.DRIVE_NODE___SET_DRIVE_NAME__STRING:
				setDriveName((String)arguments.get(0));
				return null;
			case PcPackage.DRIVE_NODE___GET_INTERNAL_DRIVE_NODE:
				return getInternalDriveNode();
			case PcPackage.DRIVE_NODE___IS_EXACTLY_DRIVE_NODE:
				return isExactlyDriveNode();
			case PcPackage.DRIVE_NODE___PRE_DELETE:
				preDelete();
				return null;
			case PcPackage.DRIVE_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case PcPackage.DRIVE_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case PcPackage.DRIVE_NODE___PRE_SAVE:
				preSave();
				return null;
			case PcPackage.DRIVE_NODE___POST_SAVE:
				postSave();
				return null;
			case PcPackage.DRIVE_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case PcPackage.DRIVE_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.DRIVE_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.DRIVE_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case PcPackage.DRIVE_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.DRIVE_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.DRIVE_NODE___CAN_MOVE_TO__DRIVECONTAINER_INT_INT:
				return canMoveTo((DriveContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.DRIVE_NODE___MOVE_TO__DRIVECONTAINER_INT_INT:
				moveTo((DriveContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.DRIVE_NODE___SMOVE_TO__DRIVECONTAINER_INT_INT:
				s_moveTo((DriveContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.DRIVE_NODE___GET_CONTAINER:
				return getContainer();
			case PcPackage.DRIVE_NODE___GET_REFERENCED_DRIVE:
				return getReferencedDrive();
			case PcPackage.DRIVE_NODE___GET_LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
			case PcPackage.DRIVE_NODE___SET_LIBRARY_COMPONENT_UID__STRING:
				setLibraryComponentUID((String)arguments.get(0));
				return null;
			case PcPackage.DRIVE_NODE___GET_DRIVE_NODE_VIEW:
				return getDriveNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DriveNodeImpl
