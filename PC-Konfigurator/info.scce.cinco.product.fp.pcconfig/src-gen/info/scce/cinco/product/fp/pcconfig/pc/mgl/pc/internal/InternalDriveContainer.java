/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drive Container</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage#getInternalDriveContainer()
 * @model
 * @generated
 */
public interface InternalDriveContainer extends InternalContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalDriveContainer
