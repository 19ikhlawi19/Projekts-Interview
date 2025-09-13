/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalGPUSlot;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.GPUSlotView;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPU Slot View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.GPUSlotViewImpl#getInternalGPUSlot <em>Internal GPU Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPUSlotViewImpl extends EObjectImpl implements GPUSlotView {
	/**
	 * The cached value of the '{@link #getInternalGPUSlot() <em>Internal GPU Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalGPUSlot()
	 * @generated
	 * @ordered
	 */
	protected InternalGPUSlot internalGPUSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPUSlotViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.GPU_SLOT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalGPUSlot getInternalGPUSlot() {
		if (internalGPUSlot != null && internalGPUSlot.eIsProxy()) {
			InternalEObject oldInternalGPUSlot = (InternalEObject)internalGPUSlot;
			internalGPUSlot = (InternalGPUSlot)eResolveProxy(oldInternalGPUSlot);
			if (internalGPUSlot != oldInternalGPUSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.GPU_SLOT_VIEW__INTERNAL_GPU_SLOT, oldInternalGPUSlot, internalGPUSlot));
			}
		}
		return internalGPUSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalGPUSlot basicGetInternalGPUSlot() {
		return internalGPUSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalGPUSlot(InternalGPUSlot newInternalGPUSlot) {
		InternalGPUSlot oldInternalGPUSlot = internalGPUSlot;
		internalGPUSlot = newInternalGPUSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.GPU_SLOT_VIEW__INTERNAL_GPU_SLOT, oldInternalGPUSlot, internalGPUSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.GPU_SLOT_VIEW__INTERNAL_GPU_SLOT:
				if (resolve) return getInternalGPUSlot();
				return basicGetInternalGPUSlot();
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
			case ViewsPackage.GPU_SLOT_VIEW__INTERNAL_GPU_SLOT:
				setInternalGPUSlot((InternalGPUSlot)newValue);
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
			case ViewsPackage.GPU_SLOT_VIEW__INTERNAL_GPU_SLOT:
				setInternalGPUSlot((InternalGPUSlot)null);
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
			case ViewsPackage.GPU_SLOT_VIEW__INTERNAL_GPU_SLOT:
				return internalGPUSlot != null;
		}
		return super.eIsSet(featureID);
	}

} //GPUSlotViewImpl
