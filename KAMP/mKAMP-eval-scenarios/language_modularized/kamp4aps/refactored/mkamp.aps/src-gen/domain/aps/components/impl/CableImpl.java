/**
 */
package domain.aps.components.impl;

import domain.aps.components.Cable;
import domain.aps.components.ComponentsPackage;

import domain.as.ComponentRepository.impl.ComponentImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CableImpl extends ComponentImpl implements Cable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.CABLE;
	}

} //CableImpl
