/**
 */
package domain.ppu.ppubuscomponents;

import domain.aps.buscomponents.BuscomponentsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.ppu.ppubuscomponents.PpubuscomponentsFactory
 * @model kind="package"
 * @generated
 */
public interface PpubuscomponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ppubuscomponents";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ppubuscomponents";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ppubuscomponents";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PpubuscomponentsPackage eINSTANCE = domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPSlaveImpl <em>Profibus DP Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPSlaveImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPSlave()
	 * @generated
	 */
	int PROFIBUS_DP_SLAVE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__ID = BuscomponentsPackage.BUS_SLAVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__NAME = BuscomponentsPackage.BUS_SLAVE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_SLAVE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__PARENT = BuscomponentsPackage.BUS_SLAVE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__PARENT_MODULE = BuscomponentsPackage.BUS_SLAVE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__SIGNALINTERFACE_MASTER = BuscomponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE__SIGNALINTERFACE_SLAVE = BuscomponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE;

	/**
	 * The number of structural features of the '<em>Profibus DP Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE_FEATURE_COUNT = BuscomponentsPackage.BUS_SLAVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_SLAVE_OPERATION_COUNT = BuscomponentsPackage.BUS_SLAVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATSlaveImpl <em>Ether CAT Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.EtherCATSlaveImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATSlave()
	 * @generated
	 */
	int ETHER_CAT_SLAVE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__ID = BuscomponentsPackage.BUS_SLAVE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__NAME = BuscomponentsPackage.BUS_SLAVE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_SLAVE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__PARENT = BuscomponentsPackage.BUS_SLAVE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__PARENT_MODULE = BuscomponentsPackage.BUS_SLAVE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__SIGNALINTERFACE_MASTER = BuscomponentsPackage.BUS_SLAVE__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE__SIGNALINTERFACE_SLAVE = BuscomponentsPackage.BUS_SLAVE__SIGNALINTERFACE_SLAVE;

	/**
	 * The number of structural features of the '<em>Ether CAT Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE_FEATURE_COUNT = BuscomponentsPackage.BUS_SLAVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_SLAVE_OPERATION_COUNT = BuscomponentsPackage.BUS_SLAVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPCableImpl <em>Profibus DP Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPCableImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPCable()
	 * @generated
	 */
	int PROFIBUS_DP_CABLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__ID = BuscomponentsPackage.BUS_CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__NAME = BuscomponentsPackage.BUS_CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__PARENT = BuscomponentsPackage.BUS_CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__PARENT_MODULE = BuscomponentsPackage.BUS_CABLE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signal Plug1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__SIGNAL_PLUG1 = BuscomponentsPackage.BUS_CABLE__SIGNAL_PLUG1;

	/**
	 * The feature id for the '<em><b>Signal Plug2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE__SIGNAL_PLUG2 = BuscomponentsPackage.BUS_CABLE__SIGNAL_PLUG2;

	/**
	 * The number of structural features of the '<em>Profibus DP Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE_FEATURE_COUNT = BuscomponentsPackage.BUS_CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_CABLE_OPERATION_COUNT = BuscomponentsPackage.BUS_CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPBoxImpl <em>Profibus DP Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPBoxImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPBox()
	 * @generated
	 */
	int PROFIBUS_DP_BOX = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__ID = BuscomponentsPackage.BUS_BOX__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__NAME = BuscomponentsPackage.BUS_BOX__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_BOX__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__PARENT = BuscomponentsPackage.BUS_BOX__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__PARENT_MODULE = BuscomponentsPackage.BUS_BOX__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__SIGNALINTERFACES = BuscomponentsPackage.BUS_BOX__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__SIGNALINTERFACE_MASTER = BuscomponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__SIGNALINTERFACE_BOX = BuscomponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX__POWERSUPPLY = BuscomponentsPackage.BUS_BOX__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Profibus DP Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX_FEATURE_COUNT = BuscomponentsPackage.BUS_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_BOX_OPERATION_COUNT = BuscomponentsPackage.BUS_BOX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPMasterImpl <em>Profibus DP Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPMasterImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPMaster()
	 * @generated
	 */
	int PROFIBUS_DP_MASTER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__ID = BuscomponentsPackage.BUS_MASTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__NAME = BuscomponentsPackage.BUS_MASTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_MASTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__PARENT = BuscomponentsPackage.BUS_MASTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__PARENT_MODULE = BuscomponentsPackage.BUS_MASTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__SIGNALINTERFACES = BuscomponentsPackage.BUS_MASTER__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER__SIGNALINTERFACE_CONTROLLER = BuscomponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER;

	/**
	 * The number of structural features of the '<em>Profibus DP Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER_FEATURE_COUNT = BuscomponentsPackage.BUS_MASTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Profibus DP Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFIBUS_DP_MASTER_OPERATION_COUNT = BuscomponentsPackage.BUS_MASTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATBoxImpl <em>Ether CAT Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.EtherCATBoxImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATBox()
	 * @generated
	 */
	int ETHER_CAT_BOX = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__ID = BuscomponentsPackage.BUS_BOX__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__NAME = BuscomponentsPackage.BUS_BOX__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_BOX__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__PARENT = BuscomponentsPackage.BUS_BOX__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__PARENT_MODULE = BuscomponentsPackage.BUS_BOX__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__SIGNALINTERFACES = BuscomponentsPackage.BUS_BOX__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__SIGNALINTERFACE_MASTER = BuscomponentsPackage.BUS_BOX__SIGNALINTERFACE_MASTER;

	/**
	 * The feature id for the '<em><b>Signalinterface box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__SIGNALINTERFACE_BOX = BuscomponentsPackage.BUS_BOX__SIGNALINTERFACE_BOX;

	/**
	 * The feature id for the '<em><b>Powersupply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX__POWERSUPPLY = BuscomponentsPackage.BUS_BOX__POWERSUPPLY;

	/**
	 * The number of structural features of the '<em>Ether CAT Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX_FEATURE_COUNT = BuscomponentsPackage.BUS_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_BOX_OPERATION_COUNT = BuscomponentsPackage.BUS_BOX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATMasterImpl <em>Ether CAT Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.EtherCATMasterImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATMaster()
	 * @generated
	 */
	int ETHER_CAT_MASTER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__ID = BuscomponentsPackage.BUS_MASTER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__NAME = BuscomponentsPackage.BUS_MASTER__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_MASTER__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__PARENT = BuscomponentsPackage.BUS_MASTER__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__PARENT_MODULE = BuscomponentsPackage.BUS_MASTER__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signalinterfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__SIGNALINTERFACES = BuscomponentsPackage.BUS_MASTER__SIGNALINTERFACES;

	/**
	 * The feature id for the '<em><b>Signalinterface controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER__SIGNALINTERFACE_CONTROLLER = BuscomponentsPackage.BUS_MASTER__SIGNALINTERFACE_CONTROLLER;

	/**
	 * The number of structural features of the '<em>Ether CAT Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER_FEATURE_COUNT = BuscomponentsPackage.BUS_MASTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_MASTER_OPERATION_COUNT = BuscomponentsPackage.BUS_MASTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATCableImpl <em>Ether CAT Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.ppu.ppubuscomponents.impl.EtherCATCableImpl
	 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATCable()
	 * @generated
	 */
	int ETHER_CAT_CABLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__ID = BuscomponentsPackage.BUS_CABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__NAME = BuscomponentsPackage.BUS_CABLE__NAME;

	/**
	 * The feature id for the '<em><b>Connected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__CONNECTED_INTERFACES = BuscomponentsPackage.BUS_CABLE__CONNECTED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__PARENT = BuscomponentsPackage.BUS_CABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Parent Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__PARENT_MODULE = BuscomponentsPackage.BUS_CABLE__PARENT_MODULE;

	/**
	 * The feature id for the '<em><b>Signal Plug1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__SIGNAL_PLUG1 = BuscomponentsPackage.BUS_CABLE__SIGNAL_PLUG1;

	/**
	 * The feature id for the '<em><b>Signal Plug2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE__SIGNAL_PLUG2 = BuscomponentsPackage.BUS_CABLE__SIGNAL_PLUG2;

	/**
	 * The number of structural features of the '<em>Ether CAT Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE_FEATURE_COUNT = BuscomponentsPackage.BUS_CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ether CAT Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHER_CAT_CABLE_OPERATION_COUNT = BuscomponentsPackage.BUS_CABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.ProfibusDPSlave <em>Profibus DP Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Slave</em>'.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPSlave
	 * @generated
	 */
	EClass getProfibusDPSlave();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.EtherCATSlave <em>Ether CAT Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Slave</em>'.
	 * @see domain.ppu.ppubuscomponents.EtherCATSlave
	 * @generated
	 */
	EClass getEtherCATSlave();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.ProfibusDPCable <em>Profibus DP Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Cable</em>'.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPCable
	 * @generated
	 */
	EClass getProfibusDPCable();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.ProfibusDPBox <em>Profibus DP Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Box</em>'.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPBox
	 * @generated
	 */
	EClass getProfibusDPBox();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.ProfibusDPMaster <em>Profibus DP Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profibus DP Master</em>'.
	 * @see domain.ppu.ppubuscomponents.ProfibusDPMaster
	 * @generated
	 */
	EClass getProfibusDPMaster();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.EtherCATBox <em>Ether CAT Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Box</em>'.
	 * @see domain.ppu.ppubuscomponents.EtherCATBox
	 * @generated
	 */
	EClass getEtherCATBox();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.EtherCATMaster <em>Ether CAT Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Master</em>'.
	 * @see domain.ppu.ppubuscomponents.EtherCATMaster
	 * @generated
	 */
	EClass getEtherCATMaster();

	/**
	 * Returns the meta object for class '{@link domain.ppu.ppubuscomponents.EtherCATCable <em>Ether CAT Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ether CAT Cable</em>'.
	 * @see domain.ppu.ppubuscomponents.EtherCATCable
	 * @generated
	 */
	EClass getEtherCATCable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PpubuscomponentsFactory getPpubuscomponentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPSlaveImpl <em>Profibus DP Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPSlaveImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPSlave()
		 * @generated
		 */
		EClass PROFIBUS_DP_SLAVE = eINSTANCE.getProfibusDPSlave();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATSlaveImpl <em>Ether CAT Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.EtherCATSlaveImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATSlave()
		 * @generated
		 */
		EClass ETHER_CAT_SLAVE = eINSTANCE.getEtherCATSlave();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPCableImpl <em>Profibus DP Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPCableImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPCable()
		 * @generated
		 */
		EClass PROFIBUS_DP_CABLE = eINSTANCE.getProfibusDPCable();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPBoxImpl <em>Profibus DP Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPBoxImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPBox()
		 * @generated
		 */
		EClass PROFIBUS_DP_BOX = eINSTANCE.getProfibusDPBox();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.ProfibusDPMasterImpl <em>Profibus DP Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.ProfibusDPMasterImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getProfibusDPMaster()
		 * @generated
		 */
		EClass PROFIBUS_DP_MASTER = eINSTANCE.getProfibusDPMaster();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATBoxImpl <em>Ether CAT Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.EtherCATBoxImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATBox()
		 * @generated
		 */
		EClass ETHER_CAT_BOX = eINSTANCE.getEtherCATBox();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATMasterImpl <em>Ether CAT Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.EtherCATMasterImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATMaster()
		 * @generated
		 */
		EClass ETHER_CAT_MASTER = eINSTANCE.getEtherCATMaster();

		/**
		 * The meta object literal for the '{@link domain.ppu.ppubuscomponents.impl.EtherCATCableImpl <em>Ether CAT Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.ppu.ppubuscomponents.impl.EtherCATCableImpl
		 * @see domain.ppu.ppubuscomponents.impl.PpubuscomponentsPackageImpl#getEtherCATCable()
		 * @generated
		 */
		EClass ETHER_CAT_CABLE = eINSTANCE.getEtherCATCable();

	}

} //PpubuscomponentsPackage
