/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;

import graphmodel.internal.impl.InternalContainerImpl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalCaseContainerImpl#getCaseInternalSlots <em>Case Internal Slots</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalCaseContainerImpl#getCasePrice <em>Case Price</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalCaseContainerImpl#getCaseExternalSlots <em>Case External Slots</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalCaseContainerImpl#getCaseName <em>Case Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalCaseContainerImpl#getCaseFormFactor <em>Case Form Factor</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalCaseContainerImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalCaseContainerImpl extends InternalContainerImpl implements InternalCaseContainer {
	/**
	 * The default value of the '{@link #getCaseInternalSlots() <em>Case Internal Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseInternalSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int CASE_INTERNAL_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCaseInternalSlots() <em>Case Internal Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseInternalSlots()
	 * @generated
	 * @ordered
	 */
	protected int caseInternalSlots = CASE_INTERNAL_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCasePrice() <em>Case Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasePrice()
	 * @generated
	 * @ordered
	 */
	protected static final float CASE_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCasePrice() <em>Case Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasePrice()
	 * @generated
	 * @ordered
	 */
	protected float casePrice = CASE_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaseExternalSlots() <em>Case External Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseExternalSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int CASE_EXTERNAL_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCaseExternalSlots() <em>Case External Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseExternalSlots()
	 * @generated
	 * @ordered
	 */
	protected int caseExternalSlots = CASE_EXTERNAL_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaseName() <em>Case Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseName() <em>Case Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseName()
	 * @generated
	 * @ordered
	 */
	protected String caseName = CASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaseFormFactor() <em>Case Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseFormFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_FORM_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseFormFactor() <em>Case Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseFormFactor()
	 * @generated
	 * @ordered
	 */
	protected String caseFormFactor = CASE_FORM_FACTOR_EDEFAULT;

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
	protected InternalCaseContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_CASE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCaseInternalSlots() {
		return caseInternalSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseInternalSlots(int newCaseInternalSlots) {
		int oldCaseInternalSlots = caseInternalSlots;
		caseInternalSlots = newCaseInternalSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CASE_CONTAINER__CASE_INTERNAL_SLOTS, oldCaseInternalSlots, caseInternalSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCasePrice() {
		return casePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCasePrice(float newCasePrice) {
		float oldCasePrice = casePrice;
		casePrice = newCasePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CASE_CONTAINER__CASE_PRICE, oldCasePrice, casePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCaseExternalSlots() {
		return caseExternalSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseExternalSlots(int newCaseExternalSlots) {
		int oldCaseExternalSlots = caseExternalSlots;
		caseExternalSlots = newCaseExternalSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CASE_CONTAINER__CASE_EXTERNAL_SLOTS, oldCaseExternalSlots, caseExternalSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaseName() {
		return caseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseName(String newCaseName) {
		String oldCaseName = caseName;
		caseName = newCaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CASE_CONTAINER__CASE_NAME, oldCaseName, caseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaseFormFactor() {
		return caseFormFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFormFactor(String newCaseFormFactor) {
		String oldCaseFormFactor = caseFormFactor;
		caseFormFactor = newCaseFormFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CASE_CONTAINER__CASE_FORM_FACTOR, oldCaseFormFactor, caseFormFactor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_CASE_CONTAINER__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainmentConstraint> getContainmentConstraints() {
		 org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>constraints =
			new org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>();
		constraints.add(new ContainmentConstraint(0,1,info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer.class));
		constraints.add(new ContainmentConstraint(0,1,info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer.class));
		constraints.add(new ContainmentConstraint(0,1,info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedCase() {
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
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_INTERNAL_SLOTS:
				return getCaseInternalSlots();
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_PRICE:
				return getCasePrice();
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_EXTERNAL_SLOTS:
				return getCaseExternalSlots();
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_NAME:
				return getCaseName();
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_FORM_FACTOR:
				return getCaseFormFactor();
			case InternalPackage.INTERNAL_CASE_CONTAINER__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_INTERNAL_SLOTS:
				setCaseInternalSlots((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_PRICE:
				setCasePrice((Float)newValue);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_EXTERNAL_SLOTS:
				setCaseExternalSlots((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_NAME:
				setCaseName((String)newValue);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_FORM_FACTOR:
				setCaseFormFactor((String)newValue);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_INTERNAL_SLOTS:
				setCaseInternalSlots(CASE_INTERNAL_SLOTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_PRICE:
				setCasePrice(CASE_PRICE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_EXTERNAL_SLOTS:
				setCaseExternalSlots(CASE_EXTERNAL_SLOTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_NAME:
				setCaseName(CASE_NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_FORM_FACTOR:
				setCaseFormFactor(CASE_FORM_FACTOR_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_CASE_CONTAINER__LIBRARY_COMPONENT_UID:
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
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_INTERNAL_SLOTS:
				return caseInternalSlots != CASE_INTERNAL_SLOTS_EDEFAULT;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_PRICE:
				return casePrice != CASE_PRICE_EDEFAULT;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_EXTERNAL_SLOTS:
				return caseExternalSlots != CASE_EXTERNAL_SLOTS_EDEFAULT;
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_NAME:
				return CASE_NAME_EDEFAULT == null ? caseName != null : !CASE_NAME_EDEFAULT.equals(caseName);
			case InternalPackage.INTERNAL_CASE_CONTAINER__CASE_FORM_FACTOR:
				return CASE_FORM_FACTOR_EDEFAULT == null ? caseFormFactor != null : !CASE_FORM_FACTOR_EDEFAULT.equals(caseFormFactor);
			case InternalPackage.INTERNAL_CASE_CONTAINER__LIBRARY_COMPONENT_UID:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_CASE_CONTAINER___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_CASE_CONTAINER___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InternalPackage.INTERNAL_CASE_CONTAINER___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
			case InternalPackage.INTERNAL_CASE_CONTAINER___GET_REFERENCED_CASE:
				return getReferencedCase();
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
		result.append(" (caseInternalSlots: ");
		result.append(caseInternalSlots);
		result.append(", casePrice: ");
		result.append(casePrice);
		result.append(", caseExternalSlots: ");
		result.append(caseExternalSlots);
		result.append(", caseName: ");
		result.append(caseName);
		result.append(", caseFormFactor: ");
		result.append(caseFormFactor);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalCaseContainerImpl
