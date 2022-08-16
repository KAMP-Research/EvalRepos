/**
 */
package quality.as_foaa.impl;

import domain.as.StructureRepository.Structure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import quality.as_foaa.As_foaaPackage;
import quality.as_foaa.StockSpecification;
import quality.as_foaa.StructureStockList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Stock List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quality.as_foaa.impl.StructureStockListImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link quality.as_foaa.impl.StructureStockListImpl#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureStockListImpl extends StockListImpl implements StructureStockList {
	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureStockListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return As_foaaPackage.Literals.STRUCTURE_STOCK_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockSpecification getParent() {
		if (eContainerFeatureID() != As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT) return null;
		return (StockSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(StockSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(StockSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, As_foaaPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST, StockSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getStructures() {
		if (structures == null) {
			structures = new EObjectResolvingEList<Structure>(Structure.class, this, As_foaaPackage.STRUCTURE_STOCK_LIST__STRUCTURES);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((StockSpecification)otherEnd, msgs);
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
			case As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT:
				return eInternalContainer().eInverseRemove(this, As_foaaPackage.STOCK_SPECIFICATION__STRUCTURE_STOCK_LIST, StockSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT:
				return getParent();
			case As_foaaPackage.STRUCTURE_STOCK_LIST__STRUCTURES:
				return getStructures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT:
				setParent((StockSpecification)newValue);
				return;
			case As_foaaPackage.STRUCTURE_STOCK_LIST__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends Structure>)newValue);
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
			case As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT:
				setParent((StockSpecification)null);
				return;
			case As_foaaPackage.STRUCTURE_STOCK_LIST__STRUCTURES:
				getStructures().clear();
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
			case As_foaaPackage.STRUCTURE_STOCK_LIST__PARENT:
				return getParent() != null;
			case As_foaaPackage.STRUCTURE_STOCK_LIST__STRUCTURES:
				return structures != null && !structures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureStockListImpl
