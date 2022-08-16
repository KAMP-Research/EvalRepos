/**
 */
package domain.ppu.ppucomponents.impl;

import domain.aps.components.impl.PanelImpl;

import domain.aps.electroniccomponents.Button;
import domain.aps.electroniccomponents.LED;

import domain.aps.interfaces.Screwing;

import domain.ppu.ppucomponents.OperationPanel;
import domain.ppu.ppucomponents.PpucomponentsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.impl.OperationPanelImpl#getScrewing_rack <em>Screwing rack</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.impl.OperationPanelImpl#getLeds <em>Leds</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.impl.OperationPanelImpl#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationPanelImpl extends PanelImpl implements OperationPanel {
	/**
	 * The cached value of the '{@link #getScrewing_rack() <em>Screwing rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewing_rack()
	 * @generated
	 * @ordered
	 */
	protected Screwing screwing_rack;

	/**
	 * The cached value of the '{@link #getLeds() <em>Leds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeds()
	 * @generated
	 * @ordered
	 */
	protected EList<LED> leds;

	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> buttons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpucomponentsPackage.Literals.OPERATION_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing getScrewing_rack() {
		if (screwing_rack != null && screwing_rack.eIsProxy()) {
			InternalEObject oldScrewing_rack = (InternalEObject)screwing_rack;
			screwing_rack = (Screwing)eResolveProxy(oldScrewing_rack);
			if (screwing_rack != oldScrewing_rack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PpucomponentsPackage.OPERATION_PANEL__SCREWING_RACK, oldScrewing_rack, screwing_rack));
			}
		}
		return screwing_rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screwing basicGetScrewing_rack() {
		return screwing_rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewing_rack(Screwing newScrewing_rack) {
		Screwing oldScrewing_rack = screwing_rack;
		screwing_rack = newScrewing_rack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PpucomponentsPackage.OPERATION_PANEL__SCREWING_RACK, oldScrewing_rack, screwing_rack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LED> getLeds() {
		if (leds == null) {
			leds = new EObjectResolvingEList<LED>(LED.class, this, PpucomponentsPackage.OPERATION_PANEL__LEDS);
		}
		return leds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButtons() {
		if (buttons == null) {
			buttons = new EObjectResolvingEList<Button>(Button.class, this, PpucomponentsPackage.OPERATION_PANEL__BUTTONS);
		}
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PpucomponentsPackage.OPERATION_PANEL__SCREWING_RACK:
				if (resolve) return getScrewing_rack();
				return basicGetScrewing_rack();
			case PpucomponentsPackage.OPERATION_PANEL__LEDS:
				return getLeds();
			case PpucomponentsPackage.OPERATION_PANEL__BUTTONS:
				return getButtons();
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
			case PpucomponentsPackage.OPERATION_PANEL__SCREWING_RACK:
				setScrewing_rack((Screwing)newValue);
				return;
			case PpucomponentsPackage.OPERATION_PANEL__LEDS:
				getLeds().clear();
				getLeds().addAll((Collection<? extends LED>)newValue);
				return;
			case PpucomponentsPackage.OPERATION_PANEL__BUTTONS:
				getButtons().clear();
				getButtons().addAll((Collection<? extends Button>)newValue);
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
			case PpucomponentsPackage.OPERATION_PANEL__SCREWING_RACK:
				setScrewing_rack((Screwing)null);
				return;
			case PpucomponentsPackage.OPERATION_PANEL__LEDS:
				getLeds().clear();
				return;
			case PpucomponentsPackage.OPERATION_PANEL__BUTTONS:
				getButtons().clear();
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
			case PpucomponentsPackage.OPERATION_PANEL__SCREWING_RACK:
				return screwing_rack != null;
			case PpucomponentsPackage.OPERATION_PANEL__LEDS:
				return leds != null && !leds.isEmpty();
			case PpucomponentsPackage.OPERATION_PANEL__BUTTONS:
				return buttons != null && !buttons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationPanelImpl
