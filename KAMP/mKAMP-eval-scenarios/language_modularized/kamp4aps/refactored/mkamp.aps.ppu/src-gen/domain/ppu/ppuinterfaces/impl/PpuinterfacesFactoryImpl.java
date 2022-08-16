/**
 */
package domain.ppu.ppuinterfaces.impl;

import domain.ppu.ppuinterfaces.*;

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
public class PpuinterfacesFactoryImpl extends EFactoryImpl implements PpuinterfacesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PpuinterfacesFactory init() {
		try {
			PpuinterfacesFactory thePpuinterfacesFactory = (PpuinterfacesFactory)EPackage.Registry.INSTANCE.getEFactory(PpuinterfacesPackage.eNS_URI);
			if (thePpuinterfacesFactory != null) {
				return thePpuinterfacesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PpuinterfacesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpuinterfacesFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PpuinterfacesPackage getPpuinterfacesPackage() {
		return (PpuinterfacesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PpuinterfacesPackage getPackage() {
		return PpuinterfacesPackage.eINSTANCE;
	}

} //PpuinterfacesFactoryImpl
