/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage
 * @generated
 */
public interface MainboardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MainboardFactory eINSTANCE = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl.MainboardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	MainboardContainer createMainboardContainer();

	/**
	 * Returns a new object of class '<em>CPU Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Slot</em>'.
	 * @generated
	 */
	CPUSlot createCPUSlot();

	/**
	 * Returns a new object of class '<em>RAM Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Slot</em>'.
	 * @generated
	 */
	RAMSlot createRAMSlot();

	/**
	 * Returns a new object of class '<em>GPU Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPU Slot</em>'.
	 * @generated
	 */
	GPUSlot createGPUSlot();

	/**
	 * Returns a new object of class '<em>CPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Node</em>'.
	 * @generated
	 */
	CPUNode createCPUNode();

	/**
	 * Returns a new object of class '<em>RAM Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Node</em>'.
	 * @generated
	 */
	RAMNode createRAMNode();

	/**
	 * Returns a new object of class '<em>GPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPU Node</em>'.
	 * @generated
	 */
	GPUNode createGPUNode();

	/**
	 * Returns a new object of class '<em>Mainboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard</em>'.
	 * @generated
	 */
	Mainboard createMainboard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MainboardPackage getMainboardPackage();

} //MainboardFactory
