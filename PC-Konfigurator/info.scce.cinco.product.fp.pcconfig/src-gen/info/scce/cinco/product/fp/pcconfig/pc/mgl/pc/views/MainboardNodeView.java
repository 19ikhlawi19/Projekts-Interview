/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mainboard Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#getInternalMainboardNode <em>Internal Mainboard Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getMainboardNodeView()
 * @model
 * @generated
 */
public interface MainboardNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Mainboard Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Mainboard Node</em>' reference.
	 * @see #setInternalMainboardNode(InternalMainboardNode)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getMainboardNodeView_InternalMainboardNode()
	 * @model
	 * @generated
	 */
	InternalMainboardNode getInternalMainboardNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView#getInternalMainboardNode <em>Internal Mainboard Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Mainboard Node</em>' reference.
	 * @see #getInternalMainboardNode()
	 * @generated
	 */
	void setInternalMainboardNode(InternalMainboardNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String _arg);

} // MainboardNodeView
