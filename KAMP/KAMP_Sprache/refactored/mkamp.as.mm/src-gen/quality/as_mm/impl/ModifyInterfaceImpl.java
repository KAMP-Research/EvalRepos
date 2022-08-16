/**
 */
package quality.as_mm.impl;

import domain.as.InterfaceRepository.Interface;

import org.eclipse.emf.ecore.EClass;

import quality.as_mm.As_mmPackage;
import quality.as_mm.ModifyInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyInterfaceImpl<T extends Interface> extends ModifyEntityImpl<Interface> implements ModifyInterface<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_mmPackage.Literals.MODIFY_INTERFACE;
	}

} //ModifyInterfaceImpl
