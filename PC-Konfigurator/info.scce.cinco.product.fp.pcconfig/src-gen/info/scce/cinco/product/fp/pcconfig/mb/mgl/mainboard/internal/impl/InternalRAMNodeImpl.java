/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAM Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalRAMNodeImpl#getPowerConsumption <em>Power Consumption</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalRAMNodeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalRAMNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalRAMNodeImpl#getRamType <em>Ram Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalRAMNodeImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalRAMNodeImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalRAMNodeImpl extends InternalNodeImpl implements InternalRAMNode {
	/**
	 * The default value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_CONSUMPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected int powerConsumption = POWER_CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamType() <em>Ram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamType()
	 * @generated
	 * @ordered
	 */
	protected static final String RAM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamType() <em>Ram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamType()
	 * @generated
	 * @ordered
	 */
	protected String ramType = RAM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

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
	protected InternalRAMNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_RAM_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowerConsumption() {
		return powerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerConsumption(int newPowerConsumption) {
		int oldPowerConsumption = powerConsumption;
		powerConsumption = newPowerConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_RAM_NODE__POWER_CONSUMPTION, oldPowerConsumption, powerConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_RAM_NODE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_RAM_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRamType() {
		return ramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRamType(String newRamType) {
		String oldRamType = ramType;
		ramType = newRamType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_RAM_NODE__RAM_TYPE, oldRamType, ramType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_RAM_NODE__CAPACITY, oldCapacity, capacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_RAM_NODE__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedRAM() {
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
			case InternalPackage.INTERNAL_RAM_NODE__POWER_CONSUMPTION:
				return getPowerConsumption();
			case InternalPackage.INTERNAL_RAM_NODE__PRICE:
				return getPrice();
			case InternalPackage.INTERNAL_RAM_NODE__NAME:
				return getName();
			case InternalPackage.INTERNAL_RAM_NODE__RAM_TYPE:
				return getRamType();
			case InternalPackage.INTERNAL_RAM_NODE__CAPACITY:
				return getCapacity();
			case InternalPackage.INTERNAL_RAM_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_RAM_NODE__POWER_CONSUMPTION:
				setPowerConsumption((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__PRICE:
				setPrice((Float)newValue);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__NAME:
				setName((String)newValue);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__RAM_TYPE:
				setRamType((String)newValue);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_RAM_NODE__POWER_CONSUMPTION:
				setPowerConsumption(POWER_CONSUMPTION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__RAM_TYPE:
				setRamType(RAM_TYPE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_RAM_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_RAM_NODE__POWER_CONSUMPTION:
				return powerConsumption != POWER_CONSUMPTION_EDEFAULT;
			case InternalPackage.INTERNAL_RAM_NODE__PRICE:
				return price != PRICE_EDEFAULT;
			case InternalPackage.INTERNAL_RAM_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InternalPackage.INTERNAL_RAM_NODE__RAM_TYPE:
				return RAM_TYPE_EDEFAULT == null ? ramType != null : !RAM_TYPE_EDEFAULT.equals(ramType);
			case InternalPackage.INTERNAL_RAM_NODE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case InternalPackage.INTERNAL_RAM_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_RAM_NODE___GET_REFERENCED_RAM:
				return getReferencedRAM();
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
		result.append(" (powerConsumption: ");
		result.append(powerConsumption);
		result.append(", price: ");
		result.append(price);
		result.append(", name: ");
		result.append(name);
		result.append(", ramType: ");
		result.append(ramType);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalRAMNodeImpl
