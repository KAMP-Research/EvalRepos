/**
 */
package domain.ppu.ppuinterfaces.util;

import domain.aps.interfaces.Screwing;
import domain.aps.interfaces.Suspension;

import domain.as.InterfaceRepository.Interface;

import domain.ppu.ppuinterfaces.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import paradigm.basic.Entity;
import paradigm.basic.Identifier;
import paradigm.basic.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see domain.ppu.ppuinterfaces.PpuinterfacesPackage
 * @generated
 */
public class PpuinterfacesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PpuinterfacesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpuinterfacesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PpuinterfacesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PpuinterfacesSwitch<Adapter> modelSwitch =
		new PpuinterfacesSwitch<Adapter>() {
			@Override
			public Adapter caseSuspensionRack(SuspensionRack object) {
				return createSuspensionRackAdapter();
			}
			@Override
			public Adapter caseSuspensionArm(SuspensionArm object) {
				return createSuspensionArmAdapter();
			}
			@Override
			public Adapter caseScrewingSplitter(ScrewingSplitter object) {
				return createScrewingSplitterAdapter();
			}
			@Override
			public Adapter caseScrewingMotor(ScrewingMotor object) {
				return createScrewingMotorAdapter();
			}
			@Override
			public Adapter caseScrewingPotentiometer(ScrewingPotentiometer object) {
				return createScrewingPotentiometerAdapter();
			}
			@Override
			public Adapter caseScrewingFixture(ScrewingFixture object) {
				return createScrewingFixtureAdapter();
			}
			@Override
			public Adapter caseScrewingRack(ScrewingRack object) {
				return createScrewingRackAdapter();
			}
			@Override
			public Adapter caseScrewingCylinder(ScrewingCylinder object) {
				return createScrewingCylinderAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseSuspension(Suspension object) {
				return createSuspensionAdapter();
			}
			@Override
			public Adapter caseScrewing(Screwing object) {
				return createScrewingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.SuspensionRack <em>Suspension Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.SuspensionRack
	 * @generated
	 */
	public Adapter createSuspensionRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.SuspensionArm <em>Suspension Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.SuspensionArm
	 * @generated
	 */
	public Adapter createSuspensionArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.ScrewingSplitter <em>Screwing Splitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.ScrewingSplitter
	 * @generated
	 */
	public Adapter createScrewingSplitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.ScrewingMotor <em>Screwing Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.ScrewingMotor
	 * @generated
	 */
	public Adapter createScrewingMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.ScrewingPotentiometer <em>Screwing Potentiometer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.ScrewingPotentiometer
	 * @generated
	 */
	public Adapter createScrewingPotentiometerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.ScrewingFixture <em>Screwing Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.ScrewingFixture
	 * @generated
	 */
	public Adapter createScrewingFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.ScrewingRack <em>Screwing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.ScrewingRack
	 * @generated
	 */
	public Adapter createScrewingRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppuinterfaces.ScrewingCylinder <em>Screwing Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppuinterfaces.ScrewingCylinder
	 * @generated
	 */
	public Adapter createScrewingCylinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.basic.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.basic.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.basic.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.basic.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.basic.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.basic.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.as.InterfaceRepository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.as.InterfaceRepository.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.interfaces.Suspension <em>Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.interfaces.Suspension
	 * @generated
	 */
	public Adapter createSuspensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.interfaces.Screwing <em>Screwing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.interfaces.Screwing
	 * @generated
	 */
	public Adapter createScrewingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PpuinterfacesAdapterFactory
