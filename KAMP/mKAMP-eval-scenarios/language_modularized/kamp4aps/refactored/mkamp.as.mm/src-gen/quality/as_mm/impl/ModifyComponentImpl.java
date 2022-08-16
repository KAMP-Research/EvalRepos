/**
 */
package quality.as_mm.impl;

import domain.as.ComponentRepository.Component;

import org.eclipse.emf.ecore.EClass;

import quality.as_mm.As_mmPackage;
import quality.as_mm.ModifyComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModifyComponentImpl<T extends Component> extends ModifyEntityImpl<Component> implements ModifyComponent<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_mmPackage.Literals.MODIFY_COMPONENT;
	}

} //ModifyComponentImpl
