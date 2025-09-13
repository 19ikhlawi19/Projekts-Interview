/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCCPUNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCCPU Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#getInternalPCCPUNode <em>Internal PCCPU Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getPCCPUNodeView()
 * @model
 * @generated
 */
public interface PCCPUNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal PCCPU Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal PCCPU Node</em>' reference.
	 * @see #setInternalPCCPUNode(InternalPCCPUNode)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getPCCPUNodeView_InternalPCCPUNode()
	 * @model
	 * @generated
	 */
	InternalPCCPUNode getInternalPCCPUNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCCPUNodeView#getInternalPCCPUNode <em>Internal PCCPU Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal PCCPU Node</em>' reference.
	 * @see #getInternalPCCPUNode()
	 * @generated
	 */
	void setInternalPCCPUNode(InternalPCCPUNode value);

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

} // PCCPUNodeView
