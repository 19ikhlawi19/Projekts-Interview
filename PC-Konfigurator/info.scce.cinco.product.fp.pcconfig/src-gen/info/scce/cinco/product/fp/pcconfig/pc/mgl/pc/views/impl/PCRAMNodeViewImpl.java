/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMNodeView;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCRAM Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMNodeViewImpl#getInternalPCRAMNode <em>Internal PCRAM Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCRAMNodeViewImpl extends EObjectImpl implements PCRAMNodeView {
	/**
	 * The cached value of the '{@link #getInternalPCRAMNode() <em>Internal PCRAM Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPCRAMNode()
	 * @generated
	 * @ordered
	 */
	protected InternalPCRAMNode internalPCRAMNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCRAMNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PCRAM_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCRAMNode getInternalPCRAMNode() {
		if (internalPCRAMNode != null && internalPCRAMNode.eIsProxy()) {
			InternalEObject oldInternalPCRAMNode = (InternalEObject)internalPCRAMNode;
			internalPCRAMNode = (InternalPCRAMNode)eResolveProxy(oldInternalPCRAMNode);
			if (internalPCRAMNode != oldInternalPCRAMNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE, oldInternalPCRAMNode, internalPCRAMNode));
			}
		}
		return internalPCRAMNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPCRAMNode basicGetInternalPCRAMNode() {
		return internalPCRAMNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPCRAMNode(InternalPCRAMNode newInternalPCRAMNode) {
		InternalPCRAMNode oldInternalPCRAMNode = internalPCRAMNode;
		internalPCRAMNode = newInternalPCRAMNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE, oldInternalPCRAMNode, internalPCRAMNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE:
				if (resolve) return getInternalPCRAMNode();
				return basicGetInternalPCRAMNode();
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
			case ViewsPackage.PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE:
				setInternalPCRAMNode((InternalPCRAMNode)newValue);
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
			case ViewsPackage.PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE:
				setInternalPCRAMNode((InternalPCRAMNode)null);
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
			case ViewsPackage.PCRAM_NODE_VIEW__INTERNAL_PCRAM_NODE:
				return internalPCRAMNode != null;
		}
		return super.eIsSet(featureID);
	}

} //PCRAMNodeViewImpl
