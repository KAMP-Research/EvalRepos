/**
 */
package quality.aps_mm.impl;

import domain.aps.buscomponents.BuscomponentsPackage;

import domain.aps.components.ComponentsPackage;

import domain.aps.electroniccomponents.ElectroniccomponentsPackage;

import domain.aps.interfaces.InterfacesPackage;

import domain.aps.mechanicalcomponents.MechanicalcomponentsPackage;

import domain.aps.structures.StructuresPackage;

import domain.as.AsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import paradigm.basic.BasicPackage;

import paradigm.modificationmarks.ModificationmarksPackage;

import quality.aps_mm.Aps_mmFactory;
import quality.aps_mm.Aps_mmPackage;
import quality.aps_mm.ModifyBusBox;
import quality.aps_mm.ModifyBusCable;
import quality.aps_mm.ModifyBusMaster;
import quality.aps_mm.ModifyBusSlave;
import quality.aps_mm.ModifyPhysicalConnection;
import quality.aps_mm.ModifyRamp;
import quality.aps_mm.ModifySensor;
import quality.aps_mm.ModifySignalinterface;

import quality.as_mm.As_mmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aps_mmPackageImpl extends EPackageImpl implements Aps_mmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyPhysicalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySignalinterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusSlaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyRampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusCableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyBusBoxEClass = null;

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
	 * @see quality.aps_mm.Aps_mmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Aps_mmPackageImpl() {
		super(eNS_URI, Aps_mmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Aps_mmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Aps_mmPackage init() {
		if (isInited) return (Aps_mmPackage)EPackage.Registry.INSTANCE.getEPackage(Aps_mmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAps_mmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Aps_mmPackageImpl theAps_mmPackage = registeredAps_mmPackage instanceof Aps_mmPackageImpl ? (Aps_mmPackageImpl)registeredAps_mmPackage : new Aps_mmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentsPackage.eINSTANCE.eClass();
		BuscomponentsPackage.eINSTANCE.eClass();
		ElectroniccomponentsPackage.eINSTANCE.eClass();
		MechanicalcomponentsPackage.eINSTANCE.eClass();
		StructuresPackage.eINSTANCE.eClass();
		InterfacesPackage.eINSTANCE.eClass();
		AsPackage.eINSTANCE.eClass();
		As_mmPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAps_mmPackage.createPackageContents();

		// Initialize created meta-data
		theAps_mmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAps_mmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Aps_mmPackage.eNS_URI, theAps_mmPackage);
		return theAps_mmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusMaster() {
		return modifyBusMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyPhysicalConnection() {
		return modifyPhysicalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySignalinterface() {
		return modifySignalinterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifySensor() {
		return modifySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySensor_ModifySignalInterfaces() {
		return (EReference)modifySensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifySensor_ModifyPhysicalConnections() {
		return (EReference)modifySensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusSlave() {
		return modifyBusSlaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyRamp() {
		return modifyRampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusCable() {
		return modifyBusCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyBusBox() {
		return modifyBusBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_mmFactory getAps_mmFactory() {
		return (Aps_mmFactory)getEFactoryInstance();
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
		modifyBusMasterEClass = createEClass(MODIFY_BUS_MASTER);

		modifyPhysicalConnectionEClass = createEClass(MODIFY_PHYSICAL_CONNECTION);

		modifySignalinterfaceEClass = createEClass(MODIFY_SIGNALINTERFACE);

		modifySensorEClass = createEClass(MODIFY_SENSOR);
		createEReference(modifySensorEClass, MODIFY_SENSOR__MODIFY_SIGNAL_INTERFACES);
		createEReference(modifySensorEClass, MODIFY_SENSOR__MODIFY_PHYSICAL_CONNECTIONS);

		modifyBusSlaveEClass = createEClass(MODIFY_BUS_SLAVE);

		modifyRampEClass = createEClass(MODIFY_RAMP);

		modifyBusCableEClass = createEClass(MODIFY_BUS_CABLE);

		modifyBusBoxEClass = createEClass(MODIFY_BUS_BOX);
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
		As_mmPackage theAs_mmPackage = (As_mmPackage)EPackage.Registry.INSTANCE.getEPackage(As_mmPackage.eNS_URI);
		BuscomponentsPackage theBuscomponentsPackage = (BuscomponentsPackage)EPackage.Registry.INSTANCE.getEPackage(BuscomponentsPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theAs_mmPackage.getModifyComponent());
		EGenericType g2 = createEGenericType(theBuscomponentsPackage.getBusMaster());
		g1.getETypeArguments().add(g2);
		modifyBusMasterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAs_mmPackage.getModifyInterface());
		g2 = createEGenericType(theInterfacesPackage.getPhysicalConnection());
		g1.getETypeArguments().add(g2);
		modifyPhysicalConnectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAs_mmPackage.getModifyInterface());
		g2 = createEGenericType(theInterfacesPackage.getSignalInterface());
		g1.getETypeArguments().add(g2);
		modifySignalinterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAs_mmPackage.getModifyComponent());
		g2 = createEGenericType(theComponentsPackage.getSensor());
		g1.getETypeArguments().add(g2);
		modifySensorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAs_mmPackage.getModifyComponent());
		g2 = createEGenericType(theBuscomponentsPackage.getBusSlave());
		g1.getETypeArguments().add(g2);
		modifyBusSlaveEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAs_mmPackage.getModifyComponent());
		g2 = createEGenericType(theComponentsPackage.getRegularRamp());
		g1.getETypeArguments().add(g2);
		modifyRampEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAs_mmPackage.getModifyComponent());
		g2 = createEGenericType(theBuscomponentsPackage.getBusCable());
		g1.getETypeArguments().add(g2);
		modifyBusCableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAs_mmPackage.getModifyComponent());
		g2 = createEGenericType(theBuscomponentsPackage.getBusBox());
		g1.getETypeArguments().add(g2);
		modifyBusBoxEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(modifyBusMasterEClass, ModifyBusMaster.class, "ModifyBusMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyPhysicalConnectionEClass, ModifyPhysicalConnection.class, "ModifyPhysicalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifySignalinterfaceEClass, ModifySignalinterface.class, "ModifySignalinterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifySensorEClass, ModifySensor.class, "ModifySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifySensor_ModifySignalInterfaces(), theInterfacesPackage.getSignalInterface(), null, "modifySignalInterfaces", null, 0, -1, ModifySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifySensor_ModifyPhysicalConnections(), theInterfacesPackage.getPhysicalConnection(), null, "modifyPhysicalConnections", null, 0, -1, ModifySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifyBusSlaveEClass, ModifyBusSlave.class, "ModifyBusSlave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyRampEClass, ModifyRamp.class, "ModifyRamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusCableEClass, ModifyBusCable.class, "ModifyBusCable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modifyBusBoxEClass, ModifyBusBox.class, "ModifyBusBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Aps_mmPackageImpl
