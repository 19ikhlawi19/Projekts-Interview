/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage
 * @generated
 */
public interface InternalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalFactory eINSTANCE = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mainboard Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard Container</em>'.
	 * @generated
	 */
	InternalMainboardContainer createInternalMainboardContainer();

	/**
	 * Returns a new object of class '<em>CPU Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Slot</em>'.
	 * @generated
	 */
	InternalCPUSlot createInternalCPUSlot();

	/**
	 * Returns a new object of class '<em>RAM Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Slot</em>'.
	 * @generated
	 */
	InternalRAMSlot createInternalRAMSlot();

	/**
	 * Returns a new object of class '<em>GPU Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPU Slot</em>'.
	 * @generated
	 */
	InternalGPUSlot createInternalGPUSlot();

	/**
	 * Returns a new object of class '<em>CPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Node</em>'.
	 * @generated
	 */
	InternalCPUNode createInternalCPUNode();

	/**
	 * Returns a new object of class '<em>RAM Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Node</em>'.
	 * @generated
	 */
	InternalRAMNode createInternalRAMNode();

	/**
	 * Returns a new object of class '<em>GPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPU Node</em>'.
	 * @generated
	 */
	InternalGPUNode createInternalGPUNode();

	/**
	 * Returns a new object of class '<em>Mainboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard</em>'.
	 * @generated
	 */
	InternalMainboard createInternalMainboard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InternalPackage getInternalPackage();

} //InternalFactory
