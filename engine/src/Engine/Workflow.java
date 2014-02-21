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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne startExistsOnce endExistsOnce onlyOneTransitionAllowedToReferenceSameTask uniqeNamesForTasks'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge='\n\t\t\tlet numberOfSplits : Integer = self.nodes->select(t| t.oclIsKindOf(Split))->size(),\n\t\t\tnumberOfMerges : Integer = self.nodes->select(t| t.oclIsKindOf(Merge))->size(),\n\t\t\tnumberOfOutgoingSplits : Integer = self.nodes->select(t| t.oclIsKindOf(Split))->collect(s: Split | s.tasks->size())->sum(),\n\t\t\tnumberOfIngoingMerge : Integer = self.nodes->select(t| t.oclIsKindOf(Merge))->collect(m: Merge | m.previousTasks->size())->sum() in\n\t\t\t\tnumberOfIngoingMerge = numberOfOutgoingSplits + numberOfMerges - numberOfSplits' numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne='\n\t\t\tlet numberOfIfElse : Integer = self.nodes->select(t| t.oclIsKindOf(IfElse))->size(),\n\t\t\tnumberOfSwitch : Integer = self.nodes->select(t| t.oclIsKindOf(Switch))->size(),\n\t\t\tnumberOfWaitForOne : Integer = self.nodes->select(t| t.oclIsKindOf(WaitForOne))->size(), \n\t\t\tnumberOfOutgoingSwitch : Integer = self.nodes->select(t| t.oclIsKindOf(Switch))->collect(s: Switch | s.tasks->size())->sum(),\n\t\t\tnumberOfOutgoingIfElse : Integer = self.nodes->select(t| t.oclIsKindOf(IfElse))->collect(s: IfElse | s.tasks->size())->sum(),\n\t\t\tnumberOfIngoingWaitForOne : Integer = self.nodes->select(t| t.oclIsKindOf(WaitForOne))->collect(s: WaitForOne | s.previousTasks->size())->sum() in\n\t\t\t\tnumberOfIngoingWaitForOne = numberOfOutgoingSwitch + numberOfOutgoingIfElse + numberOfWaitForOne - numberOfIfElse - numberOfSwitch' startExistsOnce='\n\t\t\tself.nodes->select(n| n.oclIsKindOf(Task))->select(t: Task | t.start = true)->size() = 1' endExistsOnce='\n\t\t\tself.nodes->select(n| n.oclIsKindOf(Task))->select(t: Task | t.end = true)->size() = 1' onlyOneTransitionAllowedToReferenceSameTask='\n\t\t\tlet allRefs : Bag = self.nodes->select(t| t.oclIsKindOf(Split))->collect(s: Split | s.tasks)->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(Merge))->collect(m: Merge | m.task))->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(Switch))->collect(s: Switch | s.tasks))->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(IfElse))->collect(i: IfElse | i.tasks))->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(WaitForOne))->collect(w: WaitForOne | w.task))->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(Simple))->collect(s: Simple | s.task)),\t\t\t\t\t\t\t\t\n\t\t\tuniqueRef : Set = self.nodes->select(t| t.oclIsKindOf(Split))->collect(s: Split | s.tasks)->asSet()->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(Merge))->collect(m: Merge | m.task)->asSet())->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(Switch))->collect(s: Switch | s.tasks)->asSet())->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(IfElse))->collect(i: IfElse | i.tasks)->asSet())->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(WaitForOne))->collect(w: WaitForOne | w.task)->asSet())->\n\t\t\t\t\t\t\t\tunion(self.nodes->select(t| t.oclIsKindOf(Simple))->collect(s: Simple | s.task)->asSet())\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\tin\n\t\t\t\t\t\t uniqueRef->size() = allRefs->size()' uniqeNamesForTasks='\n\t\t\tself.nodes->select(t | t.oclIsKindOf(Task))->forAll(p1, p2 | p1 <> p2 implies p1.name <> p2.name)'"
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
