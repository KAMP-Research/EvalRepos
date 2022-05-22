/**
 */
package topo.impl;

import base.BasePackage;
import base.NamedEntity;

import graph.LogicalCommunication;
import graph.NetworkEntity;
import graph.PhysicalConnection;
import graph.PowerGridNode;

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

import topo.SmartGridTopology;
import topo.TopoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Grid Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link topo.impl.SmartGridTopologyImpl#getId <em>Id</em>}</li>
 *   <li>{@link topo.impl.SmartGridTopologyImpl#getName <em>Name</em>}</li>
 *   <li>{@link topo.impl.SmartGridTopologyImpl#getContainsNE <em>Contains NE</em>}</li>
 *   <li>{@link topo.impl.SmartGridTopologyImpl#getContainsPGN <em>Contains PGN</em>}</li>
 *   <li>{@link topo.impl.SmartGridTopologyImpl#getContainsPC <em>Contains PC</em>}</li>
 *   <li>{@link topo.impl.SmartGridTopologyImpl#getContainsLC <em>Contains LC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartGridTopologyImpl extends MinimalEObjectImpl.Container implements SmartGridTopology {
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
	 * The cached value of the '{@link #getContainsNE() <em>Contains NE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsNE()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkEntity> containsNE;

	/**
	 * The cached value of the '{@link #getContainsPGN() <em>Contains PGN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPGN()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerGridNode> containsPGN;

	/**
	 * The cached value of the '{@link #getContainsPC() <em>Contains PC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPC()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalConnection> containsPC;

	/**
	 * The cached value of the '{@link #getContainsLC() <em>Contains LC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsLC()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalCommunication> containsLC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartGridTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopoPackage.Literals.SMART_GRID_TOPOLOGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopoPackage.SMART_GRID_TOPOLOGY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopoPackage.SMART_GRID_TOPOLOGY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkEntity> getContainsNE() {
		if (containsNE == null) {
			containsNE = new EObjectContainmentEList<NetworkEntity>(NetworkEntity.class, this, TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_NE);
		}
		return containsNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerGridNode> getContainsPGN() {
		if (containsPGN == null) {
			containsPGN = new EObjectContainmentEList<PowerGridNode>(PowerGridNode.class, this, TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PGN);
		}
		return containsPGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalConnection> getContainsPC() {
		if (containsPC == null) {
			containsPC = new EObjectContainmentEList<PhysicalConnection>(PhysicalConnection.class, this, TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PC);
		}
		return containsPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalCommunication> getContainsLC() {
		if (containsLC == null) {
			containsLC = new EObjectContainmentEList<LogicalCommunication>(LogicalCommunication.class, this, TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_LC);
		}
		return containsLC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_NE:
				return ((InternalEList<?>)getContainsNE()).basicRemove(otherEnd, msgs);
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PGN:
				return ((InternalEList<?>)getContainsPGN()).basicRemove(otherEnd, msgs);
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PC:
				return ((InternalEList<?>)getContainsPC()).basicRemove(otherEnd, msgs);
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_LC:
				return ((InternalEList<?>)getContainsLC()).basicRemove(otherEnd, msgs);
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
			case TopoPackage.SMART_GRID_TOPOLOGY__ID:
				return getId();
			case TopoPackage.SMART_GRID_TOPOLOGY__NAME:
				return getName();
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_NE:
				return getContainsNE();
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PGN:
				return getContainsPGN();
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PC:
				return getContainsPC();
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_LC:
				return getContainsLC();
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
			case TopoPackage.SMART_GRID_TOPOLOGY__ID:
				setId((Integer)newValue);
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__NAME:
				setName((String)newValue);
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_NE:
				getContainsNE().clear();
				getContainsNE().addAll((Collection<? extends NetworkEntity>)newValue);
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PGN:
				getContainsPGN().clear();
				getContainsPGN().addAll((Collection<? extends PowerGridNode>)newValue);
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PC:
				getContainsPC().clear();
				getContainsPC().addAll((Collection<? extends PhysicalConnection>)newValue);
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_LC:
				getContainsLC().clear();
				getContainsLC().addAll((Collection<? extends LogicalCommunication>)newValue);
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
			case TopoPackage.SMART_GRID_TOPOLOGY__ID:
				setId(ID_EDEFAULT);
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_NE:
				getContainsNE().clear();
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PGN:
				getContainsPGN().clear();
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PC:
				getContainsPC().clear();
				return;
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_LC:
				getContainsLC().clear();
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
			case TopoPackage.SMART_GRID_TOPOLOGY__ID:
				return id != ID_EDEFAULT;
			case TopoPackage.SMART_GRID_TOPOLOGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_NE:
				return containsNE != null && !containsNE.isEmpty();
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PGN:
				return containsPGN != null && !containsPGN.isEmpty();
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_PC:
				return containsPC != null && !containsPC.isEmpty();
			case TopoPackage.SMART_GRID_TOPOLOGY__CONTAINS_LC:
				return containsLC != null && !containsLC.isEmpty();
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
				case TopoPackage.SMART_GRID_TOPOLOGY__NAME: return BasePackage.NAMED_ENTITY__NAME;
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
				case BasePackage.NAMED_ENTITY__NAME: return TopoPackage.SMART_GRID_TOPOLOGY__NAME;
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

} //SmartGridTopologyImpl
