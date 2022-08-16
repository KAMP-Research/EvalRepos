/**
 */
package domain.aps.components.impl;

import domain.aps.buscomponents.BusBox;
import domain.aps.buscomponents.BusCable;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.Pusher;

import domain.aps.interfaces.PhysicalConnection;

import domain.as.ComponentRepository.Component;

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
 * An implementation of the model object '<em><b>Pusher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.impl.PusherImpl#getComponentsRepository <em>Components Repository</em>}</li>
 *   <li>{@link domain.aps.components.impl.PusherImpl#getFixtureCylinder <em>Fixture Cylinder</em>}</li>
 *   <li>{@link domain.aps.components.impl.PusherImpl#getBusBox <em>Bus Box</em>}</li>
 *   <li>{@link domain.aps.components.impl.PusherImpl#getBusCable <em>Bus Cable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PusherImpl extends ComponentImpl implements Pusher {
	/**
	 * The cached value of the '{@link #getComponentsRepository() <em>Components Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsRepository()
	 * @generated
	 * @ordered
	 */
	protected Component componentsRepository;

	/**
	 * The cached value of the '{@link #getFixtureCylinder() <em>Fixture Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixtureCylinder()
	 * @generated
	 * @ordered
	 */
	protected PhysicalConnection fixtureCylinder;

	/**
	 * The cached value of the '{@link #getBusBox() <em>Bus Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusBox()
	 * @generated
	 * @ordered
	 */
	protected BusBox busBox;

	/**
	 * The cached value of the '{@link #getBusCable() <em>Bus Cable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusCable()
	 * @generated
	 * @ordered
	 */
	protected EList<BusCable> busCable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PusherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.PUSHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponentsRepository() {
		if (componentsRepository != null && componentsRepository.eIsProxy()) {
			InternalEObject oldComponentsRepository = (InternalEObject)componentsRepository;
			componentsRepository = (Component)eResolveProxy(oldComponentsRepository);
			if (componentsRepository != oldComponentsRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.PUSHER__COMPONENTS_REPOSITORY, oldComponentsRepository, componentsRepository));
			}
		}
		return componentsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentsRepository() {
		return componentsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentsRepository(Component newComponentsRepository) {
		Component oldComponentsRepository = componentsRepository;
		componentsRepository = newComponentsRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PUSHER__COMPONENTS_REPOSITORY, oldComponentsRepository, componentsRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection getFixtureCylinder() {
		return fixtureCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixtureCylinder(PhysicalConnection newFixtureCylinder, NotificationChain msgs) {
		PhysicalConnection oldFixtureCylinder = fixtureCylinder;
		fixtureCylinder = newFixtureCylinder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.PUSHER__FIXTURE_CYLINDER, oldFixtureCylinder, newFixtureCylinder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixtureCylinder(PhysicalConnection newFixtureCylinder) {
		if (newFixtureCylinder != fixtureCylinder) {
			NotificationChain msgs = null;
			if (fixtureCylinder != null)
				msgs = ((InternalEObject)fixtureCylinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.PUSHER__FIXTURE_CYLINDER, null, msgs);
			if (newFixtureCylinder != null)
				msgs = ((InternalEObject)newFixtureCylinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.PUSHER__FIXTURE_CYLINDER, null, msgs);
			msgs = basicSetFixtureCylinder(newFixtureCylinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PUSHER__FIXTURE_CYLINDER, newFixtureCylinder, newFixtureCylinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusBox getBusBox() {
		return busBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusBox(BusBox newBusBox, NotificationChain msgs) {
		BusBox oldBusBox = busBox;
		busBox = newBusBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.PUSHER__BUS_BOX, oldBusBox, newBusBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusBox(BusBox newBusBox) {
		if (newBusBox != busBox) {
			NotificationChain msgs = null;
			if (busBox != null)
				msgs = ((InternalEObject)busBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.PUSHER__BUS_BOX, null, msgs);
			if (newBusBox != null)
				msgs = ((InternalEObject)newBusBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.PUSHER__BUS_BOX, null, msgs);
			msgs = basicSetBusBox(newBusBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PUSHER__BUS_BOX, newBusBox, newBusBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusCable> getBusCable() {
		if (busCable == null) {
			busCable = new EObjectContainmentEList<BusCable>(BusCable.class, this, ComponentsPackage.PUSHER__BUS_CABLE);
		}
		return busCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.PUSHER__FIXTURE_CYLINDER:
				return basicSetFixtureCylinder(null, msgs);
			case ComponentsPackage.PUSHER__BUS_BOX:
				return basicSetBusBox(null, msgs);
			case ComponentsPackage.PUSHER__BUS_CABLE:
				return ((InternalEList<?>)getBusCable()).basicRemove(otherEnd, msgs);
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
			case ComponentsPackage.PUSHER__COMPONENTS_REPOSITORY:
				if (resolve) return getComponentsRepository();
				return basicGetComponentsRepository();
			case ComponentsPackage.PUSHER__FIXTURE_CYLINDER:
				return getFixtureCylinder();
			case ComponentsPackage.PUSHER__BUS_BOX:
				return getBusBox();
			case ComponentsPackage.PUSHER__BUS_CABLE:
				return getBusCable();
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
			case ComponentsPackage.PUSHER__COMPONENTS_REPOSITORY:
				setComponentsRepository((Component)newValue);
				return;
			case ComponentsPackage.PUSHER__FIXTURE_CYLINDER:
				setFixtureCylinder((PhysicalConnection)newValue);
				return;
			case ComponentsPackage.PUSHER__BUS_BOX:
				setBusBox((BusBox)newValue);
				return;
			case ComponentsPackage.PUSHER__BUS_CABLE:
				getBusCable().clear();
				getBusCable().addAll((Collection<? extends BusCable>)newValue);
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
			case ComponentsPackage.PUSHER__COMPONENTS_REPOSITORY:
				setComponentsRepository((Component)null);
				return;
			case ComponentsPackage.PUSHER__FIXTURE_CYLINDER:
				setFixtureCylinder((PhysicalConnection)null);
				return;
			case ComponentsPackage.PUSHER__BUS_BOX:
				setBusBox((BusBox)null);
				return;
			case ComponentsPackage.PUSHER__BUS_CABLE:
				getBusCable().clear();
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
			case ComponentsPackage.PUSHER__COMPONENTS_REPOSITORY:
				return componentsRepository != null;
			case ComponentsPackage.PUSHER__FIXTURE_CYLINDER:
				return fixtureCylinder != null;
			case ComponentsPackage.PUSHER__BUS_BOX:
				return busBox != null;
			case ComponentsPackage.PUSHER__BUS_CABLE:
				return busCable != null && !busCable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PusherImpl
