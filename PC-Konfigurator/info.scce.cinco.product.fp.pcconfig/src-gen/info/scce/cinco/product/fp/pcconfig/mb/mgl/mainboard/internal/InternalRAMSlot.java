/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAM Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMSlot#getRamType <em>Ram Type</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage#getInternalRAMSlot()
 * @model
 * @generated
 */
public interface InternalRAMSlot extends InternalContainer {
	/**
	 * Returns the value of the '<em><b>Ram Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Type</em>' attribute.
	 * @see #setRamType(String)
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage#getInternalRAMSlot_RamType()
	 * @model
	 * @generated
	 */
	String getRamType();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMSlot#getRamType <em>Ram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Type</em>' attribute.
	 * @see #getRamType()
	 * @generated
	 */
	void setRamType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalRAMSlot
