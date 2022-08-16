/**
 */
package domain.ppu.ppuinterfaces;

import domain.aps.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see domain.ppu.ppuinterfaces.PpuinterfacesFactory
 * @model kind="package"
 * @generated
 */
public interface PpuinterfacesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppuinterfaces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ppuinterfaces";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppuinterfaces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpuinterfacesPackage eINSTANCE = domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.SuspensionRackImpl <em>Suspension Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.SuspensionRackImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getSuspensionRack()
	 * @generated
	 */
	int SUSPENSION_RACK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__ID = InterfacesPackage.SUSPENSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__NAME = InterfacesPackage.SUSPENSION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK__PARENT_ELEMENT = InterfacesPackage.SUSPENSION__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK_FEATURE_COUNT = InterfacesPackage.SUSPENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_RACK_OPERATION_COUNT = InterfacesPackage.SUSPENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.SuspensionArmImpl <em>Suspension Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.SuspensionArmImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getSuspensionArm()
	 * @generated
	 */
	int SUSPENSION_ARM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__ID = InterfacesPackage.SUSPENSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__NAME = InterfacesPackage.SUSPENSION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM__PARENT_ELEMENT = InterfacesPackage.SUSPENSION__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM_FEATURE_COUNT = InterfacesPackage.SUSPENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_ARM_OPERATION_COUNT = InterfacesPackage.SUSPENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingSplitterImpl <em>Screwing Splitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.ScrewingSplitterImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingSplitter()
	 * @generated
	 */
	int SCREWING_SPLITTER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__ID = InterfacesPackage.SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__NAME = InterfacesPackage.SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER__PARENT_ELEMENT = InterfacesPackage.SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER_FEATURE_COUNT = InterfacesPackage.SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Splitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_SPLITTER_OPERATION_COUNT = InterfacesPackage.SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingMotorImpl <em>Screwing Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.ScrewingMotorImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingMotor()
	 * @generated
	 */
	int SCREWING_MOTOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__ID = InterfacesPackage.SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__NAME = InterfacesPackage.SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR__PARENT_ELEMENT = InterfacesPackage.SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR_FEATURE_COUNT = InterfacesPackage.SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_MOTOR_OPERATION_COUNT = InterfacesPackage.SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingPotentiometerImpl <em>Screwing Potentiometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.ScrewingPotentiometerImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingPotentiometer()
	 * @generated
	 */
	int SCREWING_POTENTIOMETER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__ID = InterfacesPackage.SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__NAME = InterfacesPackage.SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER__PARENT_ELEMENT = InterfacesPackage.SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER_FEATURE_COUNT = InterfacesPackage.SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Potentiometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_POTENTIOMETER_OPERATION_COUNT = InterfacesPackage.SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingFixtureImpl <em>Screwing Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.ScrewingFixtureImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingFixture()
	 * @generated
	 */
	int SCREWING_FIXTURE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__ID = InterfacesPackage.SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__NAME = InterfacesPackage.SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE__PARENT_ELEMENT = InterfacesPackage.SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE_FEATURE_COUNT = InterfacesPackage.SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FIXTURE_OPERATION_COUNT = InterfacesPackage.SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingRackImpl <em>Screwing Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.ScrewingRackImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingRack()
	 * @generated
	 */
	int SCREWING_RACK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__ID = InterfacesPackage.SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__NAME = InterfacesPackage.SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK__PARENT_ELEMENT = InterfacesPackage.SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK_FEATURE_COUNT = InterfacesPackage.SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_RACK_OPERATION_COUNT = InterfacesPackage.SCREWING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingCylinderImpl <em>Screwing Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppuinterfaces.impl.ScrewingCylinderImpl
	 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingCylinder()
	 * @generated
	 */
	int SCREWING_CYLINDER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__ID = InterfacesPackage.SCREWING__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__NAME = InterfacesPackage.SCREWING__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER__PARENT_ELEMENT = InterfacesPackage.SCREWING__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER_FEATURE_COUNT = InterfacesPackage.SCREWING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_CYLINDER_OPERATION_COUNT = InterfacesPackage.SCREWING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.SuspensionRack <em>Suspension Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension Rack</em>'.
	 * @see domain.ppu.ppuinterfaces.SuspensionRack
	 * @generated
	 */
	EClass getSuspensionRack();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.SuspensionArm <em>Suspension Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension Arm</em>'.
	 * @see domain.ppu.ppuinterfaces.SuspensionArm
	 * @generated
	 */
	EClass getSuspensionArm();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.ScrewingSplitter <em>Screwing Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Splitter</em>'.
	 * @see domain.ppu.ppuinterfaces.ScrewingSplitter
	 * @generated
	 */
	EClass getScrewingSplitter();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.ScrewingMotor <em>Screwing Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Motor</em>'.
	 * @see domain.ppu.ppuinterfaces.ScrewingMotor
	 * @generated
	 */
	EClass getScrewingMotor();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.ScrewingPotentiometer <em>Screwing Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Potentiometer</em>'.
	 * @see domain.ppu.ppuinterfaces.ScrewingPotentiometer
	 * @generated
	 */
	EClass getScrewingPotentiometer();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.ScrewingFixture <em>Screwing Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Fixture</em>'.
	 * @see domain.ppu.ppuinterfaces.ScrewingFixture
	 * @generated
	 */
	EClass getScrewingFixture();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.ScrewingRack <em>Screwing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Rack</em>'.
	 * @see domain.ppu.ppuinterfaces.ScrewingRack
	 * @generated
	 */
	EClass getScrewingRack();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppuinterfaces.ScrewingCylinder <em>Screwing Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing Cylinder</em>'.
	 * @see domain.ppu.ppuinterfaces.ScrewingCylinder
	 * @generated
	 */
	EClass getScrewingCylinder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PpuinterfacesFactory getPpuinterfacesFactory();

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
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.SuspensionRackImpl <em>Suspension Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.SuspensionRackImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getSuspensionRack()
		 * @generated
		 */
		EClass SUSPENSION_RACK = eINSTANCE.getSuspensionRack();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.SuspensionArmImpl <em>Suspension Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.SuspensionArmImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getSuspensionArm()
		 * @generated
		 */
		EClass SUSPENSION_ARM = eINSTANCE.getSuspensionArm();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingSplitterImpl <em>Screwing Splitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.ScrewingSplitterImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingSplitter()
		 * @generated
		 */
		EClass SCREWING_SPLITTER = eINSTANCE.getScrewingSplitter();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingMotorImpl <em>Screwing Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.ScrewingMotorImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingMotor()
		 * @generated
		 */
		EClass SCREWING_MOTOR = eINSTANCE.getScrewingMotor();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingPotentiometerImpl <em>Screwing Potentiometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.ScrewingPotentiometerImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingPotentiometer()
		 * @generated
		 */
		EClass SCREWING_POTENTIOMETER = eINSTANCE.getScrewingPotentiometer();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingFixtureImpl <em>Screwing Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.ScrewingFixtureImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingFixture()
		 * @generated
		 */
		EClass SCREWING_FIXTURE = eINSTANCE.getScrewingFixture();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingRackImpl <em>Screwing Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.ScrewingRackImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingRack()
		 * @generated
		 */
		EClass SCREWING_RACK = eINSTANCE.getScrewingRack();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppuinterfaces.impl.ScrewingCylinderImpl <em>Screwing Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppuinterfaces.impl.ScrewingCylinderImpl
		 * @see domain.ppu.ppuinterfaces.impl.PpuinterfacesPackageImpl#getScrewingCylinder()
		 * @generated
		 */
		EClass SCREWING_CYLINDER = eINSTANCE.getScrewingCylinder();

	}

} //PpuinterfacesPackage
