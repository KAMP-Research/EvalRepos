/**
 */
package domain.aps.mechanicalcomponents;

import domain.aps.components.ComponentsPackage;

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
 * @see domain.aps.mechanicalcomponents.MechanicalcomponentsFactory
 * @model kind="package"
 * @generated
 */
public interface MechanicalcomponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mechanicalcomponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mechanicalcomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mechanicalcomponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MechanicalcomponentsPackage eINSTANCE = domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.aps.mechanicalcomponents.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalPartImpl
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getMechanicalPart()
	 * @generated
	 */
	int MECHANICAL_PART = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__ID = ComponentRepositoryPackage.COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__NAME = ComponentRepositoryPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__CONNECTED_INTERFACES = ComponentRepositoryPackage.COMPONENT__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__PARENT = ComponentRepositoryPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__PARENT_MODULE = ComponentRepositoryPackage.COMPONENT__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART__SCREWING = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mechanical Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART_FEATURE_COUNT = ComponentRepositoryPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mechanical Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECHANICAL_PART_OPERATION_COUNT = ComponentRepositoryPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.mechanicalcomponents.impl.RampImpl <em>Ramp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.mechanicalcomponents.impl.RampImpl
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getRamp()
	 * @generated
	 */
	int RAMP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__ID = ComponentsPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__NAME = ComponentsPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__CONNECTED_INTERFACES = ComponentsPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__PARENT = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__PARENT_MODULE = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__SCREWING_BASE = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screwing component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__SCREWING_COMPONENT = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP__PHYSICALCONNECTION = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_FEATURE_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ramp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAMP_OPERATION_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.mechanicalcomponents.impl.GripperPartImpl <em>Gripper Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.mechanicalcomponents.impl.GripperPartImpl
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getGripperPart()
	 * @generated
	 */
	int GRIPPER_PART = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__ID = ComponentsPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__NAME = ComponentsPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__CONNECTED_INTERFACES = ComponentsPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__PARENT = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART__PARENT_MODULE = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Gripper Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART_FEATURE_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gripper Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_PART_OPERATION_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.mechanicalcomponents.impl.PushheadImpl <em>Pushhead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.mechanicalcomponents.impl.PushheadImpl
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getPushhead()
	 * @generated
	 */
	int PUSHHEAD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__ID = MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__NAME = MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__CONNECTED_INTERFACES = MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__PARENT = MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__PARENT_MODULE = MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Pushhead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pushhead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHHEAD_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.mechanicalcomponents.impl.ReturnSpringImpl <em>Return Spring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.mechanicalcomponents.impl.ReturnSpringImpl
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getReturnSpring()
	 * @generated
	 */
	int RETURN_SPRING = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__ID = MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__NAME = MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__CONNECTED_INTERFACES = MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__PARENT = MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__PARENT_MODULE = MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Return Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Spring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_SPRING_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.mechanicalcomponents.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.mechanicalcomponents.impl.TableImpl
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = ComponentsPackage.MECHANICAL_ASSEMBLY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = ComponentsPackage.MECHANICAL_ASSEMBLY__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONNECTED_INTERFACES = ComponentsPackage.MECHANICAL_ASSEMBLY__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARENT = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARENT_MODULE = ComponentsPackage.MECHANICAL_ASSEMBLY__PARENT_MODULE;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ComponentsPackage.MECHANICAL_ASSEMBLY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.mechanicalcomponents.impl.RubberBandImpl <em>Rubber Band</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.mechanicalcomponents.impl.RubberBandImpl
	 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getRubberBand()
	 * @generated
	 */
	int RUBBER_BAND = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__ID = MECHANICAL_PART__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__NAME = MECHANICAL_PART__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__CONNECTED_INTERFACES = MECHANICAL_PART__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__PARENT = MECHANICAL_PART__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__PARENT_MODULE = MECHANICAL_PART__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Screwing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND__SCREWING = MECHANICAL_PART__SCREWING;

	/**
	 * The number of structural features of the '<em>Rubber Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND_FEATURE_COUNT = MECHANICAL_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rubber Band</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBBER_BAND_OPERATION_COUNT = MECHANICAL_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.aps.mechanicalcomponents.MechanicalPart <em>Mechanical Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mechanical Part</em>'.
	 * @see domain.aps.mechanicalcomponents.MechanicalPart
	 * @generated
	 */
	EClass getMechanicalPart();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.mechanicalcomponents.MechanicalPart#getScrewing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing</em>'.
	 * @see domain.aps.mechanicalcomponents.MechanicalPart#getScrewing()
	 * @see #getMechanicalPart()
	 * @generated
	 */
	EReference getMechanicalPart_Screwing();

	/**
	 * Returns the meta object for class '{@link domain.aps.mechanicalcomponents.Ramp <em>Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ramp</em>'.
	 * @see domain.aps.mechanicalcomponents.Ramp
	 * @generated
	 */
	EClass getRamp();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.mechanicalcomponents.Ramp#getScrewing_base <em>Screwing base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing base</em>'.
	 * @see domain.aps.mechanicalcomponents.Ramp#getScrewing_base()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Screwing_base();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.mechanicalcomponents.Ramp#getScrewing_component <em>Screwing component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screwing component</em>'.
	 * @see domain.aps.mechanicalcomponents.Ramp#getScrewing_component()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Screwing_component();

	/**
	 * Returns the meta object for the reference '{@link domain.aps.mechanicalcomponents.Ramp#getPhysicalconnection <em>Physicalconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalconnection</em>'.
	 * @see domain.aps.mechanicalcomponents.Ramp#getPhysicalconnection()
	 * @see #getRamp()
	 * @generated
	 */
	EReference getRamp_Physicalconnection();

	/**
	 * Returns the meta object for class '{@link domain.aps.mechanicalcomponents.GripperPart <em>Gripper Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gripper Part</em>'.
	 * @see domain.aps.mechanicalcomponents.GripperPart
	 * @generated
	 */
	EClass getGripperPart();

	/**
	 * Returns the meta object for class '{@link domain.aps.mechanicalcomponents.Pushhead <em>Pushhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pushhead</em>'.
	 * @see domain.aps.mechanicalcomponents.Pushhead
	 * @generated
	 */
	EClass getPushhead();

	/**
	 * Returns the meta object for class '{@link domain.aps.mechanicalcomponents.ReturnSpring <em>Return Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Spring</em>'.
	 * @see domain.aps.mechanicalcomponents.ReturnSpring
	 * @generated
	 */
	EClass getReturnSpring();

	/**
	 * Returns the meta object for class '{@link domain.aps.mechanicalcomponents.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see domain.aps.mechanicalcomponents.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link domain.aps.mechanicalcomponents.RubberBand <em>Rubber Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rubber Band</em>'.
	 * @see domain.aps.mechanicalcomponents.RubberBand
	 * @generated
	 */
	EClass getRubberBand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MechanicalcomponentsFactory getMechanicalcomponentsFactory();

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
		 * The meta object literal for the '{@link domain.aps.mechanicalcomponents.impl.MechanicalPartImpl <em>Mechanical Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalPartImpl
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getMechanicalPart()
		 * @generated
		 */
		EClass MECHANICAL_PART = eINSTANCE.getMechanicalPart();

		/**
		 * The meta object literal for the '<em><b>Screwing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MECHANICAL_PART__SCREWING = eINSTANCE.getMechanicalPart_Screwing();

		/**
		 * The meta object literal for the '{@link domain.aps.mechanicalcomponents.impl.RampImpl <em>Ramp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.mechanicalcomponents.impl.RampImpl
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getRamp()
		 * @generated
		 */
		EClass RAMP = eINSTANCE.getRamp();

		/**
		 * The meta object literal for the '<em><b>Screwing base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__SCREWING_BASE = eINSTANCE.getRamp_Screwing_base();

		/**
		 * The meta object literal for the '<em><b>Screwing component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__SCREWING_COMPONENT = eINSTANCE.getRamp_Screwing_component();

		/**
		 * The meta object literal for the '<em><b>Physicalconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAMP__PHYSICALCONNECTION = eINSTANCE.getRamp_Physicalconnection();

		/**
		 * The meta object literal for the '{@link domain.aps.mechanicalcomponents.impl.GripperPartImpl <em>Gripper Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.mechanicalcomponents.impl.GripperPartImpl
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getGripperPart()
		 * @generated
		 */
		EClass GRIPPER_PART = eINSTANCE.getGripperPart();

		/**
		 * The meta object literal for the '{@link domain.aps.mechanicalcomponents.impl.PushheadImpl <em>Pushhead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.mechanicalcomponents.impl.PushheadImpl
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getPushhead()
		 * @generated
		 */
		EClass PUSHHEAD = eINSTANCE.getPushhead();

		/**
		 * The meta object literal for the '{@link domain.aps.mechanicalcomponents.impl.ReturnSpringImpl <em>Return Spring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.mechanicalcomponents.impl.ReturnSpringImpl
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getReturnSpring()
		 * @generated
		 */
		EClass RETURN_SPRING = eINSTANCE.getReturnSpring();

		/**
		 * The meta object literal for the '{@link domain.aps.mechanicalcomponents.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.mechanicalcomponents.impl.TableImpl
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link domain.aps.mechanicalcomponents.impl.RubberBandImpl <em>Rubber Band</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.mechanicalcomponents.impl.RubberBandImpl
		 * @see domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl#getRubberBand()
		 * @generated
		 */
		EClass RUBBER_BAND = eINSTANCE.getRubberBand();

	}

} //MechanicalcomponentsPackage
