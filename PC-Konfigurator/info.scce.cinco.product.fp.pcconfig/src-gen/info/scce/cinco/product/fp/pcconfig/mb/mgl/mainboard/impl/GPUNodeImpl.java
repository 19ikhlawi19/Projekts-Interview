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

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPU Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GPUNodeImpl extends NodeImpl implements GPUNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPUNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainboardPackage.eINSTANCE.getGPUNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChip() {
		return getInternalGPUNode().getChip();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChip(final String _arg) {
		getInternalGPUNode().getElement().transact("Set Chip", () -> {
			getInternalGPUNode().setChip(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMemory() {
		return getInternalGPUNode().getMemory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemory(final int _arg) {
		getInternalGPUNode().getElement().transact("Set Memory", () -> {
			getInternalGPUNode().setMemory(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowerConsumption() {
		return getInternalGPUNode().getPowerConsumption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerConsumption(final int _arg) {
		getInternalGPUNode().getElement().transact("Set PowerConsumption", () -> {
			getInternalGPUNode().setPowerConsumption(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return getInternalGPUNode().getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(final float _arg) {
		getInternalGPUNode().getElement().transact("Set Price", () -> {
			getInternalGPUNode().setPrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalGPUNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalGPUNode().getElement().transact("Set Name", () -> {
			getInternalGPUNode().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalGPUNode getInternalGPUNode() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyGPUNode() {
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
	public boolean canMoveTo(final GPUSlot gPUSlot, final int x, final int y) {
		return gPUSlot.canContain(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final GPUSlot gPUSlot, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(gPUSlot, x, y);
			gPUSlot.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final GPUSlot gPUSlot, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPUSlot getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedGPU() {
		String uid = ((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode)getInternalElement()).getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return ((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode) this.getInternalElement()).getLibraryComponentUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(final String id) {
		((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode) this.getInternalElement()).setLibraryComponentUID(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GPUNodeView getGPUNodeView() {
		GPUNodeView gPUNodeView = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsFactory.eINSTANCE.createGPUNodeView();
		gPUNodeView.setInternalGPUNode((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode)getInternalElement());
		return gPUNodeView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return MainboardPackage.GPU_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return MainboardPackage.GPU_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return MainboardPackage.GPU_NODE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return MainboardPackage.GPU_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___PRE_SAVE: return MainboardPackage.GPU_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT___POST_SAVE: return MainboardPackage.GPU_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return MainboardPackage.GPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return MainboardPackage.GPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return MainboardPackage.GPU_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return MainboardPackage.GPU_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return MainboardPackage.GPU_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return MainboardPackage.GPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return MainboardPackage.GPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return MainboardPackage.GPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
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
			case MainboardPackage.GPU_NODE___GET_CHIP:
				return getChip();
			case MainboardPackage.GPU_NODE___SET_CHIP__STRING:
				setChip((String)arguments.get(0));
				return null;
			case MainboardPackage.GPU_NODE___GET_MEMORY:
				return getMemory();
			case MainboardPackage.GPU_NODE___SET_MEMORY__INT:
				setMemory((Integer)arguments.get(0));
				return null;
			case MainboardPackage.GPU_NODE___GET_POWER_CONSUMPTION:
				return getPowerConsumption();
			case MainboardPackage.GPU_NODE___SET_POWER_CONSUMPTION__INT:
				setPowerConsumption((Integer)arguments.get(0));
				return null;
			case MainboardPackage.GPU_NODE___GET_PRICE:
				return getPrice();
			case MainboardPackage.GPU_NODE___SET_PRICE__FLOAT:
				setPrice((Float)arguments.get(0));
				return null;
			case MainboardPackage.GPU_NODE___GET_NAME:
				return getName();
			case MainboardPackage.GPU_NODE___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case MainboardPackage.GPU_NODE___GET_INTERNAL_GPU_NODE:
				return getInternalGPUNode();
			case MainboardPackage.GPU_NODE___IS_EXACTLY_GPU_NODE:
				return isExactlyGPUNode();
			case MainboardPackage.GPU_NODE___PRE_DELETE:
				preDelete();
				return null;
			case MainboardPackage.GPU_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case MainboardPackage.GPU_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case MainboardPackage.GPU_NODE___PRE_SAVE:
				preSave();
				return null;
			case MainboardPackage.GPU_NODE___POST_SAVE:
				postSave();
				return null;
			case MainboardPackage.GPU_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case MainboardPackage.GPU_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.GPU_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.GPU_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case MainboardPackage.GPU_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case MainboardPackage.GPU_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case MainboardPackage.GPU_NODE___CAN_MOVE_TO__GPUSLOT_INT_INT:
				return canMoveTo((GPUSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case MainboardPackage.GPU_NODE___MOVE_TO__GPUSLOT_INT_INT:
				moveTo((GPUSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.GPU_NODE___SMOVE_TO__GPUSLOT_INT_INT:
				s_moveTo((GPUSlot)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case MainboardPackage.GPU_NODE___GET_CONTAINER:
				return getContainer();
			case MainboardPackage.GPU_NODE___GET_REFERENCED_GPU:
				return getReferencedGPU();
			case MainboardPackage.GPU_NODE___GET_LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
			case MainboardPackage.GPU_NODE___SET_LIBRARY_COMPONENT_UID__STRING:
				setLibraryComponentUID((String)arguments.get(0));
				return null;
			case MainboardPackage.GPU_NODE___GET_GPU_NODE_VIEW:
				return getGPUNodeView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GPUNodeImpl
