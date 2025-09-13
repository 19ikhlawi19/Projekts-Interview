/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUSlot;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView;
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
 * An implementation of the model object '<em><b>CPU Slot View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.CPUSlotViewImpl#getInternalCPUSlot <em>Internal CPU Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPUSlotViewImpl extends EObjectImpl implements CPUSlotView {
	/**
	 * The cached value of the '{@link #getInternalCPUSlot() <em>Internal CPU Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalCPUSlot()
	 * @generated
	 * @ordered
	 */
	protected InternalCPUSlot internalCPUSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUSlotViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CPU_SLOT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCPUSlot getInternalCPUSlot() {
		if (internalCPUSlot != null && internalCPUSlot.eIsProxy()) {
			InternalEObject oldInternalCPUSlot = (InternalEObject)internalCPUSlot;
			internalCPUSlot = (InternalCPUSlot)eResolveProxy(oldInternalCPUSlot);
			if (internalCPUSlot != oldInternalCPUSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CPU_SLOT_VIEW__INTERNAL_CPU_SLOT, oldInternalCPUSlot, internalCPUSlot));
			}
		}
		return internalCPUSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalCPUSlot basicGetInternalCPUSlot() {
		return internalCPUSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalCPUSlot(InternalCPUSlot newInternalCPUSlot) {
		InternalCPUSlot oldInternalCPUSlot = internalCPUSlot;
		internalCPUSlot = newInternalCPUSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CPU_SLOT_VIEW__INTERNAL_CPU_SLOT, oldInternalCPUSlot, internalCPUSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocket() {
		return getInternalCPUSlot().getSocket();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocket(final String _arg) {
		getInternalCPUSlot().getElement().transact("Set Socket", () -> {
			getInternalCPUSlot().setSocket(_arg);
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
			case ViewsPackage.CPU_SLOT_VIEW__INTERNAL_CPU_SLOT:
				if (resolve) return getInternalCPUSlot();
				return basicGetInternalCPUSlot();
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
			case ViewsPackage.CPU_SLOT_VIEW__INTERNAL_CPU_SLOT:
				setInternalCPUSlot((InternalCPUSlot)newValue);
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
			case ViewsPackage.CPU_SLOT_VIEW__INTERNAL_CPU_SLOT:
				setInternalCPUSlot((InternalCPUSlot)null);
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
			case ViewsPackage.CPU_SLOT_VIEW__INTERNAL_CPU_SLOT:
				return internalCPUSlot != null;
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
			case ViewsPackage.CPU_SLOT_VIEW___GET_SOCKET:
				return getSocket();
			case ViewsPackage.CPU_SLOT_VIEW___SET_SOCKET__STRING:
				setSocket((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CPUSlotViewImpl
