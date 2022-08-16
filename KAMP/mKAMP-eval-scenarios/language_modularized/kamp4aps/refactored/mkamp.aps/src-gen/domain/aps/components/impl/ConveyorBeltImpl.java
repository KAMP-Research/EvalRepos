/**
 */
package domain.aps.components.impl;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.ConveyorBelt;

import domain.aps.mechanicalcomponents.RubberBand;

import domain.as.ComponentRepository.impl.ComponentImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.aps.components.impl.ConveyorBeltImpl#getRubberBand <em>Rubber Band</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorBeltImpl extends ComponentImpl implements ConveyorBelt {
	/**
	 * The cached value of the '{@link #getRubberBand() <em>Rubber Band</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubberBand()
	 * @generated
	 * @ordered
	 */
	protected RubberBand rubberBand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.CONVEYOR_BELT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubberBand getRubberBand() {
		return rubberBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubberBand(RubberBand newRubberBand, NotificationChain msgs) {
		RubberBand oldRubberBand = rubberBand;
		rubberBand = newRubberBand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND, oldRubberBand, newRubberBand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubberBand(RubberBand newRubberBand) {
		if (newRubberBand != rubberBand) {
			NotificationChain msgs = null;
			if (rubberBand != null)
				msgs = ((InternalEObject)rubberBand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND, null, msgs);
			if (newRubberBand != null)
				msgs = ((InternalEObject)newRubberBand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND, null, msgs);
			msgs = basicSetRubberBand(newRubberBand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND, newRubberBand, newRubberBand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND:
				return basicSetRubberBand(null, msgs);
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
			case ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND:
				return getRubberBand();
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
			case ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND:
				setRubberBand((RubberBand)newValue);
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
			case ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND:
				setRubberBand((RubberBand)null);
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
			case ComponentsPackage.CONVEYOR_BELT__RUBBER_BAND:
				return rubberBand != null;
		}
		return super.eIsSet(featureID);
	}

} //ConveyorBeltImpl
