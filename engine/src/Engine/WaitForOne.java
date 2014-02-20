/**
 */
package Engine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait For One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.WaitForOne#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getWaitForOne()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='waitForOneMustHaveTwoIncomingTasks noOutReferencesToStart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot waitForOneMustHaveTwoIncomingTasks='\n\t\t\tself.previousTasks->size() > 1' noOutReferencesToStart='\n\t\t\tself.task->select(t | t.start = true)->size() = 0'"
 * @generated
 */
public interface WaitForOne extends Transition {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see Engine.EnginePackage#getWaitForOne_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link Engine.WaitForOne#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // WaitForOne
