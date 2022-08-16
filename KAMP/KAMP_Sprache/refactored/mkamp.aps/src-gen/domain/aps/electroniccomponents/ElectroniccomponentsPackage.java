/**
 */
package domain.aps.electroniccomponents;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.aps.electroniccomponents.ElectroniccomponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ElectroniccomponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "electroniccomponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "electroniccomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "electroniccomponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElectroniccomponentsPackage eINSTANCE = domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.aps.electroniccomponents.impl.ElectronicPartImpl <em>Electronic Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.electroniccomponents.impl.ElectronicPartImpl
	 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getElectronicPart()
	 * @generated
	 */
	int ELECTRONIC_PART = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PIN = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART__PHYSICALCONNECTION = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Electronic Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Electronic Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_PART_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.electroniccomponents.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.electroniccomponents.impl.SwitchImpl
	 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID = ELECTRONIC_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = ELECTRONIC_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__CONNECTED_INTERFACES = ELECTRONIC_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PARENT = ELECTRONIC_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PARENT_MODULE = ELECTRONIC_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = ELECTRONIC_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.electroniccomponents.impl.MicroSwitchImpl <em>Micro Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.electroniccomponents.impl.MicroSwitchImpl
	 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getMicroSwitch()
	 * @generated
	 */
	int MICRO_SWITCH = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH__ID = SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH__CONNECTED_INTERFACES = SWITCH__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH__PARENT = SWITCH__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH__PARENT_MODULE = SWITCH__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH__PIN = SWITCH__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH__PHYSICALCONNECTION = SWITCH__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Micro Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Micro Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SWITCH_OPERATION_COUNT = SWITCH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.electroniccomponents.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.electroniccomponents.impl.LEDImpl
	 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getLED()
	 * @generated
	 */
	int LED = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__ID = ELECTRONIC_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = ELECTRONIC_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__CONNECTED_INTERFACES = ELECTRONIC_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PARENT = ELECTRONIC_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PARENT_MODULE = ELECTRONIC_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = ELECTRONIC_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.electroniccomponents.impl.PotentiometerImpl <em>Potentiometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.electroniccomponents.impl.PotentiometerImpl
	 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getPotentiometer()
	 * @generated
	 */
	int POTENTIOMETER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__ID = ELECTRONIC_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__NAME = ELECTRONIC_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__CONNECTED_INTERFACES = ELECTRONIC_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__PARENT = ELECTRONIC_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__PARENT_MODULE = ELECTRONIC_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIOMETER_OPERATION_COUNT = ELECTRONIC_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.electroniccomponents.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.electroniccomponents.impl.ButtonImpl
	 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = ELECTRONIC_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = ELECTRONIC_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONNECTED_INTERFACES = ELECTRONIC_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PARENT = ELECTRONIC_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PARENT_MODULE = ELECTRONIC_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PIN = ELECTRONIC_PART__PIN;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PHYSICALCONNECTION = ELECTRONIC_PART__PHYSICALCONNECTION;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = ELECTRONIC_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = ELECTRONIC_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.aps.electroniccomponents.ElectronicPart <em>Electronic Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Part</em>'.
	 * @see domain.aps.electroniccomponents.ElectronicPart
	 * @generated
	 */
	EClass getElectronicPart();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.electroniccomponents.ElectronicPart#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pin</em>'.
	 * @see domain.aps.electroniccomponents.ElectronicPart#getPin()
	 * @see #getElectronicPart()
	 * @generated
	 */
	EReference getElectronicPart_Pin();

	/**
	 * Returns the meta object for the containment reference '{@link domain.aps.electroniccomponents.ElectronicPart#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physicalconnection</em>'.
	 * @see domain.aps.electroniccomponents.ElectronicPart#getPhysicalconnection()
	 * @see #getElectronicPart()
	 * @generated
	 */
	EReference getElectronicPart_Physicalconnection();

	/**
	 * Returns the meta object for class '{@link domain.aps.electroniccomponents.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see domain.aps.electroniccomponents.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for class '{@link domain.aps.electroniccomponents.MicroSwitch <em>Micro Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Micro Switch</em>'.
	 * @see domain.aps.electroniccomponents.MicroSwitch
	 * @generated
	 */
	EClass getMicroSwitch();

	/**
	 * Returns the meta object for class '{@link domain.aps.electroniccomponents.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see domain.aps.electroniccomponents.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for class '{@link domain.aps.electroniccomponents.Potentiometer <em>Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potentiometer</em>'.
	 * @see domain.aps.electroniccomponents.Potentiometer
	 * @generated
	 */
	EClass getPotentiometer();

	/**
	 * Returns the meta object for class '{@link domain.aps.electroniccomponents.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see domain.aps.electroniccomponents.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElectroniccomponentsFactory getElectroniccomponentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link domain.aps.electroniccomponents.impl.ElectronicPartImpl <em>Electronic Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.electroniccomponents.impl.ElectronicPartImpl
		 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getElectronicPart()
		 * @generated
		 */
		EClass ELECTRONIC_PART = eINSTANCE.getElectronicPart();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_PART__PIN = eINSTANCE.getElectronicPart_Pin();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRONIC_PART__PHYSICALCONNECTION = eINSTANCE.getElectronicPart_Physicalconnection();

		/**
		 * The meta object literal for the '{@link domain.aps.electroniccomponents.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.electroniccomponents.impl.SwitchImpl
		 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '{@link domain.aps.electroniccomponents.impl.MicroSwitchImpl <em>Micro Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.electroniccomponents.impl.MicroSwitchImpl
		 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getMicroSwitch()
		 * @generated
		 */
		EClass MICRO_SWITCH = eINSTANCE.getMicroSwitch();

		/**
		 * The meta object literal for the '{@link domain.aps.electroniccomponents.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.electroniccomponents.impl.LEDImpl
		 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '{@link domain.aps.electroniccomponents.impl.PotentiometerImpl <em>Potentiometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.electroniccomponents.impl.PotentiometerImpl
		 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getPotentiometer()
		 * @generated
		 */
		EClass POTENTIOMETER = eINSTANCE.getPotentiometer();

		/**
		 * The meta object literal for the '{@link domain.aps.electroniccomponents.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.electroniccomponents.impl.ButtonImpl
		 * @see domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

	}

} //ElectroniccomponentsPackage
