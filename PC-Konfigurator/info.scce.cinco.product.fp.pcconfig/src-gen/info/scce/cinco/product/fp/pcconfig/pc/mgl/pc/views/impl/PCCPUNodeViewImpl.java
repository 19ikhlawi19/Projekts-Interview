/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCCPUNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView;
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
 * An implementation of the model object '<em><b>PCCPU Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCCPUNodeViewImpl#getInternalPCCPUNode <em>Internal PCCPU Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCCPUNodeViewImpl extends EObjectImpl implements PCCPUNodeView {
	/**
	 * The cached value of the '{@link #getInternalPCCPUNode() <em>Internal PCCPU Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPCCPUNode()
	 * @generated
	 * @ordered
	 */
	protected InternalPCCPUNode internalPCCPUNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCCPUNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PCCPU_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCCPUNode getInternalPCCPUNode() {
		if (internalPCCPUNode != null && internalPCCPUNode.eIsProxy()) {
			InternalEObject oldInternalPCCPUNode = (InternalEObject)internalPCCPUNode;
			internalPCCPUNode = (InternalPCCPUNode)eResolveProxy(oldInternalPCCPUNode);
			if (internalPCCPUNode != oldInternalPCCPUNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE, oldInternalPCCPUNode, internalPCCPUNode));
			}
		}
		return internalPCCPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPCCPUNode basicGetInternalPCCPUNode() {
		return internalPCCPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPCCPUNode(InternalPCCPUNode newInternalPCCPUNode) {
		InternalPCCPUNode oldInternalPCCPUNode = internalPCCPUNode;
		internalPCCPUNode = newInternalPCCPUNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE, oldInternalPCCPUNode, internalPCCPUNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalPCCPUNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalPCCPUNode().getElement().transact("Set Name", () -> {
			getInternalPCCPUNode().setName(_arg);
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
			case ViewsPackage.PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE:
				if (resolve) return getInternalPCCPUNode();
				return basicGetInternalPCCPUNode();
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
			case ViewsPackage.PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE:
				setInternalPCCPUNode((InternalPCCPUNode)newValue);
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
			case ViewsPackage.PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE:
				setInternalPCCPUNode((InternalPCCPUNode)null);
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
			case ViewsPackage.PCCPU_NODE_VIEW__INTERNAL_PCCPU_NODE:
				return internalPCCPUNode != null;
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
			case ViewsPackage.PCCPU_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.PCCPU_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PCCPUNodeViewImpl
