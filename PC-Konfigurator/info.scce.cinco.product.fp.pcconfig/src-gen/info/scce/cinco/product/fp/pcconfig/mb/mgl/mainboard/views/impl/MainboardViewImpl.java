/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboard;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mainboard View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardViewImpl#getInternalMainboard <em>Internal Mainboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainboardViewImpl extends EObjectImpl implements MainboardView {
	/**
	 * The cached value of the '{@link #getInternalMainboard() <em>Internal Mainboard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMainboard()
	 * @generated
	 * @ordered
	 */
	protected InternalMainboard internalMainboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainboardViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.MAINBOARD_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboard getInternalMainboard() {
		if (internalMainboard != null && internalMainboard.eIsProxy()) {
			InternalEObject oldInternalMainboard = (InternalEObject)internalMainboard;
			internalMainboard = (InternalMainboard)eResolveProxy(oldInternalMainboard);
			if (internalMainboard != oldInternalMainboard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.MAINBOARD_VIEW__INTERNAL_MAINBOARD, oldInternalMainboard, internalMainboard));
			}
		}
		return internalMainboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalMainboard basicGetInternalMainboard() {
		return internalMainboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalMainboard(InternalMainboard newInternalMainboard) {
		InternalMainboard oldInternalMainboard = internalMainboard;
		internalMainboard = newInternalMainboard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.MAINBOARD_VIEW__INTERNAL_MAINBOARD, oldInternalMainboard, internalMainboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.MAINBOARD_VIEW__INTERNAL_MAINBOARD:
				if (resolve) return getInternalMainboard();
				return basicGetInternalMainboard();
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
			case ViewsPackage.MAINBOARD_VIEW__INTERNAL_MAINBOARD:
				setInternalMainboard((InternalMainboard)newValue);
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
			case ViewsPackage.MAINBOARD_VIEW__INTERNAL_MAINBOARD:
				setInternalMainboard((InternalMainboard)null);
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
			case ViewsPackage.MAINBOARD_VIEW__INTERNAL_MAINBOARD:
				return internalMainboard != null;
		}
		return super.eIsSet(featureID);
	}

} //MainboardViewImpl
