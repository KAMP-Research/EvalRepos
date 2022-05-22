/**
 */
package output.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import output.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see output.OutputPackage
 * @generated
 */
public class OutputAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OutputPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OutputPackage.eINSTANCE;
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
	protected OutputSwitch<Adapter> modelSwitch =
		new OutputSwitch<Adapter>() {
			@Override
			public Adapter caseScenarioResult(ScenarioResult object) {
				return createScenarioResultAdapter();
			}
			@Override
			public Adapter caseEntityState(EntityState object) {
				return createEntityStateAdapter();
			}
			@Override
			public Adapter caseOnline(Online object) {
				return createOnlineAdapter();
			}
			@Override
			public Adapter caseDefect(Defect object) {
				return createDefectAdapter();
			}
			@Override
			public Adapter caseNoPower(NoPower object) {
				return createNoPowerAdapter();
			}
			@Override
			public Adapter caseNoUplink(NoUplink object) {
				return createNoUplinkAdapter();
			}
			@Override
			public Adapter caseOffline(Offline object) {
				return createOfflineAdapter();
			}
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseOn(On object) {
				return createOnAdapter();
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
	 * Creates a new adapter for an object of class '{@link output.ScenarioResult <em>Scenario Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.ScenarioResult
	 * @generated
	 */
	public Adapter createScenarioResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.EntityState <em>Entity State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.EntityState
	 * @generated
	 */
	public Adapter createEntityStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.Online <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.Online
	 * @generated
	 */
	public Adapter createOnlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.Defect <em>Defect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.Defect
	 * @generated
	 */
	public Adapter createDefectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.NoPower <em>No Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.NoPower
	 * @generated
	 */
	public Adapter createNoPowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.NoUplink <em>No Uplink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.NoUplink
	 * @generated
	 */
	public Adapter createNoUplinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.Offline <em>Offline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.Offline
	 * @generated
	 */
	public Adapter createOfflineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link output.On <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see output.On
	 * @generated
	 */
	public Adapter createOnAdapter() {
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

} //OutputAdapterFactory
