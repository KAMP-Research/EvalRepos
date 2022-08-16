/**
 */
package softwarecomposition.impl;

import composition.AssemblyContext;
import composition.Connector;
import composition.impl.ComposedProvidingRequiringEntityImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import softwarecomposition.SoftwarecompositionPackage;
import softwarecomposition.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubSystemImpl extends ComposedProvidingRequiringEntityImpl implements SubSystem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarecompositionPackage.Literals.SUB_SYSTEM;
	}

	@Override
	public Collection<AssemblyContext> getAssemblyContexts__ComposedStructure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Connector> getConnectors__ComposedStructure() {
		// TODO Auto-generated method stub
		return null;
	}

} //SubSystemImpl
