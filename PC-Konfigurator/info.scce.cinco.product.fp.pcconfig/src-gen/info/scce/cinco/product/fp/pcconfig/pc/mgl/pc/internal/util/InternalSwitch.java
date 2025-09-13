/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.*;

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
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPackage
 * @generated
 */
public class InternalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InternalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalSwitch() {
		if (modelPackage == null) {
			modelPackage = InternalPackage.eINSTANCE;
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
			case InternalPackage.INTERNAL_CASE_CONTAINER: {
				InternalCaseContainer internalCaseContainer = (InternalCaseContainer)theEObject;
				T result = caseInternalCaseContainer(internalCaseContainer);
				if (result == null) result = caseInternalContainer(internalCaseContainer);
				if (result == null) result = caseInternalNode(internalCaseContainer);
				if (result == null) result = caseInternalModelElementContainer(internalCaseContainer);
				if (result == null) result = caseInternalModelElement(internalCaseContainer);
				if (result == null) result = caseInternalIdentifiableElement(internalCaseContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DRIVE_CONTAINER: {
				InternalDriveContainer internalDriveContainer = (InternalDriveContainer)theEObject;
				T result = caseInternalDriveContainer(internalDriveContainer);
				if (result == null) result = caseInternalContainer(internalDriveContainer);
				if (result == null) result = caseInternalNode(internalDriveContainer);
				if (result == null) result = caseInternalModelElementContainer(internalDriveContainer);
				if (result == null) result = caseInternalModelElement(internalDriveContainer);
				if (result == null) result = caseInternalIdentifiableElement(internalDriveContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_DRIVE_NODE: {
				InternalDriveNode internalDriveNode = (InternalDriveNode)theEObject;
				T result = caseInternalDriveNode(internalDriveNode);
				if (result == null) result = caseInternalNode(internalDriveNode);
				if (result == null) result = caseInternalModelElement(internalDriveNode);
				if (result == null) result = caseInternalIdentifiableElement(internalDriveNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PSU_CONTAINER: {
				InternalPSUContainer internalPSUContainer = (InternalPSUContainer)theEObject;
				T result = caseInternalPSUContainer(internalPSUContainer);
				if (result == null) result = caseInternalContainer(internalPSUContainer);
				if (result == null) result = caseInternalNode(internalPSUContainer);
				if (result == null) result = caseInternalModelElementContainer(internalPSUContainer);
				if (result == null) result = caseInternalModelElement(internalPSUContainer);
				if (result == null) result = caseInternalIdentifiableElement(internalPSUContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PSU_NODE: {
				InternalPSUNode internalPSUNode = (InternalPSUNode)theEObject;
				T result = caseInternalPSUNode(internalPSUNode);
				if (result == null) result = caseInternalNode(internalPSUNode);
				if (result == null) result = caseInternalModelElement(internalPSUNode);
				if (result == null) result = caseInternalIdentifiableElement(internalPSUNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PC_MAINBOARD_CONTAINER: {
				InternalPCMainboardContainer internalPCMainboardContainer = (InternalPCMainboardContainer)theEObject;
				T result = caseInternalPCMainboardContainer(internalPCMainboardContainer);
				if (result == null) result = caseInternalContainer(internalPCMainboardContainer);
				if (result == null) result = caseInternalNode(internalPCMainboardContainer);
				if (result == null) result = caseInternalModelElementContainer(internalPCMainboardContainer);
				if (result == null) result = caseInternalModelElement(internalPCMainboardContainer);
				if (result == null) result = caseInternalIdentifiableElement(internalPCMainboardContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_MAINBOARD_NODE: {
				InternalMainboardNode internalMainboardNode = (InternalMainboardNode)theEObject;
				T result = caseInternalMainboardNode(internalMainboardNode);
				if (result == null) result = caseInternalContainer(internalMainboardNode);
				if (result == null) result = caseInternalNode(internalMainboardNode);
				if (result == null) result = caseInternalModelElementContainer(internalMainboardNode);
				if (result == null) result = caseInternalModelElement(internalMainboardNode);
				if (result == null) result = caseInternalIdentifiableElement(internalMainboardNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PCCPU_NODE: {
				InternalPCCPUNode internalPCCPUNode = (InternalPCCPUNode)theEObject;
				T result = caseInternalPCCPUNode(internalPCCPUNode);
				if (result == null) result = caseInternalNode(internalPCCPUNode);
				if (result == null) result = caseInternalModelElement(internalPCCPUNode);
				if (result == null) result = caseInternalIdentifiableElement(internalPCCPUNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PCGPU_NODE: {
				InternalPCGPUNode internalPCGPUNode = (InternalPCGPUNode)theEObject;
				T result = caseInternalPCGPUNode(internalPCGPUNode);
				if (result == null) result = caseInternalNode(internalPCGPUNode);
				if (result == null) result = caseInternalModelElement(internalPCGPUNode);
				if (result == null) result = caseInternalIdentifiableElement(internalPCGPUNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PCRAM_NODE: {
				InternalPCRAMNode internalPCRAMNode = (InternalPCRAMNode)theEObject;
				T result = caseInternalPCRAMNode(internalPCRAMNode);
				if (result == null) result = caseInternalNode(internalPCRAMNode);
				if (result == null) result = caseInternalModelElement(internalPCRAMNode);
				if (result == null) result = caseInternalIdentifiableElement(internalPCRAMNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PCRAM_SLOT: {
				InternalPCRAMSlot internalPCRAMSlot = (InternalPCRAMSlot)theEObject;
				T result = caseInternalPCRAMSlot(internalPCRAMSlot);
				if (result == null) result = caseInternalNode(internalPCRAMSlot);
				if (result == null) result = caseInternalModelElement(internalPCRAMSlot);
				if (result == null) result = caseInternalIdentifiableElement(internalPCRAMSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_PC: {
				InternalPC internalPC = (InternalPC)theEObject;
				T result = caseInternalPC(internalPC);
				if (result == null) result = caseInternalGraphModel(internalPC);
				if (result == null) result = caseInternalModelElementContainer(internalPC);
				if (result == null) result = caseInternalIdentifiableElement(internalPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalCaseContainer(InternalCaseContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDriveContainer(InternalDriveContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDriveNode(InternalDriveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSU Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSU Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPSUContainer(InternalPSUContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSU Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSU Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPSUNode(InternalPSUNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PC Mainboard Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PC Mainboard Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPCMainboardContainer(InternalPCMainboardContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalMainboardNode(InternalMainboardNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCCPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCCPU Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPCCPUNode(InternalPCCPUNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCGPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCGPU Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPCGPUNode(InternalPCGPUNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCRAM Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCRAM Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPCRAMNode(InternalPCRAMNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCRAM Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCRAM Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPCRAMSlot(InternalPCRAMSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalPC(InternalPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalIdentifiableElement(InternalIdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalModelElement(InternalModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalNode(InternalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalModelElementContainer(InternalModelElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalContainer(InternalContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalGraphModel(InternalGraphModel object) {
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

} //InternalSwitch
