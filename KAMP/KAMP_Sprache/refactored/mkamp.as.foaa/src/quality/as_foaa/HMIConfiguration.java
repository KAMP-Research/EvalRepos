/**
 */
package quality.as_foaa;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMI Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.HMIConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link quality.as_foaa.HMIConfiguration#getComponents <em>Components</em>}</li>
 *   <li>{@link quality.as_foaa.HMIConfiguration#getModules <em>Modules</em>}</li>
 *   <li>{@link quality.as_foaa.HMIConfiguration#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link quality.as_foaa.HMIConfiguration#getStructures <em>Structures</em>}</li>
 *   <li>{@link quality.as_foaa.HMIConfiguration#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getHMIConfiguration()
 * @model
 * @generated
 */
public interface HMIConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see quality.as_foaa.As_foaaPackage#getHMIConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link quality.as_foaa.HMIConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link domain.as.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getHMIConfiguration_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link domain.as.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getHMIConfiguration_Modules()
	 * @model
	 * @generated
	 */
	EList<domain.as.ModuleRepository.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link domain.as.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getHMIConfiguration_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' reference list.
	 * The list contents are of type {@link domain.as.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getHMIConfiguration_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.HMISpecification#getHmiConfig <em>Hmi Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(HMISpecification)
	 * @see quality.as_foaa.As_foaaPackage#getHMIConfiguration_Parent()
	 * @see quality.as_foaa.HMISpecification#getHmiConfig
	 * @model opposite="hmiConfig" required="true" transient="false"
	 * @generated
	 */
	HMISpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.HMIConfiguration#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(HMISpecification value);

} // HMIConfiguration
