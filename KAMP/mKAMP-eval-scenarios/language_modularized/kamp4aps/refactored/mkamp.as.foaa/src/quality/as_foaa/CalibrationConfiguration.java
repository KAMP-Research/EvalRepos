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
 * A representation of the model object '<em><b>Calibration Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.CalibrationConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link quality.as_foaa.CalibrationConfiguration#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.CalibrationConfiguration#getComponents <em>Components</em>}</li>
 *   <li>{@link quality.as_foaa.CalibrationConfiguration#getModules <em>Modules</em>}</li>
 *   <li>{@link quality.as_foaa.CalibrationConfiguration#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link quality.as_foaa.CalibrationConfiguration#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see quality.as_foaa.As_foaaPackage#getCalibrationConfiguration()
 * @model
 * @generated
 */
public interface CalibrationConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link quality.as_foaa.CalibrationConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link quality.as_foaa.CalibrationSpecification#getCalibrationConfig <em>Calibration Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CalibrationSpecification)
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationConfiguration_Parent()
	 * @see quality.as_foaa.CalibrationSpecification#getCalibrationConfig
	 * @model opposite="calibrationConfig" required="true" transient="false"
	 * @generated
	 */
	CalibrationSpecification getParent();

	/**
	 * Sets the value of the '{@link quality.as_foaa.CalibrationConfiguration#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CalibrationSpecification value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link domain.as.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationConfiguration_Components()
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
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationConfiguration_Modules()
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
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationConfiguration_Interfaces()
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
	 * @see quality.as_foaa.As_foaaPackage#getCalibrationConfiguration_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

} // CalibrationConfiguration
