/**
 */
package topo.util;

import base.Identifier;
import base.NamedEntity;
import base.NamedIdentifier;

import graph.CommunicatingEntity;
import graph.NetworkEntity;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import topo.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see topo.TopoPackage
 * @generated
 */
public class TopoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TopoPackage.eINSTANCE;
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
	protected TopoSwitch<Adapter> modelSwitch =
		new TopoSwitch<Adapter>() {
			@Override
			public Adapter caseSmartGridTopology(SmartGridTopology object) {
				return createSmartGridTopologyAdapter();
			}
			@Override
			public Adapter caseSmartMeter(SmartMeter object) {
				return createSmartMeterAdapter();
			}
			@Override
			public Adapter caseNetworkNode(NetworkNode object) {
				return createNetworkNodeAdapter();
			}
			@Override
			public Adapter caseControlCenter(ControlCenter object) {
				return createControlCenterAdapter();
			}
			@Override
			public Adapter caseGenericController(GenericController object) {
				return createGenericControllerAdapter();
			}
			@Override
			public Adapter caseInterCom(InterCom object) {
				return createInterComAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter caseNamedIdentifier(NamedIdentifier object) {
				return createNamedIdentifierAdapter();
			}
			@Override
			public Adapter caseNetworkEntity(NetworkEntity object) {
				return createNetworkEntityAdapter();
			}
			@Override
			public Adapter caseCommunicatingEntity(CommunicatingEntity object) {
				return createCommunicatingEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link topo.SmartGridTopology <em>Smart Grid Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see topo.SmartGridTopology
	 * @generated
	 */
	public Adapter createSmartGridTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link topo.SmartMeter <em>Smart Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see topo.SmartMeter
	 * @generated
	 */
	public Adapter createSmartMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link topo.NetworkNode <em>Network Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see topo.NetworkNode
	 * @generated
	 */
	public Adapter createNetworkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link topo.ControlCenter <em>Control Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see topo.ControlCenter
	 * @generated
	 */
	public Adapter createControlCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link topo.GenericController <em>Generic Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see topo.GenericController
	 * @generated
	 */
	public Adapter createGenericControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link topo.InterCom <em>Inter Com</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see topo.InterCom
	 * @generated
	 */
	public Adapter createInterComAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.NamedIdentifier <em>Named Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.NamedIdentifier
	 * @generated
	 */
	public Adapter createNamedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graph.NetworkEntity <em>Network Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graph.NetworkEntity
	 * @generated
	 */
	public Adapter createNetworkEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link graph.CommunicatingEntity <em>Communicating Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see graph.CommunicatingEntity
	 * @generated
	 */
	public Adapter createCommunicatingEntityAdapter() {
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

} //TopoAdapterFactory
