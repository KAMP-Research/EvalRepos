/**
 */
package typerepo.typeapplication;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Applications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.TypeApplications#getNetworknodetypeapplication <em>Networknodetypeapplication</em>}</li>
 *   <li>{@link typerepo.typeapplication.TypeApplications#getConnectiontypeapplication <em>Connectiontypeapplication</em>}</li>
 *   <li>{@link typerepo.typeapplication.TypeApplications#getTypeapplications <em>Typeapplications</em>}</li>
 * </ul>
 *
 * @see typerepo.typeapplication.TypeapplicationPackage#getTypeApplications()
 * @model
 * @generated
 */
public interface TypeApplications extends EObject {
	/**
	 * Returns the value of the '<em><b>Networknodetypeapplication</b></em>' containment reference list.
	 * The list contents are of type {@link typerepo.typeapplication.SmartMeterTypeApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networknodetypeapplication</em>' containment reference list.
	 * @see typerepo.typeapplication.TypeapplicationPackage#getTypeApplications_Networknodetypeapplication()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartMeterTypeApplication> getNetworknodetypeapplication();

	/**
	 * Returns the value of the '<em><b>Connectiontypeapplication</b></em>' containment reference list.
	 * The list contents are of type {@link typerepo.typeapplication.NetworkNodeTypeApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectiontypeapplication</em>' containment reference list.
	 * @see typerepo.typeapplication.TypeapplicationPackage#getTypeApplications_Connectiontypeapplication()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkNodeTypeApplication> getConnectiontypeapplication();

	/**
	 * Returns the value of the '<em><b>Typeapplications</b></em>' containment reference list.
	 * The list contents are of type {@link typerepo.typeapplication.ConnectionTypeApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeapplications</em>' containment reference list.
	 * @see typerepo.typeapplication.TypeapplicationPackage#getTypeApplications_Typeapplications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionTypeApplication> getTypeapplications();

} // TypeApplications
