/**
 */
package domain.aps.mechanicalcomponents.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.buscomponents.impl.BuscomponentsPackageImpl;

import domain.aps.components.ComponentsPackage;

import domain.aps.components.impl.ComponentsPackageImpl;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.electroniccomponents.impl.ElectroniccomponentsPackageImpl;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.interfaces.impl.InterfacesPackageImpl;

import domain.aps.mechanicalcomponents.GripperPart;
import domain.aps.mechanicalcomponents.MechanicalPart;
import domain.aps.mechanicalcomponents.MechanicalcomponentsFactory;
import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;
import domain.aps.mechanicalcomponents.Pushhead;
import domain.aps.mechanicalcomponents.Ramp;
import domain.aps.mechanicalcomponents.ReturnSpring;
import domain.aps.mechanicalcomponents.RubberBand;
import domain.aps.mechanicalcomponents.Table;

import domain.aps.structures.StructuresPackage;

import domain.aps.structures.impl.StructuresPackageImpl;

import domain.as.AsPackage;

import domain.as.ComponentRepository.ComponentRepositoryPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MechanicalcomponentsPackageImpl extends EPackageImpl implements MechanicalcomponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mechanicalPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gripperPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushheadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnSpringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubberBandEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see domain.aps.mechanicalcomponents.MechanicalcomponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MechanicalcomponentsPackageImpl() {
		super(eNS_URI, MechanicalcomponentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MechanicalcomponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MechanicalcomponentsPackage init() {
		if (isInited) return (MechanicalcomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMechanicalcomponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MechanicalcomponentsPackageImpl theMechanicalcomponentsPackage = registeredMechanicalcomponentsPackage instanceof MechanicalcomponentsPackageImpl ? (MechanicalcomponentsPackageImpl)registeredMechanicalcomponentsPackage : new MechanicalcomponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(registeredPackage instanceof ComponentsPackageImpl ? registeredPackage : ComponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);
		BuscomponentsPackageImpl theBuscomponentsPackage = (BuscomponentsPackageImpl)(registeredPackage instanceof BuscomponentsPackageImpl ? registeredPackage : BuscomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);
		ElectroniccomponentsPackageImpl theElectroniccomponentsPackage = (ElectroniccomponentsPackageImpl)(registeredPackage instanceof ElectroniccomponentsPackageImpl ? registeredPackage : ElectroniccomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructuresPackage.eNS_URI);
		StructuresPackageImpl theStructuresPackage = (StructuresPackageImpl)(registeredPackage instanceof StructuresPackageImpl ? registeredPackage : StructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		InterfacesPackageImpl theInterfacesPackage = (InterfacesPackageImpl)(registeredPackage instanceof InterfacesPackageImpl ? registeredPackage : InterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		theMechanicalcomponentsPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theBuscomponentsPackage.createPackageContents();
		theElectroniccomponentsPackage.createPackageContents();
		theStructuresPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();

		// Initialize created meta-data
		theMechanicalcomponentsPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theBuscomponentsPackage.initializePackageContents();
		theElectroniccomponentsPackage.initializePackageContents();
		theStructuresPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMechanicalcomponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MechanicalcomponentsPackage.eNS_URI, theMechanicalcomponentsPackage);
		return theMechanicalcomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMechanicalPart() {
		return mechanicalPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMechanicalPart_Screwing() {
		return (EReference)mechanicalPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRamp() {
		return rampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Screwing_base() {
		return (EReference)rampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Screwing_component() {
		return (EReference)rampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRamp_Physicalconnection() {
		return (EReference)rampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGripperPart() {
		return gripperPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushhead() {
		return pushheadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnSpring() {
		return returnSpringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubberBand() {
		return rubberBandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalcomponentsFactory getMechanicalcomponentsFactory() {
		return (MechanicalcomponentsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mechanicalPartEClass = createEClass(MECHANICAL_PART);
		createEReference(mechanicalPartEClass, MECHANICAL_PART__SCREWING);

		rampEClass = createEClass(RAMP);
		createEReference(rampEClass, RAMP__SCREWING_BASE);
		createEReference(rampEClass, RAMP__SCREWING_COMPONENT);
		createEReference(rampEClass, RAMP__PHYSICALCONNECTION);

		gripperPartEClass = createEClass(GRIPPER_PART);

		pushheadEClass = createEClass(PUSHHEAD);

		returnSpringEClass = createEClass(RETURN_SPRING);

		tableEClass = createEClass(TABLE);

		rubberBandEClass = createEClass(RUBBER_BAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mechanicalPartEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		rampEClass.getESuperTypes().add(theComponentsPackage.getMechanicalAssembly());
		gripperPartEClass.getESuperTypes().add(theComponentsPackage.getMechanicalAssembly());
		pushheadEClass.getESuperTypes().add(this.getMechanicalPart());
		returnSpringEClass.getESuperTypes().add(this.getMechanicalPart());
		tableEClass.getESuperTypes().add(theComponentsPackage.getMechanicalAssembly());
		rubberBandEClass.getESuperTypes().add(this.getMechanicalPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(mechanicalPartEClass, MechanicalPart.class, "MechanicalPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMechanicalPart_Screwing(), theInterfacesPackage.getScrewing(), null, "screwing", null, 1, 1, MechanicalPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rampEClass, Ramp.class, "Ramp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRamp_Screwing_base(), theInterfacesPackage.getScrewing(), null, "screwing_base", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRamp_Screwing_component(), theInterfacesPackage.getScrewing(), null, "screwing_component", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRamp_Physicalconnection(), theInterfacesPackage.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, Ramp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gripperPartEClass, GripperPart.class, "GripperPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pushheadEClass, Pushhead.class, "Pushhead", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnSpringEClass, ReturnSpring.class, "ReturnSpring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rubberBandEClass, RubberBand.class, "RubberBand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MechanicalcomponentsPackageImpl
