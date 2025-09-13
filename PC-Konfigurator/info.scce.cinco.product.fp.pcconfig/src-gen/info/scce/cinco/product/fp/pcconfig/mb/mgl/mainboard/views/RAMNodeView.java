/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAM Node View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getInternalRAMNode <em>Internal RAM Node</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage#getRAMNodeView()
 * @model
 * @generated
 */
public interface RAMNodeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal RAM Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal RAM Node</em>' reference.
	 * @see #setInternalRAMNode(InternalRAMNode)
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage#getRAMNodeView_InternalRAMNode()
	 * @model
	 * @generated
	 */
	InternalRAMNode getInternalRAMNode();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView#getInternalRAMNode <em>Internal RAM Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal RAM Node</em>' reference.
	 * @see #getInternalRAMNode()
	 * @generated
	 */
	void setInternalRAMNode(InternalRAMNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getPowerConsumption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPowerConsumption(int _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	float getPrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPrice(float _arg);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getRamType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRamType(String _arg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getCapacity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCapacity(int _arg);

} // RAMNodeView
