/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPU Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUSlot#getSocket <em>Socket</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage#getInternalCPUSlot()
 * @model
 * @generated
 */
public interface InternalCPUSlot extends InternalContainer {
	/**
	 * Returns the value of the '<em><b>Socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socket</em>' attribute.
	 * @see #setSocket(String)
	 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage#getInternalCPUSlot_Socket()
	 * @model
	 * @generated
	 */
	String getSocket();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalCPUSlot#getSocket <em>Socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socket</em>' attribute.
	 * @see #getSocket()
	 * @generated
	 */
	void setSocket(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalCPUSlot
