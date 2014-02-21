/**
 */
package Engine.impl;

import Engine.EnginePackage;
import Engine.ResultTask;
import Engine.Simple;
import Engine.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Engine.impl.SimpleImpl#getName <em>Name</em>}</li>
 *   <li>{@link Engine.impl.SimpleImpl#getPreviousTasks <em>Previous Tasks</em>}</li>
 *   <li>{@link Engine.impl.SimpleImpl#getResultTasks <em>Result Tasks</em>}</li>
 *   <li>{@link Engine.impl.SimpleImpl#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleImpl extends MinimalEObjectImpl.Container implements Simple {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPreviousTasks() <em>Previous Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> previousTasks;
	/**
	 * The cached value of the '{@link #getResultTasks() <em>Result Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultTask> resultTasks;
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.SIMPLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getPreviousTasks() {
		if (previousTasks == null) {
			previousTasks = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, EnginePackage.SIMPLE__PREVIOUS_TASKS, EnginePackage.TASK__TRANSITION);
		}
		return previousTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultTask> getResultTasks() {
		if (resultTasks == null) {
			resultTasks = new EObjectContainmentEList<ResultTask>(ResultTask.class, this, EnginePackage.SIMPLE__RESULT_TASKS);
		}
		return resultTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnginePackage.SIMPLE__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.SIMPLE__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void transit() {
		task.setReady(previousTasks);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnginePackage.SIMPLE__PREVIOUS_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreviousTasks()).basicAdd(otherEnd, msgs);
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
			case EnginePackage.SIMPLE__PREVIOUS_TASKS:
				return ((InternalEList<?>)getPreviousTasks()).basicRemove(otherEnd, msgs);
			case EnginePackage.SIMPLE__RESULT_TASKS:
				return ((InternalEList<?>)getResultTasks()).basicRemove(otherEnd, msgs);
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
			case EnginePackage.SIMPLE__NAME:
				return getName();
			case EnginePackage.SIMPLE__PREVIOUS_TASKS:
				return getPreviousTasks();
			case EnginePackage.SIMPLE__RESULT_TASKS:
				return getResultTasks();
			case EnginePackage.SIMPLE__TASK:
				if (resolve) return getTask();
				return basicGetTask();
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
			case EnginePackage.SIMPLE__NAME:
				setName((String)newValue);
				return;
			case EnginePackage.SIMPLE__PREVIOUS_TASKS:
				getPreviousTasks().clear();
				getPreviousTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case EnginePackage.SIMPLE__RESULT_TASKS:
				getResultTasks().clear();
				getResultTasks().addAll((Collection<? extends ResultTask>)newValue);
				return;
			case EnginePackage.SIMPLE__TASK:
				setTask((Task)newValue);
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
			case EnginePackage.SIMPLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EnginePackage.SIMPLE__PREVIOUS_TASKS:
				getPreviousTasks().clear();
				return;
			case EnginePackage.SIMPLE__RESULT_TASKS:
				getResultTasks().clear();
				return;
			case EnginePackage.SIMPLE__TASK:
				setTask((Task)null);
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
			case EnginePackage.SIMPLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EnginePackage.SIMPLE__PREVIOUS_TASKS:
				return previousTasks != null && !previousTasks.isEmpty();
			case EnginePackage.SIMPLE__RESULT_TASKS:
				return resultTasks != null && !resultTasks.isEmpty();
			case EnginePackage.SIMPLE__TASK:
				return task != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EnginePackage.SIMPLE___TRANSIT:
				transit();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SimpleImpl
