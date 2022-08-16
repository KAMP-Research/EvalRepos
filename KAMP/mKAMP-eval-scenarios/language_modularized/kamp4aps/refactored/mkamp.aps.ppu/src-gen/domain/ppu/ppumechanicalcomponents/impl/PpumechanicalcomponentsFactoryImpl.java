/**
 */
package domain.ppu.ppumechanicalcomponents.impl;

import domain.ppu.ppumechanicalcomponents.*;

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
public class PpumechanicalcomponentsFactoryImpl extends EFactoryImpl implements PpumechanicalcomponentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PpumechanicalcomponentsFactory init() {
		try {
			PpumechanicalcomponentsFactory thePpumechanicalcomponentsFactory = (PpumechanicalcomponentsFactory)EPackage.Registry.INSTANCE.getEFactory(PpumechanicalcomponentsPackage.eNS_URI);
			if (thePpumechanicalcomponentsFactory != null) {
				return thePpumechanicalcomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PpumechanicalcomponentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpumechanicalcomponentsFactoryImpl() {
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
			case PpumechanicalcomponentsPackage.ARM: return createArm();
			case PpumechanicalcomponentsPackage.HOUSING: return createHousing();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm createArm() {
		ArmImpl arm = new ArmImpl();
		return arm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Housing createHousing() {
		HousingImpl housing = new HousingImpl();
		return housing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpumechanicalcomponentsPackage getPpumechanicalcomponentsPackage() {
		return (PpumechanicalcomponentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PpumechanicalcomponentsPackage getPackage() {
		return PpumechanicalcomponentsPackage.eINSTANCE;
	}

} //PpumechanicalcomponentsFactoryImpl
