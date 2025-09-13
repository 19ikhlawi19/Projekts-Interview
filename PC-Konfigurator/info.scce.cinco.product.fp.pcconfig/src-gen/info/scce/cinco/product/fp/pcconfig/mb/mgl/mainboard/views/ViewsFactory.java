/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage
 * @generated
 */
public interface ViewsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsFactory eINSTANCE = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.ViewsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mainboard Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard Container View</em>'.
	 * @generated
	 */
	MainboardContainerView createMainboardContainerView();

	/**
	 * Returns a new object of class '<em>CPU Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Slot View</em>'.
	 * @generated
	 */
	CPUSlotView createCPUSlotView();

	/**
	 * Returns a new object of class '<em>RAM Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Slot View</em>'.
	 * @generated
	 */
	RAMSlotView createRAMSlotView();

	/**
	 * Returns a new object of class '<em>GPU Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPU Slot View</em>'.
	 * @generated
	 */
	GPUSlotView createGPUSlotView();

	/**
	 * Returns a new object of class '<em>CPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Node View</em>'.
	 * @generated
	 */
	CPUNodeView createCPUNodeView();

	/**
	 * Returns a new object of class '<em>RAM Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Node View</em>'.
	 * @generated
	 */
	RAMNodeView createRAMNodeView();

	/**
	 * Returns a new object of class '<em>GPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPU Node View</em>'.
	 * @generated
	 */
	GPUNodeView createGPUNodeView();

	/**
	 * Returns a new object of class '<em>Mainboard View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainboard View</em>'.
	 * @generated
	 */
	MainboardView createMainboardView();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewsPackage getViewsPackage();

} //ViewsFactory
