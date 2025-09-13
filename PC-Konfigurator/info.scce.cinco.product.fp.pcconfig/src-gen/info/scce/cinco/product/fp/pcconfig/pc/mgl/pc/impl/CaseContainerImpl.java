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

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PcPackage;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.CaseContainerView;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.impl.CaseContainerImpl#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseContainerImpl extends ModelElementContainerImpl implements CaseContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcPackage.eINSTANCE.getCaseContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalModelElement getInternalElement() {
		if (eContainerFeatureID() != PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT) return null;
		return (InternalModelElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(InternalModelElement newInternalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInternalElement, PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalElement(InternalModelElement newInternalElement) {
		if (newInternalElement != eInternalContainer() || (eContainerFeatureID() != PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT && newInternalElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT, newInternalElement, newInternalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCaseInternalSlots() {
		return getInternalCaseContainer().getCaseInternalSlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseInternalSlots(final int _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseInternalSlots", () -> {
			getInternalCaseContainer().setCaseInternalSlots(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCasePrice() {
		return getInternalCaseContainer().getCasePrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCasePrice(final float _arg) {
		getInternalCaseContainer().getElement().transact("Set CasePrice", () -> {
			getInternalCaseContainer().setCasePrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCaseExternalSlots() {
		return getInternalCaseContainer().getCaseExternalSlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseExternalSlots(final int _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseExternalSlots", () -> {
			getInternalCaseContainer().setCaseExternalSlots(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaseName() {
		return getInternalCaseContainer().getCaseName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseName(final String _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseName", () -> {
			getInternalCaseContainer().setCaseName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaseFormFactor() {
		return getInternalCaseContainer().getCaseFormFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFormFactor(final String _arg) {
		getInternalCaseContainer().getElement().transact("Set CaseFormFactor", () -> {
			getInternalCaseContainer().setCaseFormFactor(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalCaseContainer getInternalCaseContainer() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer) getInternalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExactlyCaseContainer() {
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
	public EList<DriveContainer> getDriveContainers() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewDriveContainer() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveContainer newDriveContainer(final int x, final int y) {
		return newDriveContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveContainer newDriveContainer(final String id, final int x, final int y) {
		return newDriveContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveContainer newDriveContainer(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createDriveContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriveContainer newDriveContainer(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createDriveContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.DriveContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PSUContainer> getPSUContainers() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewPSUContainer() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUContainer newPSUContainer(final int x, final int y) {
		return newPSUContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUContainer newPSUContainer(final String id, final int x, final int y) {
		return newPSUContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUContainer newPSUContainer(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPSUContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PSUContainer newPSUContainer(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPSUContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PSUContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCMainboardContainer> getPCMainboardContainers() {
		return getModelElements(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canNewPCMainboardContainer() {
		return this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMainboardContainer newPCMainboardContainer(final int x, final int y) {
		return newPCMainboardContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMainboardContainer newPCMainboardContainer(final String id, final int x, final int y) {
		return newPCMainboardContainer(x, y, -1, -1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMainboardContainer newPCMainboardContainer(final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCMainboardContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer.class, this.getClass()));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMainboardContainer newPCMainboardContainer(final String id, final int x, final int y, final int width, final int height) {
		if (this.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer.class)) {
			info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer node = info.scce.cinco.product.fp.pcconfig.pc.mgl.factory.PCFactory.eINSTANCE.createPCMainboardContainer((graphmodel.internal.InternalModelElementContainer) this.getInternalElement());
			this.getInternalContainerElement().getModelElements().add(node.getInternalElement());
			node.move(x, y);
			node.resize(width, height);
			return node;
		} else throw new java.lang.RuntimeException(
			java.lang.String.format("Cannot add node %s to %s", info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PCMainboardContainer.class, this.getClass()));
		
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
	public boolean canMoveTo(final PC pC, final int x, final int y) {
		return pC.canContain(info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.CaseContainer.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void moveTo(final PC pC, final int x, final int y) {
		transact("Move to", () -> {
			graphmodel.ModelElementContainer sourceContainer = this.getContainer();
			graphmodel.internal.InternalNode ime = (graphmodel.internal.InternalNode) this.getInternalElement();
			int deltaX = x - ime.getX();
			int deltaY = y - ime.getY();
			s_moveTo(pC, x, y);
			pC.getInternalContainerElement().getModelElements().add(ime);
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
	public void s_moveTo(final PC pC, final int x, final int y) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PC getContainer() {
		return (info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.PC)getInternalElement().getContainer().getContainerElement();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedCase() {
		String uid = ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer)getInternalElement()).getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return ((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer) this.getInternalElement()).getLibraryComponentUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(final String id) {
		((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer) this.getInternalElement()).setLibraryComponentUID(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseContainerView getCaseContainerView() {
		CaseContainerView caseContainerView = info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsFactory.eINSTANCE.createCaseContainerView();
		caseContainerView.setInternalCaseContainer((info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalCaseContainer)getInternalElement());
		return caseContainerView;
		
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
			case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT:
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
			case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT:
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
			case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT:
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
			case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT:
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
			case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT:
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
			case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT:
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
			case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT:
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
				case PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT: return GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT;
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
				case GraphmodelPackage.MODEL_ELEMENT__INTERNAL_ELEMENT: return PcPackage.CASE_CONTAINER__INTERNAL_ELEMENT;
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
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___PRE_SAVE: return PcPackage.CASE_CONTAINER___PRE_SAVE;
				case GraphmodelPackage.IDENTIFIABLE_ELEMENT___POST_SAVE: return PcPackage.CASE_CONTAINER___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElementContainer.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT: return PcPackage.CASE_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___GET_NODES: return PcPackage.CASE_CONTAINER___GET_NODES;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___PRE_SAVE: return PcPackage.CASE_CONTAINER___PRE_SAVE;
				case GraphmodelPackage.MODEL_ELEMENT_CONTAINER___POST_SAVE: return PcPackage.CASE_CONTAINER___POST_SAVE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.MODEL_ELEMENT___GET_CONTAINER: return PcPackage.CASE_CONTAINER___GET_CONTAINER;
				case GraphmodelPackage.MODEL_ELEMENT___GET_ROOT_ELEMENT: return PcPackage.CASE_CONTAINER___GET_ROOT_ELEMENT;
				case GraphmodelPackage.MODEL_ELEMENT___HIGHLIGHT: return PcPackage.CASE_CONTAINER___HIGHLIGHT;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE: return PcPackage.CASE_CONTAINER___UPDATE;
				case GraphmodelPackage.MODEL_ELEMENT___UPDATE_GRAPH_MODEL: return PcPackage.CASE_CONTAINER___UPDATE_GRAPH_MODEL;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case GraphmodelPackage.NODE___GET_SUCCESSORS: return PcPackage.CASE_CONTAINER___GET_SUCCESSORS;
				case GraphmodelPackage.NODE___GET_SUCCESSORS__CLASS: return PcPackage.CASE_CONTAINER___GET_SUCCESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS: return PcPackage.CASE_CONTAINER___GET_PREDECESSORS;
				case GraphmodelPackage.NODE___GET_PREDECESSORS__CLASS: return PcPackage.CASE_CONTAINER___GET_PREDECESSORS__CLASS;
				case GraphmodelPackage.NODE___GET_INCOMING__CLASS: return PcPackage.CASE_CONTAINER___GET_INCOMING__CLASS;
				case GraphmodelPackage.NODE___GET_OUTGOING__CLASS: return PcPackage.CASE_CONTAINER___GET_OUTGOING__CLASS;
				case GraphmodelPackage.NODE___CAN_CONNECT__EDGE_NODE: return PcPackage.CASE_CONTAINER___CAN_CONNECT__EDGE_NODE;
				case GraphmodelPackage.NODE___GET_OUTGOING_CONSTRAINTS: return PcPackage.CASE_CONTAINER___GET_OUTGOING_CONSTRAINTS;
				case GraphmodelPackage.NODE___GET_INCOMING_CONSTRAINTS: return PcPackage.CASE_CONTAINER___GET_INCOMING_CONSTRAINTS;
				case GraphmodelPackage.NODE___CAN_START__CLASS: return PcPackage.CASE_CONTAINER___CAN_START__CLASS;
				case GraphmodelPackage.NODE___CAN_END__CLASS: return PcPackage.CASE_CONTAINER___CAN_END__CLASS;
				case GraphmodelPackage.NODE___MOVE__INT_INT: return PcPackage.CASE_CONTAINER___MOVE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT: return PcPackage.CASE_CONTAINER___RESIZE__INT_INT;
				case GraphmodelPackage.NODE___RESIZE__INT_INT_INT_INT: return PcPackage.CASE_CONTAINER___RESIZE__INT_INT_INT_INT;
				case GraphmodelPackage.NODE___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT: return PcPackage.CASE_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT: return PcPackage.CASE_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT;
				case GraphmodelPackage.NODE___DELETE: return PcPackage.CASE_CONTAINER___DELETE;
				case GraphmodelPackage.NODE___GET_POST_DELETE_FUNCTION: return PcPackage.CASE_CONTAINER___GET_POST_DELETE_FUNCTION;
				case GraphmodelPackage.NODE___GET_POST_DELETE_EVENT: return PcPackage.CASE_CONTAINER___GET_POST_DELETE_EVENT;
				case GraphmodelPackage.NODE___PRE_DELETE: return PcPackage.CASE_CONTAINER___PRE_DELETE;
				case GraphmodelPackage.NODE___CAN_MOVE_TO__MODELELEMENTCONTAINER: return PcPackage.CASE_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___MOVE_TO__MODELELEMENTCONTAINER_INT_INT: return PcPackage.CASE_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___CAN_CLONE__MODELELEMENTCONTAINER: return PcPackage.CASE_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___CLONE__MODELELEMENTCONTAINER: return PcPackage.CASE_CONTAINER___CLONE__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___GET_X: return PcPackage.CASE_CONTAINER___GET_X;
				case GraphmodelPackage.NODE___GET_Y: return PcPackage.CASE_CONTAINER___GET_Y;
				case GraphmodelPackage.NODE___GET_WIDTH: return PcPackage.CASE_CONTAINER___GET_WIDTH;
				case GraphmodelPackage.NODE___GET_HEIGHT: return PcPackage.CASE_CONTAINER___GET_HEIGHT;
				case GraphmodelPackage.NODE___COPY__MODELELEMENTCONTAINER: return PcPackage.CASE_CONTAINER___COPY__MODELELEMENTCONTAINER;
				case GraphmodelPackage.NODE___SET_X__INT: return PcPackage.CASE_CONTAINER___SET_X__INT;
				case GraphmodelPackage.NODE___SET_Y__INT: return PcPackage.CASE_CONTAINER___SET_Y__INT;
				case GraphmodelPackage.NODE___SET_WIDTH__INT: return PcPackage.CASE_CONTAINER___SET_WIDTH__INT;
				case GraphmodelPackage.NODE___SET_HEIGHT__INT: return PcPackage.CASE_CONTAINER___SET_HEIGHT__INT;
				case GraphmodelPackage.NODE___PRE_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.CASE_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___POST_RESIZE__INT_INT_INT_INT_DIRECTION: return PcPackage.CASE_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION;
				case GraphmodelPackage.NODE___GET_LAYER: return PcPackage.CASE_CONTAINER___GET_LAYER;
				case GraphmodelPackage.NODE___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT: return PcPackage.CASE_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT;
				case GraphmodelPackage.NODE___GET_INCOMING: return PcPackage.CASE_CONTAINER___GET_INCOMING;
				case GraphmodelPackage.NODE___GET_OUTGOING: return PcPackage.CASE_CONTAINER___GET_OUTGOING;
				case GraphmodelPackage.NODE___GET_UNTYPED_INCOMING: return PcPackage.CASE_CONTAINER___GET_UNTYPED_INCOMING;
				case GraphmodelPackage.NODE___GET_UNTYPED_OUTGOING: return PcPackage.CASE_CONTAINER___GET_UNTYPED_OUTGOING;
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
			case PcPackage.CASE_CONTAINER___GET_CASE_INTERNAL_SLOTS:
				return getCaseInternalSlots();
			case PcPackage.CASE_CONTAINER___SET_CASE_INTERNAL_SLOTS__INT:
				setCaseInternalSlots((Integer)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___GET_CASE_PRICE:
				return getCasePrice();
			case PcPackage.CASE_CONTAINER___SET_CASE_PRICE__FLOAT:
				setCasePrice((Float)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___GET_CASE_EXTERNAL_SLOTS:
				return getCaseExternalSlots();
			case PcPackage.CASE_CONTAINER___SET_CASE_EXTERNAL_SLOTS__INT:
				setCaseExternalSlots((Integer)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___GET_CASE_NAME:
				return getCaseName();
			case PcPackage.CASE_CONTAINER___SET_CASE_NAME__STRING:
				setCaseName((String)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___GET_CASE_FORM_FACTOR:
				return getCaseFormFactor();
			case PcPackage.CASE_CONTAINER___SET_CASE_FORM_FACTOR__STRING:
				setCaseFormFactor((String)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___GET_INTERNAL_CASE_CONTAINER:
				return getInternalCaseContainer();
			case PcPackage.CASE_CONTAINER___IS_EXACTLY_CASE_CONTAINER:
				return isExactlyCaseContainer();
			case PcPackage.CASE_CONTAINER___PRE_DELETE:
				preDelete();
				return null;
			case PcPackage.CASE_CONTAINER___GET_POST_DELETE_FUNCTION:
				return getPostDeleteFunction();
			case PcPackage.CASE_CONTAINER___GET_POST_DELETE_EVENT:
				return getPostDeleteEvent();
			case PcPackage.CASE_CONTAINER___PRE_SAVE:
				preSave();
				return null;
			case PcPackage.CASE_CONTAINER___POST_SAVE:
				postSave();
				return null;
			case PcPackage.CASE_CONTAINER___GET_ROOT_ELEMENT:
				return getRootElement();
			case PcPackage.CASE_CONTAINER___GET_NODES:
				return getNodes();
			case PcPackage.CASE_CONTAINER___GET_DRIVE_CONTAINERS:
				return getDriveContainers();
			case PcPackage.CASE_CONTAINER___CAN_NEW_DRIVE_CONTAINER:
				return canNewDriveContainer();
			case PcPackage.CASE_CONTAINER___NEW_DRIVE_CONTAINER__INT_INT:
				return newDriveContainer((Integer)arguments.get(0), (Integer)arguments.get(1));
			case PcPackage.CASE_CONTAINER___NEW_DRIVE_CONTAINER__STRING_INT_INT:
				return newDriveContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.CASE_CONTAINER___NEW_DRIVE_CONTAINER__INT_INT_INT_INT:
				return newDriveContainer((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.CASE_CONTAINER___NEW_DRIVE_CONTAINER__STRING_INT_INT_INT_INT:
				return newDriveContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.CASE_CONTAINER___GET_PSU_CONTAINERS:
				return getPSUContainers();
			case PcPackage.CASE_CONTAINER___CAN_NEW_PSU_CONTAINER:
				return canNewPSUContainer();
			case PcPackage.CASE_CONTAINER___NEW_PSU_CONTAINER__INT_INT:
				return newPSUContainer((Integer)arguments.get(0), (Integer)arguments.get(1));
			case PcPackage.CASE_CONTAINER___NEW_PSU_CONTAINER__STRING_INT_INT:
				return newPSUContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.CASE_CONTAINER___NEW_PSU_CONTAINER__INT_INT_INT_INT:
				return newPSUContainer((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.CASE_CONTAINER___NEW_PSU_CONTAINER__STRING_INT_INT_INT_INT:
				return newPSUContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.CASE_CONTAINER___GET_PC_MAINBOARD_CONTAINERS:
				return getPCMainboardContainers();
			case PcPackage.CASE_CONTAINER___CAN_NEW_PC_MAINBOARD_CONTAINER:
				return canNewPCMainboardContainer();
			case PcPackage.CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__INT_INT:
				return newPCMainboardContainer((Integer)arguments.get(0), (Integer)arguments.get(1));
			case PcPackage.CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__STRING_INT_INT:
				return newPCMainboardContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__INT_INT_INT_INT:
				return newPCMainboardContainer((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case PcPackage.CASE_CONTAINER___NEW_PC_MAINBOARD_CONTAINER__STRING_INT_INT_INT_INT:
				return newPCMainboardContainer((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case PcPackage.CASE_CONTAINER___SMOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				s_moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.CASE_CONTAINER___PRE_MOVE__MODELELEMENTCONTAINER_INT_INT:
				preMove((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.CASE_CONTAINER___POST_MOVE__MODELELEMENTCONTAINER_MODELELEMENTCONTAINER_INT_INT_INT_INT:
				postMove((ModelElementContainer)arguments.get(0), (ModelElementContainer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case PcPackage.CASE_CONTAINER___PRE_RESIZE__INT_INT_INT_INT_DIRECTION:
				preResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.CASE_CONTAINER___POST_RESIZE__INT_INT_INT_INT_DIRECTION:
				postResize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Direction)arguments.get(4));
				return null;
			case PcPackage.CASE_CONTAINER___CAN_MOVE_TO__PC_INT_INT:
				return canMoveTo((PC)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case PcPackage.CASE_CONTAINER___MOVE_TO__PC_INT_INT:
				moveTo((PC)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.CASE_CONTAINER___SMOVE_TO__PC_INT_INT:
				s_moveTo((PC)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.CASE_CONTAINER___GET_CONTAINER:
				return getContainer();
			case PcPackage.CASE_CONTAINER___GET_REFERENCED_CASE:
				return getReferencedCase();
			case PcPackage.CASE_CONTAINER___GET_LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
			case PcPackage.CASE_CONTAINER___SET_LIBRARY_COMPONENT_UID__STRING:
				setLibraryComponentUID((String)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___GET_CASE_CONTAINER_VIEW:
				return getCaseContainerView();
			case PcPackage.CASE_CONTAINER___GET_INTERNAL_CONTAINER_ELEMENT:
				return getInternalContainerElement();
			case PcPackage.CASE_CONTAINER___DELETE:
				delete();
				return null;
			case PcPackage.CASE_CONTAINER___GET_SUCCESSORS:
				return getSuccessors();
			case PcPackage.CASE_CONTAINER___GET_SUCCESSORS__CLASS:
				return getSuccessors((Class)arguments.get(0));
			case PcPackage.CASE_CONTAINER___GET_PREDECESSORS:
				return getPredecessors();
			case PcPackage.CASE_CONTAINER___GET_PREDECESSORS__CLASS:
				return getPredecessors((Class)arguments.get(0));
			case PcPackage.CASE_CONTAINER___GET_INCOMING__CLASS:
				return getIncoming((Class)arguments.get(0));
			case PcPackage.CASE_CONTAINER___GET_OUTGOING__CLASS:
				return getOutgoing((Class)arguments.get(0));
			case PcPackage.CASE_CONTAINER___CAN_CONNECT__EDGE_NODE:
				return canConnect((Edge)arguments.get(0), (Node)arguments.get(1));
			case PcPackage.CASE_CONTAINER___GET_OUTGOING_CONSTRAINTS:
				return getOutgoingConstraints();
			case PcPackage.CASE_CONTAINER___GET_INCOMING_CONSTRAINTS:
				return getIncomingConstraints();
			case PcPackage.CASE_CONTAINER___CAN_START__CLASS:
				return canStart((Class<? extends Edge>)arguments.get(0));
			case PcPackage.CASE_CONTAINER___CAN_END__CLASS:
				return canEnd((Class<? extends Edge>)arguments.get(0));
			case PcPackage.CASE_CONTAINER___MOVE__INT_INT:
				move((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case PcPackage.CASE_CONTAINER___RESIZE__INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case PcPackage.CASE_CONTAINER___RESIZE__INT_INT_INT_INT:
				resize((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case PcPackage.CASE_CONTAINER___CAN_MOVE_TO__MODELELEMENTCONTAINER:
				return canMoveTo((ModelElementContainer)arguments.get(0));
			case PcPackage.CASE_CONTAINER___MOVE_TO__MODELELEMENTCONTAINER_INT_INT:
				moveTo((ModelElementContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case PcPackage.CASE_CONTAINER___CAN_CLONE__MODELELEMENTCONTAINER:
				return canClone((ModelElementContainer)arguments.get(0));
			case PcPackage.CASE_CONTAINER___CLONE__MODELELEMENTCONTAINER:
				return clone((ModelElementContainer)arguments.get(0));
			case PcPackage.CASE_CONTAINER___GET_X:
				return getX();
			case PcPackage.CASE_CONTAINER___GET_Y:
				return getY();
			case PcPackage.CASE_CONTAINER___GET_WIDTH:
				return getWidth();
			case PcPackage.CASE_CONTAINER___GET_HEIGHT:
				return getHeight();
			case PcPackage.CASE_CONTAINER___COPY__MODELELEMENTCONTAINER:
				return copy((ModelElementContainer)arguments.get(0));
			case PcPackage.CASE_CONTAINER___SET_X__INT:
				setX((Integer)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___SET_Y__INT:
				setY((Integer)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___SET_WIDTH__INT:
				setWidth((Integer)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___SET_HEIGHT__INT:
				setHeight((Integer)arguments.get(0));
				return null;
			case PcPackage.CASE_CONTAINER___GET_LAYER:
				return getLayer();
			case PcPackage.CASE_CONTAINER___GET_INCOMING:
				return getIncoming();
			case PcPackage.CASE_CONTAINER___GET_OUTGOING:
				return getOutgoing();
			case PcPackage.CASE_CONTAINER___GET_UNTYPED_INCOMING:
				return getUntypedIncoming();
			case PcPackage.CASE_CONTAINER___GET_UNTYPED_OUTGOING:
				return getUntypedOutgoing();
			case PcPackage.CASE_CONTAINER___HIGHLIGHT:
				highlight();
				return null;
			case PcPackage.CASE_CONTAINER___UPDATE:
				update();
				return null;
			case PcPackage.CASE_CONTAINER___UPDATE_GRAPH_MODEL:
				updateGraphModel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CaseContainerImpl
