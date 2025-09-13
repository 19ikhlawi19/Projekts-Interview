/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveContainer;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveContainerView;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive Container View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveContainerViewImpl#getInternalDriveContainer <em>Internal Drive Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriveContainerViewImpl extends EObjectImpl implements DriveContainerView {
	/**
	 * The cached value of the '{@link #getInternalDriveContainer() <em>Internal Drive Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDriveContainer()
	 * @generated
	 * @ordered
	 */
	protected InternalDriveContainer internalDriveContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveContainerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DRIVE_CONTAINER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDriveContainer getInternalDriveContainer() {
		if (internalDriveContainer != null && internalDriveContainer.eIsProxy()) {
			InternalEObject oldInternalDriveContainer = (InternalEObject)internalDriveContainer;
			internalDriveContainer = (InternalDriveContainer)eResolveProxy(oldInternalDriveContainer);
			if (internalDriveContainer != oldInternalDriveContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER, oldInternalDriveContainer, internalDriveContainer));
			}
		}
		return internalDriveContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDriveContainer basicGetInternalDriveContainer() {
		return internalDriveContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDriveContainer(InternalDriveContainer newInternalDriveContainer) {
		InternalDriveContainer oldInternalDriveContainer = internalDriveContainer;
		internalDriveContainer = newInternalDriveContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER, oldInternalDriveContainer, internalDriveContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER:
				if (resolve) return getInternalDriveContainer();
				return basicGetInternalDriveContainer();
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
			case ViewsPackage.DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER:
				setInternalDriveContainer((InternalDriveContainer)newValue);
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
			case ViewsPackage.DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER:
				setInternalDriveContainer((InternalDriveContainer)null);
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
			case ViewsPackage.DRIVE_CONTAINER_VIEW__INTERNAL_DRIVE_CONTAINER:
				return internalDriveContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //DriveContainerViewImpl
