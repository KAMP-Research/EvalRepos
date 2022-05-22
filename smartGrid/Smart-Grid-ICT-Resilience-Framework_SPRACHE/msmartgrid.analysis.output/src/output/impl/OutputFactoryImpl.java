/**
 */
package output.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import output.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputFactoryImpl extends EFactoryImpl implements OutputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OutputFactory init() {
		try {
			OutputFactory theOutputFactory = (OutputFactory)EPackage.Registry.INSTANCE.getEFactory(OutputPackage.eNS_URI);
			if (theOutputFactory != null) {
				return theOutputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OutputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFactoryImpl() {
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
			case OutputPackage.SCENARIO_RESULT: return createScenarioResult();
			case OutputPackage.ONLINE: return createOnline();
			case OutputPackage.DEFECT: return createDefect();
			case OutputPackage.NO_POWER: return createNoPower();
			case OutputPackage.NO_UPLINK: return createNoUplink();
			case OutputPackage.CLUSTER: return createCluster();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioResult createScenarioResult() {
		ScenarioResultImpl scenarioResult = new ScenarioResultImpl();
		return scenarioResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Online createOnline() {
		OnlineImpl online = new OnlineImpl();
		return online;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defect createDefect() {
		DefectImpl defect = new DefectImpl();
		return defect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoPower createNoPower() {
		NoPowerImpl noPower = new NoPowerImpl();
		return noPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoUplink createNoUplink() {
		NoUplinkImpl noUplink = new NoUplinkImpl();
		return noUplink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPackage getOutputPackage() {
		return (OutputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OutputPackage getPackage() {
		return OutputPackage.eINSTANCE;
	}

} //OutputFactoryImpl
