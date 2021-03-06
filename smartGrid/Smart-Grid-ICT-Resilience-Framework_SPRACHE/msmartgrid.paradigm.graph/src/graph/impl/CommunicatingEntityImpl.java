/**
 */
package graph.impl;

import graph.CommunicatingEntity;
import graph.GraphPackage;
import graph.LogicalCommunication;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communicating Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.CommunicatingEntityImpl#getCommunicatesBy <em>Communicates By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommunicatingEntityImpl extends NetworkEntityImpl implements CommunicatingEntity {
	/**
	 * The cached value of the '{@link #getCommunicatesBy() <em>Communicates By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicatesBy()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalCommunication> communicatesBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicatingEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.COMMUNICATING_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalCommunication> getCommunicatesBy() {
		if (communicatesBy == null) {
			communicatesBy = new EObjectWithInverseResolvingEList.ManyInverse<LogicalCommunication>(LogicalCommunication.class, this, GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY, GraphPackage.LOGICAL_COMMUNICATION__LINKS);
		}
		return communicatesBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicatesBy()).basicAdd(otherEnd, msgs);
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
			case GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY:
				return ((InternalEList<?>)getCommunicatesBy()).basicRemove(otherEnd, msgs);
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
			case GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY:
				return getCommunicatesBy();
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
			case GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY:
				getCommunicatesBy().clear();
				getCommunicatesBy().addAll((Collection<? extends LogicalCommunication>)newValue);
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
			case GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY:
				getCommunicatesBy().clear();
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
			case GraphPackage.COMMUNICATING_ENTITY__COMMUNICATES_BY:
				return communicatesBy != null && !communicatesBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicatingEntityImpl
