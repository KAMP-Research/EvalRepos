/**
 */
package domain.aps.components.impl;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.Pipe;

import domain.aps.interfaces.PneumaticSupply;

import domain.as.ComponentRepository.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.impl.PipeImpl#getPlugs <em>Plugs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PipeImpl extends ComponentImpl implements Pipe {
	/**
	 * The cached value of the '{@link #getPlugs() <em>Plugs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs()
	 * @generated
	 * @ordered
	 */
	protected PneumaticSupply plugs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.PIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply getPlugs() {
		if (plugs != null && plugs.eIsProxy()) {
			InternalEObject oldPlugs = (InternalEObject)plugs;
			plugs = (PneumaticSupply)eResolveProxy(oldPlugs);
			if (plugs != oldPlugs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.PIPE__PLUGS, oldPlugs, plugs));
			}
		}
		return plugs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PneumaticSupply basicGetPlugs() {
		return plugs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs(PneumaticSupply newPlugs) {
		PneumaticSupply oldPlugs = plugs;
		plugs = newPlugs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PIPE__PLUGS, oldPlugs, plugs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.PIPE__PLUGS:
				if (resolve) return getPlugs();
				return basicGetPlugs();
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
			case ComponentsPackage.PIPE__PLUGS:
				setPlugs((PneumaticSupply)newValue);
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
			case ComponentsPackage.PIPE__PLUGS:
				setPlugs((PneumaticSupply)null);
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
			case ComponentsPackage.PIPE__PLUGS:
				return plugs != null;
		}
		return super.eIsSet(featureID);
	}

} //PipeImpl
