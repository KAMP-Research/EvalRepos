/**
 */
package graph;

import base.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.LogicalCommunication#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getLogicalCommunication()
 * @model
 * @generated
 */
public interface LogicalCommunication extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link graph.CommunicatingEntity}.
	 * It is bidirectional and its opposite is '{@link graph.CommunicatingEntity#getCommunicatesBy <em>Communicates By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see graph.GraphPackage#getLogicalCommunication_Links()
	 * @see graph.CommunicatingEntity#getCommunicatesBy
	 * @model opposite="CommunicatesBy" lower="2" upper="2"
	 * @generated
	 */
	EList<CommunicatingEntity> getLinks();

} // LogicalCommunication
