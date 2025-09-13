/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.util;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.*;

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
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage
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
			case ViewsPackage.CASE_CONTAINER_VIEW: {
				CaseContainerView caseContainerView = (CaseContainerView)theEObject;
				T result = caseCaseContainerView(caseContainerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DRIVE_CONTAINER_VIEW: {
				DriveContainerView driveContainerView = (DriveContainerView)theEObject;
				T result = caseDriveContainerView(driveContainerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.DRIVE_NODE_VIEW: {
				DriveNodeView driveNodeView = (DriveNodeView)theEObject;
				T result = caseDriveNodeView(driveNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PSU_CONTAINER_VIEW: {
				PSUContainerView psuContainerView = (PSUContainerView)theEObject;
				T result = casePSUContainerView(psuContainerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PSU_NODE_VIEW: {
				PSUNodeView psuNodeView = (PSUNodeView)theEObject;
				T result = casePSUNodeView(psuNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PC_MAINBOARD_CONTAINER_VIEW: {
				PCMainboardContainerView pcMainboardContainerView = (PCMainboardContainerView)theEObject;
				T result = casePCMainboardContainerView(pcMainboardContainerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.MAINBOARD_NODE_VIEW: {
				MainboardNodeView mainboardNodeView = (MainboardNodeView)theEObject;
				T result = caseMainboardNodeView(mainboardNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PCCPU_NODE_VIEW: {
				PCCPUNodeView pccpuNodeView = (PCCPUNodeView)theEObject;
				T result = casePCCPUNodeView(pccpuNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PCGPU_NODE_VIEW: {
				PCGPUNodeView pcgpuNodeView = (PCGPUNodeView)theEObject;
				T result = casePCGPUNodeView(pcgpuNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PCRAM_NODE_VIEW: {
				PCRAMNodeView pcramNodeView = (PCRAMNodeView)theEObject;
				T result = casePCRAMNodeView(pcramNodeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PCRAM_SLOT_VIEW: {
				PCRAMSlotView pcramSlotView = (PCRAMSlotView)theEObject;
				T result = casePCRAMSlotView(pcramSlotView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewsPackage.PC_VIEW: {
				PCView pcView = (PCView)theEObject;
				T result = casePCView(pcView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Container View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Container View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseContainerView(CaseContainerView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive Container View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive Container View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriveContainerView(DriveContainerView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriveNodeView(DriveNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSU Container View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSU Container View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSUContainerView(PSUContainerView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSU Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSUNodeView(PSUNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PC Mainboard Container View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PC Mainboard Container View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMainboardContainerView(PCMainboardContainerView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainboardNodeView(MainboardNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCCPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCCPU Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCCPUNodeView(PCCPUNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCGPU Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCGPU Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCGPUNodeView(PCGPUNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCRAM Node View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCRAM Node View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCRAMNodeView(PCRAMNodeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCRAM Slot View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCRAM Slot View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCRAMSlotView(PCRAMSlotView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PC View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PC View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCView(PCView object) {
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
