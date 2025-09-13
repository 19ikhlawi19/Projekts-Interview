/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ConnectionConstraint;

import graphmodel.Direction;
import graphmodel.Edge;
import graphmodel.GraphmodelPackage;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.ModelElementContainer;
import graphmodel.Node;

import graphmodel.impl.ModelElementContainerImpl;

import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalPackage;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.MainboardNodeView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mainboard Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.MainboardNodeImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainboardNodeImpl extends ModelElementContainerImpl implements MainboardNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainboardNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcPackage.eINSTANCE.getMainboardNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElement getInternalElement() {
		if (eContainerFeatureID() != PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT) return null;
		return (InternalModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalModelElement newInternalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalElement, PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalModelElement newInternalElement) {
		if (newInternalElement != eInternalContainer() || (eContainerFeatureID() != PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT && newInternalElement != null)) {
			if (EcoreUtil.isAncestor(this, newInternalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInternalElement != null)
				msgs = ((InternalEObject)newInternalElement).eInverseAdd(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
			msgs = basicSetInternalElement(newInternalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalMainboardNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalMainboardNode().getElement().transact("Set Name", () -> {
			getInternalMainboardNode().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboardNode getInternalMainboardNode() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyMainboardNode() {
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
		de.jabc.cinco.meta.runtime.hook.CincoPostDeleteHook<? super info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode> postDeleteHook = new info.scce.cinco.product.fp.pcconfig.pc.hook.MainboardNodePostDelete();
		return postDeleteHook.getPostDeleteFunction(this);
		
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
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC) this.getInternalElement().getRootElement().getElement();
		
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
	public EList<PCGPUNode> getPCGPUNodes() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewPCGPUNode() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCGPUNode newPCGPUNode(final int x, final int y) {
		return newPCGPUNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCGPUNode newPCGPUNode(final String id, final int x, final int y) {
		return newPCGPUNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCGPUNode newPCGPUNode(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCGPUNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCGPUNode newPCGPUNode(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCGPUNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCGPUNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCCPUNode> getPCCPUNodes() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewPCCPUNode() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCCPUNode newPCCPUNode(final int x, final int y) {
		return newPCCPUNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCCPUNode newPCCPUNode(final String id, final int x, final int y) {
		return newPCCPUNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCCPUNode newPCCPUNode(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCCPUNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCCPUNode newPCCPUNode(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCCPUNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCCPUNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCRAMNode> getPCRAMNodes() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewPCRAMNode() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMNode newPCRAMNode(final int x, final int y) {
		return newPCRAMNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMNode newPCRAMNode(final String id, final int x, final int y) {
		return newPCRAMNode(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMNode newPCRAMNode(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCRAMNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMNode newPCRAMNode(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCRAMNode((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMNode.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCRAMSlot> getPCRAMSlots() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewPCRAMSlot() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMSlot newPCRAMSlot(final int x, final int y) {
		return newPCRAMSlot(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMSlot newPCRAMSlot(final String id, final int x, final int y) {
		return newPCRAMSlot(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMSlot newPCRAMSlot(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCRAMSlot((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCRAMSlot newPCRAMSlot(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCRAMSlot((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCRAMSlot.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final ModelElementContainer container, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preMove(final ModelElementContainer newContainer, final int newX, final int newY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postMove(final ModelElementContainer source, final ModelElementContainer target, final int x, final int y, final int deltaX, final int deltaY) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void preResize(final int newWidth, final int newHeight, final int newX, final int newY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void postResize(final int oldWidth, final int oldHeight, final int oldX, final int oldY, final Direction direction) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final PCMainboardContainer pCMainboardContainer, final int x, final int y) {
		return pCMainboardContainer.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.MainboardNode.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final PCMainboardContainer pCMainboardContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(pCMainboardContainer, x, y);
			pCMainboardContainer.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void s_moveTo(final PCMainboardContainer pCMainboardContainer, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMainboardContainer getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mainboard getReferencedMB() {
		String uid = ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode)getInternalElement()).getLibraryComponentUID();
		return (info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.Mainboard) de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode) this.getInternalElement()).getLibraryComponentUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(final String id) {
		((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode) this.getInternalElement()).setLibraryComponentUID(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainboardNodeView getMainboardNodeView() {
		MainboardNodeView mainboardNodeView = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsFactory.eINSTANCE.createMainboardNodeView();
		mainboardNodeView.setInternalMainboardNode((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalMainboardNode)getInternalElement());
		return mainboardNodeView;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElementContainer getInternalContainerElement() {
		return (InternalModelElementContainer)getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void delete() {
		preDelete();
		Runnable postDeleteFunction = getPostDeleteFunction();
		Runnable postDeleteEvent = getPostDeleteEvent();
		for (graphmodel.Node child : getAllNodes())
			child.delete();
		if (getInternalElement() == null) return; //deleting children might have hook-deleted myself
		java.util.HashSet<graphmodel.Edge> allEdges = new java.util.HashSet<>();
		allEdges.addAll(getIncoming());
		allEdges.addAll(getOutgoing());
		for (graphmodel.Edge edge : allEdges)
			edge.delete();
		if (getInternalElement() == null) return; //deleting edges might have hook-deleted myself
		transact("Delete", () -> {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this.getInternalElement());
			org.eclipse.emf.ecore.util.EcoreUtil.delete(this);
		});
		postDeleteFunction.run();
		postDeleteEvent.run();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <M extends Node> EList<M> getSuccessors() {
		EList<graphmodel.internal.InternalNode> iSucc= ((graphmodel.internal.InternalNode) this.getInternalElement()).getSuccessors();
		@SuppressWarnings("unchecked")
		java.util.List<M> collect = iSucc.stream().map(iNode -> (M) iNode.getElement()).collect(java.util.stream.Collectors.toList());
		EList<M> successors = new org.eclipse.emf.common.util.BasicEList<M>(collect);
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getSuccessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getSuccessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <M extends Node> EList<M> getPredecessors() {
		EList<graphmodel.internal.InternalNode> iSucc= ((graphmodel.internal.InternalNode) this.getInternalElement()).getPredecessors();
		@SuppressWarnings("unchecked")
		java.util.List<M> collect = iSucc.stream().map(iNode -> (M) iNode.getElement()).collect(java.util.stream.Collectors.toList());
		EList<M> successors = new org.eclipse.emf.common.util.BasicEList<M>(collect);
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> EList<T> getPredecessors(final Class<T> clazz) {
		@SuppressWarnings("all")
		java.util.List<T> successors =(java.util.List<T>) ((graphmodel.internal.InternalNode)this.getInternalElement()).
				getPredecessors().stream().
					map(me -> me.getElement()).
						filter(me -> clazz.isAssignableFrom(((Node)me).getClass())).
							collect(java.util.stream.Collectors.toList());
				
		EList<T> retval = new org.eclipse.emf.common.util.BasicEList<T>();
		retval.addAll(successors);
		return retval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getIncoming(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getIncoming().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getOutgoing(final Class<T> clazz) {
		java.util.List<T> it = ((graphmodel.internal.InternalNode) getInternalElement()).getOutgoing().stream()
						.filter(iNode -> clazz.isInstance(iNode.getElement())).map(iNode -> clazz.cast(iNode.getElement()))
						.collect(java.util.stream.Collectors.toList());
				org.eclipse.emf.common.util.BasicEList<T> bl = new org.eclipse.emf.common.util.BasicEList<T>();
				bl.addAll(it);
				return bl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canConnect(final Edge with, final Node to) {
		return canStart(with.getClass())&& to.canEnd(with.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getOutgoingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionConstraint> getIncomingConstraints() {
		return ((graphmodel.internal.InternalNode)getInternalElement()).getIncomingConstraints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canStart(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canStart(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canEnd(final Class<? extends Edge> edgeType) {
		return ((graphmodel.internal.InternalNode)getInternalElement()).canEnd(edgeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void move(final int x, final int y) {
		transact("Move", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			if (deltaX != 0 || deltaY != 0)
				preMove(getContainer(), x, y);
			if (deltaX != 0)
				ime.setX(x);
			if (deltaY != 0)
				ime.setY(y);
			if (deltaX != 0 || deltaY != 0)
				postMove(getContainer(), getContainer(), x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height) {
		resize(width,  height, getX(), getY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void resize(final int width, final int height, final int x, final int y) {
		transact("Resize", () -> {
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) getInternalElement();
			int oldWidth  = ime.getWidth();
			int oldHeight = ime.getHeight();
			int oldX      = ime.getX();
			int oldY      = ime.getY();
			boolean widthChanged  = width  != oldWidth;
			boolean heightChanged = height != oldHeight;
			boolean xChanged      = x != oldX;
			boolean yChanged      = y != oldY;
			graphmodel.Direction direction = graphmodel.Direction.UNSPECIFIED;
			if (widthChanged || heightChanged || xChanged || yChanged) {
				boolean north = heightChanged &&  yChanged;
				boolean south = heightChanged && !yChanged;
				boolean west  = widthChanged  &&  xChanged;
				boolean east  = widthChanged  && !xChanged;
				direction =
					( north && !south && !west && !east) ? graphmodel.Direction.NORTH      :
					( north && !south && !west &&  east) ? graphmodel.Direction.NORTH_EAST :
					(!north && !south && !west &&  east) ? graphmodel.Direction.EAST       :
					(!north &&  south && !west &&  east) ? graphmodel.Direction.SOUTH_EAST :
					(!north &&  south && !west && !east) ? graphmodel.Direction.SOUTH      :
					(!north &&  south &&  west && !east) ? graphmodel.Direction.SOUTH_WEST :
					(!north && !south &&  west && !east) ? graphmodel.Direction.WEST       :
					( north && !south &&  west && !east) ? graphmodel.Direction.NORTH_WEST :
					                                       graphmodel.Direction.UNSPECIFIED;
				this.preResize(width, height, x, y, direction);
			}
			if (widthChanged)  ime.setWidth(width);
			if (heightChanged) ime.setHeight(height);
			if (xChanged)      ime.setX(x);
			if (yChanged)      ime.setY(y);
			if (widthChanged || heightChanged || xChanged || yChanged) {
				this.postResize(oldWidth, oldHeight, oldX, oldY, direction);
				this.update();
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canMoveTo(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final ModelElementContainer targetContainer, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			preMove(targetContainer, x, y);
			s_moveTo(targetContainer, x, y);
			targetContainer.getInternalContainerElement().getModelElements().add(ime);
			ime.setX(x);
			ime.setY(y);
			postMove(sourceContainer, targetContainer, x, y, deltaX, deltaY);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canClone(final ModelElementContainer targetContainer) {
		return targetContainer.canContain(this.getClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T clone(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, getInternalElement().getId());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy.getElement(), getId());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getX();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getY();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getWidth();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return ((graphmodel.internal.InternalNode) getInternalElement()).getHeight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Node> T copy(final ModelElementContainer targetContainer) {
		graphmodel.internal.InternalNode copy = (graphmodel.internal.InternalNode) org.eclipse.emf.ecore.util.EcoreUtil.copy(this.getInternalElement());
		org.eclipse.emf.ecore.util.EcoreUtil.setID(copy, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		targetContainer.getInternalContainerElement().getModelElements().add(copy);
		@SuppressWarnings("unchecked")
		T t = (T) copy.getElement();
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(final int x) {
		transact("Set x", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setX(x);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(final int y) {
		transact("Set Y", () -> {
		((graphmodel.internal.InternalNode) getInternalElement()).setY(y);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(final int width) {
		transact("Set width", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setWidth(width);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(final int height) {
		transact("Set height", () -> {
			((graphmodel.internal.InternalNode) getInternalElement()).setHeight(height);
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLayer() {
		return getContainer().getModelElements().indexOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getIncoming() {
		return (EList<T>)getIncoming(graphmodel.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Edge> EList<T> getOutgoing() {
		return (EList<T>)getOutgoing(graphmodel.Edge.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getUntypedIncoming() {
		EList<graphmodel.internal.InternalEdge> in = ((graphmodel.internal.InternalNode)getInternalElement()).getIncoming();
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(in
					.stream().map(me -> (graphmodel.Edge)me.getElement()).
						collect(java.util.stream.Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getUntypedOutgoing() {
		EList<graphmodel.internal.InternalEdge> out = ((graphmodel.internal.InternalNode)getInternalElement()).getOutgoing();
				return org.eclipse.emf.common.util.ECollections.unmodifiableEList(out
					.stream().map(me -> (graphmodel.Edge)me.getElement()).
						collect(java.util.stream.Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void highlight() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void update() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void updateGraphModel() {
		this.getRootElement().updateModelElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInternalElement((InternalModelElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT:
				return basicSetInternalElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, InternalPackage.INTERNAL_MODEL_ELEMENT__ELEMENT, InternalModelElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT:
				return getInternalElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT:
				setInternalElement((InternalModelElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT:
				return getInternalElement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT: return GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT: return PcPackage.MAINBOARD_NODE__INTERNAL_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return PcPackage.MAINBOARD_NODE___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return PcPackage.MAINBOARD_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT: return PcPackage.MAINBOARD_NODE___GET_INTERNAL_CONTAINER_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return PcPackage.MAINBOARD_NODE___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return PcPackage.MAINBOARD_NODE___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return PcPackage.MAINBOARD_NODE___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return PcPackage.MAINBOARD_NODE___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return PcPackage.MAINBOARD_NODE___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___HIGHLIGHT: return PcPackage.MAINBOARD_NODE___HIGHLIGHT;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE: return PcPackage.MAINBOARD_NODE___UPDATE;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE_GRAPH_MODEL: return PcPackage.MAINBOARD_NODE___UPDATE_GRAPH_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return PcPackage.MAINBOARD_NODE___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS: return PcPackage.MAINBOARD_NODE___GET_SUCCESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return PcPackage.MAINBOARD_NODE___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS: return PcPackage.MAINBOARD_NODE___GET_PREDECESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_INCOMING__CLASS: return PcPackage.MAINBOARD_NODE___GET_INCOMING__CLASS;
				case GraphmodelPackage.NODE___GET_OUTGOING__CLASS: return PcPackage.MAINBOARD_NODE___GET_OUTGOING__CLASS;
				case GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE: return PcPackage.MAINBOARD_NODE___CAN_CONNECT__EDGE_NODE;
				case GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS: return PcPackage.MAINBOARD_NODE___GET_OUTGOING_CONSTRAINTS;
				case GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS: return PcPackage.MAINBOARD_NODE___GET_INCOMING_CONSTRAINTS;
				case GraphmodelPackage.NODE___CAN_START__CLASS: return PcPackage.MAINBOARD_NODE___CAN_START__CLASS;
				case GraphmodelPackage.NODE___CAN_END__CLASS: return PcPackage.MAINBOARD_NODE___CAN_END__CLASS;
				case GraphmodelPackage.NODE___MOVE__INT_INT: return PcPackage.MAINBOARD_NODE___MOVE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT: return PcPackage.MAINBOARD_NODE___RESIZE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT: return PcPackage.MAINBOARD_NODE___RESIZE__INT_INT_INT_INT;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return PcPackage.MAINBOARD_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return PcPackage.MAINBOARD_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___DELETE: return PcPackage.MAINBOARD_NODE___DELETE;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return PcPackage.MAINBOARD_NODE___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return PcPackage.MAINBOARD_NODE___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return PcPackage.MAINBOARD_NODE___PRE_DELETE;
				case GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER: return PcPackage.MAINBOARD_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT: return PcPackage.MAINBOARD_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER: return PcPackage.MAINBOARD_NODE___CAN_CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER: return PcPackage.MAINBOARD_NODE___CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___GET_X: return PcPackage.MAINBOARD_NODE___GET_X;
				case GraphmodelPackage.NODE___GET_Y: return PcPackage.MAINBOARD_NODE___GET_Y;
				case GraphmodelPackage.NODE___GET_WIDTH: return PcPackage.MAINBOARD_NODE___GET_WIDTH;
				case GraphmodelPackage.NODE___GET_HEIGHT: return PcPackage.MAINBOARD_NODE___GET_HEIGHT;
				case GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER: return PcPackage.MAINBOARD_NODE___COPY__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___SET_X__INT: return PcPackage.MAINBOARD_NODE___SET_X__INT;
				case GraphmodelPackage.NODE___SET_Y__INT: return PcPackage.MAINBOARD_NODE___SET_Y__INT;
				case GraphmodelPackage.NODE___SET_WIDTH__INT: return PcPackage.MAINBOARD_NODE___SET_WIDTH__INT;
				case GraphmodelPackage.NODE___SET_HEIGHT__INT: return PcPackage.MAINBOARD_NODE___SET_HEIGHT__INT;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.MAINBOARD_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.MAINBOARD_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___GET_LAYER: return PcPackage.MAINBOARD_NODE___GET_LAYER;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return PcPackage.MAINBOARD_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return PcPackage.MAINBOARD_NODE___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return PcPackage.MAINBOARD_NODE___GET_OUTGOING;
				case GraphmodelPackage.NODE___GET_UNTYPED_INCOMING: return PcPackage.MAINBOARD_NODE___GET_UNTYPED_INCOMING;
				case GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING: return PcPackage.MAINBOARD_NODE___GET_UNTYPED_OUTGOING;
				default: return -1;
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
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PcPackage.MAINBOARD_NODE___GET_NAME:
				return getName();
			case PcPackage.MAINBOARD_NODE___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case PcPackage.MAINBOARD_NODE___GET_INTERNAL_MAINBOARD_NODE:
				return getInternalMainboardNode();
			case PcPackage.MAINBOARD_NODE___IS_EXACTLY_MAINBOARD_NODE:
				return isExactlyMainboardNode();
			case PcPackage.MAINBOARD_NODE___PRE_DELETE:
				preDelete();
				return null;
			case PcPackage.MAINBOARD_NODE___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case PcPackage.MAINBOARD_NODE___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case PcPackage.MAINBOARD_NODE___PRE_SAVE:
				preSave();
				return null;
			case PcPackage.MAINBOARD_NODE___POST_SAVE:
				postSave();
				return null;
			case PcPackage.MAINBOARD_NODE___GET_ROOT_ELEMENT:
				return getRootElement();
			case PcPackage.MAINBOARD_NODE___GET_NODES:
				return getNodes();
			case PcPackage.MAINBOARD_NODE___GET_PCGPU_NODES:
				return getPCGPUNodes();
			case PcPackage.MAINBOARD_NODE___CAN_NEW_PCGPU_NODE:
				return canNewPCGPUNode();
			case PcPackage.MAINBOARD_NODE___NEW_PCGPU_NODE__INT_INT:
				return newPCGPUNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case PcPackage.MAINBOARD_NODE___NEW_PCGPU_NODE__STRING_INT_INT:
				return newPCGPUNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.MAINBOARD_NODE___NEW_PCGPU_NODE__INT_INT_INT_INT:
				return newPCGPUNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.MAINBOARD_NODE___NEW_PCGPU_NODE__STRING_INT_INT_INT_INT:
				return newPCGPUNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.MAINBOARD_NODE___GET_PCCPU_NODES:
				return getPCCPUNodes();
			case PcPackage.MAINBOARD_NODE___CAN_NEW_PCCPU_NODE:
				return canNewPCCPUNode();
			case PcPackage.MAINBOARD_NODE___NEW_PCCPU_NODE__INT_INT:
				return newPCCPUNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case PcPackage.MAINBOARD_NODE___NEW_PCCPU_NODE__STRING_INT_INT:
				return newPCCPUNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.MAINBOARD_NODE___NEW_PCCPU_NODE__INT_INT_INT_INT:
				return newPCCPUNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.MAINBOARD_NODE___NEW_PCCPU_NODE__STRING_INT_INT_INT_INT:
				return newPCCPUNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.MAINBOARD_NODE___GET_PCRAM_NODES:
				return getPCRAMNodes();
			case PcPackage.MAINBOARD_NODE___CAN_NEW_PCRAM_NODE:
				return canNewPCRAMNode();
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_NODE__INT_INT:
				return newPCRAMNode((Integer)arguments.get(0), (Integer)arguments.get(1));
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_NODE__STRING_INT_INT:
				return newPCRAMNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_NODE__INT_INT_INT_INT:
				return newPCRAMNode((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_NODE__STRING_INT_INT_INT_INT:
				return newPCRAMNode((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.MAINBOARD_NODE___GET_PCRAM_SLOTS:
				return getPCRAMSlots();
			case PcPackage.MAINBOARD_NODE___CAN_NEW_PCRAM_SLOT:
				return canNewPCRAMSlot();
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_SLOT__INT_INT:
				return newPCRAMSlot((Integer)arguments.get(0), (Integer)arguments.get(1));
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_SLOT__STRING_INT_INT:
				return newPCRAMSlot((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_SLOT__INT_INT_INT_INT:
				return newPCRAMSlot((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.MAINBOARD_NODE___NEW_PCRAM_SLOT__STRING_INT_INT_INT_INT:
				return newPCRAMSlot((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.MAINBOARD_NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.MAINBOARD_NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.MAINBOARD_NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case PcPackage.MAINBOARD_NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.MAINBOARD_NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.MAINBOARD_NODE___CAN_MOVE_TO__PCMAINBOARDCONTAINER_INT_INT:
				return canMoveTo((PCMainboardContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.MAINBOARD_NODE___MOVE_TO__PCMAINBOARDCONTAINER_INT_INT:
				moveTo((PCMainboardContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.MAINBOARD_NODE___SMOVE_TO__PCMAINBOARDCONTAINER_INT_INT:
				s_moveTo((PCMainboardContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.MAINBOARD_NODE___GET_CONTAINER:
				return getContainer();
			case PcPackage.MAINBOARD_NODE___GET_REFERENCED_MB:
				return getReferencedMB();
			case PcPackage.MAINBOARD_NODE___GET_LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
			case PcPackage.MAINBOARD_NODE___SET_LIBRARY_COMPONENT_UID__STRING:
				setLibraryComponentUID((String)arguments.get(0));
				return null;
			case PcPackage.MAINBOARD_NODE___GET_MAINBOARD_NODE_VIEW:
				return getMainboardNodeView();
			case PcPackage.MAINBOARD_NODE___GET_INTERNAL_CONTAINER_ELEMENT:
				return getInternalContainerElement();
			case PcPackage.MAINBOARD_NODE___DELETE:
				delete();
				return null;
			case PcPackage.MAINBOARD_NODE___GET_SUCCESSORS:
				return getSuccessors();
			case PcPackage.MAINBOARD_NODE___GET_SUCCESSORS__CLASS:
				return getSuccessors((Class)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___GET_PREDECESSORS:
				return getPredecessors();
			case PcPackage.MAINBOARD_NODE___GET_PREDECESSORS__CLASS:
				return getPredecessors((Class)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___GET_INCOMING__CLASS:
				return getIncoming((Class)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___GET_OUTGOING__CLASS:
				return getOutgoing((Class)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___CAN_CONNECT__EDGE_NODE:
				return canConnect((Edge)arguments.get(0), (Node)arguments.get(1));
			case PcPackage.MAINBOARD_NODE___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case PcPackage.MAINBOARD_NODE___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case PcPackage.MAINBOARD_NODE___CAN_START__CLASS:
				return canStart((Class<? extends Edge>)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___CAN_END__CLASS:
				return canEnd((Class<? extends Edge>)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___MOVE__INT_INT:
				move((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case PcPackage.MAINBOARD_NODE___RESIZE__INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case PcPackage.MAINBOARD_NODE___RESIZE__INT_INT_INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case PcPackage.MAINBOARD_NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER:
				return canMoveTo((ModelElementContainer)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.MAINBOARD_NODE___CAN_CLONE__MODELELEMENTCONTAINER:
				return canClone((ModelElementContainer)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___CLONE__MODELELEMENTCONTAINER:
				return clone((ModelElementContainer)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___GET_X:
				return getX();
			case PcPackage.MAINBOARD_NODE___GET_Y:
				return getY();
			case PcPackage.MAINBOARD_NODE___GET_WIDTH:
				return getWidth();
			case PcPackage.MAINBOARD_NODE___GET_HEIGHT:
				return getHeight();
			case PcPackage.MAINBOARD_NODE___COPY__MODELELEMENTCONTAINER:
				return copy((ModelElementContainer)arguments.get(0));
			case PcPackage.MAINBOARD_NODE___SET_X__INT:
				setX((Integer)arguments.get(0));
				return null;
			case PcPackage.MAINBOARD_NODE___SET_Y__INT:
				setY((Integer)arguments.get(0));
				return null;
			case PcPackage.MAINBOARD_NODE___SET_WIDTH__INT:
				setWidth((Integer)arguments.get(0));
				return null;
			case PcPackage.MAINBOARD_NODE___SET_HEIGHT__INT:
				setHeight((Integer)arguments.get(0));
				return null;
			case PcPackage.MAINBOARD_NODE___GET_LAYER:
				return getLayer();
			case PcPackage.MAINBOARD_NODE___GET_INCOMING:
				return getIncoming();
			case PcPackage.MAINBOARD_NODE___GET_OUTGOING:
				return getOutgoing();
			case PcPackage.MAINBOARD_NODE___GET_UNTYPED_INCOMING:
				return getUntypedIncoming();
			case PcPackage.MAINBOARD_NODE___GET_UNTYPED_OUTGOING:
				return getUntypedOutgoing();
			case PcPackage.MAINBOARD_NODE___HIGHLIGHT:
				highlight();
				return null;
			case PcPackage.MAINBOARD_NODE___UPDATE:
				update();
				return null;
			case PcPackage.MAINBOARD_NODE___UPDATE_GRAPH_MODEL:
				updateGraphModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MainboardNodeImpl
