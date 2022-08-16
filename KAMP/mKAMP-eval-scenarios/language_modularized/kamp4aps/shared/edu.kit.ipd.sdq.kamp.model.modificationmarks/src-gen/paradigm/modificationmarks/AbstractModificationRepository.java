/**
 */
package paradigm.modificationmarks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paradigm.modificationmarks.AbstractModificationRepository#getSeedModifications <em>Seed Modifications</em>}</li>
 *   <li>{@link paradigm.modificationmarks.AbstractModificationRepository#getChangePropagationSteps <em>Change Propagation Steps</em>}</li>
 * </ul>
 *
 * @see paradigm.modificationmarks.ModificationmarksPackage#getAbstractModificationRepository()
 * @model abstract="true"
 * @generated
 */
public interface AbstractModificationRepository<S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> extends EObject {
	/**
	 * Returns the value of the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Modifications</em>' containment reference.
	 * @see #setSeedModifications(AbstractSeedModifications)
	 * @see paradigm.modificationmarks.ModificationmarksPackage#getAbstractModificationRepository_SeedModifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	S getSeedModifications();

	/**
	 * Sets the value of the '{@link paradigm.modificationmarks.AbstractModificationRepository#getSeedModifications <em>Seed Modifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Modifications</em>' containment reference.
	 * @see #getSeedModifications()
	 * @generated
	 */
	void setSeedModifications(S value);

	/**
	 * Returns the value of the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Propagation Steps</em>' containment reference list.
	 * @see paradigm.modificationmarks.ModificationmarksPackage#getAbstractModificationRepository_ChangePropagationSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<T> getChangePropagationSteps();

} // AbstractModificationRepository
