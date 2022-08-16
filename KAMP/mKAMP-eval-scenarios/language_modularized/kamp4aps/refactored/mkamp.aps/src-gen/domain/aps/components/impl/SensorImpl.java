/**
 */
package domain.aps.components.impl;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.PowerSupply;
import domain.aps.components.Sensor;

import domain.aps.interfaces.PhysicalConnection;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.impl.SensorImpl#getPhysicalconnection <em>Physicalconnection</em>}</li>
 *   <li>{@link domain.aps.components.impl.SensorImpl#getSignalinterface <em>Signalinterface</em>}</li>
 *   <li>{@link domain.aps.components.impl.SensorImpl#getPowersupply <em>Powersupply</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ComponentImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getPhysicalconnection() <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalconnection()
	 * @generated
	 * @ordered
	 */
	protected PhysicalConnection physicalconnection;

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
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powersupply;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection getPhysicalconnection() {
		if (physicalconnection != null && physicalconnection.eIsProxy()) {
			InternalEObject oldPhysicalconnection = (InternalEObject)physicalconnection;
			physicalconnection = (PhysicalConnection)eResolveProxy(oldPhysicalconnection);
			if (physicalconnection != oldPhysicalconnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.SENSOR__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
			}
		}
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection basicGetPhysicalconnection() {
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalconnection(PhysicalConnection newPhysicalconnection) {
		PhysicalConnection oldPhysicalconnection = physicalconnection;
		physicalconnection = newPhysicalconnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.SENSOR__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.SENSOR__SIGNALINTERFACE, oldSignalinterface, signalinterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.SENSOR__SIGNALINTERFACE, oldSignalinterface, signalinterface));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.SENSOR__POWERSUPPLY, oldPowersupply, powersupply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.SENSOR__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.SENSOR__PHYSICALCONNECTION:
				if (resolve) return getPhysicalconnection();
				return basicGetPhysicalconnection();
			case ComponentsPackage.SENSOR__SIGNALINTERFACE:
				if (resolve) return getSignalinterface();
				return basicGetSignalinterface();
			case ComponentsPackage.SENSOR__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
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
			case ComponentsPackage.SENSOR__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)newValue);
				return;
			case ComponentsPackage.SENSOR__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)newValue);
				return;
			case ComponentsPackage.SENSOR__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
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
			case ComponentsPackage.SENSOR__PHYSICALCONNECTION:
				setPhysicalconnection((PhysicalConnection)null);
				return;
			case ComponentsPackage.SENSOR__SIGNALINTERFACE:
				setSignalinterface((SignalInterface)null);
				return;
			case ComponentsPackage.SENSOR__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
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
			case ComponentsPackage.SENSOR__PHYSICALCONNECTION:
				return physicalconnection != null;
			case ComponentsPackage.SENSOR__SIGNALINTERFACE:
				return signalinterface != null;
			case ComponentsPackage.SENSOR__POWERSUPPLY:
				return powersupply != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
