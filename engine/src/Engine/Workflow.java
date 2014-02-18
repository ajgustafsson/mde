/**
 */
package Engine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Engine.Workflow#getNodes <em>Nodes</em>}</li>
 *   <li>{@link Engine.Workflow#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Engine.EnginePackage#getWorkflow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne startExistsOnce endExistsOnce onlyOneTransitionAllowedToReferenceSameTask'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge='\n\t\t\tlet numberOfSplits : Integer = Split.allInstances()->size(),\n\t\t\tnumberOfMerges : Integer = Merge.allInstances()->size(),\n\t\t\tnumberOfOutgoingSplits : Integer = Split.allInstances()->collect(tasks->size())->sum(),\n\t\t\tnumberOfIngoingMerge : Integer = Merge.allInstances()->collect(previousTask->size())->sum() in\n\t\t\t\tnumberOfIngoingMerge = numberOfOutgoingSplits + numberOfMerges - numberOfSplits' numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne='\n\t\t\tlet numberOfIfElse : Integer = IfElse.allInstances()->size(),\n\t\t\tnumberOfSwitch : Integer = Switch.allInstances()->size(),\n\t\t\tnumberOfWaitForOne : Integer = WaitForOne.allInstances()->size(), \n\t\t\tnumberOfOutgoingSwitch : Integer = Switch.allInstances()->collect(tasks->size())->sum(),\n\t\t\tnumberOfOutgoingIfElse : Integer = IfElse.allInstances()->collect(tasks->size())->sum(),\n\t\t\tnumberOfIngoingWaitForOne : Integer = WaitForOne.allInstances()->collect(previousTask->size())->sum() in\n\t\t\t\tnumberOfIngoingWaitForOne = numberOfOutgoingSwitch + numberOfOutgoingIfElse + numberOfWaitForOne - numberOfIfElse - numberOfSwitch' startExistsOnce='\n\t\t\tTask.allInstances()->select(t | t.isStart = true)->size() = 1' endExistsOnce='\n\t\t\tTask.allInstances()->select(t | t.isEnd = true)->size() = 1' onlyOneTransitionAllowedToReferenceSameTask='\n\t\t\tlet allRefs : Bag = Split.allInstances().tasks->\n\t\t\t\t\t\t\t\tunion(Merge.allInstances().task)->\n\t\t\t\t\t\t\t\tunion(Switch.allInstances().tasks)->\n\t\t\t\t\t\t\t\tunion(IfElse.allInstances().tasks)->\n\t\t\t\t\t\t\t\tunion(WaitForOne.allInstances().task)->\n\t\t\t\t\t\t\t\tunion(Simple.allInstances().task),\t\t\t\t\t\t\t\t\n\t\t\tuniqueRef : Set = Split.allInstances().tasks->asSet()->\n\t\t\t\t\t\t\t\tunion(Merge.allInstances().task->asSet())->\n\t\t\t\t\t\t\t\tunion(Switch.allInstances().tasks->asSet())->\n\t\t\t\t\t\t\t\tunion(IfElse.allInstances().tasks->asSet())->\n\t\t\t\t\t\t\t\tunion(WaitForOne.allInstances().task->asSet())->\n\t\t\t\t\t\t\t\tunion(Simple.allInstances().task->asSet())\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\tin\n\t\t\t\t\t\t uniqueRef->size() = allRefs->size()'"
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link Engine.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see Engine.EnginePackage#getWorkflow_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

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
	 * @see Engine.EnginePackage#getWorkflow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Engine.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start(User user);

} // Workflow
