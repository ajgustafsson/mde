/**
 */
package Engine;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.Task#getState <em>State</em>}</li>
 *   <li>{@link Engine.Task#isEnd <em>End</em>}</li>
 *   <li>{@link Engine.Task#isStart <em>Start</em>}</li>
 *   <li>{@link Engine.Task#getPermission <em>Permission</em>}</li>
 *   <li>{@link Engine.Task#getTransition <em>Transition</em>}</li>
 *   <li>{@link Engine.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link Engine.Task#getResult <em>Result</em>}</li>
 *   <li>{@link Engine.Task#getData <em>Data</em>}</li>
 *   <li>{@link Engine.Task#getPreviousTasks <em>Previous Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noOutReferencesForEnd noMoreThanOneOutReferenceForTasks'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noOutReferencesForEnd='\n\t\t\tif self.isEnd = true then \n\t\t\t\tself.transition->size() = 0\n\t\t\telse \n\t\t\t\ttrue\n\t\t\tendif' noMoreThanOneOutReferenceForTasks='\n\t\t\tself.transition->size() < 2'"
 * @generated
 */
public interface Task extends Node {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link Engine.TaskState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see Engine.TaskState
	 * @see #setState(TaskState)
	 * @see Engine.EnginePackage#getTask_State()
	 * @model
	 * @generated
	 */
	TaskState getState();

	/**
	 * Sets the value of the '{@link Engine.Task#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see Engine.TaskState
	 * @see #getState()
	 * @generated
	 */
	void setState(TaskState value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(boolean)
	 * @see Engine.EnginePackage#getTask_End()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isEnd();

	/**
	 * Sets the value of the '{@link Engine.Task#isEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #isEnd()
	 * @generated
	 */
	void setEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(boolean)
	 * @see Engine.EnginePackage#getTask_Start()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isStart();

	/**
	 * Sets the value of the '{@link Engine.Task#isStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isStart()
	 * @generated
	 */
	void setStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see Engine.EnginePackage#getTask_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link Engine.Task#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Previous Tasks</b></em>' reference list.
	 * The list contents are of type {@link Engine.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Tasks</em>' reference list.
	 * @see Engine.EnginePackage#getTask_PreviousTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getPreviousTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void doJob();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model previousTasksMany="false"
	 * @generated
	 */
	void setReady(EList previousTasks);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' reference.
	 * @see #setPermission(Permission)
	 * @see Engine.EnginePackage#getTask_Permission()
	 * @model
	 * @generated
	 */
	Permission getPermission();

	/**
	 * Sets the value of the '{@link Engine.Task#getPermission <em>Permission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' reference.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(Permission value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference list.
	 * The list contents are of type {@link Engine.Transition}.
	 * It is bidirectional and its opposite is '{@link Engine.Transition#getPreviousTasks <em>Previous Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference list.
	 * @see Engine.EnginePackage#getTask_Transition()
	 * @see Engine.Transition#getPreviousTasks
	 * @model opposite="previousTasks"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Engine.EnginePackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Engine.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(int)
	 * @see Engine.EnginePackage#getTask_Result()
	 * @model
	 * @generated
	 */
	int getResult();

	/**
	 * Sets the value of the '{@link Engine.Task#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(int value);

} // Task
