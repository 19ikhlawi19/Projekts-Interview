/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboardContainer;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.MainboardContainerView;
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
 * An implementation of the model object '<em><b>Mainboard Container View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.views.impl.MainboardContainerViewImpl#getInternalMainboardContainer <em>Internal Mainboard Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainboardContainerViewImpl extends EObjectImpl implements MainboardContainerView {
	/**
	 * The cached value of the '{@link #getInternalMainboardContainer() <em>Internal Mainboard Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMainboardContainer()
	 * @generated
	 * @ordered
	 */
	protected InternalMainboardContainer internalMainboardContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainboardContainerViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.MAINBOARD_CONTAINER_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalMainboardContainer getInternalMainboardContainer() {
		if (internalMainboardContainer != null && internalMainboardContainer.eIsProxy()) {
			InternalEObject oldInternalMainboardContainer = (InternalEObject)internalMainboardContainer;
			internalMainboardContainer = (InternalMainboardContainer)eResolveProxy(oldInternalMainboardContainer);
			if (internalMainboardContainer != oldInternalMainboardContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER, oldInternalMainboardContainer, internalMainboardContainer));
			}
		}
		return internalMainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalMainboardContainer basicGetInternalMainboardContainer() {
		return internalMainboardContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalMainboardContainer(InternalMainboardContainer newInternalMainboardContainer) {
		InternalMainboardContainer oldInternalMainboardContainer = internalMainboardContainer;
		internalMainboardContainer = newInternalMainboardContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER, oldInternalMainboardContainer, internalMainboardContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumPCIe16Slots() {
		return getInternalMainboardContainer().getNumPCIe16Slots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumPCIe16Slots(final int _arg) {
		getInternalMainboardContainer().getElement().transact("Set NumPCIe16Slots", () -> {
			getInternalMainboardContainer().setNumPCIe16Slots(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowerConsumption() {
		return getInternalMainboardContainer().getPowerConsumption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerConsumption(final int _arg) {
		getInternalMainboardContainer().getElement().transact("Set PowerConsumption", () -> {
			getInternalMainboardContainer().setPowerConsumption(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormFactor() {
		return getInternalMainboardContainer().getFormFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormFactor(final String _arg) {
		getInternalMainboardContainer().getElement().transact("Set FormFactor", () -> {
			getInternalMainboardContainer().setFormFactor(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return getInternalMainboardContainer().getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(final float _arg) {
		getInternalMainboardContainer().getElement().transact("Set Price", () -> {
			getInternalMainboardContainer().setPrice(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumSataPorts() {
		return getInternalMainboardContainer().getNumSataPorts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumSataPorts(final int _arg) {
		getInternalMainboardContainer().getElement().transact("Set NumSataPorts", () -> {
			getInternalMainboardContainer().setNumSataPorts(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return getInternalMainboardContainer().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String _arg) {
		getInternalMainboardContainer().getElement().transact("Set Name", () -> {
			getInternalMainboardContainer().setName(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocket() {
		return getInternalMainboardContainer().getSocket();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocket(final String _arg) {
		getInternalMainboardContainer().getElement().transact("Set Socket", () -> {
			getInternalMainboardContainer().setSocket(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChipset() {
		return getInternalMainboardContainer().getChipset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChipset(final String _arg) {
		getInternalMainboardContainer().getElement().transact("Set Chipset", () -> {
			getInternalMainboardContainer().setChipset(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeMemorySlots() {
		return getInternalMainboardContainer().getTypeMemorySlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeMemorySlots(final String _arg) {
		getInternalMainboardContainer().getElement().transact("Set TypeMemorySlots", () -> {
			getInternalMainboardContainer().setTypeMemorySlots(_arg);
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumMemorySlots() {
		return getInternalMainboardContainer().getNumMemorySlots();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumMemorySlots(final int _arg) {
		getInternalMainboardContainer().getElement().transact("Set NumMemorySlots", () -> {
			getInternalMainboardContainer().setNumMemorySlots(_arg);
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
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER:
				if (resolve) return getInternalMainboardContainer();
				return basicGetInternalMainboardContainer();
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
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER:
				setInternalMainboardContainer((InternalMainboardContainer)newValue);
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
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER:
				setInternalMainboardContainer((InternalMainboardContainer)null);
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
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW__INTERNAL_MAINBOARD_CONTAINER:
				return internalMainboardContainer != null;
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
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_NUM_PC_IE16_SLOTS:
				return getNumPCIe16Slots();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_NUM_PC_IE16_SLOTS__INT:
				setNumPCIe16Slots((Integer)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_POWER_CONSUMPTION:
				return getPowerConsumption();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_POWER_CONSUMPTION__INT:
				setPowerConsumption((Integer)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_FORM_FACTOR:
				return getFormFactor();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_FORM_FACTOR__STRING:
				setFormFactor((String)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_PRICE:
				return getPrice();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_PRICE__FLOAT:
				setPrice((Float)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_NUM_SATA_PORTS:
				return getNumSataPorts();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_NUM_SATA_PORTS__INT:
				setNumSataPorts((Integer)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_NAME:
				return getName();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_NAME__STRING:
				setName((String)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_SOCKET:
				return getSocket();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_SOCKET__STRING:
				setSocket((String)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_CHIPSET:
				return getChipset();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_CHIPSET__STRING:
				setChipset((String)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_TYPE_MEMORY_SLOTS:
				return getTypeMemorySlots();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_TYPE_MEMORY_SLOTS__STRING:
				setTypeMemorySlots((String)arguments.get(0));
				return null;
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___GET_NUM_MEMORY_SLOTS:
				return getNumMemorySlots();
			case ViewsPackage.MAINBOARD_CONTAINER_VIEW___SET_NUM_MEMORY_SLOTS__INT:
				setNumMemorySlots((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MainboardContainerViewImpl
