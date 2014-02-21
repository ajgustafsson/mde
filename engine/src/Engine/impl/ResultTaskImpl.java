/**
 */
package Engine.impl;

import Engine.EnginePackage;
import Engine.ResultTask;
import Engine.Task;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Engine.impl.ResultTaskImpl#getTask <em>Task</em>}</li>
 *   <li>{@link Engine.impl.ResultTaskImpl#getResultName <em>Result Name</em>}</li>
 *   <li>{@link Engine.impl.ResultTaskImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultTaskImpl extends MinimalEObjectImpl.Container implements ResultTask {
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
	 * The default value of the '{@link #getResultName() <em>Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultName() <em>Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultName()
	 * @generated
	 * @ordered
	 */
	protected String resultName = RESULT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final int RESULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected int result = RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.RESULT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(int newResult) {
		int oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.RESULT_TASK__RESULT, oldResult, result));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnginePackage.RESULT_TASK__TASK, oldTask, task));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.RESULT_TASK__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultName() {
		return resultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultName(String newResultName) {
		String oldResultName = resultName;
		resultName = newResultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnginePackage.RESULT_TASK__RESULT_NAME, oldResultName, resultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnginePackage.RESULT_TASK__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case EnginePackage.RESULT_TASK__RESULT_NAME:
				return getResultName();
			case EnginePackage.RESULT_TASK__RESULT:
				return getResult();
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
			case EnginePackage.RESULT_TASK__TASK:
				setTask((Task)newValue);
				return;
			case EnginePackage.RESULT_TASK__RESULT_NAME:
				setResultName((String)newValue);
				return;
			case EnginePackage.RESULT_TASK__RESULT:
				setResult((Integer)newValue);
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
			case EnginePackage.RESULT_TASK__TASK:
				setTask((Task)null);
				return;
			case EnginePackage.RESULT_TASK__RESULT_NAME:
				setResultName(RESULT_NAME_EDEFAULT);
				return;
			case EnginePackage.RESULT_TASK__RESULT:
				setResult(RESULT_EDEFAULT);
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
			case EnginePackage.RESULT_TASK__TASK:
				return task != null;
			case EnginePackage.RESULT_TASK__RESULT_NAME:
				return RESULT_NAME_EDEFAULT == null ? resultName != null : !RESULT_NAME_EDEFAULT.equals(resultName);
			case EnginePackage.RESULT_TASK__RESULT:
				return result != RESULT_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ResultName: ");
		result.append(resultName);
		result.append(", Result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //ResultTaskImpl
