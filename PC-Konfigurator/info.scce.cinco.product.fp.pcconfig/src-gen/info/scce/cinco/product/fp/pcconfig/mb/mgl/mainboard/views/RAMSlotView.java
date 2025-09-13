/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMSlot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAM Slot View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#getInternalRAMSlot <em>Internal RAM Slot</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage#getRAMSlotView()
 * @model
 * @generated
 */
public interface RAMSlotView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal RAM Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal RAM Slot</em>' reference.
	 * @see #setInternalRAMSlot(InternalRAMSlot)
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage#getRAMSlotView_InternalRAMSlot()
	 * @model
	 * @generated
	 */
	InternalRAMSlot getInternalRAMSlot();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMSlotView#getInternalRAMSlot <em>Internal RAM Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal RAM Slot</em>' reference.
	 * @see #getInternalRAMSlot()
	 * @generated
	 */
	void setInternalRAMSlot(InternalRAMSlot value);

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

} // RAMSlotView
