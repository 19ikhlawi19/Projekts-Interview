/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage
 * @generated
 */
public interface PcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcFactory eINSTANCE = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.PcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Case Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Container</em>'.
	 * @generated
	 */
	CaseContainer createCaseContainer();

	/**
	 * Returns a new object of class '<em>Drive Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drive Container</em>'.
	 * @generated
	 */
	DriveContainer createDriveContainer();

	/**
	 * Returns a new object of class '<em>Drive Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drive Node</em>'.
	 * @generated
	 */
	DriveNode createDriveNode();

	/**
	 * Returns a new object of class '<em>PSU Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSU Container</em>'.
	 * @generated
	 */
	PSUContainer createPSUContainer();

	/**
	 * Returns a new object of class '<em>PSU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSU Node</em>'.
	 * @generated
	 */
	PSUNode createPSUNode();

	/**
	 * Returns a new object of class '<em>PC Mainboard Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC Mainboard Container</em>'.
	 * @generated
	 */
	PCMainboardContainer createPCMainboardContainer();

	/**
	 * Returns a new object of class '<em>Mainboard Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard Node</em>'.
	 * @generated
	 */
	MainboardNode createMainboardNode();

	/**
	 * Returns a new object of class '<em>PCCPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCCPU Node</em>'.
	 * @generated
	 */
	PCCPUNode createPCCPUNode();

	/**
	 * Returns a new object of class '<em>PCGPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCGPU Node</em>'.
	 * @generated
	 */
	PCGPUNode createPCGPUNode();

	/**
	 * Returns a new object of class '<em>PCRAM Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCRAM Node</em>'.
	 * @generated
	 */
	PCRAMNode createPCRAMNode();

	/**
	 * Returns a new object of class '<em>PCRAM Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCRAM Slot</em>'.
	 * @generated
	 */
	PCRAMSlot createPCRAMSlot();

	/**
	 * Returns a new object of class '<em>PC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC</em>'.
	 * @generated
	 */
	PC createPC();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcPackage getPcPackage();

} //PcFactory
