/**
 */
package domain.aps.components.impl;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.Compressor;
import domain.aps.components.PowerSupply;

import domain.aps.electroniccomponents.Switch;

import domain.aps.interfaces.PneumaticSupply;
import domain.aps.interfaces.Screwing;
import domain.aps.interfaces.SignalInterface;

import domain.as.ComponentRepository.impl.ComponentImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compressor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.impl.CompressorImpl#getPowersupply <em>Powersupply</em>}</li>
 *   <li>{@link domain.aps.components.impl.CompressorImpl#getPneumaticsupply <em>Pneumaticsupply</em>}</li>
 *   <li>{@link domain.aps.components.impl.CompressorImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link domain.aps.components.impl.CompressorImpl#getScrewing <em>Screwing</em>}</li>
 *   <li>{@link domain.aps.components.impl.CompressorImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompressorImpl extends ComponentImpl implements Compressor {
	/**
	 * The cached value of the '{@link #getPowersupply() <em>Powersupply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowersupply()
	 * @generated
	 * @ordered
	 */
	protected PowerSupply powersupply;

	/**
	 * The cached value of the '{@link #getPneumaticsupply() <em>Pneumaticsupply</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPneumaticsupply()
	 * @generated
	 * @ordered
	 */
	protected EList<PneumaticSupply> pneumaticsupply;

	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalInterface> pins;

	/**
	 * The cached value of the '{@link #getScrewing() <em>Screwing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected Switch switch_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompressorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.COMPRESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSupply getPowersupply() {
		return powersupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowersupply(PowerSupply newPowersupply, NotificationChain msgs) {
		PowerSupply oldPowersupply = powersupply;
		powersupply = newPowersupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPRESSOR__POWERSUPPLY, oldPowersupply, newPowersupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowersupply(PowerSupply newPowersupply) {
		if (newPowersupply != powersupply) {
			NotificationChain msgs = null;
			if (powersupply != null)
				msgs = ((InternalEObject)powersupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.COMPRESSOR__POWERSUPPLY, null, msgs);
			if (newPowersupply != null)
				msgs = ((InternalEObject)newPowersupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.COMPRESSOR__POWERSUPPLY, null, msgs);
			msgs = basicSetPowersupply(newPowersupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPRESSOR__POWERSUPPLY, newPowersupply, newPowersupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PneumaticSupply> getPneumaticsupply() {
		if (pneumaticsupply == null) {
			pneumaticsupply = new EObjectContainmentEList<PneumaticSupply>(PneumaticSupply.class, this, ComponentsPackage.COMPRESSOR__PNEUMATICSUPPLY);
		}
		return pneumaticsupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalInterface> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<SignalInterface>(SignalInterface.class, this, ComponentsPackage.COMPRESSOR__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing() {
		return screwing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrewing(Screwing newScrewing, NotificationChain msgs) {
		Screwing oldScrewing = screwing;
		screwing = newScrewing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPRESSOR__SCREWING, oldScrewing, newScrewing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing(Screwing newScrewing) {
		if (newScrewing != screwing) {
			NotificationChain msgs = null;
			if (screwing != null)
				msgs = ((InternalEObject)screwing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.COMPRESSOR__SCREWING, null, msgs);
			if (newScrewing != null)
				msgs = ((InternalEObject)newScrewing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.COMPRESSOR__SCREWING, null, msgs);
			msgs = basicSetScrewing(newScrewing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPRESSOR__SCREWING, newScrewing, newScrewing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitch(Switch newSwitch, NotificationChain msgs) {
		Switch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPRESSOR__SWITCH, oldSwitch, newSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch(Switch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null)
				msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.COMPRESSOR__SWITCH, null, msgs);
			if (newSwitch != null)
				msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.COMPRESSOR__SWITCH, null, msgs);
			msgs = basicSetSwitch(newSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPRESSOR__SWITCH, newSwitch, newSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.COMPRESSOR__POWERSUPPLY:
				return basicSetPowersupply(null, msgs);
			case ComponentsPackage.COMPRESSOR__PNEUMATICSUPPLY:
				return ((InternalEList<?>)getPneumaticsupply()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPRESSOR__PINS:
				return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPRESSOR__SCREWING:
				return basicSetScrewing(null, msgs);
			case ComponentsPackage.COMPRESSOR__SWITCH:
				return basicSetSwitch(null, msgs);
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
			case ComponentsPackage.COMPRESSOR__POWERSUPPLY:
				return getPowersupply();
			case ComponentsPackage.COMPRESSOR__PNEUMATICSUPPLY:
				return getPneumaticsupply();
			case ComponentsPackage.COMPRESSOR__PINS:
				return getPins();
			case ComponentsPackage.COMPRESSOR__SCREWING:
				return getScrewing();
			case ComponentsPackage.COMPRESSOR__SWITCH:
				return getSwitch();
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
			case ComponentsPackage.COMPRESSOR__POWERSUPPLY:
				setPowersupply((PowerSupply)newValue);
				return;
			case ComponentsPackage.COMPRESSOR__PNEUMATICSUPPLY:
				getPneumaticsupply().clear();
				getPneumaticsupply().addAll((Collection<? extends PneumaticSupply>)newValue);
				return;
			case ComponentsPackage.COMPRESSOR__PINS:
				getPins().clear();
				getPins().addAll((Collection<? extends SignalInterface>)newValue);
				return;
			case ComponentsPackage.COMPRESSOR__SCREWING:
				setScrewing((Screwing)newValue);
				return;
			case ComponentsPackage.COMPRESSOR__SWITCH:
				setSwitch((Switch)newValue);
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
			case ComponentsPackage.COMPRESSOR__POWERSUPPLY:
				setPowersupply((PowerSupply)null);
				return;
			case ComponentsPackage.COMPRESSOR__PNEUMATICSUPPLY:
				getPneumaticsupply().clear();
				return;
			case ComponentsPackage.COMPRESSOR__PINS:
				getPins().clear();
				return;
			case ComponentsPackage.COMPRESSOR__SCREWING:
				setScrewing((Screwing)null);
				return;
			case ComponentsPackage.COMPRESSOR__SWITCH:
				setSwitch((Switch)null);
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
			case ComponentsPackage.COMPRESSOR__POWERSUPPLY:
				return powersupply != null;
			case ComponentsPackage.COMPRESSOR__PNEUMATICSUPPLY:
				return pneumaticsupply != null && !pneumaticsupply.isEmpty();
			case ComponentsPackage.COMPRESSOR__PINS:
				return pins != null && !pins.isEmpty();
			case ComponentsPackage.COMPRESSOR__SCREWING:
				return screwing != null;
			case ComponentsPackage.COMPRESSOR__SWITCH:
				return switch_ != null;
		}
		return super.eIsSet(featureID);
	}

} //CompressorImpl
