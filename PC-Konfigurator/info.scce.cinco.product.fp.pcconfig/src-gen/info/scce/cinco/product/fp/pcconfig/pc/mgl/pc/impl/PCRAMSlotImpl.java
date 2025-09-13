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

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCRAM Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PCRAMSlotImpl extends NodeImpl implements PCRAMSlot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCRAMSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcPackage.eINSTANCE.getPCRAMSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlotType() {
		return getInternalPCRAMSlot().getSlotType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlotType(final String _arg) {
		getInternalPCRAMSlot().getElement().transact("Set SlotType", () -> {
			getInternalPCRAMSlot().setSlotType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCRAMSlot getInternalPCRAMSlot() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyPCRAMSlot() {
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
	public boolean canMoveTo(final MainboardNode mainboardNode, final int x, final int y) {
		return mainboardNode.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final MainboardNode mainboardNode, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(mainboardNode, x, y);
			mainboardNode.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final MainboardNode mainboardNode, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardNode getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMSlotView getPCRAMSlotView() {
		PCRAMSlotView pCRAMSlotView = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsFactory.eINSTANCE.createPCRAMSlotView();
		pCRAMSlotView.setInternalPCRAMSlot((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot)getInternalElement());
		return pCRAMSlotView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return PcPackage.PCRAM_SLOT___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return PcPackage.PCRAM_SLOT___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return PcPackage.PCRAM_SLOT___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return PcPackage.PCRAM_SLOT___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return PcPackage.PCRAM_SLOT___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return PcPackage.PCRAM_SLOT___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return PcPackage.PCRAM_SLOT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return PcPackage.PCRAM_SLOT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return PcPackage.PCRAM_SLOT___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return PcPackage.PCRAM_SLOT___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return PcPackage.PCRAM_SLOT___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.PCRAM_SLOT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.PCRAM_SLOT___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return PcPackage.PCRAM_SLOT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
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
			case PcPackage.PCRAM_SLOT___GET_SLOT_TYPE:
				return getSlotType();
			case PcPackage.PCRAM_SLOT___SET_SLOT_TYPE__STRING:
				setSlotType((String)arguments.get(0));
				return null;
			case PcPackage.PCRAM_SLOT___GET_INTERNAL_PCRAM_SLOT:
				return getInternalPCRAMSlot();
			case PcPackage.PCRAM_SLOT___IS_EXACTLY_PCRAM_SLOT:
				return isExactlyPCRAMSlot();
			case PcPackage.PCRAM_SLOT___PRE_DELETE:
				preDelete();
				return null;
			case PcPackage.PCRAM_SLOT___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case PcPackage.PCRAM_SLOT___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case PcPackage.PCRAM_SLOT___PRE_SAVE:
				preSave();
				return null;
			case PcPackage.PCRAM_SLOT___POST_SAVE:
				postSave();
				return null;
			case PcPackage.PCRAM_SLOT___GET_ROOT_ELEMENT:
				return getRootElement();
			case PcPackage.PCRAM_SLOT___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PCRAM_SLOT___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PCRAM_SLOT___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case PcPackage.PCRAM_SLOT___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.PCRAM_SLOT___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.PCRAM_SLOT___CAN_MOVE_TO__MAINBOARDNODE_INT_INT:
				return canMoveTo((MainboardNode)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.PCRAM_SLOT___MOVE_TO__MAINBOARDNODE_INT_INT:
				moveTo((MainboardNode)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PCRAM_SLOT___SMOVE_TO__MAINBOARDNODE_INT_INT:
				s_moveTo((MainboardNode)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PCRAM_SLOT___GET_CONTAINER:
				return getContainer();
			case PcPackage.PCRAM_SLOT___GET_PCRAM_SLOT_VIEW:
				return getPCRAMSlotView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PCRAMSlotImpl
