/**
 */
package quality.as_foaa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import quality.as_foaa.As_foaaPackage;
import quality.as_foaa.CalibrationSpecification;
import quality.as_foaa.DocumentationSpecification;
import quality.as_foaa.ECADSpecification;
import quality.as_foaa.FieldOfActivityAnnotationRepository;
import quality.as_foaa.HMISpecification;
import quality.as_foaa.StaffSpecification;
import quality.as_foaa.StockSpecification;
import quality.as_foaa.TestSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Of Activity Annotation Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.impl.FieldOfActivityAnnotationRepositoryImpl#getCalibrationSpecification <em>Calibration Specification</em>}</li>
 *   <li>{@link quality.as_foaa.impl.FieldOfActivityAnnotationRepositoryImpl#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link quality.as_foaa.impl.FieldOfActivityAnnotationRepositoryImpl#getStockSpecification <em>Stock Specification</em>}</li>
 *   <li>{@link quality.as_foaa.impl.FieldOfActivityAnnotationRepositoryImpl#getHmiSpecification <em>Hmi Specification</em>}</li>
 *   <li>{@link quality.as_foaa.impl.FieldOfActivityAnnotationRepositoryImpl#getEcadSpecification <em>Ecad Specification</em>}</li>
 *   <li>{@link quality.as_foaa.impl.FieldOfActivityAnnotationRepositoryImpl#getDocumentationSpecification <em>Documentation Specification</em>}</li>
 *   <li>{@link quality.as_foaa.impl.FieldOfActivityAnnotationRepositoryImpl#getStaffSpecification <em>Staff Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldOfActivityAnnotationRepositoryImpl extends MinimalEObjectImpl.Container implements FieldOfActivityAnnotationRepository {
	/**
	 * The cached value of the '{@link #getCalibrationSpecification() <em>Calibration Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrationSpecification()
	 * @generated
	 * @ordered
	 */
	protected CalibrationSpecification calibrationSpecification;

	/**
	 * The cached value of the '{@link #getTestSpecification() <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSpecification()
	 * @generated
	 * @ordered
	 */
	protected TestSpecification testSpecification;

	/**
	 * The cached value of the '{@link #getStockSpecification() <em>Stock Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockSpecification()
	 * @generated
	 * @ordered
	 */
	protected StockSpecification stockSpecification;

	/**
	 * The cached value of the '{@link #getHmiSpecification() <em>Hmi Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHmiSpecification()
	 * @generated
	 * @ordered
	 */
	protected HMISpecification hmiSpecification;

	/**
	 * The cached value of the '{@link #getEcadSpecification() <em>Ecad Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcadSpecification()
	 * @generated
	 * @ordered
	 */
	protected ECADSpecification ecadSpecification;

	/**
	 * The cached value of the '{@link #getDocumentationSpecification() <em>Documentation Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationSpecification()
	 * @generated
	 * @ordered
	 */
	protected DocumentationSpecification documentationSpecification;

	/**
	 * The cached value of the '{@link #getStaffSpecification() <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffSpecification()
	 * @generated
	 * @ordered
	 */
	protected StaffSpecification staffSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfActivityAnnotationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_foaaPackage.Literals.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibrationSpecification getCalibrationSpecification() {
		return calibrationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibrationSpecification(CalibrationSpecification newCalibrationSpecification, NotificationChain msgs) {
		CalibrationSpecification oldCalibrationSpecification = calibrationSpecification;
		calibrationSpecification = newCalibrationSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION, oldCalibrationSpecification, newCalibrationSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalibrationSpecification(CalibrationSpecification newCalibrationSpecification) {
		if (newCalibrationSpecification != calibrationSpecification) {
			NotificationChain msgs = null;
			if (calibrationSpecification != null)
				msgs = ((InternalEObject)calibrationSpecification).eInverseRemove(this, As_foaaPackage.CALIBRATION_SPECIFICATION__PARENT, CalibrationSpecification.class, msgs);
			if (newCalibrationSpecification != null)
				msgs = ((InternalEObject)newCalibrationSpecification).eInverseAdd(this, As_foaaPackage.CALIBRATION_SPECIFICATION__PARENT, CalibrationSpecification.class, msgs);
			msgs = basicSetCalibrationSpecification(newCalibrationSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION, newCalibrationSpecification, newCalibrationSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSpecification getTestSpecification() {
		return testSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestSpecification(TestSpecification newTestSpecification, NotificationChain msgs) {
		TestSpecification oldTestSpecification = testSpecification;
		testSpecification = newTestSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION, oldTestSpecification, newTestSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestSpecification(TestSpecification newTestSpecification) {
		if (newTestSpecification != testSpecification) {
			NotificationChain msgs = null;
			if (testSpecification != null)
				msgs = ((InternalEObject)testSpecification).eInverseRemove(this, As_foaaPackage.TEST_SPECIFICATION__PARENT, TestSpecification.class, msgs);
			if (newTestSpecification != null)
				msgs = ((InternalEObject)newTestSpecification).eInverseAdd(this, As_foaaPackage.TEST_SPECIFICATION__PARENT, TestSpecification.class, msgs);
			msgs = basicSetTestSpecification(newTestSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION, newTestSpecification, newTestSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockSpecification getStockSpecification() {
		return stockSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStockSpecification(StockSpecification newStockSpecification, NotificationChain msgs) {
		StockSpecification oldStockSpecification = stockSpecification;
		stockSpecification = newStockSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION, oldStockSpecification, newStockSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStockSpecification(StockSpecification newStockSpecification) {
		if (newStockSpecification != stockSpecification) {
			NotificationChain msgs = null;
			if (stockSpecification != null)
				msgs = ((InternalEObject)stockSpecification).eInverseRemove(this, As_foaaPackage.STOCK_SPECIFICATION__PARENT, StockSpecification.class, msgs);
			if (newStockSpecification != null)
				msgs = ((InternalEObject)newStockSpecification).eInverseAdd(this, As_foaaPackage.STOCK_SPECIFICATION__PARENT, StockSpecification.class, msgs);
			msgs = basicSetStockSpecification(newStockSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION, newStockSpecification, newStockSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMISpecification getHmiSpecification() {
		return hmiSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHmiSpecification(HMISpecification newHmiSpecification, NotificationChain msgs) {
		HMISpecification oldHmiSpecification = hmiSpecification;
		hmiSpecification = newHmiSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION, oldHmiSpecification, newHmiSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHmiSpecification(HMISpecification newHmiSpecification) {
		if (newHmiSpecification != hmiSpecification) {
			NotificationChain msgs = null;
			if (hmiSpecification != null)
				msgs = ((InternalEObject)hmiSpecification).eInverseRemove(this, As_foaaPackage.HMI_SPECIFICATION__PARENT, HMISpecification.class, msgs);
			if (newHmiSpecification != null)
				msgs = ((InternalEObject)newHmiSpecification).eInverseAdd(this, As_foaaPackage.HMI_SPECIFICATION__PARENT, HMISpecification.class, msgs);
			msgs = basicSetHmiSpecification(newHmiSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION, newHmiSpecification, newHmiSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECADSpecification getEcadSpecification() {
		return ecadSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcadSpecification(ECADSpecification newEcadSpecification, NotificationChain msgs) {
		ECADSpecification oldEcadSpecification = ecadSpecification;
		ecadSpecification = newEcadSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION, oldEcadSpecification, newEcadSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcadSpecification(ECADSpecification newEcadSpecification) {
		if (newEcadSpecification != ecadSpecification) {
			NotificationChain msgs = null;
			if (ecadSpecification != null)
				msgs = ((InternalEObject)ecadSpecification).eInverseRemove(this, As_foaaPackage.ECAD_SPECIFICATION__PARENT, ECADSpecification.class, msgs);
			if (newEcadSpecification != null)
				msgs = ((InternalEObject)newEcadSpecification).eInverseAdd(this, As_foaaPackage.ECAD_SPECIFICATION__PARENT, ECADSpecification.class, msgs);
			msgs = basicSetEcadSpecification(newEcadSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION, newEcadSpecification, newEcadSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationSpecification getDocumentationSpecification() {
		return documentationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentationSpecification(DocumentationSpecification newDocumentationSpecification, NotificationChain msgs) {
		DocumentationSpecification oldDocumentationSpecification = documentationSpecification;
		documentationSpecification = newDocumentationSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION, oldDocumentationSpecification, newDocumentationSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentationSpecification(DocumentationSpecification newDocumentationSpecification) {
		if (newDocumentationSpecification != documentationSpecification) {
			NotificationChain msgs = null;
			if (documentationSpecification != null)
				msgs = ((InternalEObject)documentationSpecification).eInverseRemove(this, As_foaaPackage.DOCUMENTATION_SPECIFICATION__PARENT, DocumentationSpecification.class, msgs);
			if (newDocumentationSpecification != null)
				msgs = ((InternalEObject)newDocumentationSpecification).eInverseAdd(this, As_foaaPackage.DOCUMENTATION_SPECIFICATION__PARENT, DocumentationSpecification.class, msgs);
			msgs = basicSetDocumentationSpecification(newDocumentationSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION, newDocumentationSpecification, newDocumentationSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSpecification getStaffSpecification() {
		return staffSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaffSpecification(StaffSpecification newStaffSpecification, NotificationChain msgs) {
		StaffSpecification oldStaffSpecification = staffSpecification;
		staffSpecification = newStaffSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, oldStaffSpecification, newStaffSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffSpecification(StaffSpecification newStaffSpecification) {
		if (newStaffSpecification != staffSpecification) {
			NotificationChain msgs = null;
			if (staffSpecification != null)
				msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, As_foaaPackage.STAFF_SPECIFICATION__PARENT, StaffSpecification.class, msgs);
			if (newStaffSpecification != null)
				msgs = ((InternalEObject)newStaffSpecification).eInverseAdd(this, As_foaaPackage.STAFF_SPECIFICATION__PARENT, StaffSpecification.class, msgs);
			msgs = basicSetStaffSpecification(newStaffSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, newStaffSpecification, newStaffSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION:
				if (calibrationSpecification != null)
					msgs = ((InternalEObject)calibrationSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION, null, msgs);
				return basicSetCalibrationSpecification((CalibrationSpecification)otherEnd, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				if (testSpecification != null)
					msgs = ((InternalEObject)testSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION, null, msgs);
				return basicSetTestSpecification((TestSpecification)otherEnd, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION:
				if (stockSpecification != null)
					msgs = ((InternalEObject)stockSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION, null, msgs);
				return basicSetStockSpecification((StockSpecification)otherEnd, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION:
				if (hmiSpecification != null)
					msgs = ((InternalEObject)hmiSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION, null, msgs);
				return basicSetHmiSpecification((HMISpecification)otherEnd, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION:
				if (ecadSpecification != null)
					msgs = ((InternalEObject)ecadSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION, null, msgs);
				return basicSetEcadSpecification((ECADSpecification)otherEnd, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION:
				if (documentationSpecification != null)
					msgs = ((InternalEObject)documentationSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION, null, msgs);
				return basicSetDocumentationSpecification((DocumentationSpecification)otherEnd, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				if (staffSpecification != null)
					msgs = ((InternalEObject)staffSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION, null, msgs);
				return basicSetStaffSpecification((StaffSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION:
				return basicSetCalibrationSpecification(null, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				return basicSetTestSpecification(null, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION:
				return basicSetStockSpecification(null, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION:
				return basicSetHmiSpecification(null, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION:
				return basicSetEcadSpecification(null, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION:
				return basicSetDocumentationSpecification(null, msgs);
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				return basicSetStaffSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION:
				return getCalibrationSpecification();
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				return getTestSpecification();
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION:
				return getStockSpecification();
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION:
				return getHmiSpecification();
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION:
				return getEcadSpecification();
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION:
				return getDocumentationSpecification();
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				return getStaffSpecification();
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
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION:
				setCalibrationSpecification((CalibrationSpecification)newValue);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((TestSpecification)newValue);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION:
				setStockSpecification((StockSpecification)newValue);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION:
				setHmiSpecification((HMISpecification)newValue);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION:
				setEcadSpecification((ECADSpecification)newValue);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION:
				setDocumentationSpecification((DocumentationSpecification)newValue);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((StaffSpecification)newValue);
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
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION:
				setCalibrationSpecification((CalibrationSpecification)null);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				setTestSpecification((TestSpecification)null);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION:
				setStockSpecification((StockSpecification)null);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION:
				setHmiSpecification((HMISpecification)null);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION:
				setEcadSpecification((ECADSpecification)null);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION:
				setDocumentationSpecification((DocumentationSpecification)null);
				return;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				setStaffSpecification((StaffSpecification)null);
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
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__CALIBRATION_SPECIFICATION:
				return calibrationSpecification != null;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__TEST_SPECIFICATION:
				return testSpecification != null;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STOCK_SPECIFICATION:
				return stockSpecification != null;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__HMI_SPECIFICATION:
				return hmiSpecification != null;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__ECAD_SPECIFICATION:
				return ecadSpecification != null;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__DOCUMENTATION_SPECIFICATION:
				return documentationSpecification != null;
			case As_foaaPackage.FIELD_OF_ACTIVITY_ANNOTATION_REPOSITORY__STAFF_SPECIFICATION:
				return staffSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldOfActivityAnnotationRepositoryImpl
