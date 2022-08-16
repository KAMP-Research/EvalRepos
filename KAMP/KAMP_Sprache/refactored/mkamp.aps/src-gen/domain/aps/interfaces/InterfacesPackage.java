/**
 */
package domain.aps.interfaces;

import domain.as.InterfaceRepository.InterfaceRepositoryPackage;

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
 * @see domain.aps.interfaces.InterfacesFactory
 * @model kind="package"
 * @generated
 */
public interface InterfacesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interfaces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "interfaces";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interfaces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfacesPackage eINSTANCE = domain.aps.interfaces.impl.InterfacesPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.FixtureImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.WaterSupplyImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getWaterSupply()
	 * @generated
	 */
	int WATER_SUPPLY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Water Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Water Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SUPPLY_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.PhysicalConnectionImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getPhysicalConnection()
	 * @generated
	 */
	int PHYSICAL_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.SuspensionImpl <em>Suspension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.SuspensionImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getSuspension()
	 * @generated
	 */
	int SUSPENSION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Suspension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPENSION_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.TransportConnectionImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getTransportConnection()
	 * @generated
	 */
	int TRANSPORT_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Transport Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CONNECTION_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.ClampingImpl <em>Clamping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.ClampingImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getClamping()
	 * @generated
	 */
	int CLAMPING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Clamping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clamping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAMPING_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.GearingImpl <em>Gearing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.GearingImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getGearing()
	 * @generated
	 */
	int GEARING = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Gearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gearing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEARING_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.ScrewingImpl <em>Screwing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.ScrewingImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getScrewing()
	 * @generated
	 */
	int SCREWING = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Screwing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREWING_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.PneumaticSupplyImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getPneumaticSupply()
	 * @generated
	 */
	int PNEUMATIC_SUPPLY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Pneumatic Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pneumatic Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNEUMATIC_SUPPLY_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.aps.interfaces.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.aps.interfaces.impl.SignalInterfaceImpl
	 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getSignalInterface()
	 * @generated
	 */
	int SIGNAL_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__ID = InterfaceRepositoryPackage.INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__NAME = InterfaceRepositoryPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE__PARENT_ELEMENT = InterfaceRepositoryPackage.INTERFACE__PARENT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Signal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE_FEATURE_COUNT = InterfaceRepositoryPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_INTERFACE_OPERATION_COUNT = InterfaceRepositoryPackage.INTERFACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see domain.aps.interfaces.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.WaterSupply <em>Water Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Supply</em>'.
	 * @see domain.aps.interfaces.WaterSupply
	 * @generated
	 */
	EClass getWaterSupply();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connection</em>'.
	 * @see domain.aps.interfaces.PhysicalConnection
	 * @generated
	 */
	EClass getPhysicalConnection();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspension</em>'.
	 * @see domain.aps.interfaces.Suspension
	 * @generated
	 */
	EClass getSuspension();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.TransportConnection <em>Transport Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Connection</em>'.
	 * @see domain.aps.interfaces.TransportConnection
	 * @generated
	 */
	EClass getTransportConnection();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.Clamping <em>Clamping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clamping</em>'.
	 * @see domain.aps.interfaces.Clamping
	 * @generated
	 */
	EClass getClamping();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.Gearing <em>Gearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gearing</em>'.
	 * @see domain.aps.interfaces.Gearing
	 * @generated
	 */
	EClass getGearing();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screwing</em>'.
	 * @see domain.aps.interfaces.Screwing
	 * @generated
	 */
	EClass getScrewing();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.PneumaticSupply <em>Pneumatic Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pneumatic Supply</em>'.
	 * @see domain.aps.interfaces.PneumaticSupply
	 * @generated
	 */
	EClass getPneumaticSupply();

	/**
	 * Returns the meta object for class '{@link domain.aps.interfaces.SignalInterface <em>Signal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Interface</em>'.
	 * @see domain.aps.interfaces.SignalInterface
	 * @generated
	 */
	EClass getSignalInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfacesFactory getInterfacesFactory();

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
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.FixtureImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.WaterSupplyImpl <em>Water Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.WaterSupplyImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getWaterSupply()
		 * @generated
		 */
		EClass WATER_SUPPLY = eINSTANCE.getWaterSupply();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.PhysicalConnectionImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getPhysicalConnection()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.SuspensionImpl <em>Suspension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.SuspensionImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getSuspension()
		 * @generated
		 */
		EClass SUSPENSION = eINSTANCE.getSuspension();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.TransportConnectionImpl <em>Transport Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.TransportConnectionImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getTransportConnection()
		 * @generated
		 */
		EClass TRANSPORT_CONNECTION = eINSTANCE.getTransportConnection();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.ClampingImpl <em>Clamping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.ClampingImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getClamping()
		 * @generated
		 */
		EClass CLAMPING = eINSTANCE.getClamping();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.GearingImpl <em>Gearing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.GearingImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getGearing()
		 * @generated
		 */
		EClass GEARING = eINSTANCE.getGearing();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.ScrewingImpl <em>Screwing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.ScrewingImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getScrewing()
		 * @generated
		 */
		EClass SCREWING = eINSTANCE.getScrewing();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.PneumaticSupplyImpl <em>Pneumatic Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.PneumaticSupplyImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getPneumaticSupply()
		 * @generated
		 */
		EClass PNEUMATIC_SUPPLY = eINSTANCE.getPneumaticSupply();

		/**
		 * The meta object literal for the '{@link domain.aps.interfaces.impl.SignalInterfaceImpl <em>Signal Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.aps.interfaces.impl.SignalInterfaceImpl
		 * @see domain.aps.interfaces.impl.InterfacesPackageImpl#getSignalInterface()
		 * @generated
		 */
		EClass SIGNAL_INTERFACE = eINSTANCE.getSignalInterface();

	}

} //InterfacesPackage
