/**
 */
package Engine.impl;

import Engine.EngineFactory;
import Engine.EnginePackage;
import Engine.IfElse;
import Engine.MainSystem;
import Engine.Merge;
import Engine.Node;
import Engine.Permission;
import Engine.Simple;
import Engine.Split;
import Engine.Switch;
import Engine.Task;
import Engine.TaskState;
import Engine.Transition;
import Engine.User;
import Engine.UserGroup;
import Engine.WaitForOne;
import Engine.Workflow;
import Engine.util.EngineValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnginePackageImpl extends EPackageImpl implements EnginePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitForOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Engine.EnginePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnginePackageImpl() {
		super(eNS_URI, EngineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EnginePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnginePackage init() {
		if (isInited) return (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);

		// Obtain or create and register package
		EnginePackageImpl theEnginePackage = (EnginePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnginePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnginePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEnginePackage.createPackageContents();

		// Initialize created meta-data
		theEnginePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEnginePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EngineValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEnginePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnginePackage.eNS_URI, theEnginePackage);
		return theEnginePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Nodes() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflow_Name() {
		return (EAttribute)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_State() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_IsEnd() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_IsStart() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Data() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__DoJob() {
		return taskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetReady__EList() {
		return taskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Permission() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Transition() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Result() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_PreviousTask() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Transit() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Tasks() {
		return (EReference)splitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerge() {
		return mergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerge_Task() {
		return (EReference)mergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Task() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfElse() {
		return ifElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfElse_Tasks() {
		return (EReference)ifElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Tasks() {
		return (EReference)switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaitForOne() {
		return waitForOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaitForOne_Task() {
		return (EReference)waitForOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Groups() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainSystem() {
		return mainSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainSystem_Workflows() {
		return (EReference)mainSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainSystem_Users() {
		return (EReference)mainSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainSystem_UserGroups() {
		return (EReference)mainSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainSystem_Permissions() {
		return (EReference)mainSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserGroup() {
		return userGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserGroup_Permissions() {
		return (EReference)userGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserGroup_Name() {
		return (EAttribute)userGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_Name() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskState() {
		return taskStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineFactory getEngineFactory() {
		return (EngineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__NODES);
		createEAttribute(workflowEClass, WORKFLOW__NAME);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__STATE);
		createEAttribute(taskEClass, TASK__IS_END);
		createEAttribute(taskEClass, TASK__IS_START);
		createEReference(taskEClass, TASK__PERMISSION);
		createEReference(taskEClass, TASK__TRANSITION);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__RESULT);
		createEAttribute(taskEClass, TASK__DATA);
		createEOperation(taskEClass, TASK___DO_JOB);
		createEOperation(taskEClass, TASK___SET_READY__ELIST);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__PREVIOUS_TASK);
		createEOperation(transitionEClass, TRANSITION___TRANSIT);

		splitEClass = createEClass(SPLIT);
		createEReference(splitEClass, SPLIT__TASKS);

		mergeEClass = createEClass(MERGE);
		createEReference(mergeEClass, MERGE__TASK);

		simpleEClass = createEClass(SIMPLE);
		createEReference(simpleEClass, SIMPLE__TASK);

		ifElseEClass = createEClass(IF_ELSE);
		createEReference(ifElseEClass, IF_ELSE__TASKS);

		switchEClass = createEClass(SWITCH);
		createEReference(switchEClass, SWITCH__TASKS);

		waitForOneEClass = createEClass(WAIT_FOR_ONE);
		createEReference(waitForOneEClass, WAIT_FOR_ONE__TASK);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__GROUPS);
		createEAttribute(userEClass, USER__NAME);

		mainSystemEClass = createEClass(MAIN_SYSTEM);
		createEReference(mainSystemEClass, MAIN_SYSTEM__WORKFLOWS);
		createEReference(mainSystemEClass, MAIN_SYSTEM__USERS);
		createEReference(mainSystemEClass, MAIN_SYSTEM__USER_GROUPS);
		createEReference(mainSystemEClass, MAIN_SYSTEM__PERMISSIONS);

		userGroupEClass = createEClass(USER_GROUP);
		createEReference(userGroupEClass, USER_GROUP__PERMISSIONS);
		createEAttribute(userGroupEClass, USER_GROUP__NAME);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__NAME);

		// Create enums
		taskStateEEnum = createEEnum(TASK_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		splitEClass.getESuperTypes().add(this.getTransition());
		mergeEClass.getESuperTypes().add(this.getTransition());
		simpleEClass.getESuperTypes().add(this.getTransition());
		ifElseEClass.getESuperTypes().add(this.getTransition());
		switchEClass.getESuperTypes().add(this.getTransition());
		waitForOneEClass.getESuperTypes().add(this.getTransition());

		// Initialize classes, features, and operations; add parameters
		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_State(), this.getTaskState(), "state", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_IsEnd(), ecorePackage.getEBoolean(), "isEnd", "false", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_IsStart(), ecorePackage.getEBoolean(), "isStart", "false", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Permission(), this.getPermission(), null, "permission", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Transition(), this.getTransition(), this.getTransition_PreviousTask(), "transition", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Result(), ecorePackage.getEInt(), "Result", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Data(), ecorePackage.getEString(), "data", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTask__DoJob(), null, "doJob", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getTask__SetReady__EList(), null, "setReady", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEEList(), "previousTasks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_PreviousTask(), this.getTask(), this.getTask_Transition(), "previousTask", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransition__Transit(), null, "transit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(splitEClass, Split.class, "Split", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplit_Tasks(), this.getTask(), null, "tasks", null, 2, -1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeEClass, Merge.class, "Merge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMerge_Task(), this.getTask(), null, "task", null, 1, 1, Merge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_Task(), this.getTask(), null, "task", null, 1, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifElseEClass, IfElse.class, "IfElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfElse_Tasks(), this.getTask(), null, "tasks", null, 2, 2, IfElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitch_Tasks(), this.getTask(), null, "tasks", null, 3, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitForOneEClass, WaitForOne.class, "WaitForOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaitForOne_Task(), this.getTask(), null, "task", null, 1, 1, WaitForOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Groups(), this.getUserGroup(), null, "groups", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainSystemEClass, MainSystem.class, "MainSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainSystem_Workflows(), this.getWorkflow(), null, "workflows", null, 0, -1, MainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainSystem_Users(), this.getUser(), null, "users", null, 0, -1, MainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainSystem_UserGroups(), this.getUserGroup(), null, "userGroups", null, 0, -1, MainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainSystem_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, MainSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userGroupEClass, UserGroup.class, "UserGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserGroup_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(taskStateEEnum, TaskState.class, "TaskState");
		addEEnumLiteral(taskStateEEnum, TaskState.NOT_PROCESSED);
		addEEnumLiteral(taskStateEEnum, TaskState.PROCESSING);
		addEEnumLiteral(taskStateEEnum, TaskState.PROCESSED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });																	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "constraints", "numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne startExistsOnce endExistsOnce onlyOneTransitionAllowedToReferenceSameTask"
		   });			
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "constraints", "noOutReferencesForEnd noMoreThanOneOutReferenceForTasks"
		   });			
		addAnnotation
		  (splitEClass, 
		   source, 
		   new String[] {
			 "constraints", "splitMustHaveOneIncomingTask noOutReferencesToStart"
		   });			
		addAnnotation
		  (mergeEClass, 
		   source, 
		   new String[] {
			 "constraints", "mergeMustHaveMoreThanOneIncomingTask noOutReferencesToStart"
		   });			
		addAnnotation
		  (simpleEClass, 
		   source, 
		   new String[] {
			 "constraints", "simpleMustHaveOneIncomingTask noOutReferencesToStart"
		   });			
		addAnnotation
		  (ifElseEClass, 
		   source, 
		   new String[] {
			 "constraints", "ifElseMustHaveOneIncomingTask noOutReferencesToStart"
		   });			
		addAnnotation
		  (switchEClass, 
		   source, 
		   new String[] {
			 "constraints", "switchMustHaveOneIncomingTask noOutReferencesToStart"
		   });			
		addAnnotation
		  (waitForOneEClass, 
		   source, 
		   new String[] {
			 "constraints", "waitForOneMustHaveTwoIncomingTasks noOutReferencesToStart"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (workflowEClass, 
		   source, 
		   new String[] {
			 "numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge", "\n\t\t\tlet numberOfSplits : Integer = Split.allInstances()->size(),\n\t\t\tnumberOfMerges : Integer = Merge.allInstances()->size(),\n\t\t\tnumberOfOutgoingSplits : Integer = Split.allInstances()->collect(tasks->size())->sum(),\n\t\t\tnumberOfIngoingMerge : Integer = Merge.allInstances()->collect(previousTask->size())->sum() in\n\t\t\t\tnumberOfIngoingMerge = numberOfOutgoingSplits + numberOfMerges - numberOfSplits",
			 "numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne", "\n\t\t\tlet numberOfIfElse : Integer = IfElse.allInstances()->size(),\n\t\t\tnumberOfSwitch : Integer = Switch.allInstances()->size(),\n\t\t\tnumberOfWaitForOne : Integer = WaitForOne.allInstances()->size(), \n\t\t\tnumberOfOutgoingSwitch : Integer = Switch.allInstances()->collect(tasks->size())->sum(),\n\t\t\tnumberOfOutgoingIfElse : Integer = IfElse.allInstances()->collect(tasks->size())->sum(),\n\t\t\tnumberOfIngoingWaitForOne : Integer = WaitForOne.allInstances()->collect(previousTask->size())->sum() in\n\t\t\t\tnumberOfIngoingWaitForOne = numberOfOutgoingSwitch + numberOfOutgoingIfElse + numberOfWaitForOne - numberOfIfElse - numberOfSwitch",
			 "startExistsOnce", "\n\t\t\tTask.allInstances()->select(t | t.isStart = true)->size() = 1",
			 "endExistsOnce", "\n\t\t\tTask.allInstances()->select(t | t.isEnd = true)->size() = 1",
			 "onlyOneTransitionAllowedToReferenceSameTask", "\n\t\t\tlet allRefs : Bag = Split.allInstances().tasks->\n\t\t\t\t\t\t\t\tunion(Merge.allInstances().task)->\n\t\t\t\t\t\t\t\tunion(Switch.allInstances().tasks)->\n\t\t\t\t\t\t\t\tunion(IfElse.allInstances().tasks)->\n\t\t\t\t\t\t\t\tunion(WaitForOne.allInstances().task)->\n\t\t\t\t\t\t\t\tunion(Simple.allInstances().task),\t\t\t\t\t\t\t\t\n\t\t\tuniqueRef : Set = Split.allInstances().tasks->asSet()->\n\t\t\t\t\t\t\t\tunion(Merge.allInstances().task->asSet())->\n\t\t\t\t\t\t\t\tunion(Switch.allInstances().tasks->asSet())->\n\t\t\t\t\t\t\t\tunion(IfElse.allInstances().tasks->asSet())->\n\t\t\t\t\t\t\t\tunion(WaitForOne.allInstances().task->asSet())->\n\t\t\t\t\t\t\t\tunion(Simple.allInstances().task->asSet())\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\tin\n\t\t\t\t\t\t uniqueRef->size() = allRefs->size()"
		   });			
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "noOutReferencesForEnd", "\n\t\t\tif self.isEnd = true then \n\t\t\t\tself.transition->size() = 0\n\t\t\telse \n\t\t\t\ttrue\n\t\t\tendif",
			 "noMoreThanOneOutReferenceForTasks", "\n\t\t\tself.transition->size() < 2"
		   });			
		addAnnotation
		  (splitEClass, 
		   source, 
		   new String[] {
			 "splitMustHaveOneIncomingTask", "\n\t\t\tself.previousTask->size() = 1",
			 "noOutReferencesToStart", "\n\t\t\tself.tasks->select(t | t.isStart = true)->size() = 0"
		   });			
		addAnnotation
		  (mergeEClass, 
		   source, 
		   new String[] {
			 "mergeMustHaveMoreThanOneIncomingTask", "\n\t\t\tself.previousTask->size() > 1",
			 "noOutReferencesToStart", "\n\t\t\tself.task->select(t | t.isStart = true)->size() = 0"
		   });			
		addAnnotation
		  (simpleEClass, 
		   source, 
		   new String[] {
			 "simpleMustHaveOneIncomingTask", "\n\t\t\tself.previousTask->size() = 1",
			 "noOutReferencesToStart", "\n\t\t\tself.task->select(t | t.isStart = true)->size() = 0"
		   });			
		addAnnotation
		  (ifElseEClass, 
		   source, 
		   new String[] {
			 "ifElseMustHaveOneIncomingTask", "\n\t\t\tself.previousTask->size() = 1",
			 "noOutReferencesToStart", "\n\t\t\tself.tasks->select(t | t.isStart = true)->size() = 0"
		   });			
		addAnnotation
		  (switchEClass, 
		   source, 
		   new String[] {
			 "switchMustHaveOneIncomingTask", "\n\t\t\tself.previousTask->size() = 1",
			 "noOutReferencesToStart", "\n\t\t\tself.tasks->select(t | t.isStart = true)->size() = 0"
		   });			
		addAnnotation
		  (waitForOneEClass, 
		   source, 
		   new String[] {
			 "waitForOneMustHaveTwoIncomingTasks", "\n\t\t\tself.previousTask->size() > 1",
			 "noOutReferencesToStart", "\n\t\t\tself.task->select(t | t.isStart = true)->size() = 0"
		   });
	}

} //EnginePackageImpl
