/**
 */
package typerepo.typeapplication;

import org.eclipse.emf.ecore.EObject;

import topo.NetworkNode;

import typerepo.NetworkNodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Node Type Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.NetworkNodeTypeApplication#getNetworknodetype <em>Networknodetype</em>}</li>
 *   <li>{@link typerepo.typeapplication.NetworkNodeTypeApplication#getPhysicalconnection <em>Physicalconnection</em>}</li>
 * </ul>
 *
 * @see typerepo.typeapplication.TypeapplicationPackage#getNetworkNodeTypeApplication()
 * @model
 * @generated
 */
public interface NetworkNodeTypeApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Networknodetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networknodetype</em>' reference.
	 * @see #setNetworknodetype(NetworkNodeType)
	 * @see typerepo.typeapplication.TypeapplicationPackage#getNetworkNodeTypeApplication_Networknodetype()
	 * @model required="true"
	 * @generated
	 */
	NetworkNodeType getNetworknodetype();

	/**
	 * Sets the value of the '{@link typerepo.typeapplication.NetworkNodeTypeApplication#getNetworknodetype <em>Networknodetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networknodetype</em>' reference.
	 * @see #getNetworknodetype()
	 * @generated
	 */
	void setNetworknodetype(NetworkNodeType value);

	/**
	 * Returns the value of the '<em><b>Physicalconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalconnection</em>' reference.
	 * @see #setPhysicalconnection(NetworkNode)
	 * @see typerepo.typeapplication.TypeapplicationPackage#getNetworkNodeTypeApplication_Physicalconnection()
	 * @model required="true"
	 * @generated
	 */
	NetworkNode getPhysicalconnection();

	/**
	 * Sets the value of the '{@link typerepo.typeapplication.NetworkNodeTypeApplication#getPhysicalconnection <em>Physicalconnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalconnection</em>' reference.
	 * @see #getPhysicalconnection()
	 * @generated
	 */
	void setPhysicalconnection(NetworkNode value);

} // NetworkNodeTypeApplication
