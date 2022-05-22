/**
 */
package graph;

import base.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.PhysicalConnection#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getPhysicalConnection()
 * @model
 * @generated
 */
public interface PhysicalConnection extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link graph.NetworkEntity}.
	 * It is bidirectional and its opposite is '{@link graph.NetworkEntity#getLinkedBy <em>Linked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see graph.GraphPackage#getPhysicalConnection_Links()
	 * @see graph.NetworkEntity#getLinkedBy
	 * @model opposite="LinkedBy" lower="2" upper="2"
	 * @generated
	 */
	EList<NetworkEntity> getLinks();

} // PhysicalConnection
