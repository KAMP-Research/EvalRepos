/**
 */
package topo;

import base.NamedIdentifier;

import graph.LogicalCommunication;
import graph.NetworkEntity;
import graph.PhysicalConnection;
import graph.PowerGridNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Grid Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link topo.SmartGridTopology#getContainsNE <em>Contains NE</em>}</li>
 *   <li>{@link topo.SmartGridTopology#getContainsPGN <em>Contains PGN</em>}</li>
 *   <li>{@link topo.SmartGridTopology#getContainsPC <em>Contains PC</em>}</li>
 *   <li>{@link topo.SmartGridTopology#getContainsLC <em>Contains LC</em>}</li>
 * </ul>
 *
 * @see topo.TopoPackage#getSmartGridTopology()
 * @model
 * @generated
 */
public interface SmartGridTopology extends NamedIdentifier {
	/**
	 * Returns the value of the '<em><b>Contains NE</b></em>' containment reference list.
	 * The list contents are of type {@link graph.NetworkEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains NE</em>' containment reference list.
	 * @see topo.TopoPackage#getSmartGridTopology_ContainsNE()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkEntity> getContainsNE();

	/**
	 * Returns the value of the '<em><b>Contains PGN</b></em>' containment reference list.
	 * The list contents are of type {@link graph.PowerGridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains PGN</em>' containment reference list.
	 * @see topo.TopoPackage#getSmartGridTopology_ContainsPGN()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerGridNode> getContainsPGN();

	/**
	 * Returns the value of the '<em><b>Contains PC</b></em>' containment reference list.
	 * The list contents are of type {@link graph.PhysicalConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains PC</em>' containment reference list.
	 * @see topo.TopoPackage#getSmartGridTopology_ContainsPC()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalConnection> getContainsPC();

	/**
	 * Returns the value of the '<em><b>Contains LC</b></em>' containment reference list.
	 * The list contents are of type {@link graph.LogicalCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains LC</em>' containment reference list.
	 * @see topo.TopoPackage#getSmartGridTopology_ContainsLC()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalCommunication> getContainsLC();

} // SmartGridTopology
