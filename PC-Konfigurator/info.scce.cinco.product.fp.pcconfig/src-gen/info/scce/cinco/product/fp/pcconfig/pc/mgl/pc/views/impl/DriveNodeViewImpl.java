/**
 */
package info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.internal.InternalDriveNode;

import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.DriveNodeView;
import info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.ViewsPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive Node View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.pc.mgl.pc.views.impl.DriveNodeViewImpl#getInternalDriveNode <em>Internal Drive Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriveNodeViewImpl extends EObjectImpl implements DriveNodeView {
	/**
	 * The cached value of the '{@link #getInternalDriveNode() <em>Internal Drive Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDriveNode()
	 * @generated
	 * @ordered
	 */
	protected InternalDriveNode internalDriveNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveNodeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DRIVE_NODE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalDriveNode getInternalDriveNode() {
		if (internalDriveNode != null && internalDriveNode.eIsProxy()) {
			InternalEObject oldInternalDriveNode = (InternalEObject)internalDriveNode;
			internalDriveNode = (InternalDriveNode)eResolveProxy(oldInternalDriveNode);
			if (internalDriveNode != oldInternalDriveNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE, oldInternalDriveNode, internalDriveNode));
			}
		}
		return internalDriveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDriveNode basicGetInternalDriveNode() {
		return internalDriveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalDriveNode(InternalDriveNode newInternalDriveNode) {
		InternalDriveNode oldInternalDriveNode = internalDriveNode;
		internalDriveNode = newInternalDriveNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE, oldInternalDriveNode, internalDriveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveDescription() {
		return getInternalDriveNode().getDriveDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveDescription(final String _arg) {
		getInternalDriveNode().getElement().transact("Set DriveDescription", () -> {
			getInternalDriveNode().setDriveDescription(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDrivePowerConsumption() {
		return getInternalDriveNode().getDrivePowerConsumption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrivePowerConsumption(final int _arg) {
		getInternalDriveNode().getElement().transact("Set DrivePowerConsumption", () -> {
			getInternalDriveNode().setDrivePowerConsumption(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDrivePrice() {
		return getInternalDriveNode().getDrivePrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDrivePrice(final float _arg) {
		getInternalDriveNode().getElement().transact("Set DrivePrice", () -> {
			getInternalDriveNode().setDrivePrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveType() {
		return getInternalDriveNode().getDriveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveType(final String _arg) {
		getInternalDriveNode().getElement().transact("Set DriveType", () -> {
			getInternalDriveNode().setDriveType(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriveName() {
		return getInternalDriveNode().getDriveName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriveName(final String _arg) {
		getInternalDriveNode().getElement().transact("Set DriveName", () -> {
			getInternalDriveNode().setDriveName(_arg);
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
			case ViewsPackage.DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE:
				if (resolve) return getInternalDriveNode();
				return basicGetInternalDriveNode();
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
			case ViewsPackage.DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE:
				setInternalDriveNode((InternalDriveNode)newValue);
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
			case ViewsPackage.DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE:
				setInternalDriveNode((InternalDriveNode)null);
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
			case ViewsPackage.DRIVE_NODE_VIEW__INTERNAL_DRIVE_NODE:
				return internalDriveNode != null;
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
			case ViewsPackage.DRIVE_NODE_VIEW___GET_DRIVE_DESCRIPTION:
				return getDriveDescription();
			case ViewsPackage.DRIVE_NODE_VIEW___SET_DRIVE_DESCRIPTION__STRING:
				setDriveDescription((String)arguments.get(0));
				return null;
			case ViewsPackage.DRIVE_NODE_VIEW___GET_DRIVE_POWER_CONSUMPTION:
				return getDrivePowerConsumption();
			case ViewsPackage.DRIVE_NODE_VIEW___SET_DRIVE_POWER_CONSUMPTION__INT:
				setDrivePowerConsumption((Integer)arguments.get(0));
				return null;
			case ViewsPackage.DRIVE_NODE_VIEW___GET_DRIVE_PRICE:
				return getDrivePrice();
			case ViewsPackage.DRIVE_NODE_VIEW___SET_DRIVE_PRICE__FLOAT:
				setDrivePrice((Float)arguments.get(0));
				return null;
			case ViewsPackage.DRIVE_NODE_VIEW___GET_DRIVE_TYPE:
				return getDriveType();
			case ViewsPackage.DRIVE_NODE_VIEW___SET_DRIVE_TYPE__STRING:
				setDriveType((String)arguments.get(0));
				return null;
			case ViewsPackage.DRIVE_NODE_VIEW___GET_DRIVE_NAME:
				return getDriveName();
			case ViewsPackage.DRIVE_NODE_VIEW___SET_DRIVE_NAME__STRING:
				setDriveName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DriveNodeViewImpl
