/**
 */
package repository.impl;

import base.impl.EntityImpl;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import repository.Interface;
import repository.Protocol;
import repository.RepositoryPackage;
import repository.RequiredCharacterisation;

import repository.util.RepositoryValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link repository.impl.InterfaceImpl#getParentInterfaces__Interface <em>Parent Interfaces Interface</em>}</li>
 *   <li>{@link repository.impl.InterfaceImpl#getProtocols__Interface <em>Protocols Interface</em>}</li>
 *   <li>{@link repository.impl.InterfaceImpl#getRequiredCharacterisations <em>Required Characterisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceImpl extends EntityImpl implements Interface {
	/**
	 * The cached value of the '{@link #getParentInterfaces__Interface() <em>Parent Interfaces Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInterfaces__Interface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> parentInterfaces__Interface;

	/**
	 * The cached value of the '{@link #getProtocols__Interface() <em>Protocols Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols__Interface()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocols__Interface;

	/**
	 * The cached value of the '{@link #getRequiredCharacterisations() <em>Required Characterisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCharacterisations()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredCharacterisation> requiredCharacterisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getParentInterfaces__Interface() {
		if (parentInterfaces__Interface == null) {
			parentInterfaces__Interface = new EObjectResolvingEList<Interface>(Interface.class, this, RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE);
		}
		return parentInterfaces__Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Protocol> getProtocols__Interface() {
		if (protocols__Interface == null) {
			protocols__Interface = new EObjectContainmentEList<Protocol>(Protocol.class, this, RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE);
		}
		return protocols__Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequiredCharacterisation> getRequiredCharacterisations() {
		if (requiredCharacterisations == null) {
			requiredCharacterisations = new EObjectContainmentWithInverseEList<RequiredCharacterisation>(RequiredCharacterisation.class, this, RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS, RepositoryPackage.REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION);
		}
		return requiredCharacterisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NoProtocolTypeIDUsedTwice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RepositoryValidator.DIAGNOSTIC_SOURCE,
						 RepositoryValidator.INTERFACE__NO_PROTOCOL_TYPE_ID_USED_TWICE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NoProtocolTypeIDUsedTwice", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
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
			case RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredCharacterisations()).basicAdd(otherEnd, msgs);
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
			case RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE:
				return ((InternalEList<?>)getProtocols__Interface()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS:
				return ((InternalEList<?>)getRequiredCharacterisations()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE:
				return getParentInterfaces__Interface();
			case RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE:
				return getProtocols__Interface();
			case RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS:
				return getRequiredCharacterisations();
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
			case RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE:
				getParentInterfaces__Interface().clear();
				getParentInterfaces__Interface().addAll((Collection<? extends Interface>)newValue);
				return;
			case RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE:
				getProtocols__Interface().clear();
				getProtocols__Interface().addAll((Collection<? extends Protocol>)newValue);
				return;
			case RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS:
				getRequiredCharacterisations().clear();
				getRequiredCharacterisations().addAll((Collection<? extends RequiredCharacterisation>)newValue);
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
			case RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE:
				getParentInterfaces__Interface().clear();
				return;
			case RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE:
				getProtocols__Interface().clear();
				return;
			case RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS:
				getRequiredCharacterisations().clear();
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
			case RepositoryPackage.INTERFACE__PARENT_INTERFACES_INTERFACE:
				return parentInterfaces__Interface != null && !parentInterfaces__Interface.isEmpty();
			case RepositoryPackage.INTERFACE__PROTOCOLS_INTERFACE:
				return protocols__Interface != null && !protocols__Interface.isEmpty();
			case RepositoryPackage.INTERFACE__REQUIRED_CHARACTERISATIONS:
				return requiredCharacterisations != null && !requiredCharacterisations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
