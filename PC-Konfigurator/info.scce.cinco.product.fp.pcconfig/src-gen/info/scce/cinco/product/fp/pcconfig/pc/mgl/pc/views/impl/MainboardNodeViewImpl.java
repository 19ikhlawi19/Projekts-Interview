/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView;
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
 * An implementation of the model object '<em><b>Mainboard Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.MainboardNodeViewImpl#getInternalMainboardNode <em>Internal Mainboard Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainboardNodeViewImpl extends EObjectImpl implements MainboardNodeView {
	/**
	 * The cached value of the '{@link #getInternalMainboardNode() <em>Internal Mainboard Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMainboardNode()
	 * @generated
	 * @ordered
	 */
	protected InternalMainboardNode internalMainboardNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainboardNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.MAINBOARD_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboardNode getInternalMainboardNode() {
		if (internalMainboardNode != null && internalMainboardNode.eIsProxy()) {
			InternalEObject oldInternalMainboardNode = (InternalEObject)internalMainboardNode;
			internalMainboardNode = (InternalMainboardNode)eResolveProxy(oldInternalMainboardNode);
			if (internalMainboardNode != oldInternalMainboardNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE, oldInternalMainboardNode, internalMainboardNode));
			}
		}
		return internalMainboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalMainboardNode basicGetInternalMainboardNode() {
		return internalMainboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalMainboardNode(InternalMainboardNode newInternalMainboardNode) {
		InternalMainboardNode oldInternalMainboardNode = internalMainboardNode;
		internalMainboardNode = newInternalMainboardNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE, oldInternalMainboardNode, internalMainboardNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalMainboardNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalMainboardNode().getElement().transact("Set Name", () -> {
			getInternalMainboardNode().setName(_arg);
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
			case ViewsPackage.MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE:
				if (resolve) return getInternalMainboardNode();
				return basicGetInternalMainboardNode();
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
			case ViewsPackage.MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE:
				setInternalMainboardNode((InternalMainboardNode)newValue);
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
			case ViewsPackage.MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE:
				setInternalMainboardNode((InternalMainboardNode)null);
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
			case ViewsPackage.MAINBOARD_NODE_VIEW__INTERNAL_MAINBOARD_NODE:
				return internalMainboardNode != null;
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
			case ViewsPackage.MAINBOARD_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.MAINBOARD_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MainboardNodeViewImpl
