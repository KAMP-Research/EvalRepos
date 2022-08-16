/**
 */
package domain.aps.mechanicalcomponents.impl;

import domain.aps.mechanicalcomponents.*;

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
public class MechanicalcomponentsFactoryImpl extends EFactoryImpl implements MechanicalcomponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MechanicalcomponentsFactory init() {
		try {
			MechanicalcomponentsFactory theMechanicalcomponentsFactory = (MechanicalcomponentsFactory)EPackage.Registry.INSTANCE.getEFactory(MechanicalcomponentsPackage.eNS_URI);
			if (theMechanicalcomponentsFactory != null) {
				return theMechanicalcomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MechanicalcomponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalcomponentsFactoryImpl() {
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
			case MechanicalcomponentsPackage.GRIPPER_PART: return createGripperPart();
			case MechanicalcomponentsPackage.RETURN_SPRING: return createReturnSpring();
			case MechanicalcomponentsPackage.TABLE: return createTable();
			case MechanicalcomponentsPackage.RUBBER_BAND: return createRubberBand();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GripperPart createGripperPart() {
		GripperPartImpl gripperPart = new GripperPartImpl();
		return gripperPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSpring createReturnSpring() {
		ReturnSpringImpl returnSpring = new ReturnSpringImpl();
		return returnSpring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubberBand createRubberBand() {
		RubberBandImpl rubberBand = new RubberBandImpl();
		return rubberBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalcomponentsPackage getMechanicalcomponentsPackage() {
		return (MechanicalcomponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MechanicalcomponentsPackage getPackage() {
		return MechanicalcomponentsPackage.eINSTANCE;
	}

} //MechanicalcomponentsFactoryImpl
