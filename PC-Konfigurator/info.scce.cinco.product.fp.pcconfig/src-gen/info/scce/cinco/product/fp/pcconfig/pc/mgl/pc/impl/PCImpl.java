/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl;

import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.GraphModelImpl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPC;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.PCView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PC</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PCImpl extends GraphModelImpl implements PC {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcPackage.eINSTANCE.getPC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPC getInternalPC() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPC) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyPC() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preDelete() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteFunction() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runnable getPostDeleteEvent() {
		return () -> {};
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postSave() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PC getRootElement() {
		return this;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<? extends Node> getNodes() {
		return org.eclipse.emf.common.util.ECollections.unmodifiableEList(getInternalContainerElement().getModelElements()
				.stream().filter(me -> me instanceof graphmodel.internal.InternalNode).map(me -> (graphmodel.Node)me.getElement()).
					collect(java.util.stream.Collectors.toList()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CaseContainer> getCaseContainers() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewCaseContainer() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseContainer newCaseContainer(final EObject referencedCase, final int x, final int y) {
		return newCaseContainer(referencedCase,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseContainer newCaseContainer(final EObject referencedCase, final String id, final int x, final int y) {
		return newCaseContainer(referencedCase,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseContainer newCaseContainer(final EObject referencedCase, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createCaseContainer();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(referencedCase));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", CaseContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseContainer newCaseContainer(final EObject referencedCase, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createCaseContainer();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(referencedCase));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", CaseContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PC newPC(final String path, final String fileName, final boolean postCreateHook) {
		org.eclipse.core.runtime.IPath filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("pc");
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		org.eclipse.core.resources.IFile file = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
		org.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC graph = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPC();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		
		res.getContents().add(graph.getInternalElement());
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
		return graph;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCView getPCView() {
		PCView pCView = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsFactory.eINSTANCE.createPCView();
		pCView.setInternalPC((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalPC)getInternalElement());
		return pCView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return PcPackage.PC___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return PcPackage.PC___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return PcPackage.PC___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return PcPackage.PC___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return PcPackage.PC___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == GraphModel.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.GRAPH_MODEL___GET_ROOT_ELEMENT: return PcPackage.PC___GET_ROOT_ELEMENT;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PcPackage.PC___GET_INTERNAL_PC:
				return getInternalPC();
			case PcPackage.PC___IS_EXACTLY_PC:
				return isExactlyPC();
			case PcPackage.PC___PRE_DELETE:
				preDelete();
				return null;
			case PcPackage.PC___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case PcPackage.PC___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case PcPackage.PC___PRE_SAVE:
				preSave();
				return null;
			case PcPackage.PC___POST_SAVE:
				postSave();
				return null;
			case PcPackage.PC___GET_ROOT_ELEMENT:
				return getRootElement();
			case PcPackage.PC___GET_NODES:
				return getNodes();
			case PcPackage.PC___GET_CASE_CONTAINERS:
				return getCaseContainers();
			case PcPackage.PC___CAN_NEW_CASE_CONTAINER:
				return canNewCaseContainer();
			case PcPackage.PC___NEW_CASE_CONTAINER__EOBJECT_INT_INT:
				return newCaseContainer((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.PC___NEW_CASE_CONTAINER__EOBJECT_STRING_INT_INT:
				return newCaseContainer((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.PC___NEW_CASE_CONTAINER__EOBJECT_INT_INT_INT_INT:
				return newCaseContainer((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.PC___NEW_CASE_CONTAINER__EOBJECT_STRING_INT_INT_INT_INT:
				return newCaseContainer((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case PcPackage.PC___NEW_PC__STRING_STRING_BOOLEAN:
				return newPC((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case PcPackage.PC___GET_PC_VIEW:
				return getPCView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PCImpl
