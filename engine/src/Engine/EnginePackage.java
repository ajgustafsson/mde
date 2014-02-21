/**
 */
package Engine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see Engine.EngineFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface EnginePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Engine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Group2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "G2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnginePackage eINSTANCE = Engine.impl.EnginePackageImpl.init();

	/**
	 * The meta object id for the '{@link Engine.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.WorkflowImpl
	 * @see Engine.impl.EnginePackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NODES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 1;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___START__USER = 0;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Engine.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.Node
	 * @see Engine.impl.EnginePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Engine.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.TaskImpl
	 * @see Engine.impl.EnginePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__END = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERMISSION = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRANSITION = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESULT = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA = NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREVIOUS_TASKS = NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NODE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Do Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___DO_JOB = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Ready</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SET_READY__ELIST = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Engine.Transition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.Transition
	 * @see Engine.impl.EnginePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PREVIOUS_TASKS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RESULT_TASKS = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Transit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___TRANSIT = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Engine.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.SplitImpl
	 * @see Engine.impl.EnginePackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__PREVIOUS_TASKS = TRANSITION__PREVIOUS_TASKS;

	/**
	 * The feature id for the '<em><b>Result Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__RESULT_TASKS = TRANSITION__RESULT_TASKS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__TASKS = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT___TRANSIT = TRANSITION___TRANSIT;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Engine.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.MergeImpl
	 * @see Engine.impl.EnginePackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__PREVIOUS_TASKS = TRANSITION__PREVIOUS_TASKS;

	/**
	 * The feature id for the '<em><b>Result Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__RESULT_TASKS = TRANSITION__RESULT_TASKS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__TASK = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE___TRANSIT = TRANSITION___TRANSIT;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Engine.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.SimpleImpl
	 * @see Engine.impl.EnginePackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__PREVIOUS_TASKS = TRANSITION__PREVIOUS_TASKS;

	/**
	 * The feature id for the '<em><b>Result Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__RESULT_TASKS = TRANSITION__RESULT_TASKS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TASK = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE___TRANSIT = TRANSITION___TRANSIT;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Engine.impl.IfElseImpl <em>If Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.IfElseImpl
	 * @see Engine.impl.EnginePackageImpl#getIfElse()
	 * @generated
	 */
	int IF_ELSE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE__PREVIOUS_TASKS = TRANSITION__PREVIOUS_TASKS;

	/**
	 * The feature id for the '<em><b>Result Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE__RESULT_TASKS = TRANSITION__RESULT_TASKS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE__TASKS = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE___TRANSIT = TRANSITION___TRANSIT;

	/**
	 * The number of operations of the '<em>If Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Engine.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.SwitchImpl
	 * @see Engine.impl.EnginePackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__PREVIOUS_TASKS = TRANSITION__PREVIOUS_TASKS;

	/**
	 * The feature id for the '<em><b>Result Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__RESULT_TASKS = TRANSITION__RESULT_TASKS;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TASKS = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___TRANSIT = TRANSITION___TRANSIT;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Engine.impl.WaitForOneImpl <em>Wait For One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.WaitForOneImpl
	 * @see Engine.impl.EnginePackageImpl#getWaitForOne()
	 * @generated
	 */
	int WAIT_FOR_ONE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_ONE__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Previous Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_ONE__PREVIOUS_TASKS = TRANSITION__PREVIOUS_TASKS;

	/**
	 * The feature id for the '<em><b>Result Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_ONE__RESULT_TASKS = TRANSITION__RESULT_TASKS;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_ONE__TASK = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait For One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_ONE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Transit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_ONE___TRANSIT = TRANSITION___TRANSIT;

	/**
	 * The number of operations of the '<em>Wait For One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FOR_ONE_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Engine.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.UserImpl
	 * @see Engine.impl.EnginePackageImpl#getUser()
	 * @generated
	 */
	int USER = 10;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Engine.impl.MainSystemImpl <em>Main System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.MainSystemImpl
	 * @see Engine.impl.EnginePackageImpl#getMainSystem()
	 * @generated
	 */
	int MAIN_SYSTEM = 11;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM__WORKFLOWS = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM__USERS = 1;

	/**
	 * The feature id for the '<em><b>User Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM__USER_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM__PERMISSIONS = 3;

	/**
	 * The number of structural features of the '<em>Main System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM___START__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Main System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SYSTEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Engine.impl.UserGroupImpl <em>User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.UserGroupImpl
	 * @see Engine.impl.EnginePackageImpl#getUserGroup()
	 * @generated
	 */
	int USER_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__PERMISSIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__NAME = 1;

	/**
	 * The number of structural features of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Engine.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.PermissionImpl
	 * @see Engine.impl.EnginePackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Engine.impl.ResultTaskImpl <em>Result Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.impl.ResultTaskImpl
	 * @see Engine.impl.EnginePackageImpl#getResultTask()
	 * @generated
	 */
	int RESULT_TASK = 14;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TASK__TASK = 0;

	/**
	 * The feature id for the '<em><b>Result Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TASK__RESULT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TASK__RESULT = 2;

	/**
	 * The number of structural features of the '<em>Result Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Result Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Engine.TaskState <em>Task State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Engine.TaskState
	 * @see Engine.impl.EnginePackageImpl#getTaskState()
	 * @generated
	 */
	int TASK_STATE = 15;


	/**
	 * Returns the meta object for class '{@link Engine.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see Engine.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link Engine.Workflow#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see Engine.Workflow#getNodes()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Engine.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the '{@link Engine.Workflow#start(Engine.User) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see Engine.Workflow#start(Engine.User)
	 * @generated
	 */
	EOperation getWorkflow__Start__User();

	/**
	 * Returns the meta object for class '{@link Engine.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see Engine.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Engine.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link Engine.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see Engine.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Task#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see Engine.Task#getState()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_State();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Task#isEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see Engine.Task#isEnd()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_End();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Task#isStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see Engine.Task#isStart()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Start();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Task#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see Engine.Task#getData()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Data();

	/**
	 * Returns the meta object for the reference list '{@link Engine.Task#getPreviousTasks <em>Previous Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Tasks</em>'.
	 * @see Engine.Task#getPreviousTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PreviousTasks();

	/**
	 * Returns the meta object for the '{@link Engine.Task#doJob() <em>Do Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Job</em>' operation.
	 * @see Engine.Task#doJob()
	 * @generated
	 */
	EOperation getTask__DoJob();

	/**
	 * Returns the meta object for the '{@link Engine.Task#setReady(org.eclipse.emf.common.util.EList) <em>Set Ready</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Ready</em>' operation.
	 * @see Engine.Task#setReady(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTask__SetReady__EList();

	/**
	 * Returns the meta object for the reference '{@link Engine.Task#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Permission</em>'.
	 * @see Engine.Task#getPermission()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Permission();

	/**
	 * Returns the meta object for the reference list '{@link Engine.Task#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see Engine.Task#getTransition()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Transition();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Engine.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Task#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see Engine.Task#getResult()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Result();

	/**
	 * Returns the meta object for class '{@link Engine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see Engine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link Engine.Transition#getPreviousTasks <em>Previous Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Tasks</em>'.
	 * @see Engine.Transition#getPreviousTasks()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_PreviousTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link Engine.Transition#getResultTasks <em>Result Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Tasks</em>'.
	 * @see Engine.Transition#getResultTasks()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ResultTasks();

	/**
	 * Returns the meta object for the '{@link Engine.Transition#transit() <em>Transit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transit</em>' operation.
	 * @see Engine.Transition#transit()
	 * @generated
	 */
	EOperation getTransition__Transit();

	/**
	 * Returns the meta object for class '{@link Engine.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see Engine.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the reference list '{@link Engine.Split#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see Engine.Split#getTasks()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Tasks();

	/**
	 * Returns the meta object for class '{@link Engine.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see Engine.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for the reference '{@link Engine.Merge#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see Engine.Merge#getTask()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_Task();

	/**
	 * Returns the meta object for class '{@link Engine.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see Engine.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for the reference '{@link Engine.Simple#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see Engine.Simple#getTask()
	 * @see #getSimple()
	 * @generated
	 */
	EReference getSimple_Task();

	/**
	 * Returns the meta object for class '{@link Engine.IfElse <em>If Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Else</em>'.
	 * @see Engine.IfElse
	 * @generated
	 */
	EClass getIfElse();

	/**
	 * Returns the meta object for the reference list '{@link Engine.IfElse#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see Engine.IfElse#getTasks()
	 * @see #getIfElse()
	 * @generated
	 */
	EReference getIfElse_Tasks();

	/**
	 * Returns the meta object for class '{@link Engine.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see Engine.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the reference list '{@link Engine.Switch#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see Engine.Switch#getTasks()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Tasks();

	/**
	 * Returns the meta object for class '{@link Engine.WaitForOne <em>Wait For One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait For One</em>'.
	 * @see Engine.WaitForOne
	 * @generated
	 */
	EClass getWaitForOne();

	/**
	 * Returns the meta object for the reference '{@link Engine.WaitForOne#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see Engine.WaitForOne#getTask()
	 * @see #getWaitForOne()
	 * @generated
	 */
	EReference getWaitForOne_Task();

	/**
	 * Returns the meta object for class '{@link Engine.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see Engine.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link Engine.User#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see Engine.User#getGroups()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Groups();

	/**
	 * Returns the meta object for the attribute '{@link Engine.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Engine.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for class '{@link Engine.MainSystem <em>Main System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main System</em>'.
	 * @see Engine.MainSystem
	 * @generated
	 */
	EClass getMainSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link Engine.MainSystem#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflows</em>'.
	 * @see Engine.MainSystem#getWorkflows()
	 * @see #getMainSystem()
	 * @generated
	 */
	EReference getMainSystem_Workflows();

	/**
	 * Returns the meta object for the containment reference list '{@link Engine.MainSystem#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see Engine.MainSystem#getUsers()
	 * @see #getMainSystem()
	 * @generated
	 */
	EReference getMainSystem_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link Engine.MainSystem#getUserGroups <em>User Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Groups</em>'.
	 * @see Engine.MainSystem#getUserGroups()
	 * @see #getMainSystem()
	 * @generated
	 */
	EReference getMainSystem_UserGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link Engine.MainSystem#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see Engine.MainSystem#getPermissions()
	 * @see #getMainSystem()
	 * @generated
	 */
	EReference getMainSystem_Permissions();

	/**
	 * Returns the meta object for the '{@link Engine.MainSystem#start(java.lang.String, java.lang.String) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see Engine.MainSystem#start(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getMainSystem__Start__String_String();

	/**
	 * Returns the meta object for class '{@link Engine.UserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Group</em>'.
	 * @see Engine.UserGroup
	 * @generated
	 */
	EClass getUserGroup();

	/**
	 * Returns the meta object for the reference list '{@link Engine.UserGroup#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see Engine.UserGroup#getPermissions()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link Engine.UserGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Engine.UserGroup#getName()
	 * @see #getUserGroup()
	 * @generated
	 */
	EAttribute getUserGroup_Name();

	/**
	 * Returns the meta object for class '{@link Engine.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see Engine.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link Engine.Permission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Engine.Permission#getName()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Name();

	/**
	 * Returns the meta object for class '{@link Engine.ResultTask <em>Result Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Task</em>'.
	 * @see Engine.ResultTask
	 * @generated
	 */
	EClass getResultTask();

	/**
	 * Returns the meta object for the attribute '{@link Engine.ResultTask#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see Engine.ResultTask#getResult()
	 * @see #getResultTask()
	 * @generated
	 */
	EAttribute getResultTask_Result();

	/**
	 * Returns the meta object for the reference '{@link Engine.ResultTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see Engine.ResultTask#getTask()
	 * @see #getResultTask()
	 * @generated
	 */
	EReference getResultTask_Task();

	/**
	 * Returns the meta object for the attribute '{@link Engine.ResultTask#getResultName <em>Result Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Name</em>'.
	 * @see Engine.ResultTask#getResultName()
	 * @see #getResultTask()
	 * @generated
	 */
	EAttribute getResultTask_ResultName();

	/**
	 * Returns the meta object for enum '{@link Engine.TaskState <em>Task State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task State</em>'.
	 * @see Engine.TaskState
	 * @generated
	 */
	EEnum getTaskState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EngineFactory getEngineFactory();

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
		 * The meta object literal for the '{@link Engine.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.WorkflowImpl
		 * @see Engine.impl.EnginePackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__NODES = eINSTANCE.getWorkflow_Nodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKFLOW___START__USER = eINSTANCE.getWorkflow__Start__User();

		/**
		 * The meta object literal for the '{@link Engine.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.Node
		 * @see Engine.impl.EnginePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link Engine.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.TaskImpl
		 * @see Engine.impl.EnginePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATE = eINSTANCE.getTask_State();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__END = eINSTANCE.getTask_End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__START = eINSTANCE.getTask_Start();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DATA = eINSTANCE.getTask_Data();

		/**
		 * The meta object literal for the '<em><b>Previous Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PREVIOUS_TASKS = eINSTANCE.getTask_PreviousTasks();

		/**
		 * The meta object literal for the '<em><b>Do Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___DO_JOB = eINSTANCE.getTask__DoJob();

		/**
		 * The meta object literal for the '<em><b>Set Ready</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___SET_READY__ELIST = eINSTANCE.getTask__SetReady__EList();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PERMISSION = eINSTANCE.getTask_Permission();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TRANSITION = eINSTANCE.getTask_Transition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RESULT = eINSTANCE.getTask_Result();

		/**
		 * The meta object literal for the '{@link Engine.Transition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.Transition
		 * @see Engine.impl.EnginePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Previous Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PREVIOUS_TASKS = eINSTANCE.getTransition_PreviousTasks();

		/**
		 * The meta object literal for the '<em><b>Result Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RESULT_TASKS = eINSTANCE.getTransition_ResultTasks();

		/**
		 * The meta object literal for the '<em><b>Transit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___TRANSIT = eINSTANCE.getTransition__Transit();

		/**
		 * The meta object literal for the '{@link Engine.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.SplitImpl
		 * @see Engine.impl.EnginePackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__TASKS = eINSTANCE.getSplit_Tasks();

		/**
		 * The meta object literal for the '{@link Engine.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.MergeImpl
		 * @see Engine.impl.EnginePackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE__TASK = eINSTANCE.getMerge_Task();

		/**
		 * The meta object literal for the '{@link Engine.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.SimpleImpl
		 * @see Engine.impl.EnginePackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE__TASK = eINSTANCE.getSimple_Task();

		/**
		 * The meta object literal for the '{@link Engine.impl.IfElseImpl <em>If Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.IfElseImpl
		 * @see Engine.impl.EnginePackageImpl#getIfElse()
		 * @generated
		 */
		EClass IF_ELSE = eINSTANCE.getIfElse();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_ELSE__TASKS = eINSTANCE.getIfElse_Tasks();

		/**
		 * The meta object literal for the '{@link Engine.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.SwitchImpl
		 * @see Engine.impl.EnginePackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__TASKS = eINSTANCE.getSwitch_Tasks();

		/**
		 * The meta object literal for the '{@link Engine.impl.WaitForOneImpl <em>Wait For One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.WaitForOneImpl
		 * @see Engine.impl.EnginePackageImpl#getWaitForOne()
		 * @generated
		 */
		EClass WAIT_FOR_ONE = eINSTANCE.getWaitForOne();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAIT_FOR_ONE__TASK = eINSTANCE.getWaitForOne_Task();

		/**
		 * The meta object literal for the '{@link Engine.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.UserImpl
		 * @see Engine.impl.EnginePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__GROUPS = eINSTANCE.getUser_Groups();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '{@link Engine.impl.MainSystemImpl <em>Main System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.MainSystemImpl
		 * @see Engine.impl.EnginePackageImpl#getMainSystem()
		 * @generated
		 */
		EClass MAIN_SYSTEM = eINSTANCE.getMainSystem();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_SYSTEM__WORKFLOWS = eINSTANCE.getMainSystem_Workflows();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_SYSTEM__USERS = eINSTANCE.getMainSystem_Users();

		/**
		 * The meta object literal for the '<em><b>User Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_SYSTEM__USER_GROUPS = eINSTANCE.getMainSystem_UserGroups();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_SYSTEM__PERMISSIONS = eINSTANCE.getMainSystem_Permissions();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAIN_SYSTEM___START__STRING_STRING = eINSTANCE.getMainSystem__Start__String_String();

		/**
		 * The meta object literal for the '{@link Engine.impl.UserGroupImpl <em>User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.UserGroupImpl
		 * @see Engine.impl.EnginePackageImpl#getUserGroup()
		 * @generated
		 */
		EClass USER_GROUP = eINSTANCE.getUserGroup();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__PERMISSIONS = eINSTANCE.getUserGroup_Permissions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_GROUP__NAME = eINSTANCE.getUserGroup_Name();

		/**
		 * The meta object literal for the '{@link Engine.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.PermissionImpl
		 * @see Engine.impl.EnginePackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

		/**
		 * The meta object literal for the '{@link Engine.impl.ResultTaskImpl <em>Result Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.impl.ResultTaskImpl
		 * @see Engine.impl.EnginePackageImpl#getResultTask()
		 * @generated
		 */
		EClass RESULT_TASK = eINSTANCE.getResultTask();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TASK__RESULT = eINSTANCE.getResultTask_Result();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_TASK__TASK = eINSTANCE.getResultTask_Task();

		/**
		 * The meta object literal for the '<em><b>Result Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TASK__RESULT_NAME = eINSTANCE.getResultTask_ResultName();

		/**
		 * The meta object literal for the '{@link Engine.TaskState <em>Task State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Engine.TaskState
		 * @see Engine.impl.EnginePackageImpl#getTaskState()
		 * @generated
		 */
		EEnum TASK_STATE = eINSTANCE.getTaskState();

	}

} //EnginePackage
