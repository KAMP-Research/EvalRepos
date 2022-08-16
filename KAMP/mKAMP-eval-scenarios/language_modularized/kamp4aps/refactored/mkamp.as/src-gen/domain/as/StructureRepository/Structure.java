/**
 */
package domain.as.StructureRepository;

import domain.as.ComponentRepository.Component;

import domain.as.Plant;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}</li>
 *   <li>{@link domain.as.StructureRepository.Structure#getModules <em>Modules</em>}</li>
 *   <li>{@link domain.as.StructureRepository.Structure#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see domain.as.StructureRepository.StructureRepositoryPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Plant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.as.Plant#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Plant</em>' container reference.
	 * @see #setParentPlant(Plant)
	 * @see domain.as.StructureRepository.StructureRepositoryPackage#getStructure_ParentPlant()
	 * @see domain.as.Plant#getStructures
	 * @model opposite="structures" required="true" transient="false"
	 * @generated
	 */
	Plant getParentPlant();

	/**
	 * Sets the value of the '{@link domain.as.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Plant</em>' container reference.
	 * @see #getParentPlant()
	 * @generated
	 */
	void setParentPlant(Plant value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link domain.as.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see domain.as.StructureRepository.StructureRepositoryPackage#getStructure_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<domain.as.ModuleRepository.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link domain.as.ComponentRepository.Component}.
	 * It is bidirectional and its opposite is '{@link domain.as.ComponentRepository.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see domain.as.StructureRepository.StructureRepositoryPackage#getStructure_Components()
	 * @see domain.as.ComponentRepository.Component#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // Structure
