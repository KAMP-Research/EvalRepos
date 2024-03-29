/**
 */
package quality.as_mm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import paradigm.basic.Entity;

import paradigm.modificationmarks.impl.AbstractModificationImpl;

import quality.as_mm.As_mmPackage;
import quality.as_mm.ModifyEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModifyEntityImpl<T extends Entity> extends AbstractModificationImpl<T, EObject> implements ModifyEntity<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_mmPackage.Literals.MODIFY_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} //ModifyEntityImpl
