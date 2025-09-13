/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPCRAMSlot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCRAM Slot View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#getInternalPCRAMSlot <em>Internal PCRAM Slot</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getPCRAMSlotView()
 * @model
 * @generated
 */
public interface PCRAMSlotView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal PCRAM Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal PCRAM Slot</em>' reference.
	 * @see #setInternalPCRAMSlot(InternalPCRAMSlot)
	 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage#getPCRAMSlotView_InternalPCRAMSlot()
	 * @model
	 * @generated
	 */
	InternalPCRAMSlot getInternalPCRAMSlot();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCRAMSlotView#getInternalPCRAMSlot <em>Internal PCRAM Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal PCRAM Slot</em>' reference.
	 * @see #getInternalPCRAMSlot()
	 * @generated
	 */
	void setInternalPCRAMSlot(InternalPCRAMSlot value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSlotType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSlotType(String _arg);

} // PCRAMSlotView
