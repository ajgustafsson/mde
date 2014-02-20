/**
 */
package Engine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.Switch#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getSwitch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='switchMustHaveOneIncomingTask noOutReferencesToStart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot switchMustHaveOneIncomingTask='\n\t\t\tself.previousTasks->size() = 1' noOutReferencesToStart='\n\t\t\tself.tasks->select(t | t.start = true)->size() = 0'"
 * @generated
 */
public interface Switch extends Transition {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link Engine.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see Engine.EnginePackage#getSwitch_Tasks()
	 * @model lower="3"
	 * @generated
	 */
	EList<Task> getTasks();

} // Switch
