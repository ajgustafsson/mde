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
 *   <li>{@link Engine.Task#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link Engine.Task#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link Engine.Task#getPermission <em>Permission</em>}</li>
 *   <li>{@link Engine.Task#getTransition <em>Transition</em>}</li>
 *   <li>{@link Engine.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link Engine.Task#getResult <em>Result</em>}</li>
 *   <li>{@link Engine.Task#getData <em>Data</em>}</li>
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
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is End</em>' attribute.
	 * @see #setIsEnd(boolean)
	 * @see Engine.EnginePackage#getTask_IsEnd()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsEnd();

	/**
	 * Sets the value of the '{@link Engine.Task#isIsEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isIsEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see Engine.EnginePackage#getTask_IsStart()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link Engine.Task#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

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
	 * It is bidirectional and its opposite is '{@link Engine.Transition#getPreviousTask <em>Previous Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference list.
	 * @see Engine.EnginePackage#getTask_Transition()
	 * @see Engine.Transition#getPreviousTask
	 * @model opposite="previousTask"
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
