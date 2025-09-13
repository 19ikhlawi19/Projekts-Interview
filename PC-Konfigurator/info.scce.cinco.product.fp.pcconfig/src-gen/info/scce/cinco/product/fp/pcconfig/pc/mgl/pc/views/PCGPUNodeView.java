/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCGPUNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCGPU Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#getInternalPCGPUNode <em>Internal PCGPU Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getPCGPUNodeView()
 * @model
 * @generated
 */
public interface PCGPUNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal PCGPU Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal PCGPU Node</em>' reference.
	 * @see #setInternalPCGPUNode(InternalPCGPUNode)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getPCGPUNodeView_InternalPCGPUNode()
	 * @model
	 * @generated
	 */
	InternalPCGPUNode getInternalPCGPUNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCGPUNodeView#getInternalPCGPUNode <em>Internal PCGPU Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal PCGPU Node</em>' reference.
	 * @see #getInternalPCGPUNode()
	 * @generated
	 */
	void setInternalPCGPUNode(InternalPCGPUNode value);

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

} // PCGPUNodeView
