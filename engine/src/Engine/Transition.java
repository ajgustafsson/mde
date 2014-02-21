/**
 */
package Engine;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.Transition#getPreviousTasks <em>Previous Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getTransition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Transition extends Node {

	/**
	 * Returns the value of the '<em><b>Previous Tasks</b></em>' reference list.
	 * The list contents are of type {@link Engine.Task}.
	 * It is bidirectional and its opposite is '{@link Engine.Task#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Tasks</em>' reference list.
	 * @see Engine.EnginePackage#getTransition_PreviousTasks()
	 * @see Engine.Task#getTransition
	 * @model opposite="transition"
	 * @generated
	 */
	EList<Task> getPreviousTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void transit();

} // Transition
