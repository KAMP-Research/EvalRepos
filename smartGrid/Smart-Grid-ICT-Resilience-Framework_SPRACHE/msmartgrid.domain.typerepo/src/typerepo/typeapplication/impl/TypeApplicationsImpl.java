/**
 */
package typerepo.typeapplication.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typerepo.typeapplication.ConnectionTypeApplication;
import typerepo.typeapplication.NetworkNodeTypeApplication;
import typerepo.typeapplication.SmartMeterTypeApplication;
import typerepo.typeapplication.TypeApplications;
import typerepo.typeapplication.TypeapplicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Applications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.impl.TypeApplicationsImpl#getNetworknodetypeapplication <em>Networknodetypeapplication</em>}</li>
 *   <li>{@link typerepo.typeapplication.impl.TypeApplicationsImpl#getConnectiontypeapplication <em>Connectiontypeapplication</em>}</li>
 *   <li>{@link typerepo.typeapplication.impl.TypeApplicationsImpl#getTypeapplications <em>Typeapplications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeApplicationsImpl extends MinimalEObjectImpl.Container implements TypeApplications {
	/**
	 * The cached value of the '{@link #getNetworknodetypeapplication() <em>Networknodetypeapplication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworknodetypeapplication()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartMeterTypeApplication> networknodetypeapplication;

	/**
	 * The cached value of the '{@link #getConnectiontypeapplication() <em>Connectiontypeapplication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectiontypeapplication()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkNodeTypeApplication> connectiontypeapplication;

	/**
	 * The cached value of the '{@link #getTypeapplications() <em>Typeapplications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeapplications()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionTypeApplication> typeapplications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeApplicationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeapplicationPackage.Literals.TYPE_APPLICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartMeterTypeApplication> getNetworknodetypeapplication() {
		if (networknodetypeapplication == null) {
			networknodetypeapplication = new EObjectContainmentEList<SmartMeterTypeApplication>(SmartMeterTypeApplication.class, this, TypeapplicationPackage.TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION);
		}
		return networknodetypeapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkNodeTypeApplication> getConnectiontypeapplication() {
		if (connectiontypeapplication == null) {
			connectiontypeapplication = new EObjectContainmentEList<NetworkNodeTypeApplication>(NetworkNodeTypeApplication.class, this, TypeapplicationPackage.TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION);
		}
		return connectiontypeapplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionTypeApplication> getTypeapplications() {
		if (typeapplications == null) {
			typeapplications = new EObjectContainmentEList<ConnectionTypeApplication>(ConnectionTypeApplication.class, this, TypeapplicationPackage.TYPE_APPLICATIONS__TYPEAPPLICATIONS);
		}
		return typeapplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypeapplicationPackage.TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION:
				return ((InternalEList<?>)getNetworknodetypeapplication()).basicRemove(otherEnd, msgs);
			case TypeapplicationPackage.TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION:
				return ((InternalEList<?>)getConnectiontypeapplication()).basicRemove(otherEnd, msgs);
			case TypeapplicationPackage.TYPE_APPLICATIONS__TYPEAPPLICATIONS:
				return ((InternalEList<?>)getTypeapplications()).basicRemove(otherEnd, msgs);
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
			case TypeapplicationPackage.TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION:
				return getNetworknodetypeapplication();
			case TypeapplicationPackage.TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION:
				return getConnectiontypeapplication();
			case TypeapplicationPackage.TYPE_APPLICATIONS__TYPEAPPLICATIONS:
				return getTypeapplications();
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
			case TypeapplicationPackage.TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION:
				getNetworknodetypeapplication().clear();
				getNetworknodetypeapplication().addAll((Collection<? extends SmartMeterTypeApplication>)newValue);
				return;
			case TypeapplicationPackage.TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION:
				getConnectiontypeapplication().clear();
				getConnectiontypeapplication().addAll((Collection<? extends NetworkNodeTypeApplication>)newValue);
				return;
			case TypeapplicationPackage.TYPE_APPLICATIONS__TYPEAPPLICATIONS:
				getTypeapplications().clear();
				getTypeapplications().addAll((Collection<? extends ConnectionTypeApplication>)newValue);
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
			case TypeapplicationPackage.TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION:
				getNetworknodetypeapplication().clear();
				return;
			case TypeapplicationPackage.TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION:
				getConnectiontypeapplication().clear();
				return;
			case TypeapplicationPackage.TYPE_APPLICATIONS__TYPEAPPLICATIONS:
				getTypeapplications().clear();
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
			case TypeapplicationPackage.TYPE_APPLICATIONS__NETWORKNODETYPEAPPLICATION:
				return networknodetypeapplication != null && !networknodetypeapplication.isEmpty();
			case TypeapplicationPackage.TYPE_APPLICATIONS__CONNECTIONTYPEAPPLICATION:
				return connectiontypeapplication != null && !connectiontypeapplication.isEmpty();
			case TypeapplicationPackage.TYPE_APPLICATIONS__TYPEAPPLICATIONS:
				return typeapplications != null && !typeapplications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeApplicationsImpl
