/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.util;

import graphmodel.Container;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.*;

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
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage
 * @generated
 */
public class MainboardSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MainboardPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainboardSwitch() {
		if (modelPackage == null) {
			modelPackage = MainboardPackage.eINSTANCE;
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
			case MainboardPackage.MAINBOARD_CONTAINER: {
				MainboardContainer mainboardContainer = (MainboardContainer)theEObject;
				T result = caseMainboardContainer(mainboardContainer);
				if (result == null) result = caseContainer(mainboardContainer);
				if (result == null) result = caseModelElementContainer(mainboardContainer);
				if (result == null) result = caseNode(mainboardContainer);
				if (result == null) result = caseModelElement(mainboardContainer);
				if (result == null) result = caseIdentifiableElement(mainboardContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainboardPackage.CPU_SLOT: {
				CPUSlot cpuSlot = (CPUSlot)theEObject;
				T result = caseCPUSlot(cpuSlot);
				if (result == null) result = caseContainer(cpuSlot);
				if (result == null) result = caseModelElementContainer(cpuSlot);
				if (result == null) result = caseNode(cpuSlot);
				if (result == null) result = caseModelElement(cpuSlot);
				if (result == null) result = caseIdentifiableElement(cpuSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainboardPackage.RAM_SLOT: {
				RAMSlot ramSlot = (RAMSlot)theEObject;
				T result = caseRAMSlot(ramSlot);
				if (result == null) result = caseContainer(ramSlot);
				if (result == null) result = caseModelElementContainer(ramSlot);
				if (result == null) result = caseNode(ramSlot);
				if (result == null) result = caseModelElement(ramSlot);
				if (result == null) result = caseIdentifiableElement(ramSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainboardPackage.GPU_SLOT: {
				GPUSlot gpuSlot = (GPUSlot)theEObject;
				T result = caseGPUSlot(gpuSlot);
				if (result == null) result = caseContainer(gpuSlot);
				if (result == null) result = caseModelElementContainer(gpuSlot);
				if (result == null) result = caseNode(gpuSlot);
				if (result == null) result = caseModelElement(gpuSlot);
				if (result == null) result = caseIdentifiableElement(gpuSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainboardPackage.CPU_NODE: {
				CPUNode cpuNode = (CPUNode)theEObject;
				T result = caseCPUNode(cpuNode);
				if (result == null) result = caseNode(cpuNode);
				if (result == null) result = caseModelElement(cpuNode);
				if (result == null) result = caseIdentifiableElement(cpuNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainboardPackage.RAM_NODE: {
				RAMNode ramNode = (RAMNode)theEObject;
				T result = caseRAMNode(ramNode);
				if (result == null) result = caseNode(ramNode);
				if (result == null) result = caseModelElement(ramNode);
				if (result == null) result = caseIdentifiableElement(ramNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainboardPackage.GPU_NODE: {
				GPUNode gpuNode = (GPUNode)theEObject;
				T result = caseGPUNode(gpuNode);
				if (result == null) result = caseNode(gpuNode);
				if (result == null) result = caseModelElement(gpuNode);
				if (result == null) result = caseIdentifiableElement(gpuNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MainboardPackage.MAINBOARD: {
				Mainboard mainboard = (Mainboard)theEObject;
				T result = caseMainboard(mainboard);
				if (result == null) result = caseGraphModel(mainboard);
				if (result == null) result = caseModelElementContainer(mainboard);
				if (result == null) result = caseIdentifiableElement(mainboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseMainboardContainer(MainboardContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPUSlot(CPUSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAM Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAM Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAMSlot(RAMSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPU Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPU Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPUSlot(GPUSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPUNode(CPUNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAM Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAM Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAMNode(RAMNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPU Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPU Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPUNode(GPUNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainboard(Mainboard object) {
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

} //MainboardSwitch
