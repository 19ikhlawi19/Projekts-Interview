/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUNodeView;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSU Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUNodeViewImpl#getInternalPSUNode <em>Internal PSU Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSUNodeViewImpl extends EObjectImpl implements PSUNodeView {
	/**
	 * The cached value of the '{@link #getInternalPSUNode() <em>Internal PSU Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPSUNode()
	 * @generated
	 * @ordered
	 */
	protected InternalPSUNode internalPSUNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSUNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PSU_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPSUNode getInternalPSUNode() {
		if (internalPSUNode != null && internalPSUNode.eIsProxy()) {
			InternalEObject oldInternalPSUNode = (InternalEObject)internalPSUNode;
			internalPSUNode = (InternalPSUNode)eResolveProxy(oldInternalPSUNode);
			if (internalPSUNode != oldInternalPSUNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PSU_NODE_VIEW__INTERNAL_PSU_NODE, oldInternalPSUNode, internalPSUNode));
			}
		}
		return internalPSUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPSUNode basicGetInternalPSUNode() {
		return internalPSUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPSUNode(InternalPSUNode newInternalPSUNode) {
		InternalPSUNode oldInternalPSUNode = internalPSUNode;
		internalPSUNode = newInternalPSUNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PSU_NODE_VIEW__INTERNAL_PSU_NODE, oldInternalPSUNode, internalPSUNode));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.PSU_NODE_VIEW__INTERNAL_PSU_NODE:
				if (resolve) return getInternalPSUNode();
				return basicGetInternalPSUNode();
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
			case ViewsPackage.PSU_NODE_VIEW__INTERNAL_PSU_NODE:
				setInternalPSUNode((InternalPSUNode)newValue);
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
			case ViewsPackage.PSU_NODE_VIEW__INTERNAL_PSU_NODE:
				setInternalPSUNode((InternalPSUNode)null);
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
			case ViewsPackage.PSU_NODE_VIEW__INTERNAL_PSU_NODE:
				return internalPSUNode != null;
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
			case ViewsPackage.PSU_NODE_VIEW___GET_PSU_NAME:
				return getPsuName();
			case ViewsPackage.PSU_NODE_VIEW___SET_PSU_NAME__STRING:
				setPsuName((String)arguments.get(0));
				return null;
			case ViewsPackage.PSU_NODE_VIEW___GET_PSU_POWER:
				return getPsuPower();
			case ViewsPackage.PSU_NODE_VIEW___SET_PSU_POWER__INT:
				setPsuPower((Integer)arguments.get(0));
				return null;
			case ViewsPackage.PSU_NODE_VIEW___GET_PSU_PRICE:
				return getPsuPrice();
			case ViewsPackage.PSU_NODE_VIEW___SET_PSU_PRICE__FLOAT:
				setPsuPrice((Float)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PSUNodeViewImpl
