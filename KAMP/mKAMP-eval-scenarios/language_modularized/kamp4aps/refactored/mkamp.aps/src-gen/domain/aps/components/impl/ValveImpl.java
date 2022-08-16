/**
 */
package domain.aps.components.impl;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.PowerSupply;
import domain.aps.components.Valve;

import domain.aps.interfaces.PneumaticSupply;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.impl.ValveImpl#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link domain.aps.components.impl.ValveImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link domain.aps.components.impl.ValveImpl#getSignalinterface <em>Signalinterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValveImpl extends ComponentImpl implements Valve {
	/**
	 * The cached value of the '{@link #getPneumaticsupply() <em>Pneumaticsupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPneumaticsupply()
	 * @generated
	 * @ordered
	 */
	protected PneumaticSupply pneumaticsupply;

	/**
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powersupply;

	/**
	 * The cached value of the '{@link #getSignalinterface() <em>Signalinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalinterface()
	 * @generated
	 * @ordered
	 */
	protected SignalInterface signalinterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.VALVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply getPneumaticsupply() {
		if (pneumaticsupply != null && pneumaticsupply.eIsProxy()) {
			InternalEObject oldPneumaticsupply = (InternalEObject)pneumaticsupply;
			pneumaticsupply = (PneumaticSupply)eResolveProxy(oldPneumaticsupply);
			if (pneumaticsupply != oldPneumaticsupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.VALVE__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
			}
		}
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply basicGetPneumaticsupply() {
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPneumaticsupply(PneumaticSupply newPneumaticsupply) {
		PneumaticSupply oldPneumaticsupply = pneumaticsupply;
		pneumaticsupply = newPneumaticsupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.VALVE__PNEUMATICSUPPLY, oldPneumaticsupply, pneumaticsupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply getPowersupply() {
		if (powersupply != null && powersupply.eIsProxy()) {
			InternalEObject oldPowersupply = (InternalEObject)powersupply;
			powersupply = (PowerSupply)eResolveProxy(oldPowersupply);
			if (powersupply != oldPowersupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.VALVE__POWERSUPPLY, oldPowersupply, powersupply));
			}
		}
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply basicGetPowersupply() {
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowersupply(PowerSupply newPowersupply) {
		PowerSupply oldPowersupply = powersupply;
		powersupply = newPowersupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.VALVE__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface getSignalinterface() {
		if (signalinterface != null && signalinterface.eIsProxy()) {
			InternalEObject oldSignalinterface = (InternalEObject)signalinterface;
			signalinterface = (SignalInterface)eResolveProxy(oldSignalinterface);
			if (signalinterface != oldSignalinterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.VALVE__SIGNALINTERFACE, oldSignalinterface, signalinterface));
			}
		}
		return signalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInterface basicGetSignalinterface() {
		return signalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalinterface(SignalInterface newSignalinterface) {
		SignalInterface oldSignalinterface = signalinterface;
		signalinterface = newSignalinterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.VALVE__SIGNALINTERFACE, oldSignalinterface, signalinterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.VALVE__PNEUMATICSUPPLY:
				if (resolve) return getPneumaticsupply();
				return basicGetPneumaticsupply();
			case ComponentsPackage.VALVE__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
			case ComponentsPackage.VALVE__SIGNALINTERFACE:
				if (resolve) return getSignalinterface();
				return basicGetSignalinterface();
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
			case ComponentsPackage.VALVE__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)newValue);
				return;
			case ComponentsPackage.VALVE__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
				return;
			case ComponentsPackage.VALVE__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)newValue);
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
			case ComponentsPackage.VALVE__PNEUMATICSUPPLY:
				setPneumaticsupply((PneumaticSupply)null);
				return;
			case ComponentsPackage.VALVE__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
				return;
			case ComponentsPackage.VALVE__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)null);
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
			case ComponentsPackage.VALVE__PNEUMATICSUPPLY:
				return pneumaticsupply != null;
			case ComponentsPackage.VALVE__POWERSUPPLY:
				return powersupply != null;
			case ComponentsPackage.VALVE__SIGNALINTERFACE:
				return signalinterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ValveImpl
