/**
 */
package Engine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.System#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link Engine.System#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' containment reference list.
	 * The list contents are of type {@link Engine.Workflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' containment reference list.
	 * @see Engine.EnginePackage#getSystem_Workflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workflow> getWorkflows();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link Engine.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see Engine.EnginePackage#getSystem_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // System
