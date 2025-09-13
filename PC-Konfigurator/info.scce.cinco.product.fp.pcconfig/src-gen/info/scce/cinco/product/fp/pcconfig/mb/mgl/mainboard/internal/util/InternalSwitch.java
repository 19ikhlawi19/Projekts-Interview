/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.util;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.*;

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
 * @see info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage
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
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER: {
				InternalMainboardContainer internalMainboardContainer = (InternalMainboardContainer)theEObject;
				T result = caseInternalMainboardContainer(internalMainboardContainer);
				if (result == null) result = caseInternalContainer(internalMainboardContainer);
				if (result == null) result = caseInternalNode(internalMainboardContainer);
				if (result == null) result = caseInternalModelElementContainer(internalMainboardContainer);
				if (result == null) result = caseInternalModelElement(internalMainboardContainer);
				if (result == null) result = caseInternalIdentifiableElement(internalMainboardContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CPU_SLOT: {
				InternalCPUSlot internalCPUSlot = (InternalCPUSlot)theEObject;
				T result = caseInternalCPUSlot(internalCPUSlot);
				if (result == null) result = caseInternalContainer(internalCPUSlot);
				if (result == null) result = caseInternalNode(internalCPUSlot);
				if (result == null) result = caseInternalModelElementContainer(internalCPUSlot);
				if (result == null) result = caseInternalModelElement(internalCPUSlot);
				if (result == null) result = caseInternalIdentifiableElement(internalCPUSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_RAM_SLOT: {
				InternalRAMSlot internalRAMSlot = (InternalRAMSlot)theEObject;
				T result = caseInternalRAMSlot(internalRAMSlot);
				if (result == null) result = caseInternalContainer(internalRAMSlot);
				if (result == null) result = caseInternalNode(internalRAMSlot);
				if (result == null) result = caseInternalModelElementContainer(internalRAMSlot);
				if (result == null) result = caseInternalModelElement(internalRAMSlot);
				if (result == null) result = caseInternalIdentifiableElement(internalRAMSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_GPU_SLOT: {
				InternalGPUSlot internalGPUSlot = (InternalGPUSlot)theEObject;
				T result = caseInternalGPUSlot(internalGPUSlot);
				if (result == null) result = caseInternalContainer(internalGPUSlot);
				if (result == null) result = caseInternalNode(internalGPUSlot);
				if (result == null) result = caseInternalModelElementContainer(internalGPUSlot);
				if (result == null) result = caseInternalModelElement(internalGPUSlot);
				if (result == null) result = caseInternalIdentifiableElement(internalGPUSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_CPU_NODE: {
				InternalCPUNode internalCPUNode = (InternalCPUNode)theEObject;
				T result = caseInternalCPUNode(internalCPUNode);
				if (result == null) result = caseInternalNode(internalCPUNode);
				if (result == null) result = caseInternalModelElement(internalCPUNode);
				if (result == null) result = caseInternalIdentifiableElement(internalCPUNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_RAM_NODE: {
				InternalRAMNode internalRAMNode = (InternalRAMNode)theEObject;
				T result = caseInternalRAMNode(internalRAMNode);
				if (result == null) result = caseInternalNode(internalRAMNode);
				if (result == null) result = caseInternalModelElement(internalRAMNode);
				if (result == null) result = caseInternalIdentifiableElement(internalRAMNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_GPU_NODE: {
				InternalGPUNode internalGPUNode = (InternalGPUNode)theEObject;
				T result = caseInternalGPUNode(internalGPUNode);
				if (result == null) result = caseInternalNode(internalGPUNode);
				if (result == null) result = caseInternalModelElement(internalGPUNode);
				if (result == null) result = caseInternalIdentifiableElement(internalGPUNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InternalPackage.INTERNAL_MAINBOARD: {
				InternalMainboard internalMainboard = (InternalMainboard)theEObject;
				T result = caseInternalMainboard(internalMainboard);
				if (result == null) result = caseInternalGraphModel(internalMainboard);
				if (result == null) result = caseInternalModelElementContainer(internalMainboard);
				if (result == null) result = caseInternalIdentifiableElement(internalMainboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalMainboardContainer(InternalMainboardContainer object) {
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
	public T caseInternalCPUSlot(InternalCPUSlot object) {
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
	public T caseInternalRAMSlot(InternalRAMSlot object) {
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
	public T caseInternalGPUSlot(InternalGPUSlot object) {
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
	public T caseInternalCPUNode(InternalCPUNode object) {
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
	public T caseInternalRAMNode(InternalRAMNode object) {
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
	public T caseInternalGPUNode(InternalGPUNode object) {
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
	public T caseInternalMainboard(InternalMainboard object) {
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
