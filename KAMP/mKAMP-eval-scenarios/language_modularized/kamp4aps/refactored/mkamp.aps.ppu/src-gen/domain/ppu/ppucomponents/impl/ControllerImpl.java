/**
 */
package domain.ppu.ppucomponents.impl;

import domain.aps.components.PowerSupply;

import domain.aps.structures.ControlCabinet;

import domain.as.ComponentRepository.impl.ComponentImpl;

import domain.ppu.ppucomponents.Controller;
import domain.ppu.ppucomponents.PpucomponentsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.impl.ControllerImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.impl.ControllerImpl#getControllerOf <em>Controller Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ComponentImpl implements Controller {
	/**
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powersupply;

	/**
	 * The cached value of the '{@link #getControllerOf() <em>Controller Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerOf()
	 * @generated
	 * @ordered
	 */
	protected ControlCabinet controllerOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpucomponentsPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply getPowersupply() {
		if (powersupply != null && powersupply.eIsProxy()) {
			InternalEObject oldPowersupply = (InternalEObject)powersupply;
			powersupply = (PowerSupply)eResolveProxy(oldPowersupply);
			if (powersupply != oldPowersupply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PpucomponentsPackage.CONTROLLER__POWERSUPPLY, oldPowersupply, powersupply));
			}
		}
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply basicGetPowersupply() {
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowersupply(PowerSupply newPowersupply) {
		PowerSupply oldPowersupply = powersupply;
		powersupply = newPowersupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PpucomponentsPackage.CONTROLLER__POWERSUPPLY, oldPowersupply, powersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCabinet getControllerOf() {
		if (controllerOf != null && controllerOf.eIsProxy()) {
			InternalEObject oldControllerOf = (InternalEObject)controllerOf;
			controllerOf = (ControlCabinet)eResolveProxy(oldControllerOf);
			if (controllerOf != oldControllerOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PpucomponentsPackage.CONTROLLER__CONTROLLER_OF, oldControllerOf, controllerOf));
			}
		}
		return controllerOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlCabinet basicGetControllerOf() {
		return controllerOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerOf(ControlCabinet newControllerOf) {
		ControlCabinet oldControllerOf = controllerOf;
		controllerOf = newControllerOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PpucomponentsPackage.CONTROLLER__CONTROLLER_OF, oldControllerOf, controllerOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PpucomponentsPackage.CONTROLLER__POWERSUPPLY:
				if (resolve) return getPowersupply();
				return basicGetPowersupply();
			case PpucomponentsPackage.CONTROLLER__CONTROLLER_OF:
				if (resolve) return getControllerOf();
				return basicGetControllerOf();
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
			case PpucomponentsPackage.CONTROLLER__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
				return;
			case PpucomponentsPackage.CONTROLLER__CONTROLLER_OF:
				setControllerOf((ControlCabinet)newValue);
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
			case PpucomponentsPackage.CONTROLLER__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
				return;
			case PpucomponentsPackage.CONTROLLER__CONTROLLER_OF:
				setControllerOf((ControlCabinet)null);
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
			case PpucomponentsPackage.CONTROLLER__POWERSUPPLY:
				return powersupply != null;
			case PpucomponentsPackage.CONTROLLER__CONTROLLER_OF:
				return controllerOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerImpl
