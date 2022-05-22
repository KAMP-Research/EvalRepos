/**
 */
package topo;

import graph.CommunicatingEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link topo.SmartMeter#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 *
 * @see topo.TopoPackage#getSmartMeter()
 * @model
 * @generated
 */
public interface SmartMeter extends CommunicatingEntity {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see #setAggregation(int)
	 * @see topo.TopoPackage#getSmartMeter_Aggregation()
	 * @model default="1"
	 * @generated
	 */
	int getAggregation();

	/**
	 * Sets the value of the '{@link topo.SmartMeter#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(int value);

} // SmartMeter
