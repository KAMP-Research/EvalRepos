/**
 */
package domain.as.ComponentRepository;

import domain.as.InterfaceRepository.Interface;

import domain.as.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

import paradigm.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.as.ComponentRepository.Component#getConnectedInterfaces <em>Connected Interfaces</em>}</li>
 *   <li>{@link domain.as.ComponentRepository.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.as.ComponentRepository.Component#getParentModule <em>Parent Module</em>}</li>
 * </ul>
 *
 * @see domain.as.ComponentRepository.ComponentRepositoryPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Entity {
	/**
	 * Returns the value of the '<em><b>Connected Interfaces</b></em>' reference list.
	 * The list contents are of type {@link domain.as.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Interfaces</em>' reference list.
	 * @see domain.as.ComponentRepository.ComponentRepositoryPackage#getComponent_ConnectedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getConnectedInterfaces();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.as.StructureRepository.Structure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Structure)
	 * @see domain.as.ComponentRepository.ComponentRepositoryPackage#getComponent_Parent()
	 * @see domain.as.StructureRepository.Structure#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	Structure getParent();

	/**
	 * Sets the value of the '{@link domain.as.ComponentRepository.Component#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Structure value);

	/**
	 * Returns the value of the '<em><b>Parent Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.as.ModuleRepository.Module#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Module</em>' container reference.
	 * @see #setParentModule(domain.as.ModuleRepository.Module)
	 * @see domain.as.ComponentRepository.ComponentRepositoryPackage#getComponent_ParentModule()
	 * @see domain.as.ModuleRepository.Module#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	domain.as.ModuleRepository.Module getParentModule();

	/**
	 * Sets the value of the '{@link domain.as.ComponentRepository.Component#getParentModule <em>Parent Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Module</em>' container reference.
	 * @see #getParentModule()
	 * @generated
	 */
	void setParentModule(domain.as.ModuleRepository.Module value);

} // Component
