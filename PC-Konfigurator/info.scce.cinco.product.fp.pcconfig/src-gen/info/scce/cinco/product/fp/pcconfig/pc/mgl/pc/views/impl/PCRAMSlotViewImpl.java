/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView;
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
 * An implementation of the model object '<em><b>PCRAM Slot View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.PCRAMSlotViewImpl#getInternalPCRAMSlot <em>Internal PCRAM Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCRAMSlotViewImpl extends EObjectImpl implements PCRAMSlotView {
	/**
	 * The cached value of the '{@link #getInternalPCRAMSlot() <em>Internal PCRAM Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPCRAMSlot()
	 * @generated
	 * @ordered
	 */
	protected InternalPCRAMSlot internalPCRAMSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCRAMSlotViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.PCRAM_SLOT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPCRAMSlot getInternalPCRAMSlot() {
		if (internalPCRAMSlot != null && internalPCRAMSlot.eIsProxy()) {
			InternalEObject oldInternalPCRAMSlot = (InternalEObject)internalPCRAMSlot;
			internalPCRAMSlot = (InternalPCRAMSlot)eResolveProxy(oldInternalPCRAMSlot);
			if (internalPCRAMSlot != oldInternalPCRAMSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT, oldInternalPCRAMSlot, internalPCRAMSlot));
			}
		}
		return internalPCRAMSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPCRAMSlot basicGetInternalPCRAMSlot() {
		return internalPCRAMSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPCRAMSlot(InternalPCRAMSlot newInternalPCRAMSlot) {
		InternalPCRAMSlot oldInternalPCRAMSlot = internalPCRAMSlot;
		internalPCRAMSlot = newInternalPCRAMSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT, oldInternalPCRAMSlot, internalPCRAMSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlotType() {
		return getInternalPCRAMSlot().getSlotType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlotType(final String _arg) {
		getInternalPCRAMSlot().getElement().transact("Set SlotType", () -> {
			getInternalPCRAMSlot().setSlotType(_arg);
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
			case ViewsPackage.PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT:
				if (resolve) return getInternalPCRAMSlot();
				return basicGetInternalPCRAMSlot();
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
			case ViewsPackage.PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT:
				setInternalPCRAMSlot((InternalPCRAMSlot)newValue);
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
			case ViewsPackage.PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT:
				setInternalPCRAMSlot((InternalPCRAMSlot)null);
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
			case ViewsPackage.PCRAM_SLOT_VIEW__INTERNAL_PCRAM_SLOT:
				return internalPCRAMSlot != null;
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
			case ViewsPackage.PCRAM_SLOT_VIEW___GET_SLOT_TYPE:
				return getSlotType();
			case ViewsPackage.PCRAM_SLOT_VIEW___SET_SLOT_TYPE__STRING:
				setSlotType((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PCRAMSlotViewImpl
