/**
 */
package quality.aps_ppu_mm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import quality.aps_ppu_mm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aps_ppu_mmFactoryImpl extends EFactoryImpl implements Aps_ppu_mmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aps_ppu_mmFactory init() {
		try {
			Aps_ppu_mmFactory theAps_ppu_mmFactory = (Aps_ppu_mmFactory)EPackage.Registry.INSTANCE.getEFactory(Aps_ppu_mmPackage.eNS_URI);
			if (theAps_ppu_mmFactory != null) {
				return theAps_ppu_mmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Aps_ppu_mmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_ppu_mmFactoryImpl() {
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
			case Aps_ppu_mmPackage.MODIFY_MICRO_SWITCH_MODULE: return createModifyMicroSwitchModule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyMicroSwitchModule createModifyMicroSwitchModule() {
		ModifyMicroSwitchModuleImpl modifyMicroSwitchModule = new ModifyMicroSwitchModuleImpl();
		return modifyMicroSwitchModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aps_ppu_mmPackage getAps_ppu_mmPackage() {
		return (Aps_ppu_mmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Aps_ppu_mmPackage getPackage() {
		return Aps_ppu_mmPackage.eINSTANCE;
	}

} //Aps_ppu_mmFactoryImpl
