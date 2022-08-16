/**
 */
package domain.ppu.ppustructures;

import domain.as.StructureRepository.StructureRepositoryPackage;

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
 * @see domain.ppu.ppustructures.PpustructuresFactory
 * @model kind="package"
 * @generated
 */
public interface PpustructuresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppustructures";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ppustructures";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppustructures";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpustructuresPackage eINSTANCE = domain.ppu.ppustructures.impl.PpustructuresPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.ppu.ppustructures.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppustructures.impl.ConveyorImpl
	 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Belts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__BELTS = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppustructures.impl.PneumaticNetworkImpl <em>Pneumatic Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppustructures.impl.PneumaticNetworkImpl
	 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getPneumaticNetwork()
	 * @generated
	 */
	int PNEUMATIC_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Pneumatic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_NETWORK_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppustructures.impl.CommunicationNetworkImpl <em>Communication Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppustructures.impl.CommunicationNetworkImpl
	 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getCommunicationNetwork()
	 * @generated
	 */
	int COMMUNICATION_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Communication Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_NETWORK_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppustructures.impl.PowerNetworkImpl <em>Power Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppustructures.impl.PowerNetworkImpl
	 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getPowerNetwork()
	 * @generated
	 */
	int POWER_NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Power Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_NETWORK_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppustructures.impl.CraneImpl <em>Crane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppustructures.impl.CraneImpl
	 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getCrane()
	 * @generated
	 */
	int CRANE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Arm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ARM = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mounted On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__MOUNTED_ON = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vacuumgripper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__VACUUMGRIPPER = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Crane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Crane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppustructures.impl.PowerWiringImpl <em>Power Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppustructures.impl.PowerWiringImpl
	 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getPowerWiring()
	 * @generated
	 */
	int POWER_WIRING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Power Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Power Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_WIRING_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppustructures.impl.LogicalWiringImpl <em>Logical Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppustructures.impl.LogicalWiringImpl
	 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getLogicalWiring()
	 * @generated
	 */
	int LOGICAL_WIRING = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__ID = StructureRepositoryPackage.STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__NAME = StructureRepositoryPackage.STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Plant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__PARENT_PLANT = StructureRepositoryPackage.STRUCTURE__PARENT_PLANT;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__MODULES = StructureRepositoryPackage.STRUCTURE__MODULES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING__COMPONENTS = StructureRepositoryPackage.STRUCTURE__COMPONENTS;

	/**
	 * The number of structural features of the '<em>Logical Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING_FEATURE_COUNT = StructureRepositoryPackage.STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WIRING_OPERATION_COUNT = StructureRepositoryPackage.STRUCTURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.ppu.ppustructures.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see domain.ppu.ppustructures.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.ppu.ppustructures.Conveyor#getBelts <em>Belts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Belts</em>'.
	 * @see domain.ppu.ppustructures.Conveyor#getBelts()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Belts();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppustructures.PneumaticNetwork <em>Pneumatic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Network</em>'.
	 * @see domain.ppu.ppustructures.PneumaticNetwork
	 * @generated
	 */
	EClass getPneumaticNetwork();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppustructures.CommunicationNetwork <em>Communication Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Network</em>'.
	 * @see domain.ppu.ppustructures.CommunicationNetwork
	 * @generated
	 */
	EClass getCommunicationNetwork();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppustructures.PowerNetwork <em>Power Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Network</em>'.
	 * @see domain.ppu.ppustructures.PowerNetwork
	 * @generated
	 */
	EClass getPowerNetwork();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppustructures.Crane <em>Crane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crane</em>'.
	 * @see domain.ppu.ppustructures.Crane
	 * @generated
	 */
	EClass getCrane();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppustructures.Crane#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arm</em>'.
	 * @see domain.ppu.ppustructures.Crane#getArm()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_Arm();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppustructures.Crane#getMountedOn <em>Mounted On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounted On</em>'.
	 * @see domain.ppu.ppustructures.Crane#getMountedOn()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_MountedOn();

	/**
	 * Returns the meta object for the reference '{@link domain.ppu.ppustructures.Crane#getVacuumgripper <em>Vacuumgripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vacuumgripper</em>'.
	 * @see domain.ppu.ppustructures.Crane#getVacuumgripper()
	 * @see #getCrane()
	 * @generated
	 */
	EReference getCrane_Vacuumgripper();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppustructures.PowerWiring <em>Power Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Wiring</em>'.
	 * @see domain.ppu.ppustructures.PowerWiring
	 * @generated
	 */
	EClass getPowerWiring();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppustructures.LogicalWiring <em>Logical Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Wiring</em>'.
	 * @see domain.ppu.ppustructures.LogicalWiring
	 * @generated
	 */
	EClass getLogicalWiring();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PpustructuresFactory getPpustructuresFactory();

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
		 * The meta object literal for the '{@link domain.ppu.ppustructures.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppustructures.impl.ConveyorImpl
		 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Belts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__BELTS = eINSTANCE.getConveyor_Belts();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppustructures.impl.PneumaticNetworkImpl <em>Pneumatic Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppustructures.impl.PneumaticNetworkImpl
		 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getPneumaticNetwork()
		 * @generated
		 */
		EClass PNEUMATIC_NETWORK = eINSTANCE.getPneumaticNetwork();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppustructures.impl.CommunicationNetworkImpl <em>Communication Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppustructures.impl.CommunicationNetworkImpl
		 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getCommunicationNetwork()
		 * @generated
		 */
		EClass COMMUNICATION_NETWORK = eINSTANCE.getCommunicationNetwork();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppustructures.impl.PowerNetworkImpl <em>Power Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppustructures.impl.PowerNetworkImpl
		 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getPowerNetwork()
		 * @generated
		 */
		EClass POWER_NETWORK = eINSTANCE.getPowerNetwork();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppustructures.impl.CraneImpl <em>Crane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppustructures.impl.CraneImpl
		 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getCrane()
		 * @generated
		 */
		EClass CRANE = eINSTANCE.getCrane();

		/**
		 * The meta object literal for the '<em><b>Arm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRANE__ARM = eINSTANCE.getCrane_Arm();

		/**
		 * The meta object literal for the '<em><b>Mounted On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRANE__MOUNTED_ON = eINSTANCE.getCrane_MountedOn();

		/**
		 * The meta object literal for the '<em><b>Vacuumgripper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRANE__VACUUMGRIPPER = eINSTANCE.getCrane_Vacuumgripper();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppustructures.impl.PowerWiringImpl <em>Power Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppustructures.impl.PowerWiringImpl
		 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getPowerWiring()
		 * @generated
		 */
		EClass POWER_WIRING = eINSTANCE.getPowerWiring();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppustructures.impl.LogicalWiringImpl <em>Logical Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppustructures.impl.LogicalWiringImpl
		 * @see domain.ppu.ppustructures.impl.PpustructuresPackageImpl#getLogicalWiring()
		 * @generated
		 */
		EClass LOGICAL_WIRING = eINSTANCE.getLogicalWiring();

	}

} //PpustructuresPackage
