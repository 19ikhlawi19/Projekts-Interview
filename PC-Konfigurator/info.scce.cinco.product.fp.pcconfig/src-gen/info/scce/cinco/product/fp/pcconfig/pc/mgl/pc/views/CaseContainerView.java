/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Container View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getInternalCaseContainer <em>Internal Case Container</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getCaseContainerView()
 * @model
 * @generated
 */
public interface CaseContainerView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Case Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Case Container</em>' reference.
	 * @see #setInternalCaseContainer(InternalCaseContainer)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getCaseContainerView_InternalCaseContainer()
	 * @model
	 * @generated
	 */
	InternalCaseContainer getInternalCaseContainer();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView#getInternalCaseContainer <em>Internal Case Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Case Container</em>' reference.
	 * @see #getInternalCaseContainer()
	 * @generated
	 */
	void setInternalCaseContainer(InternalCaseContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getCaseInternalSlots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCaseInternalSlots(int _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	float getCasePrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCasePrice(float _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getCaseExternalSlots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCaseExternalSlots(int _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCaseName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCaseName(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCaseFormFactor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCaseFormFactor(String _arg);

} // CaseContainerView
