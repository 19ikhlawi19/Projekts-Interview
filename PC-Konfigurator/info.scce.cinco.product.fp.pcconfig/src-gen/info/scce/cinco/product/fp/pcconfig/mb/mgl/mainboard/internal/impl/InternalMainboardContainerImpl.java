/**
 */
package info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalContainer;
import graphmodel.internal.InternalModelElementContainer;

import graphmodel.internal.impl.InternalContainerImpl;

import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalMainboardContainer;
import info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.InternalPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mainboard Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getNumPCIe16Slots <em>Num PC Ie16 Slots</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getPowerConsumption <em>Power Consumption</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getFormFactor <em>Form Factor</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getNumSataPorts <em>Num Sata Ports</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getSocket <em>Socket</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getChipset <em>Chipset</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getTypeMemorySlots <em>Type Memory Slots</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getNumMemorySlots <em>Num Memory Slots</em>}</li>
 *   <li>{@link info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.internal.impl.InternalMainboardContainerImpl#getLibraryComponentUID <em>Library Component UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalMainboardContainerImpl extends InternalContainerImpl implements InternalMainboardContainer {
	/**
	 * The default value of the '{@link #getNumPCIe16Slots() <em>Num PC Ie16 Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPCIe16Slots()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PC_IE16_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumPCIe16Slots() <em>Num PC Ie16 Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPCIe16Slots()
	 * @generated
	 * @ordered
	 */
	protected int numPCIe16Slots = NUM_PC_IE16_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_CONSUMPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected int powerConsumption = POWER_CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormFactor() <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormFactor() <em>Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactor()
	 * @generated
	 * @ordered
	 */
	protected String formFactor = FORM_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumSataPorts() <em>Num Sata Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSataPorts()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_SATA_PORTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumSataPorts() <em>Num Sata Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSataPorts()
	 * @generated
	 * @ordered
	 */
	protected int numSataPorts = NUM_SATA_PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocket() <em>Socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocket()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocket() <em>Socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocket()
	 * @generated
	 * @ordered
	 */
	protected String socket = SOCKET_EDEFAULT;

	/**
	 * The default value of the '{@link #getChipset() <em>Chipset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChipset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHIPSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChipset() <em>Chipset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChipset()
	 * @generated
	 * @ordered
	 */
	protected String chipset = CHIPSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeMemorySlots() <em>Type Memory Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMemorySlots()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_MEMORY_SLOTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeMemorySlots() <em>Type Memory Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMemorySlots()
	 * @generated
	 * @ordered
	 */
	protected String typeMemorySlots = TYPE_MEMORY_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumMemorySlots() <em>Num Memory Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMemorySlots()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_MEMORY_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumMemorySlots() <em>Num Memory Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMemorySlots()
	 * @generated
	 * @ordered
	 */
	protected int numMemorySlots = NUM_MEMORY_SLOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_COMPONENT_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryComponentUID() <em>Library Component UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryComponentUID()
	 * @generated
	 * @ordered
	 */
	protected String libraryComponentUID = LIBRARY_COMPONENT_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalMainboardContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InternalPackage.Literals.INTERNAL_MAINBOARD_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumPCIe16Slots() {
		return numPCIe16Slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumPCIe16Slots(int newNumPCIe16Slots) {
		int oldNumPCIe16Slots = numPCIe16Slots;
		numPCIe16Slots = newNumPCIe16Slots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_PC_IE16_SLOTS, oldNumPCIe16Slots, numPCIe16Slots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowerConsumption() {
		return powerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerConsumption(int newPowerConsumption) {
		int oldPowerConsumption = powerConsumption;
		powerConsumption = newPowerConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__POWER_CONSUMPTION, oldPowerConsumption, powerConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormFactor() {
		return formFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormFactor(String newFormFactor) {
		String oldFormFactor = formFactor;
		formFactor = newFormFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__FORM_FACTOR, oldFormFactor, formFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumSataPorts() {
		return numSataPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumSataPorts(int newNumSataPorts) {
		int oldNumSataPorts = numSataPorts;
		numSataPorts = newNumSataPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_SATA_PORTS, oldNumSataPorts, numSataPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocket() {
		return socket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocket(String newSocket) {
		String oldSocket = socket;
		socket = newSocket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__SOCKET, oldSocket, socket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChipset() {
		return chipset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChipset(String newChipset) {
		String oldChipset = chipset;
		chipset = newChipset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__CHIPSET, oldChipset, chipset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeMemorySlots() {
		return typeMemorySlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeMemorySlots(String newTypeMemorySlots) {
		String oldTypeMemorySlots = typeMemorySlots;
		typeMemorySlots = newTypeMemorySlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__TYPE_MEMORY_SLOTS, oldTypeMemorySlots, typeMemorySlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumMemorySlots() {
		return numMemorySlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumMemorySlots(int newNumMemorySlots) {
		int oldNumMemorySlots = numMemorySlots;
		numMemorySlots = newNumMemorySlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_MEMORY_SLOTS, oldNumMemorySlots, numMemorySlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibraryComponentUID() {
		return libraryComponentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryComponentUID(String newLibraryComponentUID) {
		String oldLibraryComponentUID = libraryComponentUID;
		libraryComponentUID = newLibraryComponentUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InternalPackage.INTERNAL_MAINBOARD_CONTAINER__LIBRARY_COMPONENT_UID, oldLibraryComponentUID, libraryComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainmentConstraint> getContainmentConstraints() {
		 org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>constraints =
			new org.eclipse.emf.common.util.BasicEList<ContainmentConstraint>();
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.CPUSlot.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.RAMSlot.class));
		constraints.add(new ContainmentConstraint(0,-1,info.scce.cinco.product.fp.pcconfig.mb.mgl.mainboard.GPUSlot.class));
		return constraints;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getReferencedMB() {
		String uid = getLibraryComponentUID();
		return  de.jabc.cinco.meta.core.referenceregistry.ReferenceRegistry.getInstance().getEObject(uid);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_PC_IE16_SLOTS:
				return getNumPCIe16Slots();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__POWER_CONSUMPTION:
				return getPowerConsumption();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__FORM_FACTOR:
				return getFormFactor();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__PRICE:
				return getPrice();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_SATA_PORTS:
				return getNumSataPorts();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NAME:
				return getName();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__SOCKET:
				return getSocket();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__CHIPSET:
				return getChipset();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__TYPE_MEMORY_SLOTS:
				return getTypeMemorySlots();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_MEMORY_SLOTS:
				return getNumMemorySlots();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__LIBRARY_COMPONENT_UID:
				return getLibraryComponentUID();
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
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_PC_IE16_SLOTS:
				setNumPCIe16Slots((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__POWER_CONSUMPTION:
				setPowerConsumption((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__FORM_FACTOR:
				setFormFactor((String)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__PRICE:
				setPrice((Float)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_SATA_PORTS:
				setNumSataPorts((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__SOCKET:
				setSocket((String)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__CHIPSET:
				setChipset((String)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__TYPE_MEMORY_SLOTS:
				setTypeMemorySlots((String)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_MEMORY_SLOTS:
				setNumMemorySlots((Integer)newValue);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID((String)newValue);
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
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_PC_IE16_SLOTS:
				setNumPCIe16Slots(NUM_PC_IE16_SLOTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__POWER_CONSUMPTION:
				setPowerConsumption(POWER_CONSUMPTION_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__FORM_FACTOR:
				setFormFactor(FORM_FACTOR_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_SATA_PORTS:
				setNumSataPorts(NUM_SATA_PORTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__SOCKET:
				setSocket(SOCKET_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__CHIPSET:
				setChipset(CHIPSET_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__TYPE_MEMORY_SLOTS:
				setTypeMemorySlots(TYPE_MEMORY_SLOTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_MEMORY_SLOTS:
				setNumMemorySlots(NUM_MEMORY_SLOTS_EDEFAULT);
				return;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__LIBRARY_COMPONENT_UID:
				setLibraryComponentUID(LIBRARY_COMPONENT_UID_EDEFAULT);
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
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_PC_IE16_SLOTS:
				return numPCIe16Slots != NUM_PC_IE16_SLOTS_EDEFAULT;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__POWER_CONSUMPTION:
				return powerConsumption != POWER_CONSUMPTION_EDEFAULT;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__FORM_FACTOR:
				return FORM_FACTOR_EDEFAULT == null ? formFactor != null : !FORM_FACTOR_EDEFAULT.equals(formFactor);
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__PRICE:
				return price != PRICE_EDEFAULT;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_SATA_PORTS:
				return numSataPorts != NUM_SATA_PORTS_EDEFAULT;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__SOCKET:
				return SOCKET_EDEFAULT == null ? socket != null : !SOCKET_EDEFAULT.equals(socket);
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__CHIPSET:
				return CHIPSET_EDEFAULT == null ? chipset != null : !CHIPSET_EDEFAULT.equals(chipset);
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__TYPE_MEMORY_SLOTS:
				return TYPE_MEMORY_SLOTS_EDEFAULT == null ? typeMemorySlots != null : !TYPE_MEMORY_SLOTS_EDEFAULT.equals(typeMemorySlots);
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__NUM_MEMORY_SLOTS:
				return numMemorySlots != NUM_MEMORY_SLOTS_EDEFAULT;
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER__LIBRARY_COMPONENT_UID:
				return LIBRARY_COMPONENT_UID_EDEFAULT == null ? libraryComponentUID != null : !LIBRARY_COMPONENT_UID_EDEFAULT.equals(libraryComponentUID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == InternalModelElementContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_MODEL_ELEMENT_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_MAINBOARD_CONTAINER___GET_CONTAINMENT_CONSTRAINTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == InternalContainer.class) {
			switch (baseOperationID) {
				case graphmodel.internal.InternalPackage.INTERNAL_CONTAINER___GET_CONTAINMENT_CONSTRAINTS: return InternalPackage.INTERNAL_MAINBOARD_CONTAINER___GET_CONTAINMENT_CONSTRAINTS;
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
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER___GET_CONTAINMENT_CONSTRAINTS:
				return getContainmentConstraints();
			case InternalPackage.INTERNAL_MAINBOARD_CONTAINER___GET_REFERENCED_MB:
				return getReferencedMB();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (numPCIe16Slots: ");
		result.append(numPCIe16Slots);
		result.append(", powerConsumption: ");
		result.append(powerConsumption);
		result.append(", formFactor: ");
		result.append(formFactor);
		result.append(", price: ");
		result.append(price);
		result.append(", numSataPorts: ");
		result.append(numSataPorts);
		result.append(", name: ");
		result.append(name);
		result.append(", socket: ");
		result.append(socket);
		result.append(", chipset: ");
		result.append(chipset);
		result.append(", typeMemorySlots: ");
		result.append(typeMemorySlots);
		result.append(", numMemorySlots: ");
		result.append(numMemorySlots);
		result.append(", libraryComponentUID: ");
		result.append(libraryComponentUID);
		result.append(')');
		return result.toString();
	}

} //InternalMainboardContainerImpl
