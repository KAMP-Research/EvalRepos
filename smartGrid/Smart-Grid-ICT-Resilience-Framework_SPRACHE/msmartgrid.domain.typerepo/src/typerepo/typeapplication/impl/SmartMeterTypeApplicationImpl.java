/**
 */
package typerepo.typeapplication.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import topo.SmartMeter;

import typerepo.SmartMeterType;

import typerepo.typeapplication.SmartMeterTypeApplication;
import typerepo.typeapplication.TypeapplicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Meter Type Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.impl.SmartMeterTypeApplicationImpl#getSmartmetertype <em>Smartmetertype</em>}</li>
 *   <li>{@link typerepo.typeapplication.impl.SmartMeterTypeApplicationImpl#getNetworknode <em>Networknode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartMeterTypeApplicationImpl extends MinimalEObjectImpl.Container implements SmartMeterTypeApplication {
	/**
	 * The cached value of the '{@link #getSmartmetertype() <em>Smartmetertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartmetertype()
	 * @generated
	 * @ordered
	 */
	protected SmartMeterType smartmetertype;

	/**
	 * The cached value of the '{@link #getNetworknode() <em>Networknode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworknode()
	 * @generated
	 * @ordered
	 */
	protected SmartMeter networknode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartMeterTypeApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeapplicationPackage.Literals.SMART_METER_TYPE_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeterType getSmartmetertype() {
		if (smartmetertype != null && smartmetertype.eIsProxy()) {
			InternalEObject oldSmartmetertype = (InternalEObject)smartmetertype;
			smartmetertype = (SmartMeterType)eResolveProxy(oldSmartmetertype);
			if (smartmetertype != oldSmartmetertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE, oldSmartmetertype, smartmetertype));
			}
		}
		return smartmetertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeterType basicGetSmartmetertype() {
		return smartmetertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmartmetertype(SmartMeterType newSmartmetertype) {
		SmartMeterType oldSmartmetertype = smartmetertype;
		smartmetertype = newSmartmetertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE, oldSmartmetertype, smartmetertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeter getNetworknode() {
		if (networknode != null && networknode.eIsProxy()) {
			InternalEObject oldNetworknode = (InternalEObject)networknode;
			networknode = (SmartMeter)eResolveProxy(oldNetworknode);
			if (networknode != oldNetworknode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__NETWORKNODE, oldNetworknode, networknode));
			}
		}
		return networknode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeter basicGetNetworknode() {
		return networknode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworknode(SmartMeter newNetworknode) {
		SmartMeter oldNetworknode = networknode;
		networknode = newNetworknode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__NETWORKNODE, oldNetworknode, networknode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE:
				if (resolve) return getSmartmetertype();
				return basicGetSmartmetertype();
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__NETWORKNODE:
				if (resolve) return getNetworknode();
				return basicGetNetworknode();
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
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE:
				setSmartmetertype((SmartMeterType)newValue);
				return;
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__NETWORKNODE:
				setNetworknode((SmartMeter)newValue);
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
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE:
				setSmartmetertype((SmartMeterType)null);
				return;
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__NETWORKNODE:
				setNetworknode((SmartMeter)null);
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
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__SMARTMETERTYPE:
				return smartmetertype != null;
			case TypeapplicationPackage.SMART_METER_TYPE_APPLICATION__NETWORKNODE:
				return networknode != null;
		}
		return super.eIsSet(featureID);
	}

} //SmartMeterTypeApplicationImpl
