/**
 */
package domain.as.ModuleRepository;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.ModuleRepository.Module#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link domain.as.ModuleRepository.Module#getModules <em>Modules</em>}</li>
 *   <li>{@link domain.as.ModuleRepository.Module#getComponents <em>Components</em>}</li>
 *   <li>{@link domain.as.ModuleRepository.Module#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see domain.as.ModuleRepository.ModuleRepositoryPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Entity</em>' reference.
	 * @see #setParentEntity(Entity)
	 * @see domain.as.ModuleRepository.ModuleRepositoryPackage#getModule_ParentEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getParentEntity();

	/**
	 * Sets the value of the '{@link domain.as.ModuleRepository.Module#getParentEntity <em>Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Entity</em>' reference.
	 * @see #getParentEntity()
	 * @generated
	 */
	void setParentEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link domain.as.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see domain.as.ModuleRepository.ModuleRepositoryPackage#getModule_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link domain.as.ComponentRepository.Component}.
	 * It is bidirectional and its opposite is '{@link domain.as.ComponentRepository.Component#getParentModule <em>Parent Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see domain.as.ModuleRepository.ModuleRepositoryPackage#getModule_Components()
	 * @see domain.as.ComponentRepository.Component#getParentModule
	 * @model opposite="parentModule" containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link domain.as.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see domain.as.ModuleRepository.ModuleRepositoryPackage#getModule_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // Module
