/**
 */
package Engine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.Node#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getNode()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameMustBePresent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameMustBePresent='\n\t\t\tself.name.oclIsUndefined() = false '"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Engine.EnginePackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Engine.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Node
