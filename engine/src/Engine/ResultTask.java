/**
 */
package Engine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.ResultTask#getTask <em>Task</em>}</li>
 *   <li>{@link Engine.ResultTask#getResultName <em>Result Name</em>}</li>
 *   <li>{@link Engine.ResultTask#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getResultTask()
 * @model
 * @generated
 */
public interface ResultTask extends EObject {
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
	 * @see Engine.EnginePackage#getResultTask_Result()
	 * @model
	 * @generated
	 */
	int getResult();

	/**
	 * Sets the value of the '{@link Engine.ResultTask#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(int value);

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
	 * @see Engine.EnginePackage#getResultTask_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link Engine.ResultTask#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Result Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Name</em>' attribute.
	 * @see #setResultName(String)
	 * @see Engine.EnginePackage#getResultTask_ResultName()
	 * @model
	 * @generated
	 */
	String getResultName();

	/**
	 * Sets the value of the '{@link Engine.ResultTask#getResultName <em>Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Name</em>' attribute.
	 * @see #getResultName()
	 * @generated
	 */
	void setResultName(String value);

} // ResultTask
