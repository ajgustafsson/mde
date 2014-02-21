/**
 */
package Engine.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Engine.EnginePackage;
import Engine.Node;
import Engine.Permission;
import Engine.Task;
import Engine.TaskState;
import Engine.User;
import Engine.UserGroup;
import Engine.Workflow;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Workflow</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link Engine.impl.WorkflowImpl#getNodes <em>Nodes</em>}</li>
 * <li>{@link Engine.impl.WorkflowImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements
		Workflow {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this,
					EnginePackage.WORKFLOW__NODES);
		}
		return nodes;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnginePackage.WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void start(User user) {

		Task startTask = getStartTask();
		if (checkThatUserCanExecuteTask(startTask, user)) {
			startTask.doJob();
		} else {
			System.out.println("You cannot do this task!");
		}
		if (!startTask.isEnd()) {
			boolean running = true;
			while (running) {
				List<Task> executableTasks = getExecutableTasks();
				Task toRun = null;
				if (executableTasks.size() == 1) {
					toRun = executableTasks.get(0);
				}
				Scanner sc = null;
				try {
					while (toRun == null) {
						printExecutableTasks(executableTasks);
						sc = new Scanner(System.in);
						String taskNameToStart = sc.nextLine();
						try {
							int id = Integer.parseInt(taskNameToStart);
							if (id < executableTasks.size()) {
								toRun = executableTasks.get(id);
							}
						} catch (NumberFormatException e) {
						}

						if (toRun == null) {
							System.out.println("Task ID " + taskNameToStart
									+ " isn't a valid task ID.");
						}
						if (checkThatUserCanExecuteTask(toRun, user)) {
							toRun.doJob();
							if (toRun.isEnd()) {
								running = false;
							}
						} else {
							System.out
									.println("Sorry, you don't have permission to do that!");
						}
					}
				} finally {
					if (sc != null) {
						sc.close();
					}
				}
			}
		}

	}

	private Task getStartTask() {
		for (Node node : this.nodes) {
			if (node instanceof Task) {
				Task task = (Task) node;
				if (task.isStart()) {
					return task;
				}
			}
		}
		throw new UnsupportedOperationException(
				"No task with isStart == true can be found.");
	}

	private boolean checkThatUserCanExecuteTask(Task task, User user) {
		Permission permission = task.getPermission();

		if (permission != null) {

			List<UserGroup> groups = user.getGroups();

			for (UserGroup group : groups) {
				if (group.getPermissions().contains(permission)) {
					return true;
				}
			}
			return false;
		} else {
			return true;
		}
	}

	private List<Task> getExecutableTasks() {

		List<Task> executableTasks = new ArrayList<>();
		for (Node node : this.nodes) {
			if (node instanceof Task) {
				Task task = (Task) node;
				if (task.getState() == TaskState.PROCESSING) {
					executableTasks.add(task);
				}
			}
		}

		return executableTasks;
	}

	private void printExecutableTasks(List<Task> executableTasks) {
		System.out
				.println("Which task do you want to start? (Type the ID of the task you want to start)");
		for (int i = 0; i < executableTasks.size(); i++) {
			Task task = executableTasks.get(0);
			System.out.println("Task ID: " + i + " (" + task.getName() + ")");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnginePackage.WORKFLOW__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnginePackage.WORKFLOW__NODES:
			return getNodes();
		case EnginePackage.WORKFLOW__NAME:
			return getName();
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
		case EnginePackage.WORKFLOW__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends Node>) newValue);
			return;
		case EnginePackage.WORKFLOW__NAME:
			setName((String) newValue);
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
		case EnginePackage.WORKFLOW__NODES:
			getNodes().clear();
			return;
		case EnginePackage.WORKFLOW__NAME:
			setName(NAME_EDEFAULT);
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
		case EnginePackage.WORKFLOW__NODES:
			return nodes != null && !nodes.isEmpty();
		case EnginePackage.WORKFLOW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case EnginePackage.WORKFLOW___START__USER:
			start((User) arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} // WorkflowImpl
