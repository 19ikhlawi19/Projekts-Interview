/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUContainer;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PSUContainerView;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSU Container View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PSUContainerViewImpl#getInternalPSUContainer <em>Internal PSU Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSUContainerViewImpl extends EObjectImpl implements PSUContainerView {
	/**
	 * The cached value of the '{@link #getInternalPSUContainer() <em>Internal PSU Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPSUContainer()
	 * @generated
	 * @ordered
	 */
	protected InternalPSUContainer internalPSUContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSUContainerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PSU_CONTAINER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPSUContainer getInternalPSUContainer() {
		if (internalPSUContainer != null && internalPSUContainer.eIsProxy()) {
			InternalEObject oldInternalPSUContainer = (InternalEObject)internalPSUContainer;
			internalPSUContainer = (InternalPSUContainer)eResolveProxy(oldInternalPSUContainer);
			if (internalPSUContainer != oldInternalPSUContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER, oldInternalPSUContainer, internalPSUContainer));
			}
		}
		return internalPSUContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPSUContainer basicGetInternalPSUContainer() {
		return internalPSUContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPSUContainer(InternalPSUContainer newInternalPSUContainer) {
		InternalPSUContainer oldInternalPSUContainer = internalPSUContainer;
		internalPSUContainer = newInternalPSUContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER, oldInternalPSUContainer, internalPSUContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER:
				if (resolve) return getInternalPSUContainer();
				return basicGetInternalPSUContainer();
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
			case ViewsPackage.PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER:
				setInternalPSUContainer((InternalPSUContainer)newValue);
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
			case ViewsPackage.PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER:
				setInternalPSUContainer((InternalPSUContainer)null);
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
			case ViewsPackage.PSU_CONTAINER_VIEW__INTERNAL_PSU_CONTAINER:
				return internalPSUContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //PSUContainerViewImpl
