/**
 */
package topo.impl;

import graph.impl.NetworkEntityImpl;

import org.eclipse.emf.ecore.EClass;

import topo.NetworkNode;
import topo.TopoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NetworkNodeImpl extends NetworkEntityImpl implements NetworkNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopoPackage.Literals.NETWORK_NODE;
	}

} //NetworkNodeImpl
