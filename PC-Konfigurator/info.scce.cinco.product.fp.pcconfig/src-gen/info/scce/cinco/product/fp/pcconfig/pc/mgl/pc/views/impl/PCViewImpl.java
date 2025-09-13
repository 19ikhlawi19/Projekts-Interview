/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPC;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PC View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCViewImpl#getInternalPC <em>Internal PC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCViewImpl extends EObjectImpl implements PCView {
	/**
	 * The cached value of the '{@link #getInternalPC() <em>Internal PC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPC()
	 * @generated
	 * @ordered
	 */
	protected InternalPC internalPC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PC_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPC getInternalPC() {
		if (internalPC != null && internalPC.eIsProxy()) {
			InternalEObject oldInternalPC = (InternalEObject)internalPC;
			internalPC = (InternalPC)eResolveProxy(oldInternalPC);
			if (internalPC != oldInternalPC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PC_VIEW__INTERNAL_PC, oldInternalPC, internalPC));
			}
		}
		return internalPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPC basicGetInternalPC() {
		return internalPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPC(InternalPC newInternalPC) {
		InternalPC oldInternalPC = internalPC;
		internalPC = newInternalPC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PC_VIEW__INTERNAL_PC, oldInternalPC, internalPC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.PC_VIEW__INTERNAL_PC:
				if (resolve) return getInternalPC();
				return basicGetInternalPC();
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
			case ViewsPackage.PC_VIEW__INTERNAL_PC:
				setInternalPC((InternalPC)newValue);
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
			case ViewsPackage.PC_VIEW__INTERNAL_PC:
				setInternalPC((InternalPC)null);
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
			case ViewsPackage.PC_VIEW__INTERNAL_PC:
				return internalPC != null;
		}
		return super.eIsSet(featureID);
	}

} //PCViewImpl
