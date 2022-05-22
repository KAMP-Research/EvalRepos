/**
 */
package graph;

import base.NamedIdentifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.NetworkEntity#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link graph.NetworkEntity#getLinkedBy <em>Linked By</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getNetworkEntity()
 * @model abstract="true"
 * @generated
 */
public interface NetworkEntity extends NamedIdentifier {
	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link graph.PowerGridNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see graph.GraphPackage#getNetworkEntity_ConnectedTo()
	 * @model required="true"
	 * @generated
	 */
	EList<PowerGridNode> getConnectedTo();

	/**
	 * Returns the value of the '<em><b>Linked By</b></em>' reference list.
	 * The list contents are of type {@link graph.PhysicalConnection}.
	 * It is bidirectional and its opposite is '{@link graph.PhysicalConnection#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked By</em>' reference list.
	 * @see graph.GraphPackage#getNetworkEntity_LinkedBy()
	 * @see graph.PhysicalConnection#getLinks
	 * @model opposite="Links"
	 * @generated
	 */
	EList<PhysicalConnection> getLinkedBy();

} // NetworkEntity
