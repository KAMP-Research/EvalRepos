/**
 */
package domain.aps.components.impl;

import domain.aps.components.ComponentsPackage;
import domain.aps.components.MechanicalAssembly;

import domain.as.ComponentRepository.impl.ComponentImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mechanical Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MechanicalAssemblyImpl extends ComponentImpl implements MechanicalAssembly {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MechanicalAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.MECHANICAL_ASSEMBLY;
	}

} //MechanicalAssemblyImpl
