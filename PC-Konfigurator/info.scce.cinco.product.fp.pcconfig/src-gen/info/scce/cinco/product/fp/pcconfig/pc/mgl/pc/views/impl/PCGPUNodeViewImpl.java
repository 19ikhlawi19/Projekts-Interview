/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCGPUNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView;
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
 * An implementation of the model object '<em><b>PCGPU Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCGPUNodeViewImpl#getInternalPCGPUNode <em>Internal PCGPU Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCGPUNodeViewImpl extends EObjectImpl implements PCGPUNodeView {
	/**
	 * The cached value of the '{@link #getInternalPCGPUNode() <em>Internal PCGPU Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPCGPUNode()
	 * @generated
	 * @ordered
	 */
	protected InternalPCGPUNode internalPCGPUNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCGPUNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PCGPU_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCGPUNode getInternalPCGPUNode() {
		if (internalPCGPUNode != null && internalPCGPUNode.eIsProxy()) {
			InternalEObject oldInternalPCGPUNode = (InternalEObject)internalPCGPUNode;
			internalPCGPUNode = (InternalPCGPUNode)eResolveProxy(oldInternalPCGPUNode);
			if (internalPCGPUNode != oldInternalPCGPUNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE, oldInternalPCGPUNode, internalPCGPUNode));
			}
		}
		return internalPCGPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPCGPUNode basicGetInternalPCGPUNode() {
		return internalPCGPUNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPCGPUNode(InternalPCGPUNode newInternalPCGPUNode) {
		InternalPCGPUNode oldInternalPCGPUNode = internalPCGPUNode;
		internalPCGPUNode = newInternalPCGPUNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE, oldInternalPCGPUNode, internalPCGPUNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalPCGPUNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalPCGPUNode().getElement().transact("Set Name", () -> {
			getInternalPCGPUNode().setName(_arg);
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
			case ViewsPackage.PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE:
				if (resolve) return getInternalPCGPUNode();
				return basicGetInternalPCGPUNode();
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
			case ViewsPackage.PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE:
				setInternalPCGPUNode((InternalPCGPUNode)newValue);
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
			case ViewsPackage.PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE:
				setInternalPCGPUNode((InternalPCGPUNode)null);
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
			case ViewsPackage.PCGPU_NODE_VIEW__INTERNAL_PCGPU_NODE:
				return internalPCGPUNode != null;
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
			case ViewsPackage.PCGPU_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.PCGPU_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PCGPUNodeViewImpl
