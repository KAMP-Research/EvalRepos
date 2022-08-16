/**
 */
package quality.aps_mm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import quality.aps_mm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aps_mmFactoryImpl extends EFactoryImpl implements Aps_mmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aps_mmFactory init() {
		try {
			Aps_mmFactory theAps_mmFactory = (Aps_mmFactory)EPackage.Registry.INSTANCE.getEFactory(Aps_mmPackage.eNS_URI);
			if (theAps_mmFactory != null) {
				return theAps_mmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Aps_mmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_mmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Aps_mmPackage.MODIFY_BUS_MASTER: return createModifyBusMaster();
			case Aps_mmPackage.MODIFY_PHYSICAL_CONNECTION: return createModifyPhysicalConnection();
			case Aps_mmPackage.MODIFY_SIGNALINTERFACE: return createModifySignalinterface();
			case Aps_mmPackage.MODIFY_SENSOR: return createModifySensor();
			case Aps_mmPackage.MODIFY_BUS_SLAVE: return createModifyBusSlave();
			case Aps_mmPackage.MODIFY_RAMP: return createModifyRamp();
			case Aps_mmPackage.MODIFY_BUS_CABLE: return createModifyBusCable();
			case Aps_mmPackage.MODIFY_BUS_BOX: return createModifyBusBox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusMaster createModifyBusMaster() {
		ModifyBusMasterImpl modifyBusMaster = new ModifyBusMasterImpl();
		return modifyBusMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyPhysicalConnection createModifyPhysicalConnection() {
		ModifyPhysicalConnectionImpl modifyPhysicalConnection = new ModifyPhysicalConnectionImpl();
		return modifyPhysicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySignalinterface createModifySignalinterface() {
		ModifySignalinterfaceImpl modifySignalinterface = new ModifySignalinterfaceImpl();
		return modifySignalinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifySensor createModifySensor() {
		ModifySensorImpl modifySensor = new ModifySensorImpl();
		return modifySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusSlave createModifyBusSlave() {
		ModifyBusSlaveImpl modifyBusSlave = new ModifyBusSlaveImpl();
		return modifyBusSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyRamp createModifyRamp() {
		ModifyRampImpl modifyRamp = new ModifyRampImpl();
		return modifyRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusCable createModifyBusCable() {
		ModifyBusCableImpl modifyBusCable = new ModifyBusCableImpl();
		return modifyBusCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyBusBox createModifyBusBox() {
		ModifyBusBoxImpl modifyBusBox = new ModifyBusBoxImpl();
		return modifyBusBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_mmPackage getAps_mmPackage() {
		return (Aps_mmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Aps_mmPackage getPackage() {
		return Aps_mmPackage.eINSTANCE;
	}

} //Aps_mmFactoryImpl
