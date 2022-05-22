/**
 */
package typerepo.typeapplication;

import org.eclipse.emf.ecore.EObject;

import topo.SmartMeter;

import typerepo.SmartMeterType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Meter Type Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typerepo.typeapplication.SmartMeterTypeApplication#getSmartmetertype <em>Smartmetertype</em>}</li>
 *   <li>{@link typerepo.typeapplication.SmartMeterTypeApplication#getNetworknode <em>Networknode</em>}</li>
 * </ul>
 *
 * @see typerepo.typeapplication.TypeapplicationPackage#getSmartMeterTypeApplication()
 * @model
 * @generated
 */
public interface SmartMeterTypeApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Smartmetertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smartmetertype</em>' reference.
	 * @see #setSmartmetertype(SmartMeterType)
	 * @see typerepo.typeapplication.TypeapplicationPackage#getSmartMeterTypeApplication_Smartmetertype()
	 * @model required="true"
	 * @generated
	 */
	SmartMeterType getSmartmetertype();

	/**
	 * Sets the value of the '{@link typerepo.typeapplication.SmartMeterTypeApplication#getSmartmetertype <em>Smartmetertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smartmetertype</em>' reference.
	 * @see #getSmartmetertype()
	 * @generated
	 */
	void setSmartmetertype(SmartMeterType value);

	/**
	 * Returns the value of the '<em><b>Networknode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networknode</em>' reference.
	 * @see #setNetworknode(SmartMeter)
	 * @see typerepo.typeapplication.TypeapplicationPackage#getSmartMeterTypeApplication_Networknode()
	 * @model required="true"
	 * @generated
	 */
	SmartMeter getNetworknode();

	/**
	 * Sets the value of the '{@link typerepo.typeapplication.SmartMeterTypeApplication#getNetworknode <em>Networknode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networknode</em>' reference.
	 * @see #getNetworknode()
	 * @generated
	 */
	void setNetworknode(SmartMeter value);

} // SmartMeterTypeApplication
