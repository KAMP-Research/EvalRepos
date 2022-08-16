/**
 */
package quality.aps_mm.util;

import domain.as.ComponentRepository.Component;

import domain.as.InterfaceRepository.Interface;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import paradigm.basic.Entity;

import paradigm.modificationmarks.AbstractModification;

import quality.aps_mm.*;

import quality.as_mm.ModifyComponent;
import quality.as_mm.ModifyEntity;
import quality.as_mm.ModifyInterface;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see quality.aps_mm.Aps_mmPackage
 * @generated
 */
public class Aps_mmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Aps_mmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_mmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Aps_mmPackage.eINSTANCE;
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
	protected Aps_mmSwitch<Adapter> modelSwitch =
		new Aps_mmSwitch<Adapter>() {
			@Override
			public Adapter caseModifyBusMaster(ModifyBusMaster object) {
				return createModifyBusMasterAdapter();
			}
			@Override
			public Adapter caseModifyPhysicalConnection(ModifyPhysicalConnection object) {
				return createModifyPhysicalConnectionAdapter();
			}
			@Override
			public Adapter caseModifySignalinterface(ModifySignalinterface object) {
				return createModifySignalinterfaceAdapter();
			}
			@Override
			public Adapter caseModifySensor(ModifySensor object) {
				return createModifySensorAdapter();
			}
			@Override
			public Adapter caseModifyBusSlave(ModifyBusSlave object) {
				return createModifyBusSlaveAdapter();
			}
			@Override
			public Adapter caseModifyRamp(ModifyRamp object) {
				return createModifyRampAdapter();
			}
			@Override
			public Adapter caseModifyBusCable(ModifyBusCable object) {
				return createModifyBusCableAdapter();
			}
			@Override
			public Adapter caseModifyBusBox(ModifyBusBox object) {
				return createModifyBusBoxAdapter();
			}
			@Override
			public <S, T> Adapter caseAbstractModification(AbstractModification<S, T> object) {
				return createAbstractModificationAdapter();
			}
			@Override
			public <T extends Entity> Adapter caseModifyEntity(ModifyEntity<T> object) {
				return createModifyEntityAdapter();
			}
			@Override
			public <T extends Component> Adapter caseModifyComponent(ModifyComponent<T> object) {
				return createModifyComponentAdapter();
			}
			@Override
			public <T extends Interface> Adapter caseModifyInterface(ModifyInterface<T> object) {
				return createModifyInterfaceAdapter();
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
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifyBusMaster <em>Modify Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifyBusMaster
	 * @generated
	 */
	public Adapter createModifyBusMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifyPhysicalConnection <em>Modify Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifyPhysicalConnection
	 * @generated
	 */
	public Adapter createModifyPhysicalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifySignalinterface <em>Modify Signalinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifySignalinterface
	 * @generated
	 */
	public Adapter createModifySignalinterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifySensor <em>Modify Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifySensor
	 * @generated
	 */
	public Adapter createModifySensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifyBusSlave <em>Modify Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifyBusSlave
	 * @generated
	 */
	public Adapter createModifyBusSlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifyRamp <em>Modify Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifyRamp
	 * @generated
	 */
	public Adapter createModifyRampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifyBusCable <em>Modify Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifyBusCable
	 * @generated
	 */
	public Adapter createModifyBusCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.aps_mm.ModifyBusBox <em>Modify Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.aps_mm.ModifyBusBox
	 * @generated
	 */
	public Adapter createModifyBusBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paradigm.modificationmarks.AbstractModification <em>Abstract Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paradigm.modificationmarks.AbstractModification
	 * @generated
	 */
	public Adapter createAbstractModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyEntity <em>Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyEntity
	 * @generated
	 */
	public Adapter createModifyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyComponent <em>Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyComponent
	 * @generated
	 */
	public Adapter createModifyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link quality.as_mm.ModifyInterface <em>Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see quality.as_mm.ModifyInterface
	 * @generated
	 */
	public Adapter createModifyInterfaceAdapter() {
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

} //Aps_mmAdapterFactory
