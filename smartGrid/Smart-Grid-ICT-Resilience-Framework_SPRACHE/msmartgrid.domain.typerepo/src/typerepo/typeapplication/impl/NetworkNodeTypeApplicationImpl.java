/**
 */
package typerepo.typeapplication.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import topo.NetworkNode;

import typerepo.NetworkNodeType;

import typerepo.typeapplication.NetworkNodeTypeApplication;
import typerepo.typeapplication.TypeapplicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Node Type Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.impl.NetworkNodeTypeApplicationImpl#getNetworknodetype <em>Networknodetype</em>}</li>
 *   <li>{@link typerepo.typeapplication.impl.NetworkNodeTypeApplicationImpl#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkNodeTypeApplicationImpl extends MinimalEObjectImpl.Container implements NetworkNodeTypeApplication {
	/**
	 * The cached value of the '{@link #getNetworknodetype() <em>Networknodetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworknodetype()
	 * @generated
	 * @ordered
	 */
	protected NetworkNodeType networknodetype;

	/**
	 * The cached value of the '{@link #getPhysicalconnection() <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalconnection()
	 * @generated
	 * @ordered
	 */
	protected NetworkNode physicalconnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkNodeTypeApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeapplicationPackage.Literals.NETWORK_NODE_TYPE_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNodeType getNetworknodetype() {
		if (networknodetype != null && networknodetype.eIsProxy()) {
			InternalEObject oldNetworknodetype = (InternalEObject)networknodetype;
			networknodetype = (NetworkNodeType)eResolveProxy(oldNetworknodetype);
			if (networknodetype != oldNetworknodetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE, oldNetworknodetype, networknodetype));
			}
		}
		return networknodetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNodeType basicGetNetworknodetype() {
		return networknodetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworknodetype(NetworkNodeType newNetworknodetype) {
		NetworkNodeType oldNetworknodetype = networknodetype;
		networknodetype = newNetworknodetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE, oldNetworknodetype, networknodetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNode getPhysicalconnection() {
		if (physicalconnection != null && physicalconnection.eIsProxy()) {
			InternalEObject oldPhysicalconnection = (InternalEObject)physicalconnection;
			physicalconnection = (NetworkNode)eResolveProxy(oldPhysicalconnection);
			if (physicalconnection != oldPhysicalconnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
			}
		}
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkNode basicGetPhysicalconnection() {
		return physicalconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalconnection(NetworkNode newPhysicalconnection) {
		NetworkNode oldPhysicalconnection = physicalconnection;
		physicalconnection = newPhysicalconnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION, oldPhysicalconnection, physicalconnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE:
				if (resolve) return getNetworknodetype();
				return basicGetNetworknodetype();
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION:
				if (resolve) return getPhysicalconnection();
				return basicGetPhysicalconnection();
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
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE:
				setNetworknodetype((NetworkNodeType)newValue);
				return;
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION:
				setPhysicalconnection((NetworkNode)newValue);
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
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE:
				setNetworknodetype((NetworkNodeType)null);
				return;
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION:
				setPhysicalconnection((NetworkNode)null);
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
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__NETWORKNODETYPE:
				return networknodetype != null;
			case TypeapplicationPackage.NETWORK_NODE_TYPE_APPLICATION__PHYSICALCONNECTION:
				return physicalconnection != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkNodeTypeApplicationImpl
