/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseInternalSlots <em>Case Internal Slots</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCasePrice <em>Case Price</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseExternalSlots <em>Case External Slots</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseName <em>Case Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseFormFactor <em>Case Form Factor</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalCaseContainer()
 * @model
 * @generated
 */
public interface InternalCaseContainer extends InternalContainer {
	/**
	 * Returns the value of the '<em><b>Case Internal Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Internal Slots</em>' attribute.
	 * @see #setCaseInternalSlots(int)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalCaseContainer_CaseInternalSlots()
	 * @model
	 * @generated
	 */
	int getCaseInternalSlots();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseInternalSlots <em>Case Internal Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Internal Slots</em>' attribute.
	 * @see #getCaseInternalSlots()
	 * @generated
	 */
	void setCaseInternalSlots(int value);

	/**
	 * Returns the value of the '<em><b>Case Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Price</em>' attribute.
	 * @see #setCasePrice(float)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalCaseContainer_CasePrice()
	 * @model
	 * @generated
	 */
	float getCasePrice();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCasePrice <em>Case Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Price</em>' attribute.
	 * @see #getCasePrice()
	 * @generated
	 */
	void setCasePrice(float value);

	/**
	 * Returns the value of the '<em><b>Case External Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case External Slots</em>' attribute.
	 * @see #setCaseExternalSlots(int)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalCaseContainer_CaseExternalSlots()
	 * @model
	 * @generated
	 */
	int getCaseExternalSlots();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseExternalSlots <em>Case External Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case External Slots</em>' attribute.
	 * @see #getCaseExternalSlots()
	 * @generated
	 */
	void setCaseExternalSlots(int value);

	/**
	 * Returns the value of the '<em><b>Case Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Name</em>' attribute.
	 * @see #setCaseName(String)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalCaseContainer_CaseName()
	 * @model
	 * @generated
	 */
	String getCaseName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseName <em>Case Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Name</em>' attribute.
	 * @see #getCaseName()
	 * @generated
	 */
	void setCaseName(String value);

	/**
	 * Returns the value of the '<em><b>Case Form Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Form Factor</em>' attribute.
	 * @see #setCaseFormFactor(String)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalCaseContainer_CaseFormFactor()
	 * @model
	 * @generated
	 */
	String getCaseFormFactor();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getCaseFormFactor <em>Case Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Form Factor</em>' attribute.
	 * @see #getCaseFormFactor()
	 * @generated
	 */
	void setCaseFormFactor(String value);

	/**
	 * Returns the value of the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Component UID</em>' attribute.
	 * @see #setLibraryComponentUID(String)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalCaseContainer_LibraryComponentUID()
	 * @model
	 * @generated
	 */
	String getLibraryComponentUID();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer#getLibraryComponentUID <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Component UID</em>' attribute.
	 * @see #getLibraryComponentUID()
	 * @generated
	 */
	void setLibraryComponentUID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EObject getReferencedCase();

} // InternalCaseContainer
