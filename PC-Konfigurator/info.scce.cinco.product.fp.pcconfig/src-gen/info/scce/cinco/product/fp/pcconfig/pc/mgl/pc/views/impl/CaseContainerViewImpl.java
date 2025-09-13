/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView;
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
 * An implementation of the model object '<em><b>Case Container View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.CaseContainerViewImpl#getInternalCaseContainer <em>Internal Case Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseContainerViewImpl extends EObjectImpl implements CaseContainerView {
	/**
	 * The cached value of the '{@link #getInternalCaseContainer() <em>Internal Case Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalCaseContainer()
	 * @generated
	 * @ordered
	 */
	protected InternalCaseContainer internalCaseContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseContainerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CASE_CONTAINER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCaseContainer getInternalCaseContainer() {
		if (internalCaseContainer != null && internalCaseContainer.eIsProxy()) {
			InternalEObject oldInternalCaseContainer = (InternalEObject)internalCaseContainer;
			internalCaseContainer = (InternalCaseContainer)eResolveProxy(oldInternalCaseContainer);
			if (internalCaseContainer != oldInternalCaseContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER, oldInternalCaseContainer, internalCaseContainer));
			}
		}
		return internalCaseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalCaseContainer basicGetInternalCaseContainer() {
		return internalCaseContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalCaseContainer(InternalCaseContainer newInternalCaseContainer) {
		InternalCaseContainer oldInternalCaseContainer = internalCaseContainer;
		internalCaseContainer = newInternalCaseContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER, oldInternalCaseContainer, internalCaseContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCaseInternalSlots() {
		return getInternalCaseContainer().getCaseInternalSlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseInternalSlots(final int _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseInternalSlots", () -> {
			getInternalCaseContainer().setCaseInternalSlots(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCasePrice() {
		return getInternalCaseContainer().getCasePrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCasePrice(final float _arg) {
		getInternalCaseContainer().getElement().transact("Set CasePrice", () -> {
			getInternalCaseContainer().setCasePrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCaseExternalSlots() {
		return getInternalCaseContainer().getCaseExternalSlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseExternalSlots(final int _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseExternalSlots", () -> {
			getInternalCaseContainer().setCaseExternalSlots(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaseName() {
		return getInternalCaseContainer().getCaseName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseName(final String _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseName", () -> {
			getInternalCaseContainer().setCaseName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaseFormFactor() {
		return getInternalCaseContainer().getCaseFormFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFormFactor(final String _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseFormFactor", () -> {
			getInternalCaseContainer().setCaseFormFactor(_arg);
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
			case ViewsPackage.CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER:
				if (resolve) return getInternalCaseContainer();
				return basicGetInternalCaseContainer();
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
			case ViewsPackage.CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER:
				setInternalCaseContainer((InternalCaseContainer)newValue);
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
			case ViewsPackage.CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER:
				setInternalCaseContainer((InternalCaseContainer)null);
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
			case ViewsPackage.CASE_CONTAINER_VIEW__INTERNAL_CASE_CONTAINER:
				return internalCaseContainer != null;
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
			case ViewsPackage.CASE_CONTAINER_VIEW___GET_CASE_INTERNAL_SLOTS:
				return getCaseInternalSlots();
			case ViewsPackage.CASE_CONTAINER_VIEW___SET_CASE_INTERNAL_SLOTS__INT:
				setCaseInternalSlots((Integer)arguments.get(0));
				return null;
			case ViewsPackage.CASE_CONTAINER_VIEW___GET_CASE_PRICE:
				return getCasePrice();
			case ViewsPackage.CASE_CONTAINER_VIEW___SET_CASE_PRICE__FLOAT:
				setCasePrice((Float)arguments.get(0));
				return null;
			case ViewsPackage.CASE_CONTAINER_VIEW___GET_CASE_EXTERNAL_SLOTS:
				return getCaseExternalSlots();
			case ViewsPackage.CASE_CONTAINER_VIEW___SET_CASE_EXTERNAL_SLOTS__INT:
				setCaseExternalSlots((Integer)arguments.get(0));
				return null;
			case ViewsPackage.CASE_CONTAINER_VIEW___GET_CASE_NAME:
				return getCaseName();
			case ViewsPackage.CASE_CONTAINER_VIEW___SET_CASE_NAME__STRING:
				setCaseName((String)arguments.get(0));
				return null;
			case ViewsPackage.CASE_CONTAINER_VIEW___GET_CASE_FORM_FACTOR:
				return getCaseFormFactor();
			case ViewsPackage.CASE_CONTAINER_VIEW___SET_CASE_FORM_FACTOR__STRING:
				setCaseFormFactor((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CaseContainerViewImpl
