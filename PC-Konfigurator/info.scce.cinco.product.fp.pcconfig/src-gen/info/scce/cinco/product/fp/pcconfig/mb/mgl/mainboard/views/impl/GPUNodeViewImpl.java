/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUNodeView;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPU Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUNodeViewImpl#getInternalGPUNode <em>Internal GPU Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPUNodeViewImpl extends EObjectImpl implements GPUNodeView {
	/**
	 * The cached value of the '{@link #getInternalGPUNode() <em>Internal GPU Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalGPUNode()
	 * @generated
	 * @ordered
	 */
	protected InternalGPUNode internalGPUNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPUNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.GPU_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalGPUNode getInternalGPUNode() {
		if (internalGPUNode != null && internalGPUNode.eIsProxy()) {
			InternalEObject oldInternalGPUNode = (InternalEObject)internalGPUNode;
			internalGPUNode = (InternalGPUNode)eResolveProxy(oldInternalGPUNode);
			if (internalGPUNode != oldInternalGPUNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.GPU_NODE_VIEW__INTERNAL_GPU_NODE, oldInternalGPUNode, internalGPUNode));
			}
		}
		return internalGPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalGPUNode basicGetInternalGPUNode() {
		return internalGPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalGPUNode(InternalGPUNode newInternalGPUNode) {
		InternalGPUNode oldInternalGPUNode = internalGPUNode;
		internalGPUNode = newInternalGPUNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.GPU_NODE_VIEW__INTERNAL_GPU_NODE, oldInternalGPUNode, internalGPUNode));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.GPU_NODE_VIEW__INTERNAL_GPU_NODE:
				if (resolve) return getInternalGPUNode();
				return basicGetInternalGPUNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.GPU_NODE_VIEW__INTERNAL_GPU_NODE:
				setInternalGPUNode((InternalGPUNode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.GPU_NODE_VIEW__INTERNAL_GPU_NODE:
				setInternalGPUNode((InternalGPUNode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.GPU_NODE_VIEW__INTERNAL_GPU_NODE:
				return internalGPUNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.GPU_NODE_VIEW___GET_CHIP:
				return getChip();
			case ViewsPackage.GPU_NODE_VIEW___SET_CHIP__STRING:
				setChip((String)arguments.get(0));
				return null;
			case ViewsPackage.GPU_NODE_VIEW___GET_MEMORY:
				return getMemory();
			case ViewsPackage.GPU_NODE_VIEW___SET_MEMORY__INT:
				setMemory((Integer)arguments.get(0));
				return null;
			case ViewsPackage.GPU_NODE_VIEW___GET_POWER_CONSUMPTION:
				return getPowerConsumption();
			case ViewsPackage.GPU_NODE_VIEW___SET_POWER_CONSUMPTION__INT:
				setPowerConsumption((Integer)arguments.get(0));
				return null;
			case ViewsPackage.GPU_NODE_VIEW___GET_PRICE:
				return getPrice();
			case ViewsPackage.GPU_NODE_VIEW___SET_PRICE__FLOAT:
				setPrice((Float)arguments.get(0));
				return null;
			case ViewsPackage.GPU_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.GPU_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GPUNodeViewImpl
