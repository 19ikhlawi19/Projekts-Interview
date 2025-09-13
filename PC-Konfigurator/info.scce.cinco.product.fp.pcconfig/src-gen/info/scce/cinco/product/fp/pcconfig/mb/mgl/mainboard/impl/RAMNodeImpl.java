/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl;

import graphmodel.Direction;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.NodeImpl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAM Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RAMNodeImpl extends NodeImpl implements RAMNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAMNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainboardPackage.eINSTANCE.getRAMNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowerConsumption() {
		return getInternalRAMNode().getPowerConsumption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerConsumption(final int _arg) {
		getInternalRAMNode().getElement().transact("Set PowerConsumption", () -> {
			getInternalRAMNode().setPowerConsumption(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return getInternalRAMNode().getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(final float _arg) {
		getInternalRAMNode().getElement().transact("Set Price", () -> {
			getInternalRAMNode().setPrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalRAMNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalRAMNode().getElement().transact("Set Name", () -> {
			getInternalRAMNode().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRamType() {
		return getInternalRAMNode().getRamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRamType(final String _arg) {
		getInternalRAMNode().getElement().transact("Set RamType", () -> {
			getInternalRAMNode().setRamType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return getInternalRAMNode().getCapacity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(final int _arg) {
		getInternalRAMNode().getElement().transact("Set Capacity", () -> {
			getInternalRAMNode().setCapacity(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRAMNode getInternalRAMNode() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyRAMNode() {
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
		return () -> {};
		
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
	public Mainboard getRootElement() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard) this.getInternalElement().getRootElement().getElement();
		
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
	public boolean canMoveTo(final RAMSlot rAMSlot, final int x, final int y) {
		return rAMSlot.canContain(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final RAMSlot rAMSlot, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(rAMSlot, x, y);
			rAMSlot.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final RAMSlot rAMSlot, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMSlot getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedRAM() {
		String uid = ((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode)getInternalElement()).getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return ((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode) this.getInternalElement()).getLibraryComponentUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(final String id) {
		((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode) this.getInternalElement()).setLibraryComponentUID(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RAMNodeView getRAMNodeView() {
		RAMNodeView rAMNodeView = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsFactory.eINSTANCE.createRAMNodeView();
		rAMNodeView.setInternalRAMNode((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode)getInternalElement());
		return rAMNodeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return MainboardPackage.RAM_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return MainboardPackage.RAM_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return MainboardPackage.RAM_NODE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return MainboardPackage.RAM_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return MainboardPackage.RAM_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return MainboardPackage.RAM_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return MainboardPackage.RAM_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return MainboardPackage.RAM_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return MainboardPackage.RAM_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return MainboardPackage.RAM_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return MainboardPackage.RAM_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return MainboardPackage.RAM_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return MainboardPackage.RAM_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return MainboardPackage.RAM_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
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
			case MainboardPackage.RAM_NODE___GET_POWER_CONSUMPTION:
				return getPowerConsumption();
			case MainboardPackage.RAM_NODE___SET_POWER_CONSUMPTION__INT:
				setPowerConsumption((Integer)arguments.get(0));
				return null;
			case MainboardPackage.RAM_NODE___GET_PRICE:
				return getPrice();
			case MainboardPackage.RAM_NODE___SET_PRICE__FLOAT:
				setPrice((Float)arguments.get(0));
				return null;
			case MainboardPackage.RAM_NODE___GET_NAME:
				return getName();
			case MainboardPackage.RAM_NODE___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case MainboardPackage.RAM_NODE___GET_RAM_TYPE:
				return getRamType();
			case MainboardPackage.RAM_NODE___SET_RAM_TYPE__STRING:
				setRamType((String)arguments.get(0));
				return null;
			case MainboardPackage.RAM_NODE___GET_CAPACITY:
				return getCapacity();
			case MainboardPackage.RAM_NODE___SET_CAPACITY__INT:
				setCapacity((Integer)arguments.get(0));
				return null;
			case MainboardPackage.RAM_NODE___GET_INTERNAL_RAM_NODE:
				return getInternalRAMNode();
			case MainboardPackage.RAM_NODE___IS_EXACTLY_RAM_NODE:
				return isExactlyRAMNode();
			case MainboardPackage.RAM_NODE___PRE_DELETE:
				preDelete();
				return null;
			case MainboardPackage.RAM_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case MainboardPackage.RAM_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case MainboardPackage.RAM_NODE___PRE_SAVE:
				preSave();
				return null;
			case MainboardPackage.RAM_NODE___POST_SAVE:
				postSave();
				return null;
			case MainboardPackage.RAM_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case MainboardPackage.RAM_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.RAM_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.RAM_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case MainboardPackage.RAM_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case MainboardPackage.RAM_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case MainboardPackage.RAM_NODE___CAN_MOVE_TO__RAMSLOT_INT_INT:
				return canMoveTo((RAMSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case MainboardPackage.RAM_NODE___MOVE_TO__RAMSLOT_INT_INT:
				moveTo((RAMSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.RAM_NODE___SMOVE_TO__RAMSLOT_INT_INT:
				s_moveTo((RAMSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.RAM_NODE___GET_CONTAINER:
				return getContainer();
			case MainboardPackage.RAM_NODE___GET_REFERENCED_RAM:
				return getReferencedRAM();
			case MainboardPackage.RAM_NODE___GET_LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
			case MainboardPackage.RAM_NODE___SET_LIBRARY_COMPONENT_UID__STRING:
				setLibraryComponentUID((String)arguments.get(0));
				return null;
			case MainboardPackage.RAM_NODE___GET_RAM_NODE_VIEW:
				return getRAMNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RAMNodeImpl
