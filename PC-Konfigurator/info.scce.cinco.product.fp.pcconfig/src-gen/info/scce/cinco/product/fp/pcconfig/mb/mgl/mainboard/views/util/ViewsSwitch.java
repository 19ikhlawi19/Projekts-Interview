/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.util;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage
 * @generated
 */
public class ViewsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW: {
				MainboardContainerView mainboardContainerView = (MainboardContainerView)theEObject;
				T result = caseMainboardContainerView(mainboardContainerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CPU_SLOT_VIEW: {
				CPUSlotView cpuSlotView = (CPUSlotView)theEObject;
				T result = caseCPUSlotView(cpuSlotView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.RAM_SLOT_VIEW: {
				RAMSlotView ramSlotView = (RAMSlotView)theEObject;
				T result = caseRAMSlotView(ramSlotView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.GPU_SLOT_VIEW: {
				GPUSlotView gpuSlotView = (GPUSlotView)theEObject;
				T result = caseGPUSlotView(gpuSlotView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.CPU_NODE_VIEW: {
				CPUNodeView cpuNodeView = (CPUNodeView)theEObject;
				T result = caseCPUNodeView(cpuNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.RAM_NODE_VIEW: {
				RAMNodeView ramNodeView = (RAMNodeView)theEObject;
				T result = caseRAMNodeView(ramNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.GPU_NODE_VIEW: {
				GPUNodeView gpuNodeView = (GPUNodeView)theEObject;
				T result = caseGPUNodeView(gpuNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.MAINBOARD_VIEW: {
				MainboardView mainboardView = (MainboardView)theEObject;
				T result = caseMainboardView(mainboardView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard Container View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard Container View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainboardContainerView(MainboardContainerView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Slot View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPUSlotView(CPUSlotView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAM Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAM Slot View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAMSlotView(RAMSlotView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPU Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPU Slot View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPUSlotView(GPUSlotView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPUNodeView(CPUNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAM Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAM Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAMNodeView(RAMNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPU Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPUNodeView(GPUNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainboardView(MainboardView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ViewsSwitch
