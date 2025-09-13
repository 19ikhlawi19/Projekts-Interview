/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage
 * @generated
 */
public interface InternalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InternalFactory eINSTANCE = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.impl.InternalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Case Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Container</em>'.
	 * @generated
	 */
	InternalCaseContainer createInternalCaseContainer();

	/**
	 * Returns a new object of class '<em>Drive Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drive Container</em>'.
	 * @generated
	 */
	InternalDriveContainer createInternalDriveContainer();

	/**
	 * Returns a new object of class '<em>Drive Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drive Node</em>'.
	 * @generated
	 */
	InternalDriveNode createInternalDriveNode();

	/**
	 * Returns a new object of class '<em>PSU Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSU Container</em>'.
	 * @generated
	 */
	InternalPSUContainer createInternalPSUContainer();

	/**
	 * Returns a new object of class '<em>PSU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSU Node</em>'.
	 * @generated
	 */
	InternalPSUNode createInternalPSUNode();

	/**
	 * Returns a new object of class '<em>PC Mainboard Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC Mainboard Container</em>'.
	 * @generated
	 */
	InternalPCMainboardContainer createInternalPCMainboardContainer();

	/**
	 * Returns a new object of class '<em>Mainboard Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard Node</em>'.
	 * @generated
	 */
	InternalMainboardNode createInternalMainboardNode();

	/**
	 * Returns a new object of class '<em>PCCPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCCPU Node</em>'.
	 * @generated
	 */
	InternalPCCPUNode createInternalPCCPUNode();

	/**
	 * Returns a new object of class '<em>PCGPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCGPU Node</em>'.
	 * @generated
	 */
	InternalPCGPUNode createInternalPCGPUNode();

	/**
	 * Returns a new object of class '<em>PCRAM Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCRAM Node</em>'.
	 * @generated
	 */
	InternalPCRAMNode createInternalPCRAMNode();

	/**
	 * Returns a new object of class '<em>PCRAM Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCRAM Slot</em>'.
	 * @generated
	 */
	InternalPCRAMSlot createInternalPCRAMSlot();

	/**
	 * Returns a new object of class '<em>PC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC</em>'.
	 * @generated
	 */
	InternalPC createInternalPC();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InternalPackage getInternalPackage();

} //InternalFactory
