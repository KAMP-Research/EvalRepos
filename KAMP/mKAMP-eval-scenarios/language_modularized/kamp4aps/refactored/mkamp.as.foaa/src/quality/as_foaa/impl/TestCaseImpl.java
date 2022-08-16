/**
 */
package quality.as_foaa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import quality.as_foaa.As_foaaPackage;
import quality.as_foaa.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.impl.TestCaseImpl#getTestName <em>Test Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TestCaseImpl extends MinimalEObjectImpl.Container implements TestCase {
	/**
	 * The default value of the '{@link #getTestName() <em>Test Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestName() <em>Test Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestName()
	 * @generated
	 * @ordered
	 */
	protected String testName = TEST_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_foaaPackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestName(String newTestName) {
		String oldTestName = testName;
		testName = newTestName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.TEST_CASE__TEST_NAME, oldTestName, testName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case As_foaaPackage.TEST_CASE__TEST_NAME:
				return getTestName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case As_foaaPackage.TEST_CASE__TEST_NAME:
				setTestName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case As_foaaPackage.TEST_CASE__TEST_NAME:
				setTestName(TEST_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case As_foaaPackage.TEST_CASE__TEST_NAME:
				return TEST_NAME_EDEFAULT == null ? testName != null : !TEST_NAME_EDEFAULT.equals(testName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testName: ");
		result.append(testName);
		result.append(')');
		return result.toString();
	}

} //TestCaseImpl
