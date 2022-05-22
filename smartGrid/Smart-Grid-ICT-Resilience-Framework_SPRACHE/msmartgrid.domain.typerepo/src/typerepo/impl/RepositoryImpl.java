/**
 */
package typerepo.impl;

import base.BasePackage;
import base.NamedEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typerepo.ConnectionType;
import typerepo.NetworkNodeType;
import typerepo.Repository;
import typerepo.SmartMeterType;
import typerepo.TyperepoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typerepo.impl.RepositoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link typerepo.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link typerepo.impl.RepositoryImpl#getContainsSmartMeterTypes <em>Contains Smart Meter Types</em>}</li>
 *   <li>{@link typerepo.impl.RepositoryImpl#getContainsConnectionType <em>Contains Connection Type</em>}</li>
 *   <li>{@link typerepo.impl.RepositoryImpl#getContainsNetworkNodeTypes <em>Contains Network Node Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getContainsSmartMeterTypes() <em>Contains Smart Meter Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSmartMeterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartMeterType> containsSmartMeterTypes;

	/**
	 * The cached value of the '{@link #getContainsConnectionType() <em>Contains Connection Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsConnectionType()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionType> containsConnectionType;

	/**
	 * The cached value of the '{@link #getContainsNetworkNodeTypes() <em>Contains Network Node Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsNetworkNodeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkNodeType> containsNetworkNodeTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyperepoPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyperepoPackage.REPOSITORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyperepoPackage.REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartMeterType> getContainsSmartMeterTypes() {
		if (containsSmartMeterTypes == null) {
			containsSmartMeterTypes = new EObjectContainmentEList<SmartMeterType>(SmartMeterType.class, this, TyperepoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES);
		}
		return containsSmartMeterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionType> getContainsConnectionType() {
		if (containsConnectionType == null) {
			containsConnectionType = new EObjectContainmentEList<ConnectionType>(ConnectionType.class, this, TyperepoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE);
		}
		return containsConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkNodeType> getContainsNetworkNodeTypes() {
		if (containsNetworkNodeTypes == null) {
			containsNetworkNodeTypes = new EObjectContainmentEList<NetworkNodeType>(NetworkNodeType.class, this, TyperepoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES);
		}
		return containsNetworkNodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyperepoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
				return ((InternalEList<?>)getContainsSmartMeterTypes()).basicRemove(otherEnd, msgs);
			case TyperepoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
				return ((InternalEList<?>)getContainsConnectionType()).basicRemove(otherEnd, msgs);
			case TyperepoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
				return ((InternalEList<?>)getContainsNetworkNodeTypes()).basicRemove(otherEnd, msgs);
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
			case TyperepoPackage.REPOSITORY__ID:
				return getId();
			case TyperepoPackage.REPOSITORY__NAME:
				return getName();
			case TyperepoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
				return getContainsSmartMeterTypes();
			case TyperepoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
				return getContainsConnectionType();
			case TyperepoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
				return getContainsNetworkNodeTypes();
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
			case TyperepoPackage.REPOSITORY__ID:
				setId((Integer)newValue);
				return;
			case TyperepoPackage.REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case TyperepoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
				getContainsSmartMeterTypes().clear();
				getContainsSmartMeterTypes().addAll((Collection<? extends SmartMeterType>)newValue);
				return;
			case TyperepoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
				getContainsConnectionType().clear();
				getContainsConnectionType().addAll((Collection<? extends ConnectionType>)newValue);
				return;
			case TyperepoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
				getContainsNetworkNodeTypes().clear();
				getContainsNetworkNodeTypes().addAll((Collection<? extends NetworkNodeType>)newValue);
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
			case TyperepoPackage.REPOSITORY__ID:
				setId(ID_EDEFAULT);
				return;
			case TyperepoPackage.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TyperepoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
				getContainsSmartMeterTypes().clear();
				return;
			case TyperepoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
				getContainsConnectionType().clear();
				return;
			case TyperepoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
				getContainsNetworkNodeTypes().clear();
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
			case TyperepoPackage.REPOSITORY__ID:
				return id != ID_EDEFAULT;
			case TyperepoPackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TyperepoPackage.REPOSITORY__CONTAINS_SMART_METER_TYPES:
				return containsSmartMeterTypes != null && !containsSmartMeterTypes.isEmpty();
			case TyperepoPackage.REPOSITORY__CONTAINS_CONNECTION_TYPE:
				return containsConnectionType != null && !containsConnectionType.isEmpty();
			case TyperepoPackage.REPOSITORY__CONTAINS_NETWORK_NODE_TYPES:
				return containsNetworkNodeTypes != null && !containsNetworkNodeTypes.isEmpty();
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
		if (baseClass == NamedEntity.class) {
			switch (derivedFeatureID) {
				case TyperepoPackage.REPOSITORY__NAME: return BasePackage.NAMED_ENTITY__NAME;
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
		if (baseClass == NamedEntity.class) {
			switch (baseFeatureID) {
				case BasePackage.NAMED_ENTITY__NAME: return TyperepoPackage.REPOSITORY__NAME;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
