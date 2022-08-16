/**
 */
package domain.ppu.ppumodules.impl;

import domain.aps.buscomponents.BusSlave;

import domain.aps.components.TurningTable;

import domain.aps.electroniccomponents.MicroSwitch;

import domain.as.ModuleRepository.impl.ModuleImpl;

import domain.ppu.ppumodules.MicroswitchModule;
import domain.ppu.ppumodules.PpumodulesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microswitch Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.impl.MicroswitchModuleImpl#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.impl.MicroswitchModuleImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.impl.MicroswitchModuleImpl#getTurningtable <em>Turningtable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroswitchModuleImpl extends ModuleImpl implements MicroswitchModule {
	/**
	 * The cached value of the '{@link #getBusSlave() <em>Bus Slave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSlave()
	 * @generated
	 * @ordered
	 */
	protected EList<BusSlave> busSlave;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected MicroSwitch switch_;

	/**
	 * The cached value of the '{@link #getTurningtable() <em>Turningtable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurningtable()
	 * @generated
	 * @ordered
	 */
	protected TurningTable turningtable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroswitchModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpumodulesPackage.Literals.MICROSWITCH_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusSlave> getBusSlave() {
		if (busSlave == null) {
			busSlave = new EObjectContainmentEList<BusSlave>(BusSlave.class, this, PpumodulesPackage.MICROSWITCH_MODULE__BUS_SLAVE);
		}
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroSwitch getSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitch(MicroSwitch newSwitch, NotificationChain msgs) {
		MicroSwitch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PpumodulesPackage.MICROSWITCH_MODULE__SWITCH, oldSwitch, newSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch(MicroSwitch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null)
				msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PpumodulesPackage.MICROSWITCH_MODULE__SWITCH, null, msgs);
			if (newSwitch != null)
				msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PpumodulesPackage.MICROSWITCH_MODULE__SWITCH, null, msgs);
			msgs = basicSetSwitch(newSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PpumodulesPackage.MICROSWITCH_MODULE__SWITCH, newSwitch, newSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTable getTurningtable() {
		if (turningtable != null && turningtable.eIsProxy()) {
			InternalEObject oldTurningtable = (InternalEObject)turningtable;
			turningtable = (TurningTable)eResolveProxy(oldTurningtable);
			if (turningtable != oldTurningtable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PpumodulesPackage.MICROSWITCH_MODULE__TURNINGTABLE, oldTurningtable, turningtable));
			}
		}
		return turningtable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurningTable basicGetTurningtable() {
		return turningtable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurningtable(TurningTable newTurningtable) {
		TurningTable oldTurningtable = turningtable;
		turningtable = newTurningtable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PpumodulesPackage.MICROSWITCH_MODULE__TURNINGTABLE, oldTurningtable, turningtable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PpumodulesPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				return ((InternalEList<?>)getBusSlave()).basicRemove(otherEnd, msgs);
			case PpumodulesPackage.MICROSWITCH_MODULE__SWITCH:
				return basicSetSwitch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PpumodulesPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				return getBusSlave();
			case PpumodulesPackage.MICROSWITCH_MODULE__SWITCH:
				return getSwitch();
			case PpumodulesPackage.MICROSWITCH_MODULE__TURNINGTABLE:
				if (resolve) return getTurningtable();
				return basicGetTurningtable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PpumodulesPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				getBusSlave().clear();
				getBusSlave().addAll((Collection<? extends BusSlave>)newValue);
				return;
			case PpumodulesPackage.MICROSWITCH_MODULE__SWITCH:
				setSwitch((MicroSwitch)newValue);
				return;
			case PpumodulesPackage.MICROSWITCH_MODULE__TURNINGTABLE:
				setTurningtable((TurningTable)newValue);
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
			case PpumodulesPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				getBusSlave().clear();
				return;
			case PpumodulesPackage.MICROSWITCH_MODULE__SWITCH:
				setSwitch((MicroSwitch)null);
				return;
			case PpumodulesPackage.MICROSWITCH_MODULE__TURNINGTABLE:
				setTurningtable((TurningTable)null);
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
			case PpumodulesPackage.MICROSWITCH_MODULE__BUS_SLAVE:
				return busSlave != null && !busSlave.isEmpty();
			case PpumodulesPackage.MICROSWITCH_MODULE__SWITCH:
				return switch_ != null;
			case PpumodulesPackage.MICROSWITCH_MODULE__TURNINGTABLE:
				return turningtable != null;
		}
		return super.eIsSet(featureID);
	}

} //MicroswitchModuleImpl
