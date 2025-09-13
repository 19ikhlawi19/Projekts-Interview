/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUSlot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPU Slot View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#getInternalCPUSlot <em>Internal CPU Slot</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage#getCPUSlotView()
 * @model
 * @generated
 */
public interface CPUSlotView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal CPU Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal CPU Slot</em>' reference.
	 * @see #setInternalCPUSlot(InternalCPUSlot)
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage#getCPUSlotView_InternalCPUSlot()
	 * @model
	 * @generated
	 */
	InternalCPUSlot getInternalCPUSlot();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.CPUSlotView#getInternalCPUSlot <em>Internal CPU Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal CPU Slot</em>' reference.
	 * @see #getInternalCPUSlot()
	 * @generated
	 */
	void setInternalCPUSlot(InternalCPUSlot value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSocket();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSocket(String _arg);

} // CPUSlotView
