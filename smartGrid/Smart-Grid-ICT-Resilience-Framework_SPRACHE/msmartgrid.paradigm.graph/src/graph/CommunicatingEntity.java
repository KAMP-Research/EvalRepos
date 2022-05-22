/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicating Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.CommunicatingEntity#getCommunicatesBy <em>Communicates By</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getCommunicatingEntity()
 * @model abstract="true"
 * @generated
 */
public interface CommunicatingEntity extends NetworkEntity {
	/**
	 * Returns the value of the '<em><b>Communicates By</b></em>' reference list.
	 * The list contents are of type {@link graph.LogicalCommunication}.
	 * It is bidirectional and its opposite is '{@link graph.LogicalCommunication#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicates By</em>' reference list.
	 * @see graph.GraphPackage#getCommunicatingEntity_CommunicatesBy()
	 * @see graph.LogicalCommunication#getLinks
	 * @model opposite="Links"
	 * @generated
	 */
	EList<LogicalCommunication> getCommunicatesBy();

} // CommunicatingEntity
