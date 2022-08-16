/**
 */
package domain.ppu.ppustructures.impl;

import domain.aps.components.ConveyorBelt;

import domain.as.StructureRepository.impl.StructureImpl;

import domain.ppu.ppustructures.Conveyor;
import domain.ppu.ppustructures.PpustructuresPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppustructures.impl.ConveyorImpl#getBelts <em>Belts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorImpl extends StructureImpl implements Conveyor {
	/**
	 * The cached value of the '{@link #getBelts() <em>Belts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelts()
	 * @generated
	 * @ordered
	 */
	protected EList<ConveyorBelt> belts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpustructuresPackage.Literals.CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConveyorBelt> getBelts() {
		if (belts == null) {
			belts = new EObjectContainmentEList<ConveyorBelt>(ConveyorBelt.class, this, PpustructuresPackage.CONVEYOR__BELTS);
		}
		return belts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PpustructuresPackage.CONVEYOR__BELTS:
				return ((InternalEList<?>)getBelts()).basicRemove(otherEnd, msgs);
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
			case PpustructuresPackage.CONVEYOR__BELTS:
				return getBelts();
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
			case PpustructuresPackage.CONVEYOR__BELTS:
				getBelts().clear();
				getBelts().addAll((Collection<? extends ConveyorBelt>)newValue);
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
			case PpustructuresPackage.CONVEYOR__BELTS:
				getBelts().clear();
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
			case PpustructuresPackage.CONVEYOR__BELTS:
				return belts != null && !belts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConveyorImpl
