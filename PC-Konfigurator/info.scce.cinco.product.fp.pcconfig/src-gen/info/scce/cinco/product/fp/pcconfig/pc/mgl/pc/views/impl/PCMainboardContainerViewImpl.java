/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCMainboardContainer;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCMainboardContainerView;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PC Mainboard Container View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCMainboardContainerViewImpl#getInternalPCMainboardContainer <em>Internal PC Mainboard Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMainboardContainerViewImpl extends EObjectImpl implements PCMainboardContainerView {
	/**
	 * The cached value of the '{@link #getInternalPCMainboardContainer() <em>Internal PC Mainboard Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPCMainboardContainer()
	 * @generated
	 * @ordered
	 */
	protected InternalPCMainboardContainer internalPCMainboardContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMainboardContainerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PC_MAINBOARD_CONTAINER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCMainboardContainer getInternalPCMainboardContainer() {
		if (internalPCMainboardContainer != null && internalPCMainboardContainer.eIsProxy()) {
			InternalEObject oldInternalPCMainboardContainer = (InternalEObject)internalPCMainboardContainer;
			internalPCMainboardContainer = (InternalPCMainboardContainer)eResolveProxy(oldInternalPCMainboardContainer);
			if (internalPCMainboardContainer != oldInternalPCMainboardContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER, oldInternalPCMainboardContainer, internalPCMainboardContainer));
			}
		}
		return internalPCMainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPCMainboardContainer basicGetInternalPCMainboardContainer() {
		return internalPCMainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPCMainboardContainer(InternalPCMainboardContainer newInternalPCMainboardContainer) {
		InternalPCMainboardContainer oldInternalPCMainboardContainer = internalPCMainboardContainer;
		internalPCMainboardContainer = newInternalPCMainboardContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER, oldInternalPCMainboardContainer, internalPCMainboardContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER:
				if (resolve) return getInternalPCMainboardContainer();
				return basicGetInternalPCMainboardContainer();
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
			case ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER:
				setInternalPCMainboardContainer((InternalPCMainboardContainer)newValue);
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
			case ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER:
				setInternalPCMainboardContainer((InternalPCMainboardContainer)null);
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
			case ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW__INTERNAL_PC_MAINBOARD_CONTAINER:
				return internalPCMainboardContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //PCMainboardContainerViewImpl
