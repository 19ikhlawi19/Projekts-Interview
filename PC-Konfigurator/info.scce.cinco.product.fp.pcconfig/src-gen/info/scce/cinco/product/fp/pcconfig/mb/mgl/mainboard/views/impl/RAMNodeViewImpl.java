/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalRAMNode;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.RAMNodeView;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RAM Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.RAMNodeViewImpl#getInternalRAMNode <em>Internal RAM Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RAMNodeViewImpl extends EObjectImpl implements RAMNodeView {
	/**
	 * The cached value of the '{@link #getInternalRAMNode() <em>Internal RAM Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalRAMNode()
	 * @generated
	 * @ordered
	 */
	protected InternalRAMNode internalRAMNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RAMNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.RAM_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalRAMNode getInternalRAMNode() {
		if (internalRAMNode != null && internalRAMNode.eIsProxy()) {
			InternalEObject oldInternalRAMNode = (InternalEObject)internalRAMNode;
			internalRAMNode = (InternalRAMNode)eResolveProxy(oldInternalRAMNode);
			if (internalRAMNode != oldInternalRAMNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.RAM_NODE_VIEW__INTERNAL_RAM_NODE, oldInternalRAMNode, internalRAMNode));
			}
		}
		return internalRAMNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalRAMNode basicGetInternalRAMNode() {
		return internalRAMNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalRAMNode(InternalRAMNode newInternalRAMNode) {
		InternalRAMNode oldInternalRAMNode = internalRAMNode;
		internalRAMNode = newInternalRAMNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.RAM_NODE_VIEW__INTERNAL_RAM_NODE, oldInternalRAMNode, internalRAMNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowerConsumption() {
		return getInternalRAMNode().getPowerConsumption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerConsumption(final int _arg) {
		getInternalRAMNode().getElement().transact("Set PowerConsumption", () -> {
			getInternalRAMNode().setPowerConsumption(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return getInternalRAMNode().getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(final float _arg) {
		getInternalRAMNode().getElement().transact("Set Price", () -> {
			getInternalRAMNode().setPrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalRAMNode().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalRAMNode().getElement().transact("Set Name", () -> {
			getInternalRAMNode().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRamType() {
		return getInternalRAMNode().getRamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRamType(final String _arg) {
		getInternalRAMNode().getElement().transact("Set RamType", () -> {
			getInternalRAMNode().setRamType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return getInternalRAMNode().getCapacity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(final int _arg) {
		getInternalRAMNode().getElement().transact("Set Capacity", () -> {
			getInternalRAMNode().setCapacity(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.RAM_NODE_VIEW__INTERNAL_RAM_NODE:
				if (resolve) return getInternalRAMNode();
				return basicGetInternalRAMNode();
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
			case ViewsPackage.RAM_NODE_VIEW__INTERNAL_RAM_NODE:
				setInternalRAMNode((InternalRAMNode)newValue);
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
			case ViewsPackage.RAM_NODE_VIEW__INTERNAL_RAM_NODE:
				setInternalRAMNode((InternalRAMNode)null);
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
			case ViewsPackage.RAM_NODE_VIEW__INTERNAL_RAM_NODE:
				return internalRAMNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ViewsPackage.RAM_NODE_VIEW___GET_POWER_CONSUMPTION:
				return getPowerConsumption();
			case ViewsPackage.RAM_NODE_VIEW___SET_POWER_CONSUMPTION__INT:
				setPowerConsumption((Integer)arguments.get(0));
				return null;
			case ViewsPackage.RAM_NODE_VIEW___GET_PRICE:
				return getPrice();
			case ViewsPackage.RAM_NODE_VIEW___SET_PRICE__FLOAT:
				setPrice((Float)arguments.get(0));
				return null;
			case ViewsPackage.RAM_NODE_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.RAM_NODE_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ViewsPackage.RAM_NODE_VIEW___GET_RAM_TYPE:
				return getRamType();
			case ViewsPackage.RAM_NODE_VIEW___SET_RAM_TYPE__STRING:
				setRamType((String)arguments.get(0));
				return null;
			case ViewsPackage.RAM_NODE_VIEW___GET_CAPACITY:
				return getCapacity();
			case ViewsPackage.RAM_NODE_VIEW___SET_CAPACITY__INT:
				setCapacity((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RAMNodeViewImpl
