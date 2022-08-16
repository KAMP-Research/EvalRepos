/**
 */
package domain.aps.electroniccomponents.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.buscomponents.impl.BuscomponentsPackageImpl;

import domain.aps.components.ComponentsPackage;

import domain.aps.components.impl.ComponentsPackageImpl;

import domain.aps.electroniccomponents.Button;
import domain.aps.electroniccomponents.ElectronicPart;
import domain.aps.electroniccomponents.ElectroniccomponentsFactory;
import domain.aps.electroniccomponents.ElectroniccomponentsPackage;
import domain.aps.electroniccomponents.MicroSwitch;
import domain.aps.electroniccomponents.Potentiometer;
import domain.aps.electroniccomponents.Switch;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.interfaces.impl.InterfacesPackageImpl;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.mechanicalcomponents.impl.MechanicalcomponentsPackageImpl;

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
public class ElectroniccomponentsPackageImpl extends EPackageImpl implements ElectroniccomponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentiometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

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
	 * @see domain.aps.electroniccomponents.ElectroniccomponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElectroniccomponentsPackageImpl() {
		super(eNS_URI, ElectroniccomponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElectroniccomponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElectroniccomponentsPackage init() {
		if (isInited) return (ElectroniccomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ElectroniccomponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredElectroniccomponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ElectroniccomponentsPackageImpl theElectroniccomponentsPackage = registeredElectroniccomponentsPackage instanceof ElectroniccomponentsPackageImpl ? (ElectroniccomponentsPackageImpl)registeredElectroniccomponentsPackage : new ElectroniccomponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(registeredPackage instanceof ComponentsPackageImpl ? registeredPackage : ComponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);
		BuscomponentsPackageImpl theBuscomponentsPackage = (BuscomponentsPackageImpl)(registeredPackage instanceof BuscomponentsPackageImpl ? registeredPackage : BuscomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MechanicalcomponentsPackage.eNS_URI);
		MechanicalcomponentsPackageImpl theMechanicalcomponentsPackage = (MechanicalcomponentsPackageImpl)(registeredPackage instanceof MechanicalcomponentsPackageImpl ? registeredPackage : MechanicalcomponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StructuresPackage.eNS_URI);
		StructuresPackageImpl theStructuresPackage = (StructuresPackageImpl)(registeredPackage instanceof StructuresPackageImpl ? registeredPackage : StructuresPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		InterfacesPackageImpl theInterfacesPackage = (InterfacesPackageImpl)(registeredPackage instanceof InterfacesPackageImpl ? registeredPackage : InterfacesPackage.eINSTANCE);

		// Create package meta-data objects
		theElectroniccomponentsPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theBuscomponentsPackage.createPackageContents();
		theMechanicalcomponentsPackage.createPackageContents();
		theStructuresPackage.createPackageContents();
		theInterfacesPackage.createPackageContents();

		// Initialize created meta-data
		theElectroniccomponentsPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theBuscomponentsPackage.initializePackageContents();
		theMechanicalcomponentsPackage.initializePackageContents();
		theStructuresPackage.initializePackageContents();
		theInterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theElectroniccomponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElectroniccomponentsPackage.eNS_URI, theElectroniccomponentsPackage);
		return theElectroniccomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectronicPart() {
		return electronicPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicPart_Pin() {
		return (EReference)electronicPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectronicPart_Physicalconnection() {
		return (EReference)electronicPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroSwitch() {
		return microSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotentiometer() {
		return potentiometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectroniccomponentsFactory getElectroniccomponentsFactory() {
		return (ElectroniccomponentsFactory)getEFactoryInstance();
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
		electronicPartEClass = createEClass(ELECTRONIC_PART);
		createEReference(electronicPartEClass, ELECTRONIC_PART__PIN);
		createEReference(electronicPartEClass, ELECTRONIC_PART__PHYSICALCONNECTION);

		switchEClass = createEClass(SWITCH);

		microSwitchEClass = createEClass(MICRO_SWITCH);

		ledEClass = createEClass(LED);

		potentiometerEClass = createEClass(POTENTIOMETER);

		buttonEClass = createEClass(BUTTON);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		electronicPartEClass.getESuperTypes().add(theComponentRepositoryPackage.getComponent());
		switchEClass.getESuperTypes().add(this.getElectronicPart());
		microSwitchEClass.getESuperTypes().add(this.getSwitch());
		ledEClass.getESuperTypes().add(this.getElectronicPart());
		potentiometerEClass.getESuperTypes().add(this.getElectronicPart());
		buttonEClass.getESuperTypes().add(this.getElectronicPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(electronicPartEClass, ElectronicPart.class, "ElectronicPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElectronicPart_Pin(), theInterfacesPackage.getSignalInterface(), null, "pin", null, 1, 1, ElectronicPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectronicPart_Physicalconnection(), theInterfacesPackage.getPhysicalConnection(), null, "physicalconnection", null, 1, 1, ElectronicPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microSwitchEClass, MicroSwitch.class, "MicroSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ledEClass, domain.aps.electroniccomponents.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(potentiometerEClass, Potentiometer.class, "Potentiometer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ElectroniccomponentsPackageImpl
