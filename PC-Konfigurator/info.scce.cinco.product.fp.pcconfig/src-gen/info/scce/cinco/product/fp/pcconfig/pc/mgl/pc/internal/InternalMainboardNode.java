/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mainboard Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalMainboardNode()
 * @model
 * @generated
 */
public interface InternalMainboardNode extends InternalContainer {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalMainboardNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library Component UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Component UID</em>' attribute.
	 * @see #setLibraryComponentUID(String)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalMainboardNode_LibraryComponentUID()
	 * @model
	 * @generated
	 */
	String getLibraryComponentUID();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode#getLibraryComponentUID <em>Library Component UID</em>}' attribute.
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
	Mainboard getReferencedMB();

} // InternalMainboardNode
