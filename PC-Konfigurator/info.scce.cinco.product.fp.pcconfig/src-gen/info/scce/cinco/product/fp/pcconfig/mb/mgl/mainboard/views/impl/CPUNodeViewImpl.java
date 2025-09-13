/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUNodeView;
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
 * An implementation of the model object '<em><b>CPU Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUNodeViewImpl#getInternalCPUNode <em>Internal CPU Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPUNodeViewImpl extends EObjectImpl implements CPUNodeView {
	/**
	 * The cached value of the '{@link #getInternalCPUNode() <em>Internal CPU Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalCPUNode()
	 * @generated
	 * @ordered
	 */
	protected InternalCPUNode internalCPUNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CPU_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCPUNode getInternalCPUNode() {
		if (internalCPUNode != null && internalCPUNode.eIsProxy()) {
			InternalEObject oldInternalCPUNode = (InternalEObject)internalCPUNode;
			internalCPUNode = (InternalCPUNode)eResolveProxy(oldInternalCPUNode);
			if (internalCPUNode != oldInternalCPUNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CPU_NODE_VIEW__INTERNAL_CPU_NODE, oldInternalCPUNode, internalCPUNode));
			}
		}
		return internalCPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalCPUNode basicGetInternalCPUNode() {
		return internalCPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalCPUNode(InternalCPUNode newInternalCPUNode) {
		InternalCPUNode oldInternalCPUNode = internalCPUNode;
		internalCPUNode = newInternalCPUNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CPU_NODE_VIEW__INTERNAL_CPU_NODE, oldInternalCPUNode, internalCPUNode));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CPU_NODE_VIEW__INTERNAL_CPU_NODE:
				if (resolve) return getInternalCPUNode();
				return basicGetInternalCPUNode();
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
			case ViewsPackage.CPU_NODE_VIEW__INTERNAL_CPU_NODE:
				setInternalCPUNode((InternalCPUNode)newValue);
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
			case ViewsPackage.CPU_NODE_VIEW__INTERNAL_CPU_NODE:
				setInternalCPUNode((InternalCPUNode)null);
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
			case ViewsPackage.CPU_NODE_VIEW__INTERNAL_CPU_NODE:
				return internalCPUNode != null;
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
			case ViewsPackage.CPU_NODE_VIEW___GET_CPU_TYPE:
				return getCpuType();
			case ViewsPackage.CPU_NODE_VIEW___SET_CPU_TYPE__STRING:
				setCpuType((String)arguments.get(0));
				return null;
			case ViewsPackage.CPU_NODE_VIEW___GET_POWER_CONSUMPTION:
				return getPowerConsumption();
			case ViewsPackage.CPU_NODE_VIEW___SET_POWER_CONSUMPTION__INT:
				setPowerConsumption((Integer)arguments.get(0));
				return null;
			case ViewsPackage.CPU_NODE_VIEW___GET_PRICE:
				return getPrice();
			case ViewsPackage.CPU_NODE_VIEW___SET_PRICE__FLOAT:
				setPrice((Float)arguments.get(0));
				return null;
			case ViewsPackage.CPU_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.CPU_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ViewsPackage.CPU_NODE_VIEW___GET_SOCKET:
				return getSocket();
			case ViewsPackage.CPU_NODE_VIEW___SET_SOCKET__STRING:
				setSocket((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CPUNodeViewImpl
