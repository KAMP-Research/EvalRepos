/**
 */
package domain.ppu.ppumodules.impl;

import domain.aps.mechanicalcomponents.RubberBand;

import domain.as.ModuleRepository.impl.ModuleImpl;

import domain.ppu.ppucomponents.Frame;

import domain.ppu.ppumodules.ConveyorBeltModule;
import domain.ppu.ppumodules.PpumodulesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor Belt Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppumodules.impl.ConveyorBeltModuleImpl#getRubberBand <em>Rubber Band</em>}</li>
 *   <li>{@link domain.ppu.ppumodules.impl.ConveyorBeltModuleImpl#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorBeltModuleImpl extends ModuleImpl implements ConveyorBeltModule {
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
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame frame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpumodulesPackage.Literals.CONVEYOR_BELT_MODULE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND, oldRubberBand, newRubberBand);
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
				msgs = ((InternalEObject)rubberBand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND, null, msgs);
			if (newRubberBand != null)
				msgs = ((InternalEObject)newRubberBand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND, null, msgs);
			msgs = basicSetRubberBand(newRubberBand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND, newRubberBand, newRubberBand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(Frame newFrame, NotificationChain msgs) {
		Frame oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME, oldFrame, newFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(Frame newFrame) {
		if (newFrame != frame) {
			NotificationChain msgs = null;
			if (frame != null)
				msgs = ((InternalEObject)frame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME, null, msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME, null, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND:
				return basicSetRubberBand(null, msgs);
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME:
				return basicSetFrame(null, msgs);
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
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND:
				return getRubberBand();
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME:
				return getFrame();
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
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND:
				setRubberBand((RubberBand)newValue);
				return;
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME:
				setFrame((Frame)newValue);
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
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND:
				setRubberBand((RubberBand)null);
				return;
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME:
				setFrame((Frame)null);
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
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__RUBBER_BAND:
				return rubberBand != null;
			case PpumodulesPackage.CONVEYOR_BELT_MODULE__FRAME:
				return frame != null;
		}
		return super.eIsSet(featureID);
	}

} //ConveyorBeltModuleImpl
