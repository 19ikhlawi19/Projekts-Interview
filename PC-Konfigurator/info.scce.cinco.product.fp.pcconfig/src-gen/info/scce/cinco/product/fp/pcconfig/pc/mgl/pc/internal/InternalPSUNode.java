/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal;

import graphmodel.internal.InternalNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSU Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getPsuName <em>Psu Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getPsuPower <em>Psu Power</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getPsuPrice <em>Psu Price</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalPSUNode()
 * @model
 * @generated
 */
public interface InternalPSUNode extends InternalNode {
	/**
	 * Returns the value of the '<em><b>Psu Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psu Name</em>' attribute.
	 * @see #setPsuName(String)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalPSUNode_PsuName()
	 * @model
	 * @generated
	 */
	String getPsuName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getPsuName <em>Psu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psu Name</em>' attribute.
	 * @see #getPsuName()
	 * @generated
	 */
	void setPsuName(String value);

	/**
	 * Returns the value of the '<em><b>Psu Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psu Power</em>' attribute.
	 * @see #setPsuPower(int)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalPSUNode_PsuPower()
	 * @model
	 * @generated
	 */
	int getPsuPower();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getPsuPower <em>Psu Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psu Power</em>' attribute.
	 * @see #getPsuPower()
	 * @generated
	 */
	void setPsuPower(int value);

	/**
	 * Returns the value of the '<em><b>Psu Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psu Price</em>' attribute.
	 * @see #setPsuPrice(float)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalPSUNode_PsuPrice()
	 * @model
	 * @generated
	 */
	float getPsuPrice();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getPsuPrice <em>Psu Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psu Price</em>' attribute.
	 * @see #getPsuPrice()
	 * @generated
	 */
	void setPsuPrice(float value);

	/**
	 * Returns the value of the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Component UID</em>' attribute.
	 * @see #setLibraryComponentUID(String)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalPSUNode_LibraryComponentUID()
	 * @model
	 * @generated
	 */
	String getLibraryComponentUID();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPSUNode#getLibraryComponentUID <em>Library Component UID</em>}' attribute.
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
	 * @model kind="operation"
	 * @generated
	 */
	EObject getReferencedPSU();

} // InternalPSUNode
