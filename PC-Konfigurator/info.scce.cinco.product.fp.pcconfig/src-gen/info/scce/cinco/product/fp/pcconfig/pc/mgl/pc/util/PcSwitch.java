/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.util;

import graphmodel.Container;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.*;

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
 * @see info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage
 * @generated
 */
public class PcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcSwitch() {
		if (modelPackage == null) {
			modelPackage = PcPackage.eINSTANCE;
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
			case PcPackage.CASE_CONTAINER: {
				CaseContainer caseContainer = (CaseContainer)theEObject;
				T result = caseCaseContainer(caseContainer);
				if (result == null) result = caseContainer(caseContainer);
				if (result == null) result = caseModelElementContainer(caseContainer);
				if (result == null) result = caseNode(caseContainer);
				if (result == null) result = caseModelElement(caseContainer);
				if (result == null) result = caseIdentifiableElement(caseContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.DRIVE_CONTAINER: {
				DriveContainer driveContainer = (DriveContainer)theEObject;
				T result = caseDriveContainer(driveContainer);
				if (result == null) result = caseContainer(driveContainer);
				if (result == null) result = caseModelElementContainer(driveContainer);
				if (result == null) result = caseNode(driveContainer);
				if (result == null) result = caseModelElement(driveContainer);
				if (result == null) result = caseIdentifiableElement(driveContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.DRIVE_NODE: {
				DriveNode driveNode = (DriveNode)theEObject;
				T result = caseDriveNode(driveNode);
				if (result == null) result = caseNode(driveNode);
				if (result == null) result = caseModelElement(driveNode);
				if (result == null) result = caseIdentifiableElement(driveNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PSU_CONTAINER: {
				PSUContainer psuContainer = (PSUContainer)theEObject;
				T result = casePSUContainer(psuContainer);
				if (result == null) result = caseContainer(psuContainer);
				if (result == null) result = caseModelElementContainer(psuContainer);
				if (result == null) result = caseNode(psuContainer);
				if (result == null) result = caseModelElement(psuContainer);
				if (result == null) result = caseIdentifiableElement(psuContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PSU_NODE: {
				PSUNode psuNode = (PSUNode)theEObject;
				T result = casePSUNode(psuNode);
				if (result == null) result = caseNode(psuNode);
				if (result == null) result = caseModelElement(psuNode);
				if (result == null) result = caseIdentifiableElement(psuNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PC_MAINBOARD_CONTAINER: {
				PCMainboardContainer pcMainboardContainer = (PCMainboardContainer)theEObject;
				T result = casePCMainboardContainer(pcMainboardContainer);
				if (result == null) result = caseContainer(pcMainboardContainer);
				if (result == null) result = caseModelElementContainer(pcMainboardContainer);
				if (result == null) result = caseNode(pcMainboardContainer);
				if (result == null) result = caseModelElement(pcMainboardContainer);
				if (result == null) result = caseIdentifiableElement(pcMainboardContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.MAINBOARD_NODE: {
				MainboardNode mainboardNode = (MainboardNode)theEObject;
				T result = caseMainboardNode(mainboardNode);
				if (result == null) result = caseContainer(mainboardNode);
				if (result == null) result = caseModelElementContainer(mainboardNode);
				if (result == null) result = caseNode(mainboardNode);
				if (result == null) result = caseModelElement(mainboardNode);
				if (result == null) result = caseIdentifiableElement(mainboardNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PCCPU_NODE: {
				PCCPUNode pccpuNode = (PCCPUNode)theEObject;
				T result = casePCCPUNode(pccpuNode);
				if (result == null) result = caseNode(pccpuNode);
				if (result == null) result = caseModelElement(pccpuNode);
				if (result == null) result = caseIdentifiableElement(pccpuNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PCGPU_NODE: {
				PCGPUNode pcgpuNode = (PCGPUNode)theEObject;
				T result = casePCGPUNode(pcgpuNode);
				if (result == null) result = caseNode(pcgpuNode);
				if (result == null) result = caseModelElement(pcgpuNode);
				if (result == null) result = caseIdentifiableElement(pcgpuNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PCRAM_NODE: {
				PCRAMNode pcramNode = (PCRAMNode)theEObject;
				T result = casePCRAMNode(pcramNode);
				if (result == null) result = caseNode(pcramNode);
				if (result == null) result = caseModelElement(pcramNode);
				if (result == null) result = caseIdentifiableElement(pcramNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PCRAM_SLOT: {
				PCRAMSlot pcramSlot = (PCRAMSlot)theEObject;
				T result = casePCRAMSlot(pcramSlot);
				if (result == null) result = caseNode(pcramSlot);
				if (result == null) result = caseModelElement(pcramSlot);
				if (result == null) result = caseIdentifiableElement(pcramSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcPackage.PC: {
				PC pc = (PC)theEObject;
				T result = casePC(pc);
				if (result == null) result = caseGraphModel(pc);
				if (result == null) result = caseModelElementContainer(pc);
				if (result == null) result = caseIdentifiableElement(pc);
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
	public T caseCaseContainer(CaseContainer object) {
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
	public T caseDriveContainer(DriveContainer object) {
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
	public T caseDriveNode(DriveNode object) {
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
	public T casePSUContainer(PSUContainer object) {
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
	public T casePSUNode(PSUNode object) {
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
	public T casePCMainboardContainer(PCMainboardContainer object) {
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
	public T caseMainboardNode(MainboardNode object) {
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
	public T casePCCPUNode(PCCPUNode object) {
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
	public T casePCGPUNode(PCGPUNode object) {
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
	public T casePCRAMNode(PCRAMNode object) {
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
	public T casePCRAMSlot(PCRAMSlot object) {
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
	public T casePC(PC object) {
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
	public T caseIdentifiableElement(IdentifiableElement object) {
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
	public T caseModelElementContainer(ModelElementContainer object) {
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
	public T caseModelElement(ModelElement object) {
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
	public T caseNode(Node object) {
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
	public T caseContainer(Container object) {
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
	public T caseGraphModel(GraphModel object) {
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

} //PcSwitch
