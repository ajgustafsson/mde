/**
 */
package Engine.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Engine.EnginePackage;
import Engine.Permission;
import Engine.ResultTask;
import Engine.Task;
import Engine.TaskState;
import Engine.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link Engine.impl.TaskImpl#getName <em>Name</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getState <em>State</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#isEnd <em>End</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#isStart <em>Start</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getPermission <em>Permission</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getTransition <em>Transition</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getDescription <em>Description</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getResult <em>Result</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getData <em>Data</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getPreviousTasks <em>Previous Tasks</em>}</li>
 * <li>{@link Engine.impl.TaskImpl#getResultTasks <em>Result Tasks</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final TaskState STATE_EDEFAULT = TaskState.NOT_PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected TaskState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnd() <em>End</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnd() <em>End</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected boolean start = START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected Permission permission;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final int RESULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected int result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreviousTasks()
	 * <em>Previous Tasks</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPreviousTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> previousTasks;

	/**
	 * The cached value of the '{@link #getResultTasks() <em>Result Tasks</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResultTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultTask> resultTasks;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TaskState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setState(TaskState newState) {
		TaskState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnd(boolean newEnd) {
		boolean oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStart(boolean newStart) {
		boolean oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Task> getPreviousTasks() {
		if (previousTasks == null) {
			previousTasks = new EObjectResolvingEList<Task>(Task.class, this, EnginePackage.TASK__PREVIOUS_TASKS);
		}
		return previousTasks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ResultTask> getResultTasks() {
		if (resultTasks == null) {
			resultTasks = new EObjectContainmentEList<ResultTask>(ResultTask.class, this, EnginePackage.TASK__RESULT_TASKS);
		}
		return resultTasks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void doJob() {
		Scanner input = null;
		try {

			System.out.println("----------- Executing " + this.name + " -----------\n");

			System.out.println("----------- Data from previous tasks: -----------\n");
			if (previousTasks != null) {
				for (Task task : previousTasks) {
					System.out.println(task.getName() + ":");
					System.out.println(task.getData());
				}
			}
			System.out.println("----------- End of data from previous tasks -----------\n");

			System.out.println("----------- " + this.name + " description: -----------\n");
			System.out.println(this.description);
			System.out.println("----------- Type or past any data that is required for next step in the workflow: -----------\n");
			input = new Scanner(System.in);
			String dataInput = input.nextLine();
			this.data = dataInput;

			System.out.println("Set the result of the task...");
			dataInput = input.nextLine();

			this.result = Integer.parseInt(dataInput);

			this.transition.get(0).transit();
			
			System.out.println("----------- Done executing " + this.name + " -----------\n");

			
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	// private void printHelpToDecideHowItWent() {
	// Transition next = this.transition.get(0);
	// List<ResultTask> resultTasks = next.getResultTasks();
	// if (resultTasks != null && resultTasks.size() > 0) {
	//
	// System.out.println("What's the result of the task?");
	// for (int i = 0; i < resultTasks.size(); i++) {
	// ResultTask resultTask = resultTasks.get(i);
	// System.out.println("Choice ID: " + i + " (" + task.getChoice() + ")");
	// }
	// Scanner input = new Scanner(System.in);
	// String dataInput = input.nextLine();
	//
	// int result = Integer.parseInt(dataInput);
	// Task nextTask = tasks.get(result);
	//
	// nextTask.setReady(previousTasks);
	// }
	//
	// }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setReady(EList previousTasks) {
		this.previousTasks.addAll(previousTasks);
		this.state = TaskState.PROCESSING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnginePackage.TASK__TRANSITION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTransition()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnginePackage.TASK__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case EnginePackage.TASK__RESULT_TASKS:
			return ((InternalEList<?>) getResultTasks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Permission getPermission() {
		if (permission != null && permission.eIsProxy()) {
			InternalEObject oldPermission = (InternalEObject) permission;
			permission = (Permission) eResolveProxy(oldPermission);
			if (permission != oldPermission) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnginePackage.TASK__PERMISSION, oldPermission, permission));
			}
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Permission basicGetPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPermission(Permission newPermission) {
		Permission oldPermission = permission;
		permission = newPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__PERMISSION, oldPermission, permission));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectWithInverseResolvingEList.ManyInverse<Transition>(Transition.class, this, EnginePackage.TASK__TRANSITION, EnginePackage.TRANSITION__PREVIOUS_TASKS);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResult(int newResult) {
		int oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.TASK__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnginePackage.TASK__NAME:
			return getName();
		case EnginePackage.TASK__STATE:
			return getState();
		case EnginePackage.TASK__END:
			return isEnd();
		case EnginePackage.TASK__START:
			return isStart();
		case EnginePackage.TASK__PERMISSION:
			if (resolve)
				return getPermission();
			return basicGetPermission();
		case EnginePackage.TASK__TRANSITION:
			return getTransition();
		case EnginePackage.TASK__DESCRIPTION:
			return getDescription();
		case EnginePackage.TASK__RESULT:
			return getResult();
		case EnginePackage.TASK__DATA:
			return getData();
		case EnginePackage.TASK__PREVIOUS_TASKS:
			return getPreviousTasks();
		case EnginePackage.TASK__RESULT_TASKS:
			return getResultTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EnginePackage.TASK__NAME:
			setName((String) newValue);
			return;
		case EnginePackage.TASK__STATE:
			setState((TaskState) newValue);
			return;
		case EnginePackage.TASK__END:
			setEnd((Boolean) newValue);
			return;
		case EnginePackage.TASK__START:
			setStart((Boolean) newValue);
			return;
		case EnginePackage.TASK__PERMISSION:
			setPermission((Permission) newValue);
			return;
		case EnginePackage.TASK__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case EnginePackage.TASK__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EnginePackage.TASK__RESULT:
			setResult((Integer) newValue);
			return;
		case EnginePackage.TASK__DATA:
			setData((String) newValue);
			return;
		case EnginePackage.TASK__PREVIOUS_TASKS:
			getPreviousTasks().clear();
			getPreviousTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case EnginePackage.TASK__RESULT_TASKS:
			getResultTasks().clear();
			getResultTasks().addAll((Collection<? extends ResultTask>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EnginePackage.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EnginePackage.TASK__STATE:
			setState(STATE_EDEFAULT);
			return;
		case EnginePackage.TASK__END:
			setEnd(END_EDEFAULT);
			return;
		case EnginePackage.TASK__START:
			setStart(START_EDEFAULT);
			return;
		case EnginePackage.TASK__PERMISSION:
			setPermission((Permission) null);
			return;
		case EnginePackage.TASK__TRANSITION:
			getTransition().clear();
			return;
		case EnginePackage.TASK__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EnginePackage.TASK__RESULT:
			setResult(RESULT_EDEFAULT);
			return;
		case EnginePackage.TASK__DATA:
			setData(DATA_EDEFAULT);
			return;
		case EnginePackage.TASK__PREVIOUS_TASKS:
			getPreviousTasks().clear();
			return;
		case EnginePackage.TASK__RESULT_TASKS:
			getResultTasks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EnginePackage.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EnginePackage.TASK__STATE:
			return state != STATE_EDEFAULT;
		case EnginePackage.TASK__END:
			return end != END_EDEFAULT;
		case EnginePackage.TASK__START:
			return start != START_EDEFAULT;
		case EnginePackage.TASK__PERMISSION:
			return permission != null;
		case EnginePackage.TASK__TRANSITION:
			return transition != null && !transition.isEmpty();
		case EnginePackage.TASK__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EnginePackage.TASK__RESULT:
			return result != RESULT_EDEFAULT;
		case EnginePackage.TASK__DATA:
			return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
		case EnginePackage.TASK__PREVIOUS_TASKS:
			return previousTasks != null && !previousTasks.isEmpty();
		case EnginePackage.TASK__RESULT_TASKS:
			return resultTasks != null && !resultTasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EnginePackage.TASK___DO_JOB:
			doJob();
			return null;
		case EnginePackage.TASK___SET_READY__ELIST:
			setReady((EList) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", state: ");
		result.append(state);
		result.append(", end: ");
		result.append(end);
		result.append(", start: ");
		result.append(start);
		result.append(", Description: ");
		result.append(description);
		result.append(", Result: ");
		result.append(result);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} // TaskImpl
