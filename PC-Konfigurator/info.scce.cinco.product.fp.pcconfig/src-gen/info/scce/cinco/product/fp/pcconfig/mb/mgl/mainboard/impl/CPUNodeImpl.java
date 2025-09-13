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

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPU Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CPUNodeImpl extends NodeImpl implements CPUNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainboardPackage.eINSTANCE.getCPUNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpuType() {
		return getInternalCPUNode().getCpuType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpuType(final String _arg) {
		getInternalCPUNode().getElement().transact("Set CpuType", () -> {
			getInternalCPUNode().setCpuType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowerConsumption() {
		return getInternalCPUNode().getPowerConsumption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerConsumption(final int _arg) {
		getInternalCPUNode().getElement().transact("Set PowerConsumption", () -> {
			getInternalCPUNode().setPowerConsumption(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return getInternalCPUNode().getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(final float _arg) {
		getInternalCPUNode().getElement().transact("Set Price", () -> {
			getInternalCPUNode().setPrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalCPUNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalCPUNode().getElement().transact("Set Name", () -> {
			getInternalCPUNode().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocket() {
		return getInternalCPUNode().getSocket();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocket(final String _arg) {
		getInternalCPUNode().getElement().transact("Set Socket", () -> {
			getInternalCPUNode().setSocket(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCPUNode getInternalCPUNode() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyCPUNode() {
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
	public boolean canMoveTo(final CPUSlot cPUSlot, final int x, final int y) {
		return cPUSlot.canContain(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final CPUSlot cPUSlot, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(cPUSlot, x, y);
			cPUSlot.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final CPUSlot cPUSlot, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUSlot getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedCPU() {
		String uid = ((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode)getInternalElement()).getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return ((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode) this.getInternalElement()).getLibraryComponentUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(final String id) {
		((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode) this.getInternalElement()).setLibraryComponentUID(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUNodeView getCPUNodeView() {
		CPUNodeView cPUNodeView = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsFactory.eINSTANCE.createCPUNodeView();
		cPUNodeView.setInternalCPUNode((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode)getInternalElement());
		return cPUNodeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return MainboardPackage.CPU_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return MainboardPackage.CPU_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return MainboardPackage.CPU_NODE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return MainboardPackage.CPU_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return MainboardPackage.CPU_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return MainboardPackage.CPU_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return MainboardPackage.CPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return MainboardPackage.CPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return MainboardPackage.CPU_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return MainboardPackage.CPU_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return MainboardPackage.CPU_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return MainboardPackage.CPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return MainboardPackage.CPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return MainboardPackage.CPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
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
			case MainboardPackage.CPU_NODE___GET_CPU_TYPE:
				return getCpuType();
			case MainboardPackage.CPU_NODE___SET_CPU_TYPE__STRING:
				setCpuType((String)arguments.get(0));
				return null;
			case MainboardPackage.CPU_NODE___GET_POWER_CONSUMPTION:
				return getPowerConsumption();
			case MainboardPackage.CPU_NODE___SET_POWER_CONSUMPTION__INT:
				setPowerConsumption((Integer)arguments.get(0));
				return null;
			case MainboardPackage.CPU_NODE___GET_PRICE:
				return getPrice();
			case MainboardPackage.CPU_NODE___SET_PRICE__FLOAT:
				setPrice((Float)arguments.get(0));
				return null;
			case MainboardPackage.CPU_NODE___GET_NAME:
				return getName();
			case MainboardPackage.CPU_NODE___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case MainboardPackage.CPU_NODE___GET_SOCKET:
				return getSocket();
			case MainboardPackage.CPU_NODE___SET_SOCKET__STRING:
				setSocket((String)arguments.get(0));
				return null;
			case MainboardPackage.CPU_NODE___GET_INTERNAL_CPU_NODE:
				return getInternalCPUNode();
			case MainboardPackage.CPU_NODE___IS_EXACTLY_CPU_NODE:
				return isExactlyCPUNode();
			case MainboardPackage.CPU_NODE___PRE_DELETE:
				preDelete();
				return null;
			case MainboardPackage.CPU_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case MainboardPackage.CPU_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case MainboardPackage.CPU_NODE___PRE_SAVE:
				preSave();
				return null;
			case MainboardPackage.CPU_NODE___POST_SAVE:
				postSave();
				return null;
			case MainboardPackage.CPU_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case MainboardPackage.CPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.CPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.CPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case MainboardPackage.CPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case MainboardPackage.CPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case MainboardPackage.CPU_NODE___CAN_MOVE_TO__CPUSLOT_INT_INT:
				return canMoveTo((CPUSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case MainboardPackage.CPU_NODE___MOVE_TO__CPUSLOT_INT_INT:
				moveTo((CPUSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.CPU_NODE___SMOVE_TO__CPUSLOT_INT_INT:
				s_moveTo((CPUSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.CPU_NODE___GET_CONTAINER:
				return getContainer();
			case MainboardPackage.CPU_NODE___GET_REFERENCED_CPU:
				return getReferencedCPU();
			case MainboardPackage.CPU_NODE___GET_LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
			case MainboardPackage.CPU_NODE___SET_LIBRARY_COMPONENT_UID__STRING:
				setLibraryComponentUID((String)arguments.get(0));
				return null;
			case MainboardPackage.CPU_NODE___GET_CPU_NODE_VIEW:
				return getCPUNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CPUNodeImpl
