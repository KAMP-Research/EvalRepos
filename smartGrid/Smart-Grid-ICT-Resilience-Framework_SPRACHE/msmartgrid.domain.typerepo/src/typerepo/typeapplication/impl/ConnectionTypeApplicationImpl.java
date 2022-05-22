/**
 */
package typerepo.typeapplication.impl;

import graph.PhysicalConnection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import typerepo.ConnectionType;

import typerepo.typeapplication.ConnectionTypeApplication;
import typerepo.typeapplication.TypeapplicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Type Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.impl.ConnectionTypeApplicationImpl#getConnectiontype <em>Connectiontype</em>}</li>
 *   <li>{@link typerepo.typeapplication.impl.ConnectionTypeApplicationImpl#getSmartmeter <em>Smartmeter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionTypeApplicationImpl extends MinimalEObjectImpl.Container implements ConnectionTypeApplication {
	/**
	 * The cached value of the '{@link #getConnectiontype() <em>Connectiontype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectiontype()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connectiontype;

	/**
	 * The cached value of the '{@link #getSmartmeter() <em>Smartmeter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartmeter()
	 * @generated
	 * @ordered
	 */
	protected PhysicalConnection smartmeter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionTypeApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeapplicationPackage.Literals.CONNECTION_TYPE_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getConnectiontype() {
		if (connectiontype != null && connectiontype.eIsProxy()) {
			InternalEObject oldConnectiontype = (InternalEObject)connectiontype;
			connectiontype = (ConnectionType)eResolveProxy(oldConnectiontype);
			if (connectiontype != oldConnectiontype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE, oldConnectiontype, connectiontype));
			}
		}
		return connectiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType basicGetConnectiontype() {
		return connectiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectiontype(ConnectionType newConnectiontype) {
		ConnectionType oldConnectiontype = connectiontype;
		connectiontype = newConnectiontype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE, oldConnectiontype, connectiontype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection getSmartmeter() {
		if (smartmeter != null && smartmeter.eIsProxy()) {
			InternalEObject oldSmartmeter = (InternalEObject)smartmeter;
			smartmeter = (PhysicalConnection)eResolveProxy(oldSmartmeter);
			if (smartmeter != oldSmartmeter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__SMARTMETER, oldSmartmeter, smartmeter));
			}
		}
		return smartmeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection basicGetSmartmeter() {
		return smartmeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmartmeter(PhysicalConnection newSmartmeter) {
		PhysicalConnection oldSmartmeter = smartmeter;
		smartmeter = newSmartmeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__SMARTMETER, oldSmartmeter, smartmeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE:
				if (resolve) return getConnectiontype();
				return basicGetConnectiontype();
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__SMARTMETER:
				if (resolve) return getSmartmeter();
				return basicGetSmartmeter();
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
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE:
				setConnectiontype((ConnectionType)newValue);
				return;
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__SMARTMETER:
				setSmartmeter((PhysicalConnection)newValue);
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
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE:
				setConnectiontype((ConnectionType)null);
				return;
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__SMARTMETER:
				setSmartmeter((PhysicalConnection)null);
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
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__CONNECTIONTYPE:
				return connectiontype != null;
			case TypeapplicationPackage.CONNECTION_TYPE_APPLICATION__SMARTMETER:
				return smartmeter != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionTypeApplicationImpl
