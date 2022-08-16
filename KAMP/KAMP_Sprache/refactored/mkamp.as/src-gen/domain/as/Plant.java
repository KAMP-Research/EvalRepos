/**
 */
package domain.as;

import domain.as.ComponentRepository.ComponentRepository;

import domain.as.InterfaceRepository.InterfaceRepository;

import domain.as.ModuleRepository.ModuleRepository;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.Plant#getPlantName <em>Plant Name</em>}</li>
 *   <li>{@link domain.as.Plant#getStructures <em>Structures</em>}</li>
 *   <li>{@link domain.as.Plant#getInterfaceRepository <em>Interface Repository</em>}</li>
 *   <li>{@link domain.as.Plant#getComponentRepository <em>Component Repository</em>}</li>
 *   <li>{@link domain.as.Plant#getModuleRepository <em>Module Repository</em>}</li>
 * </ul>
 *
 * @see domain.as.AsPackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends Entity {
	/**
	 * Returns the value of the '<em><b>Plant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Name</em>' attribute.
	 * @see #setPlantName(String)
	 * @see domain.as.AsPackage#getPlant_PlantName()
	 * @model
	 * @generated
	 */
	String getPlantName();

	/**
	 * Sets the value of the '{@link domain.as.Plant#getPlantName <em>Plant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Name</em>' attribute.
	 * @see #getPlantName()
	 * @generated
	 */
	void setPlantName(String value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link domain.as.StructureRepository.Structure}.
	 * It is bidirectional and its opposite is '{@link domain.as.StructureRepository.Structure#getParentPlant <em>Parent Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see domain.as.AsPackage#getPlant_Structures()
	 * @see domain.as.StructureRepository.Structure#getParentPlant
	 * @model opposite="parentPlant" containment="true"
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * Returns the value of the '<em><b>Interface Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Repository</em>' containment reference.
	 * @see #setInterfaceRepository(InterfaceRepository)
	 * @see domain.as.AsPackage#getPlant_InterfaceRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterfaceRepository getInterfaceRepository();

	/**
	 * Sets the value of the '{@link domain.as.Plant#getInterfaceRepository <em>Interface Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Repository</em>' containment reference.
	 * @see #getInterfaceRepository()
	 * @generated
	 */
	void setInterfaceRepository(InterfaceRepository value);

	/**
	 * Returns the value of the '<em><b>Component Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Repository</em>' containment reference.
	 * @see #setComponentRepository(ComponentRepository)
	 * @see domain.as.AsPackage#getPlant_ComponentRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentRepository getComponentRepository();

	/**
	 * Sets the value of the '{@link domain.as.Plant#getComponentRepository <em>Component Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Repository</em>' containment reference.
	 * @see #getComponentRepository()
	 * @generated
	 */
	void setComponentRepository(ComponentRepository value);

	/**
	 * Returns the value of the '<em><b>Module Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Repository</em>' containment reference.
	 * @see #setModuleRepository(ModuleRepository)
	 * @see domain.as.AsPackage#getPlant_ModuleRepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModuleRepository getModuleRepository();

	/**
	 * Sets the value of the '{@link domain.as.Plant#getModuleRepository <em>Module Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Repository</em>' containment reference.
	 * @see #getModuleRepository()
	 * @generated
	 */
	void setModuleRepository(ModuleRepository value);

} // Plant
