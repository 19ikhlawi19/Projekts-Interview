/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSU Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPSUNodeImpl#getPsuName <em>Psu Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPSUNodeImpl#getPsuPower <em>Psu Power</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPSUNodeImpl#getPsuPrice <em>Psu Price</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalPSUNodeImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalPSUNodeImpl extends InternalNodeImpl implements InternalPSUNode {
	/**
	 * The default value of the '{@link #getPsuName() <em>Psu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsuName()
	 * @generated
	 * @ordered
	 */
	protected static final String PSU_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPsuName() <em>Psu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsuName()
	 * @generated
	 * @ordered
	 */
	protected String psuName = PSU_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPsuPower() <em>Psu Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsuPower()
	 * @generated
	 * @ordered
	 */
	protected static final int PSU_POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPsuPower() <em>Psu Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsuPower()
	 * @generated
	 * @ordered
	 */
	protected int psuPower = PSU_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPsuPrice() <em>Psu Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsuPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PSU_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPsuPrice() <em>Psu Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsuPrice()
	 * @generated
	 * @ordered
	 */
	protected float psuPrice = PSU_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_COMPONENT_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected String libraryComponentUID = LIBRARY_COMPONENT_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalPSUNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_PSU_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPsuName() {
		return psuName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPsuName(String newPsuName) {
		String oldPsuName = psuName;
		psuName = newPsuName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_PSU_NODE__PSU_NAME, oldPsuName, psuName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPsuPower() {
		return psuPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPsuPower(int newPsuPower) {
		int oldPsuPower = psuPower;
		psuPower = newPsuPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_PSU_NODE__PSU_POWER, oldPsuPower, psuPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPsuPrice() {
		return psuPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPsuPrice(float newPsuPrice) {
		float oldPsuPrice = psuPrice;
		psuPrice = newPsuPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_PSU_NODE__PSU_PRICE, oldPsuPrice, psuPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return libraryComponentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(String newLibraryComponentUID) {
		String oldLibraryComponentUID = libraryComponentUID;
		libraryComponentUID = newLibraryComponentUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_PSU_NODE__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedPSU() {
		String uid = getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_PSU_NODE__PSU_NAME:
				return getPsuName();
			case InternalPackage.INTERNAL_PSU_NODE__PSU_POWER:
				return getPsuPower();
			case InternalPackage.INTERNAL_PSU_NODE__PSU_PRICE:
				return getPsuPrice();
			case InternalPackage.INTERNAL_PSU_NODE__LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
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
			case InternalPackage.INTERNAL_PSU_NODE__PSU_NAME:
				setPsuName((String)newValue);
				return;
			case InternalPackage.INTERNAL_PSU_NODE__PSU_POWER:
				setPsuPower((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_PSU_NODE__PSU_PRICE:
				setPsuPrice((Float)newValue);
				return;
			case InternalPackage.INTERNAL_PSU_NODE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID((String)newValue);
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
			case InternalPackage.INTERNAL_PSU_NODE__PSU_NAME:
				setPsuName(PSU_NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_PSU_NODE__PSU_POWER:
				setPsuPower(PSU_POWER_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_PSU_NODE__PSU_PRICE:
				setPsuPrice(PSU_PRICE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_PSU_NODE__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID(LIBRARY_COMPONENT_UID_EDEFAULT);
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
			case InternalPackage.INTERNAL_PSU_NODE__PSU_NAME:
				return PSU_NAME_EDEFAULT == null ? psuName != null : !PSU_NAME_EDEFAULT.equals(psuName);
			case InternalPackage.INTERNAL_PSU_NODE__PSU_POWER:
				return psuPower != PSU_POWER_EDEFAULT;
			case InternalPackage.INTERNAL_PSU_NODE__PSU_PRICE:
				return psuPrice != PSU_PRICE_EDEFAULT;
			case InternalPackage.INTERNAL_PSU_NODE__LIBRARY_COMPONENT_UID:
				return LIBRARY_COMPONENT_UID_EDEFAULT == null ? libraryComponentUID != null : !LIBRARY_COMPONENT_UID_EDEFAULT.equals(libraryComponentUID);
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
			case InternalPackage.INTERNAL_PSU_NODE___GET_REFERENCED_PSU:
				return getReferencedPSU();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (psuName: ");
		result.append(psuName);
		result.append(", psuPower: ");
		result.append(psuPower);
		result.append(", psuPrice: ");
		result.append(psuPrice);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalPSUNodeImpl
