/**
 */
package typerepo;

import base.NamedIdentifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typerepo.Repository#getContainsSmartMeterTypes <em>Contains Smart Meter Types</em>}</li>
 *   <li>{@link typerepo.Repository#getContainsConnectionType <em>Contains Connection Type</em>}</li>
 *   <li>{@link typerepo.Repository#getContainsNetworkNodeTypes <em>Contains Network Node Types</em>}</li>
 * </ul>
 *
 * @see typerepo.TyperepoPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedIdentifier {
	/**
	 * Returns the value of the '<em><b>Contains Smart Meter Types</b></em>' containment reference list.
	 * The list contents are of type {@link typerepo.SmartMeterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Smart Meter Types</em>' containment reference list.
	 * @see typerepo.TyperepoPackage#getRepository_ContainsSmartMeterTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartMeterType> getContainsSmartMeterTypes();

	/**
	 * Returns the value of the '<em><b>Contains Connection Type</b></em>' containment reference list.
	 * The list contents are of type {@link typerepo.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Connection Type</em>' containment reference list.
	 * @see typerepo.TyperepoPackage#getRepository_ContainsConnectionType()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionType> getContainsConnectionType();

	/**
	 * Returns the value of the '<em><b>Contains Network Node Types</b></em>' containment reference list.
	 * The list contents are of type {@link typerepo.NetworkNodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Network Node Types</em>' containment reference list.
	 * @see typerepo.TyperepoPackage#getRepository_ContainsNetworkNodeTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkNodeType> getContainsNetworkNodeTypes();

} // Repository
