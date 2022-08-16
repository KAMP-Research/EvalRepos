/**
 */
package domain.ppu.ppumodules.util;

import domain.ppu.ppumodules.*;

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
 * @see domain.ppu.ppumodules.PpumodulesPackage
 * @generated
 */
public class PpumodulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PpumodulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpumodulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PpumodulesPackage.eINSTANCE;
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
	protected PpumodulesSwitch<Adapter> modelSwitch =
		new PpumodulesSwitch<Adapter>() {
			@Override
			public Adapter casePotentiometerModule(PotentiometerModule object) {
				return createPotentiometerModuleAdapter();
			}
			@Override
			public Adapter caseInductiveSensorModule(InductiveSensorModule object) {
				return createInductiveSensorModuleAdapter();
			}
			@Override
			public Adapter casePressureSensorModule(PressureSensorModule object) {
				return createPressureSensorModuleAdapter();
			}
			@Override
			public Adapter casePusherModule(PusherModule object) {
				return createPusherModuleAdapter();
			}
			@Override
			public Adapter caseRampModule(RampModule object) {
				return createRampModuleAdapter();
			}
			@Override
			public Adapter caseMicroswitchModule(MicroswitchModule object) {
				return createMicroswitchModuleAdapter();
			}
			@Override
			public Adapter caseMotorModule(MotorModule object) {
				return createMotorModuleAdapter();
			}
			@Override
			public Adapter caseMonostableCylinderModule(MonostableCylinderModule object) {
				return createMonostableCylinderModuleAdapter();
			}
			@Override
			public Adapter caseVacuumGripperModule(VacuumGripperModule object) {
				return createVacuumGripperModuleAdapter();
			}
			@Override
			public Adapter casePresenceSensorModule(PresenceSensorModule object) {
				return createPresenceSensorModuleAdapter();
			}
			@Override
			public Adapter caseOpticalSensorModule(OpticalSensorModule object) {
				return createOpticalSensorModuleAdapter();
			}
			@Override
			public Adapter caseConveyorBeltModule(ConveyorBeltModule object) {
				return createConveyorBeltModuleAdapter();
			}
			@Override
			public Adapter caseSensorModule(SensorModule object) {
				return createSensorModuleAdapter();
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
			public Adapter caseModule(domain.as.ModuleRepository.Module object) {
				return createModuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.PotentiometerModule <em>Potentiometer Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.PotentiometerModule
	 * @generated
	 */
	public Adapter createPotentiometerModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.InductiveSensorModule <em>Inductive Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.InductiveSensorModule
	 * @generated
	 */
	public Adapter createInductiveSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.PressureSensorModule <em>Pressure Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.PressureSensorModule
	 * @generated
	 */
	public Adapter createPressureSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.PusherModule <em>Pusher Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.PusherModule
	 * @generated
	 */
	public Adapter createPusherModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.RampModule <em>Ramp Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.RampModule
	 * @generated
	 */
	public Adapter createRampModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.MicroswitchModule <em>Microswitch Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.MicroswitchModule
	 * @generated
	 */
	public Adapter createMicroswitchModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.MotorModule <em>Motor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.MotorModule
	 * @generated
	 */
	public Adapter createMotorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.MonostableCylinderModule <em>Monostable Cylinder Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.MonostableCylinderModule
	 * @generated
	 */
	public Adapter createMonostableCylinderModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.VacuumGripperModule <em>Vacuum Gripper Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.VacuumGripperModule
	 * @generated
	 */
	public Adapter createVacuumGripperModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.PresenceSensorModule <em>Presence Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.PresenceSensorModule
	 * @generated
	 */
	public Adapter createPresenceSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.OpticalSensorModule <em>Optical Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.OpticalSensorModule
	 * @generated
	 */
	public Adapter createOpticalSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.ConveyorBeltModule <em>Conveyor Belt Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.ConveyorBeltModule
	 * @generated
	 */
	public Adapter createConveyorBeltModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppumodules.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppumodules.SensorModule
	 * @generated
	 */
	public Adapter createSensorModuleAdapter() {
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
	 * Creates a new adapter for an object of class '{@link domain.as.ModuleRepository.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.as.ModuleRepository.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
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

} //PpumodulesAdapterFactory
