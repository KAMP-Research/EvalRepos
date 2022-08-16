/**
 */
package domain.aps.buscomponents.impl;

import domain.aps.buscomponents.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuscomponentsFactoryImpl extends EFactoryImpl implements BuscomponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuscomponentsFactory init() {
		try {
			BuscomponentsFactory theBuscomponentsFactory = (BuscomponentsFactory)EPackage.Registry.INSTANCE.getEFactory(BuscomponentsPackage.eNS_URI);
			if (theBuscomponentsFactory != null) {
				return theBuscomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuscomponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuscomponentsFactoryImpl() {
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
			case BuscomponentsPackage.BUS_MASTER: return createBusMaster();
			case BuscomponentsPackage.BUS_BOX: return createBusBox();
			case BuscomponentsPackage.BUS_SLAVE: return createBusSlave();
			case BuscomponentsPackage.BUS_CABLE: return createBusCable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusMaster createBusMaster() {
		BusMasterImpl busMaster = new BusMasterImpl();
		return busMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusBox createBusBox() {
		BusBoxImpl busBox = new BusBoxImpl();
		return busBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusSlave createBusSlave() {
		BusSlaveImpl busSlave = new BusSlaveImpl();
		return busSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusCable createBusCable() {
		BusCableImpl busCable = new BusCableImpl();
		return busCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuscomponentsPackage getBuscomponentsPackage() {
		return (BuscomponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuscomponentsPackage getPackage() {
		return BuscomponentsPackage.eINSTANCE;
	}

} //BuscomponentsFactoryImpl
