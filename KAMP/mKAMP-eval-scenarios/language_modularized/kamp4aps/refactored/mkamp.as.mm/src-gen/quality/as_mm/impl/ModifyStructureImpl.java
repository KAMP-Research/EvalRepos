/**
 */
package quality.as_mm.impl;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.ecore.EClass;

import quality.as_mm.As_mmPackage;
import quality.as_mm.ModifyStructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyStructureImpl<T extends Structure> extends ModifyEntityImpl<Structure> implements ModifyStructure<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_mmPackage.Literals.MODIFY_STRUCTURE;
	}

} //ModifyStructureImpl
