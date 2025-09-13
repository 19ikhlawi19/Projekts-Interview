/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.impl;

import graphmodel.GraphModel;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.GraphModelImpl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboard;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mainboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MainboardImpl extends GraphModelImpl implements Mainboard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MainboardPackage.eINSTANCE.getMainboard();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboard getInternalMainboard() {
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboard) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyMainboard() {
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
	public Mainboard getRootElement() {
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
	public EList<MainboardContainer> getMainboardContainers() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewMainboardContainer() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardContainer newMainboardContainer(final EObject referencedMB, final int x, final int y) {
		return newMainboardContainer(referencedMB,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardContainer newMainboardContainer(final EObject referencedMB, final String id, final int x, final int y) {
		return newMainboardContainer(referencedMB,x,y,-1,-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardContainer newMainboardContainer(final EObject referencedMB, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer node = info.scce.cinco.product.fp.pcconfig.mb.mgl.factory.MainboardFactory.eINSTANCE.createMainboardContainer();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboardContainer) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(referencedMB));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.fp.pcconfig.mb.mgl.factory.MainboardFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", MainboardContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardContainer newMainboardContainer(final EObject referencedMB, final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.MainboardContainer node = info.scce.cinco.product.fp.pcconfig.mb.mgl.factory.MainboardFactory.eINSTANCE.createMainboardContainer();
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboardContainer) node.getInternalElement())
				.setLibraryComponentUID(org.eclipse.emf.ecore.util.EcoreUtil.getID(referencedMB));
			node.move(x, y);
			node.resize(width, height);
			info.scce.cinco.product.fp.pcconfig.mb.mgl.factory.MainboardFactory.eINSTANCE.postCreates(node);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", MainboardContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mainboard newMainboard(final String path, final String fileName, final boolean postCreateHook) {
		org.eclipse.core.runtime.IPath filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("mainboard");
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		org.eclipse.core.resources.IFile file = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
		org.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard graph = info.scce.cinco.product.fp.pcconfig.mb.mgl.factory.MainboardFactory.eINSTANCE.createMainboard();
		
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
	public MainboardView getMainboardView() {
		MainboardView mainboardView = info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsFactory.eINSTANCE.createMainboardView();
		mainboardView.setInternalMainboard((info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboard)getInternalElement());
		return mainboardView;
		
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return MainboardPackage.MAINBOARD___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return MainboardPackage.MAINBOARD___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return MainboardPackage.MAINBOARD___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return MainboardPackage.MAINBOARD___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return MainboardPackage.MAINBOARD___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == GraphModel.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.GRAPH_MODEL___GET_ROOT_ELEMENT: return MainboardPackage.MAINBOARD___GET_ROOT_ELEMENT;
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
			case MainboardPackage.MAINBOARD___GET_INTERNAL_MAINBOARD:
				return getInternalMainboard();
			case MainboardPackage.MAINBOARD___IS_EXACTLY_MAINBOARD:
				return isExactlyMainboard();
			case MainboardPackage.MAINBOARD___PRE_DELETE:
				preDelete();
				return null;
			case MainboardPackage.MAINBOARD___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case MainboardPackage.MAINBOARD___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case MainboardPackage.MAINBOARD___PRE_SAVE:
				preSave();
				return null;
			case MainboardPackage.MAINBOARD___POST_SAVE:
				postSave();
				return null;
			case MainboardPackage.MAINBOARD___GET_ROOT_ELEMENT:
				return getRootElement();
			case MainboardPackage.MAINBOARD___GET_NODES:
				return getNodes();
			case MainboardPackage.MAINBOARD___GET_MAINBOARD_CONTAINERS:
				return getMainboardContainers();
			case MainboardPackage.MAINBOARD___CAN_NEW_MAINBOARD_CONTAINER:
				return canNewMainboardContainer();
			case MainboardPackage.MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_INT_INT:
				return newMainboardContainer((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case MainboardPackage.MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_STRING_INT_INT:
				return newMainboardContainer((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case MainboardPackage.MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_INT_INT_INT_INT:
				return newMainboardContainer((EObject)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case MainboardPackage.MAINBOARD___NEW_MAINBOARD_CONTAINER__EOBJECT_STRING_INT_INT_INT_INT:
				return newMainboardContainer((EObject)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case MainboardPackage.MAINBOARD___NEW_MAINBOARD__STRING_STRING_BOOLEAN:
				return newMainboard((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
			case MainboardPackage.MAINBOARD___GET_MAINBOARD_VIEW:
				return getMainboardView();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MainboardImpl
