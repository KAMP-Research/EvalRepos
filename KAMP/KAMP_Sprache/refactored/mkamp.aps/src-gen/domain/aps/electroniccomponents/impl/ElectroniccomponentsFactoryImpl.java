/**
 */
package domain.aps.electroniccomponents.impl;

import domain.aps.electroniccomponents.*;

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
public class ElectroniccomponentsFactoryImpl extends EFactoryImpl implements ElectroniccomponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElectroniccomponentsFactory init() {
		try {
			ElectroniccomponentsFactory theElectroniccomponentsFactory = (ElectroniccomponentsFactory)EPackage.Registry.INSTANCE.getEFactory(ElectroniccomponentsPackage.eNS_URI);
			if (theElectroniccomponentsFactory != null) {
				return theElectroniccomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ElectroniccomponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectroniccomponentsFactoryImpl() {
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
			case ElectroniccomponentsPackage.SWITCH: return createSwitch();
			case ElectroniccomponentsPackage.MICRO_SWITCH: return createMicroSwitch();
			case ElectroniccomponentsPackage.LED: return createLED();
			case ElectroniccomponentsPackage.POTENTIOMETER: return createPotentiometer();
			case ElectroniccomponentsPackage.BUTTON: return createButton();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroSwitch createMicroSwitch() {
		MicroSwitchImpl microSwitch = new MicroSwitchImpl();
		return microSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Potentiometer createPotentiometer() {
		PotentiometerImpl potentiometer = new PotentiometerImpl();
		return potentiometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectroniccomponentsPackage getElectroniccomponentsPackage() {
		return (ElectroniccomponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ElectroniccomponentsPackage getPackage() {
		return ElectroniccomponentsPackage.eINSTANCE;
	}

} //ElectroniccomponentsFactoryImpl
