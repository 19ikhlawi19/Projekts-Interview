/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalGraphModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mainboard</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage#getInternalMainboard()
 * @model
 * @generated
 */
public interface InternalMainboard extends InternalGraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalMainboard
