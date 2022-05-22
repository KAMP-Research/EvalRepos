/**
 */
package output.impl;

import graph.NetworkEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import output.Cluster;
import output.EntityState;
import output.NoUplink;
import output.On;
import output.OutputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Uplink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link output.impl.NoUplinkImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link output.impl.NoUplinkImpl#getBelongsToCluster <em>Belongs To Cluster</em>}</li>
 *   <li>{@link output.impl.NoUplinkImpl#isIsHacked <em>Is Hacked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoUplinkImpl extends OfflineImpl implements NoUplink {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected NetworkEntity owner;

	/**
	 * The cached value of the '{@link #getBelongsToCluster() <em>Belongs To Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToCluster()
	 * @generated
	 * @ordered
	 */
	protected Cluster belongsToCluster;

	/**
	 * The default value of the '{@link #isIsHacked() <em>Is Hacked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHacked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HACKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHacked() <em>Is Hacked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHacked()
	 * @generated
	 * @ordered
	 */
	protected boolean isHacked = IS_HACKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoUplinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutputPackage.Literals.NO_UPLINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEntity getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (NetworkEntity)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutputPackage.NO_UPLINK__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEntity basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(NetworkEntity newOwner) {
		NetworkEntity oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutputPackage.NO_UPLINK__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getBelongsToCluster() {
		if (belongsToCluster != null && belongsToCluster.eIsProxy()) {
			InternalEObject oldBelongsToCluster = (InternalEObject)belongsToCluster;
			belongsToCluster = (Cluster)eResolveProxy(oldBelongsToCluster);
			if (belongsToCluster != oldBelongsToCluster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER, oldBelongsToCluster, belongsToCluster));
			}
		}
		return belongsToCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetBelongsToCluster() {
		return belongsToCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsToCluster(Cluster newBelongsToCluster, NotificationChain msgs) {
		Cluster oldBelongsToCluster = belongsToCluster;
		belongsToCluster = newBelongsToCluster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER, oldBelongsToCluster, newBelongsToCluster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToCluster(Cluster newBelongsToCluster) {
		if (newBelongsToCluster != belongsToCluster) {
			NotificationChain msgs = null;
			if (belongsToCluster != null)
				msgs = ((InternalEObject)belongsToCluster).eInverseRemove(this, OutputPackage.CLUSTER__HAS_ENTITIES, Cluster.class, msgs);
			if (newBelongsToCluster != null)
				msgs = ((InternalEObject)newBelongsToCluster).eInverseAdd(this, OutputPackage.CLUSTER__HAS_ENTITIES, Cluster.class, msgs);
			msgs = basicSetBelongsToCluster(newBelongsToCluster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER, newBelongsToCluster, newBelongsToCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHacked() {
		return isHacked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHacked(boolean newIsHacked) {
		boolean oldIsHacked = isHacked;
		isHacked = newIsHacked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutputPackage.NO_UPLINK__IS_HACKED, oldIsHacked, isHacked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER:
				if (belongsToCluster != null)
					msgs = ((InternalEObject)belongsToCluster).eInverseRemove(this, OutputPackage.CLUSTER__HAS_ENTITIES, Cluster.class, msgs);
				return basicSetBelongsToCluster((Cluster)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER:
				return basicSetBelongsToCluster(null, msgs);
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
			case OutputPackage.NO_UPLINK__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER:
				if (resolve) return getBelongsToCluster();
				return basicGetBelongsToCluster();
			case OutputPackage.NO_UPLINK__IS_HACKED:
				return isIsHacked();
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
			case OutputPackage.NO_UPLINK__OWNER:
				setOwner((NetworkEntity)newValue);
				return;
			case OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER:
				setBelongsToCluster((Cluster)newValue);
				return;
			case OutputPackage.NO_UPLINK__IS_HACKED:
				setIsHacked((Boolean)newValue);
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
			case OutputPackage.NO_UPLINK__OWNER:
				setOwner((NetworkEntity)null);
				return;
			case OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER:
				setBelongsToCluster((Cluster)null);
				return;
			case OutputPackage.NO_UPLINK__IS_HACKED:
				setIsHacked(IS_HACKED_EDEFAULT);
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
			case OutputPackage.NO_UPLINK__OWNER:
				return owner != null;
			case OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER:
				return belongsToCluster != null;
			case OutputPackage.NO_UPLINK__IS_HACKED:
				return isHacked != IS_HACKED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityState.class) {
			switch (derivedFeatureID) {
				case OutputPackage.NO_UPLINK__OWNER: return OutputPackage.ENTITY_STATE__OWNER;
				default: return -1;
			}
		}
		if (baseClass == On.class) {
			switch (derivedFeatureID) {
				case OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER: return OutputPackage.ON__BELONGS_TO_CLUSTER;
				case OutputPackage.NO_UPLINK__IS_HACKED: return OutputPackage.ON__IS_HACKED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityState.class) {
			switch (baseFeatureID) {
				case OutputPackage.ENTITY_STATE__OWNER: return OutputPackage.NO_UPLINK__OWNER;
				default: return -1;
			}
		}
		if (baseClass == On.class) {
			switch (baseFeatureID) {
				case OutputPackage.ON__BELONGS_TO_CLUSTER: return OutputPackage.NO_UPLINK__BELONGS_TO_CLUSTER;
				case OutputPackage.ON__IS_HACKED: return OutputPackage.NO_UPLINK__IS_HACKED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (IsHacked: ");
		result.append(isHacked);
		result.append(')');
		return result.toString();
	}

} //NoUplinkImpl
