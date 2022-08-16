/**
 */
package domain.ppu.ppucomponents;

import domain.aps.components.Cylinder;
import domain.aps.components.CylinderPart;
import domain.aps.components.Pusher;

import domain.aps.mechanicalcomponents.ReturnSpring;

import domain.ppu.ppubuscomponents.ProfibusDPSlave;

import domain.ppu.ppumechanicalcomponents.Housing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monostable Cylinder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ppu.ppucomponents.MonostableCylinder#getHousing <em>Housing</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.MonostableCylinder#getSpring <em>Spring</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.MonostableCylinder#getReedSwitches <em>Reed Switches</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.MonostableCylinder#getCylinderPart <em>Cylinder Part</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.MonostableCylinder#getValve <em>Valve</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.MonostableCylinder#getBusSlave <em>Bus Slave</em>}</li>
 *   <li>{@link domain.ppu.ppucomponents.MonostableCylinder#getPusher <em>Pusher</em>}</li>
 * </ul>
 *
 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder()
 * @model
 * @generated
 */
public interface MonostableCylinder extends Cylinder {
	/**
	 * Returns the value of the '<em><b>Housing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Housing</em>' containment reference.
	 * @see #setHousing(Housing)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder_Housing()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Housing getHousing();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.MonostableCylinder#getHousing <em>Housing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Housing</em>' containment reference.
	 * @see #getHousing()
	 * @generated
	 */
	void setHousing(Housing value);

	/**
	 * Returns the value of the '<em><b>Spring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring</em>' containment reference.
	 * @see #setSpring(ReturnSpring)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder_Spring()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReturnSpring getSpring();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.MonostableCylinder#getSpring <em>Spring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring</em>' containment reference.
	 * @see #getSpring()
	 * @generated
	 */
	void setSpring(ReturnSpring value);

	/**
	 * Returns the value of the '<em><b>Reed Switches</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ppu.ppucomponents.ReedSwitch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reed Switches</em>' containment reference list.
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder_ReedSwitches()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReedSwitch> getReedSwitches();

	/**
	 * Returns the value of the '<em><b>Cylinder Part</b></em>' containment reference list.
	 * The list contents are of type {@link domain.aps.components.CylinderPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder Part</em>' containment reference list.
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder_CylinderPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CylinderPart> getCylinderPart();

	/**
	 * Returns the value of the '<em><b>Valve</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ppu.ppucomponents.RegularValve}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valve</em>' containment reference list.
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder_Valve()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RegularValve> getValve();

	/**
	 * Returns the value of the '<em><b>Bus Slave</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ppu.ppubuscomponents.ProfibusDPSlave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Slave</em>' containment reference list.
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder_BusSlave()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProfibusDPSlave> getBusSlave();

	/**
	 * Returns the value of the '<em><b>Pusher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pusher</em>' containment reference.
	 * @see #setPusher(Pusher)
	 * @see domain.ppu.ppucomponents.PpucomponentsPackage#getMonostableCylinder_Pusher()
	 * @model containment="true"
	 * @generated
	 */
	Pusher getPusher();

	/**
	 * Sets the value of the '{@link domain.ppu.ppucomponents.MonostableCylinder#getPusher <em>Pusher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pusher</em>' containment reference.
	 * @see #getPusher()
	 * @generated
	 */
	void setPusher(Pusher value);

} // MonostableCylinder
