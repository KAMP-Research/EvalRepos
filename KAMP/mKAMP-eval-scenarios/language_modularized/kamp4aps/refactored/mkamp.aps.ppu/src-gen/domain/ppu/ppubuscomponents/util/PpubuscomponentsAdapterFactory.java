/**
 */
package domain.ppu.ppubuscomponents.util;

import domain.aps.buscomponents.BusBox;
import domain.aps.buscomponents.BusCable;
import domain.aps.buscomponents.BusMaster;
import domain.aps.buscomponents.BusSlave;

import domain.aps.components.Cable;

import domain.as.ComponentRepository.Component;

import domain.ppu.ppubuscomponents.*;

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
 * @see domain.ppu.ppubuscomponents.PpubuscomponentsPackage
 * @generated
 */
public class PpubuscomponentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PpubuscomponentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpubuscomponentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PpubuscomponentsPackage.eINSTANCE;
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
	protected PpubuscomponentsSwitch<Adapter> modelSwitch =
		new PpubuscomponentsSwitch<Adapter>() {
			@Override
			public Adapter caseProfibusDPSlave(ProfibusDPSlave object) {
				return createProfibusDPSlaveAdapter();
			}
			@Override
			public Adapter caseEtherCATSlave(EtherCATSlave object) {
				return createEtherCATSlaveAdapter();
			}
			@Override
			public Adapter caseProfibusDPCable(ProfibusDPCable object) {
				return createProfibusDPCableAdapter();
			}
			@Override
			public Adapter caseProfibusDPBox(ProfibusDPBox object) {
				return createProfibusDPBoxAdapter();
			}
			@Override
			public Adapter caseProfibusDPMaster(ProfibusDPMaster object) {
				return createProfibusDPMasterAdapter();
			}
			@Override
			public Adapter caseEtherCATBox(EtherCATBox object) {
				return createEtherCATBoxAdapter();
			}
			@Override
			public Adapter caseEtherCATMaster(EtherCATMaster object) {
				return createEtherCATMasterAdapter();
			}
			@Override
			public Adapter caseEtherCATCable(EtherCATCable object) {
				return createEtherCATCableAdapter();
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
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseBusSlave(BusSlave object) {
				return createBusSlaveAdapter();
			}
			@Override
			public Adapter caseCable(Cable object) {
				return createCableAdapter();
			}
			@Override
			public Adapter caseBusCable(BusCable object) {
				return createBusCableAdapter();
			}
			@Override
			public Adapter caseBusBox(BusBox object) {
				return createBusBoxAdapter();
			}
			@Override
			public Adapter caseBusMaster(BusMaster object) {
				return createBusMasterAdapter();
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
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.ProfibusDPSlave <em>Profibus DP Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPSlave
	 * @generated
	 */
	public Adapter createProfibusDPSlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.EtherCATSlave <em>Ether CAT Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.EtherCATSlave
	 * @generated
	 */
	public Adapter createEtherCATSlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.ProfibusDPCable <em>Profibus DP Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPCable
	 * @generated
	 */
	public Adapter createProfibusDPCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.ProfibusDPBox <em>Profibus DP Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPBox
	 * @generated
	 */
	public Adapter createProfibusDPBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.ProfibusDPMaster <em>Profibus DP Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPMaster
	 * @generated
	 */
	public Adapter createProfibusDPMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.EtherCATBox <em>Ether CAT Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.EtherCATBox
	 * @generated
	 */
	public Adapter createEtherCATBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.EtherCATMaster <em>Ether CAT Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.EtherCATMaster
	 * @generated
	 */
	public Adapter createEtherCATMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.ppu.ppubuscomponents.EtherCATCable <em>Ether CAT Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.ppu.ppubuscomponents.EtherCATCable
	 * @generated
	 */
	public Adapter createEtherCATCableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link domain.as.ComponentRepository.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.as.ComponentRepository.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.buscomponents.BusSlave <em>Bus Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.buscomponents.BusSlave
	 * @generated
	 */
	public Adapter createBusSlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.components.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.components.Cable
	 * @generated
	 */
	public Adapter createCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.buscomponents.BusCable <em>Bus Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.buscomponents.BusCable
	 * @generated
	 */
	public Adapter createBusCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.buscomponents.BusBox <em>Bus Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.buscomponents.BusBox
	 * @generated
	 */
	public Adapter createBusBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.aps.buscomponents.BusMaster <em>Bus Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.aps.buscomponents.BusMaster
	 * @generated
	 */
	public Adapter createBusMasterAdapter() {
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

} //PpubuscomponentsAdapterFactory
