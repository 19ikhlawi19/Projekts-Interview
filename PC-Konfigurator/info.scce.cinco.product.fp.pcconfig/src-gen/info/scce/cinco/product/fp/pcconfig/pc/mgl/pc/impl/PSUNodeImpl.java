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

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSU Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PSUNodeImpl extends NodeImpl implements PSUNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSUNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcPackage.eINSTANCE.getPSUNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPsuName() {
		return getInternalPSUNode().getPsuName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPsuName(final String _arg) {
		getInternalPSUNode().getElement().transact("Set PsuName", () -> {
			getInternalPSUNode().setPsuName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPsuPower() {
		return getInternalPSUNode().getPsuPower();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPsuPower(final int _arg) {
		getInternalPSUNode().getElement().transact("Set PsuPower", () -> {
			getInternalPSUNode().setPsuPower(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPsuPrice() {
		return getInternalPSUNode().getPsuPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPsuPrice(final float _arg) {
		getInternalPSUNode().getElement().transact("Set PsuPrice", () -> {
			getInternalPSUNode().setPsuPrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPSUNode getInternalPSUNode() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyPSUNode() {
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
	public boolean canMoveTo(final PSUContainer pSUContainer, final int x, final int y) {
		return pSUContainer.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final PSUContainer pSUContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(pSUContainer, x, y);
			pSUContainer.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final PSUContainer pSUContainer, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUContainer getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedPSU() {
		String uid = ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode)getInternalElement()).getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode) this.getInternalElement()).getLibraryComponentUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(final String id) {
		((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode) this.getInternalElement()).setLibraryComponentUID(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUNodeView getPSUNodeView() {
		PSUNodeView pSUNodeView = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsFactory.eINSTANCE.createPSUNodeView();
		pSUNodeView.setInternalPSUNode((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode)getInternalElement());
		return pSUNodeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return PcPackage.PSU_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return PcPackage.PSU_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return PcPackage.PSU_NODE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return PcPackage.PSU_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return PcPackage.PSU_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return PcPackage.PSU_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return PcPackage.PSU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return PcPackage.PSU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return PcPackage.PSU_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return PcPackage.PSU_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return PcPackage.PSU_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.PSU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.PSU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return PcPackage.PSU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
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
			case PcPackage.PSU_NODE___GET_PSU_NAME:
				return getPsuName();
			case PcPackage.PSU_NODE___SET_PSU_NAME__STRING:
				setPsuName((String)arguments.get(0));
				return null;
			case PcPackage.PSU_NODE___GET_PSU_POWER:
				return getPsuPower();
			case PcPackage.PSU_NODE___SET_PSU_POWER__INT:
				setPsuPower((Integer)arguments.get(0));
				return null;
			case PcPackage.PSU_NODE___GET_PSU_PRICE:
				return getPsuPrice();
			case PcPackage.PSU_NODE___SET_PSU_PRICE__FLOAT:
				setPsuPrice((Float)arguments.get(0));
				return null;
			case PcPackage.PSU_NODE___GET_INTERNAL_PSU_NODE:
				return getInternalPSUNode();
			case PcPackage.PSU_NODE___IS_EXACTLY_PSU_NODE:
				return isExactlyPSUNode();
			case PcPackage.PSU_NODE___PRE_DELETE:
				preDelete();
				return null;
			case PcPackage.PSU_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case PcPackage.PSU_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case PcPackage.PSU_NODE___PRE_SAVE:
				preSave();
				return null;
			case PcPackage.PSU_NODE___POST_SAVE:
				postSave();
				return null;
			case PcPackage.PSU_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case PcPackage.PSU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PSU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PSU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case PcPackage.PSU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.PSU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.PSU_NODE___CAN_MOVE_TO__PSUCONTAINER_INT_INT:
				return canMoveTo((PSUContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.PSU_NODE___MOVE_TO__PSUCONTAINER_INT_INT:
				moveTo((PSUContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PSU_NODE___SMOVE_TO__PSUCONTAINER_INT_INT:
				s_moveTo((PSUContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.PSU_NODE___GET_CONTAINER:
				return getContainer();
			case PcPackage.PSU_NODE___GET_REFERENCED_PSU:
				return getReferencedPSU();
			case PcPackage.PSU_NODE___GET_LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
			case PcPackage.PSU_NODE___SET_LIBRARY_COMPONENT_UID__STRING:
				setLibraryComponentUID((String)arguments.get(0));
				return null;
			case PcPackage.PSU_NODE___GET_PSU_NODE_VIEW:
				return getPSUNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PSUNodeImpl
