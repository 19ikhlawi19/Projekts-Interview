/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage
 * @generated
 */
public interface ViewsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsFactory eINSTANCE = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.ViewsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Case Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Container View</em>'.
	 * @generated
	 */
	CaseContainerView createCaseContainerView();

	/**
	 * Returns a new object of class '<em>Drive Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drive Container View</em>'.
	 * @generated
	 */
	DriveContainerView createDriveContainerView();

	/**
	 * Returns a new object of class '<em>Drive Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drive Node View</em>'.
	 * @generated
	 */
	DriveNodeView createDriveNodeView();

	/**
	 * Returns a new object of class '<em>PSU Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSU Container View</em>'.
	 * @generated
	 */
	PSUContainerView createPSUContainerView();

	/**
	 * Returns a new object of class '<em>PSU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSU Node View</em>'.
	 * @generated
	 */
	PSUNodeView createPSUNodeView();

	/**
	 * Returns a new object of class '<em>PC Mainboard Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC Mainboard Container View</em>'.
	 * @generated
	 */
	PCMainboardContainerView createPCMainboardContainerView();

	/**
	 * Returns a new object of class '<em>Mainboard Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard Node View</em>'.
	 * @generated
	 */
	MainboardNodeView createMainboardNodeView();

	/**
	 * Returns a new object of class '<em>PCCPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCCPU Node View</em>'.
	 * @generated
	 */
	PCCPUNodeView createPCCPUNodeView();

	/**
	 * Returns a new object of class '<em>PCGPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCGPU Node View</em>'.
	 * @generated
	 */
	PCGPUNodeView createPCGPUNodeView();

	/**
	 * Returns a new object of class '<em>PCRAM Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCRAM Node View</em>'.
	 * @generated
	 */
	PCRAMNodeView createPCRAMNodeView();

	/**
	 * Returns a new object of class '<em>PCRAM Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCRAM Slot View</em>'.
	 * @generated
	 */
	PCRAMSlotView createPCRAMSlotView();

	/**
	 * Returns a new object of class '<em>PC View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC View</em>'.
	 * @generated
	 */
	PCView createPCView();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewsPackage getViewsPackage();

} //ViewsFactory
