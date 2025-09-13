/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl;

import graphmodel.internal.impl.InternalNodeImpl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalDriveNodeImpl#getDriveDescription <em>Drive Description</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalDriveNodeImpl#getDrivePowerConsumption <em>Drive Power Consumption</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalDriveNodeImpl#getDrivePrice <em>Drive Price</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalDriveNodeImpl#getDriveType <em>Drive Type</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalDriveNodeImpl#getDriveName <em>Drive Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalDriveNodeImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalDriveNodeImpl extends InternalNodeImpl implements InternalDriveNode {
	/**
	 * The default value of the '{@link #getDriveDescription() <em>Drive Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriveDescription() <em>Drive Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveDescription()
	 * @generated
	 * @ordered
	 */
	protected String driveDescription = DRIVE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrivePowerConsumption() <em>Drive Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivePowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final int DRIVE_POWER_CONSUMPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDrivePowerConsumption() <em>Drive Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivePowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected int drivePowerConsumption = DRIVE_POWER_CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrivePrice() <em>Drive Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivePrice()
	 * @generated
	 * @ordered
	 */
	protected static final float DRIVE_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDrivePrice() <em>Drive Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivePrice()
	 * @generated
	 * @ordered
	 */
	protected float drivePrice = DRIVE_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriveType() <em>Drive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveType()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriveType() <em>Drive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveType()
	 * @generated
	 * @ordered
	 */
	protected String driveType = DRIVE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriveName() <em>Drive Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveName()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriveName() <em>Drive Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveName()
	 * @generated
	 * @ordered
	 */
	protected String driveName = DRIVE_NAME_EDEFAULT;

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
	protected InternalDriveNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_DRIVE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveDescription() {
		return driveDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveDescription(String newDriveDescription) {
		String oldDriveDescription = driveDescription;
		driveDescription = newDriveDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_DESCRIPTION, oldDriveDescription, driveDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDrivePowerConsumption() {
		return drivePowerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrivePowerConsumption(int newDrivePowerConsumption) {
		int oldDrivePowerConsumption = drivePowerConsumption;
		drivePowerConsumption = newDrivePowerConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_POWER_CONSUMPTION, oldDrivePowerConsumption, drivePowerConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDrivePrice() {
		return drivePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrivePrice(float newDrivePrice) {
		float oldDrivePrice = drivePrice;
		drivePrice = newDrivePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_PRICE, oldDrivePrice, drivePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveType() {
		return driveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveType(String newDriveType) {
		String oldDriveType = driveType;
		driveType = newDriveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_TYPE, oldDriveType, driveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveName() {
		return driveName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveName(String newDriveName) {
		String oldDriveName = driveName;
		driveName = newDriveName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_NAME, oldDriveName, driveName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_DRIVE_NODE__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedDrive() {
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
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_DESCRIPTION:
				return getDriveDescription();
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_POWER_CONSUMPTION:
				return getDrivePowerConsumption();
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_PRICE:
				return getDrivePrice();
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_TYPE:
				return getDriveType();
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_NAME:
				return getDriveName();
			case InternalPackage.INTERNAL_DRIVE_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_DESCRIPTION:
				setDriveDescription((String)newValue);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_POWER_CONSUMPTION:
				setDrivePowerConsumption((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_PRICE:
				setDrivePrice((Float)newValue);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_TYPE:
				setDriveType((String)newValue);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_NAME:
				setDriveName((String)newValue);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_DESCRIPTION:
				setDriveDescription(DRIVE_DESCRIPTION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_POWER_CONSUMPTION:
				setDrivePowerConsumption(DRIVE_POWER_CONSUMPTION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_PRICE:
				setDrivePrice(DRIVE_PRICE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_TYPE:
				setDriveType(DRIVE_TYPE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_NAME:
				setDriveName(DRIVE_NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_DRIVE_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_DESCRIPTION:
				return DRIVE_DESCRIPTION_EDEFAULT == null ? driveDescription != null : !DRIVE_DESCRIPTION_EDEFAULT.equals(driveDescription);
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_POWER_CONSUMPTION:
				return drivePowerConsumption != DRIVE_POWER_CONSUMPTION_EDEFAULT;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_PRICE:
				return drivePrice != DRIVE_PRICE_EDEFAULT;
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_TYPE:
				return DRIVE_TYPE_EDEFAULT == null ? driveType != null : !DRIVE_TYPE_EDEFAULT.equals(driveType);
			case InternalPackage.INTERNAL_DRIVE_NODE__DRIVE_NAME:
				return DRIVE_NAME_EDEFAULT == null ? driveName != null : !DRIVE_NAME_EDEFAULT.equals(driveName);
			case InternalPackage.INTERNAL_DRIVE_NODE__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_DRIVE_NODE___GET_REFERENCED_DRIVE:
				return getReferencedDrive();
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
		result.append(" (driveDescription: ");
		result.append(driveDescription);
		result.append(", drivePowerConsumption: ");
		result.append(drivePowerConsumption);
		result.append(", drivePrice: ");
		result.append(drivePrice);
		result.append(", driveType: ");
		result.append(driveType);
		result.append(", driveName: ");
		result.append(driveName);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalDriveNodeImpl
