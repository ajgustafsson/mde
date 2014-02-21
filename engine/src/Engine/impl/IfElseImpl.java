/**
 */
package Engine.impl;

import Engine.EnginePackage;
import Engine.IfElse;
import Engine.ResultTask;
import Engine.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Scanner;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Engine.impl.IfElseImpl#getName <em>Name</em>}</li>
 *   <li>{@link Engine.impl.IfElseImpl#getPreviousTasks <em>Previous Tasks</em>}</li>
 *   <li>{@link Engine.impl.IfElseImpl#getResultTasks <em>Result Tasks</em>}</li>
 *   <li>{@link Engine.impl.IfElseImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfElseImpl extends MinimalEObjectImpl.Container implements IfElse {
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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.IF_ELSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.IF_ELSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getPreviousTasks() {
		if (previousTasks == null) {
			previousTasks = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, EnginePackage.IF_ELSE__PREVIOUS_TASKS, EnginePackage.TASK__TRANSITION);
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
			resultTasks = new EObjectContainmentEList<ResultTask>(ResultTask.class, this, EnginePackage.IF_ELSE__RESULT_TASKS);
		}
		return resultTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, EnginePackage.IF_ELSE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void transit() {
		System.out.println(this.name);
		for (int i = 0; i < this.tasks.size(); i++) {
			Task task = this.tasks.get(i);
			System.out.println("Choice ID: " + i +  " (" + task.getChoice() + ")");
		}
		Scanner input = new Scanner(System.in);
		String dataInput = input.nextLine();
		
		int result = Integer.parseInt(dataInput);
		Task nextTask = tasks.get(result);
		
		nextTask.setReady(previousTasks);
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
			case EnginePackage.IF_ELSE__PREVIOUS_TASKS:
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
			case EnginePackage.IF_ELSE__PREVIOUS_TASKS:
				return ((InternalEList<?>)getPreviousTasks()).basicRemove(otherEnd, msgs);
			case EnginePackage.IF_ELSE__RESULT_TASKS:
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
			case EnginePackage.IF_ELSE__NAME:
				return getName();
			case EnginePackage.IF_ELSE__PREVIOUS_TASKS:
				return getPreviousTasks();
			case EnginePackage.IF_ELSE__RESULT_TASKS:
				return getResultTasks();
			case EnginePackage.IF_ELSE__TASKS:
				return getTasks();
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
			case EnginePackage.IF_ELSE__NAME:
				setName((String)newValue);
				return;
			case EnginePackage.IF_ELSE__PREVIOUS_TASKS:
				getPreviousTasks().clear();
				getPreviousTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case EnginePackage.IF_ELSE__RESULT_TASKS:
				getResultTasks().clear();
				getResultTasks().addAll((Collection<? extends ResultTask>)newValue);
				return;
			case EnginePackage.IF_ELSE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case EnginePackage.IF_ELSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EnginePackage.IF_ELSE__PREVIOUS_TASKS:
				getPreviousTasks().clear();
				return;
			case EnginePackage.IF_ELSE__RESULT_TASKS:
				getResultTasks().clear();
				return;
			case EnginePackage.IF_ELSE__TASKS:
				getTasks().clear();
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
			case EnginePackage.IF_ELSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EnginePackage.IF_ELSE__PREVIOUS_TASKS:
				return previousTasks != null && !previousTasks.isEmpty();
			case EnginePackage.IF_ELSE__RESULT_TASKS:
				return resultTasks != null && !resultTasks.isEmpty();
			case EnginePackage.IF_ELSE__TASKS:
				return tasks != null && !tasks.isEmpty();
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
			case EnginePackage.IF_ELSE___TRANSIT:
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

} //IfElseImpl
