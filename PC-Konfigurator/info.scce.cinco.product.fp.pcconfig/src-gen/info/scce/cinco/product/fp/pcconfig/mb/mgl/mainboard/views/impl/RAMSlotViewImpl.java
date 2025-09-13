/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMSlot;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAM Slot View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMSlotViewImpl#getInternalRAMSlot <em>Internal RAM Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RAMSlotViewImpl extends EObjectImpl implements RAMSlotView {
	/**
	 * The cached value of the '{@link #getInternalRAMSlot() <em>Internal RAM Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalRAMSlot()
	 * @generated
	 * @ordered
	 */
	protected InternalRAMSlot internalRAMSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAMSlotViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.RAM_SLOT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRAMSlot getInternalRAMSlot() {
		if (internalRAMSlot != null && internalRAMSlot.eIsProxy()) {
			InternalEObject oldInternalRAMSlot = (InternalEObject)internalRAMSlot;
			internalRAMSlot = (InternalRAMSlot)eResolveProxy(oldInternalRAMSlot);
			if (internalRAMSlot != oldInternalRAMSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.RAM_SLOT_VIEW__INTERNAL_RAM_SLOT, oldInternalRAMSlot, internalRAMSlot));
			}
		}
		return internalRAMSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalRAMSlot basicGetInternalRAMSlot() {
		return internalRAMSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalRAMSlot(InternalRAMSlot newInternalRAMSlot) {
		InternalRAMSlot oldInternalRAMSlot = internalRAMSlot;
		internalRAMSlot = newInternalRAMSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.RAM_SLOT_VIEW__INTERNAL_RAM_SLOT, oldInternalRAMSlot, internalRAMSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRamType() {
		return getInternalRAMSlot().getRamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRamType(final String _arg) {
		getInternalRAMSlot().getElement().transact("Set RamType", () -> {
			getInternalRAMSlot().setRamType(_arg);
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
			case ViewsPackage.RAM_SLOT_VIEW__INTERNAL_RAM_SLOT:
				if (resolve) return getInternalRAMSlot();
				return basicGetInternalRAMSlot();
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
			case ViewsPackage.RAM_SLOT_VIEW__INTERNAL_RAM_SLOT:
				setInternalRAMSlot((InternalRAMSlot)newValue);
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
			case ViewsPackage.RAM_SLOT_VIEW__INTERNAL_RAM_SLOT:
				setInternalRAMSlot((InternalRAMSlot)null);
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
			case ViewsPackage.RAM_SLOT_VIEW__INTERNAL_RAM_SLOT:
				return internalRAMSlot != null;
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
			case ViewsPackage.RAM_SLOT_VIEW___GET_RAM_TYPE:
				return getRamType();
			case ViewsPackage.RAM_SLOT_VIEW___SET_RAM_TYPE__STRING:
				setRamType((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RAMSlotViewImpl
