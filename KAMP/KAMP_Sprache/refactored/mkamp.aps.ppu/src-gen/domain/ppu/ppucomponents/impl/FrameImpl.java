/**
 */
package domain.ppu.ppucomponents.impl;

import domain.aps.components.ConveyorBelt;

import domain.aps.components.impl.MechanicalAssemblyImpl;

import domain.ppu.ppucomponents.Frame;
import domain.ppu.ppucomponents.PpucomponentsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.impl.FrameImpl#getConveyorbelt <em>Conveyorbelt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameImpl extends MechanicalAssemblyImpl implements Frame {
	/**
	 * The cached value of the '{@link #getConveyorbelt() <em>Conveyorbelt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyorbelt()
	 * @generated
	 * @ordered
	 */
	protected EList<ConveyorBelt> conveyorbelt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PpucomponentsPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConveyorBelt> getConveyorbelt() {
		if (conveyorbelt == null) {
			conveyorbelt = new EObjectContainmentEList<ConveyorBelt>(ConveyorBelt.class, this, PpucomponentsPackage.FRAME__CONVEYORBELT);
		}
		return conveyorbelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PpucomponentsPackage.FRAME__CONVEYORBELT:
				return ((InternalEList<?>)getConveyorbelt()).basicRemove(otherEnd, msgs);
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
			case PpucomponentsPackage.FRAME__CONVEYORBELT:
				return getConveyorbelt();
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
			case PpucomponentsPackage.FRAME__CONVEYORBELT:
				getConveyorbelt().clear();
				getConveyorbelt().addAll((Collection<? extends ConveyorBelt>)newValue);
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
			case PpucomponentsPackage.FRAME__CONVEYORBELT:
				getConveyorbelt().clear();
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
			case PpucomponentsPackage.FRAME__CONVEYORBELT:
				return conveyorbelt != null && !conveyorbelt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FrameImpl
