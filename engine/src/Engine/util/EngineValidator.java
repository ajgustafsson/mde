/**
 */
package Engine.util;

import Engine.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Engine.EnginePackage
 * @generated
 */
public class EngineValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EngineValidator INSTANCE = new EngineValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Engine";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EnginePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EnginePackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case EnginePackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case EnginePackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case EnginePackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case EnginePackage.SPLIT:
				return validateSplit((Split)value, diagnostics, context);
			case EnginePackage.MERGE:
				return validateMerge((Merge)value, diagnostics, context);
			case EnginePackage.SIMPLE:
				return validateSimple((Simple)value, diagnostics, context);
			case EnginePackage.IF_ELSE:
				return validateIfElse((IfElse)value, diagnostics, context);
			case EnginePackage.SWITCH:
				return validateSwitch((Switch)value, diagnostics, context);
			case EnginePackage.WAIT_FOR_ONE:
				return validateWaitForOne((WaitForOne)value, diagnostics, context);
			case EnginePackage.USER:
				return validateUser((User)value, diagnostics, context);
			case EnginePackage.MAIN_SYSTEM:
				return validateMainSystem((MainSystem)value, diagnostics, context);
			case EnginePackage.USER_GROUP:
				return validateUserGroup((UserGroup)value, diagnostics, context);
			case EnginePackage.PERMISSION:
				return validatePermission((Permission)value, diagnostics, context);
			case EnginePackage.TASK_STATE:
				return validateTaskState((TaskState)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workflow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_startExistsOnce(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_endExistsOnce(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_onlyOneTransitionAllowedToReferenceSameTask(workflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__NUMBER_OF_OUTGOING_FROM_SPLIT_PLUS_THE_DIFFERENCES_BETWEEN_NUMBER_OF_MERGES_AND_SPLITS_EQUALS_NUMBER_OF_INGOING_TO_MERGE__EEXPRESSION = "\n" +
		"\t\t\tlet numberOfSplits : Integer = Split.allInstances()->size(),\n" +
		"\t\t\tnumberOfMerges : Integer = Merge.allInstances()->size(),\n" +
		"\t\t\tnumberOfOutgoingSplits : Integer = Split.allInstances()->collect(tasks->size())->sum(),\n" +
		"\t\t\tnumberOfIngoingMerge : Integer = Merge.allInstances()->collect(previousTask->size())->sum() in\n" +
		"\t\t\t\tnumberOfIngoingMerge = numberOfOutgoingSplits + numberOfMerges - numberOfSplits";

	/**
	 * Validates the numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numberOfOutgoingFromSplitPlusTheDifferencesBetweenNumberOfMergesAndSplitsEqualsNumberOfIngoingToMerge",
				 WORKFLOW__NUMBER_OF_OUTGOING_FROM_SPLIT_PLUS_THE_DIFFERENCES_BETWEEN_NUMBER_OF_MERGES_AND_SPLITS_EQUALS_NUMBER_OF_INGOING_TO_MERGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__NUMBER_OF_OUTGOING_FROM_SWITCH_AND_IF_ELSE_PLUS_THE_DIFFERENCES_BETWEEN_NUMBER_OF_WAIT_FOR_ONE_AND_IF_ELSE_MINUS_SWITCHES_EQUALS_NUMBER_OF_INGOING_TO_WAIT_FOR_ONE__EEXPRESSION = "\n" +
		"\t\t\tlet numberOfIfElse : Integer = IfElse.allInstances()->size(),\n" +
		"\t\t\tnumberOfSwitch : Integer = Switch.allInstances()->size(),\n" +
		"\t\t\tnumberOfWaitForOne : Integer = WaitForOne.allInstances()->size(), \n" +
		"\t\t\tnumberOfOutgoingSwitch : Integer = Switch.allInstances()->collect(tasks->size())->sum(),\n" +
		"\t\t\tnumberOfOutgoingIfElse : Integer = IfElse.allInstances()->collect(tasks->size())->sum(),\n" +
		"\t\t\tnumberOfIngoingWaitForOne : Integer = WaitForOne.allInstances()->collect(previousTask->size())->sum() in\n" +
		"\t\t\t\tnumberOfIngoingWaitForOne = numberOfOutgoingSwitch + numberOfOutgoingIfElse + numberOfWaitForOne - numberOfIfElse - numberOfSwitch";

	/**
	 * Validates the numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numberOfOutgoingFromSwitchAndIfElsePlusTheDifferencesBetweenNumberOfWaitForOneAndIfElseMinusSwitchesEqualsNumberOfIngoingToWaitForOne",
				 WORKFLOW__NUMBER_OF_OUTGOING_FROM_SWITCH_AND_IF_ELSE_PLUS_THE_DIFFERENCES_BETWEEN_NUMBER_OF_WAIT_FOR_ONE_AND_IF_ELSE_MINUS_SWITCHES_EQUALS_NUMBER_OF_INGOING_TO_WAIT_FOR_ONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the startExistsOnce constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__START_EXISTS_ONCE__EEXPRESSION = "\n" +
		"\t\t\tTask.allInstances()->select(t | t.isStart = true)->size() = 1";

	/**
	 * Validates the startExistsOnce constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_startExistsOnce(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "startExistsOnce",
				 WORKFLOW__START_EXISTS_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the endExistsOnce constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__END_EXISTS_ONCE__EEXPRESSION = "\n" +
		"\t\t\tTask.allInstances()->select(t | t.isEnd = true)->size() = 1";

	/**
	 * Validates the endExistsOnce constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_endExistsOnce(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "endExistsOnce",
				 WORKFLOW__END_EXISTS_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyOneTransitionAllowedToReferenceSameTask constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__ONLY_ONE_TRANSITION_ALLOWED_TO_REFERENCE_SAME_TASK__EEXPRESSION = "\n" +
		"\t\t\tlet allRefs : Bag = Split.allInstances().tasks->\n" +
		"\t\t\t\t\t\t\t\tunion(Merge.allInstances().task)->\n" +
		"\t\t\t\t\t\t\t\tunion(Switch.allInstances().tasks)->\n" +
		"\t\t\t\t\t\t\t\tunion(IfElse.allInstances().tasks)->\n" +
		"\t\t\t\t\t\t\t\tunion(WaitForOne.allInstances().task)->\n" +
		"\t\t\t\t\t\t\t\tunion(Simple.allInstances().task),\t\t\t\t\t\t\t\t\n" +
		"\t\t\tuniqueRef : Set = Split.allInstances().tasks->asSet()->\n" +
		"\t\t\t\t\t\t\t\tunion(Merge.allInstances().task->asSet())->\n" +
		"\t\t\t\t\t\t\t\tunion(Switch.allInstances().tasks->asSet())->\n" +
		"\t\t\t\t\t\t\t\tunion(IfElse.allInstances().tasks->asSet())->\n" +
		"\t\t\t\t\t\t\t\tunion(WaitForOne.allInstances().task->asSet())->\n" +
		"\t\t\t\t\t\t\t\tunion(Simple.allInstances().task->asSet())\t\t\t\t\t\t\t\t\t\n" +
		"\t\t\t\t\t\t\t\tin\n" +
		"\t\t\t\t\t\t uniqueRef->size() = allRefs->size()";

	/**
	 * Validates the onlyOneTransitionAllowedToReferenceSameTask constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_onlyOneTransitionAllowedToReferenceSameTask(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneTransitionAllowedToReferenceSameTask",
				 WORKFLOW__ONLY_ONE_TRANSITION_ALLOWED_TO_REFERENCE_SAME_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_noOutReferencesForEnd(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_noMoreThanOneOutReferenceForTasks(task, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noOutReferencesForEnd constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__NO_OUT_REFERENCES_FOR_END__EEXPRESSION = "\n" +
		"\t\t\tif self.isEnd = true then \n" +
		"\t\t\t\tself.transition->size() = 0\n" +
		"\t\t\telse \n" +
		"\t\t\t\ttrue\n" +
		"\t\t\tendif";

	/**
	 * Validates the noOutReferencesForEnd constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_noOutReferencesForEnd(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOutReferencesForEnd",
				 TASK__NO_OUT_REFERENCES_FOR_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noMoreThanOneOutReferenceForTasks constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TASK__NO_MORE_THAN_ONE_OUT_REFERENCE_FOR_TASKS__EEXPRESSION = "\n" +
		"\t\t\tself.transition->size() < 2";

	/**
	 * Validates the noMoreThanOneOutReferenceForTasks constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask_noMoreThanOneOutReferenceForTasks(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.TASK,
				 task,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noMoreThanOneOutReferenceForTasks",
				 TASK__NO_MORE_THAN_ONE_OUT_REFERENCE_FOR_TASKS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplit(Split split, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(split, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(split, diagnostics, context);
		if (result || diagnostics != null) result &= validateSplit_splitMustHaveOneIncomingTask(split, diagnostics, context);
		if (result || diagnostics != null) result &= validateSplit_noOutReferencesToStart(split, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the splitMustHaveOneIncomingTask constraint of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPLIT__SPLIT_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION = "\n" +
		"\t\t\tself.previousTask->size() = 1";

	/**
	 * Validates the splitMustHaveOneIncomingTask constraint of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplit_splitMustHaveOneIncomingTask(Split split, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.SPLIT,
				 split,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "splitMustHaveOneIncomingTask",
				 SPLIT__SPLIT_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noOutReferencesToStart constraint of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPLIT__NO_OUT_REFERENCES_TO_START__EEXPRESSION = "\n" +
		"\t\t\tself.tasks->select(t | t.isStart = true)->size() = 0";

	/**
	 * Validates the noOutReferencesToStart constraint of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplit_noOutReferencesToStart(Split split, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.SPLIT,
				 split,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOutReferencesToStart",
				 SPLIT__NO_OUT_REFERENCES_TO_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(merge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validateMerge_mergeMustHaveMoreThanOneIncomingTask(merge, diagnostics, context);
		if (result || diagnostics != null) result &= validateMerge_noOutReferencesToStart(merge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mergeMustHaveMoreThanOneIncomingTask constraint of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MERGE__MERGE_MUST_HAVE_MORE_THAN_ONE_INCOMING_TASK__EEXPRESSION = "\n" +
		"\t\t\tself.previousTask->size() > 1";

	/**
	 * Validates the mergeMustHaveMoreThanOneIncomingTask constraint of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge_mergeMustHaveMoreThanOneIncomingTask(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.MERGE,
				 merge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mergeMustHaveMoreThanOneIncomingTask",
				 MERGE__MERGE_MUST_HAVE_MORE_THAN_ONE_INCOMING_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noOutReferencesToStart constraint of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MERGE__NO_OUT_REFERENCES_TO_START__EEXPRESSION = "\n" +
		"\t\t\tself.task->select(t | t.isStart = true)->size() = 0";

	/**
	 * Validates the noOutReferencesToStart constraint of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMerge_noOutReferencesToStart(Merge merge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.MERGE,
				 merge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOutReferencesToStart",
				 MERGE__NO_OUT_REFERENCES_TO_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimple(Simple simple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simple, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimple_simpleMustHaveOneIncomingTask(simple, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimple_noOutReferencesToStart(simple, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the simpleMustHaveOneIncomingTask constraint of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIMPLE__SIMPLE_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION = "\n" +
		"\t\t\tself.previousTask->size() = 1";

	/**
	 * Validates the simpleMustHaveOneIncomingTask constraint of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimple_simpleMustHaveOneIncomingTask(Simple simple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.SIMPLE,
				 simple,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "simpleMustHaveOneIncomingTask",
				 SIMPLE__SIMPLE_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noOutReferencesToStart constraint of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIMPLE__NO_OUT_REFERENCES_TO_START__EEXPRESSION = "\n" +
		"\t\t\tself.task->select(t | t.isStart = true)->size() = 0";

	/**
	 * Validates the noOutReferencesToStart constraint of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimple_noOutReferencesToStart(Simple simple, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.SIMPLE,
				 simple,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOutReferencesToStart",
				 SIMPLE__NO_OUT_REFERENCES_TO_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfElse(IfElse ifElse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ifElse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validateIfElse_ifElseMustHaveOneIncomingTask(ifElse, diagnostics, context);
		if (result || diagnostics != null) result &= validateIfElse_noOutReferencesToStart(ifElse, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ifElseMustHaveOneIncomingTask constraint of '<em>If Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IF_ELSE__IF_ELSE_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION = "\n" +
		"\t\t\tself.previousTask->size() = 1";

	/**
	 * Validates the ifElseMustHaveOneIncomingTask constraint of '<em>If Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfElse_ifElseMustHaveOneIncomingTask(IfElse ifElse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.IF_ELSE,
				 ifElse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ifElseMustHaveOneIncomingTask",
				 IF_ELSE__IF_ELSE_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noOutReferencesToStart constraint of '<em>If Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IF_ELSE__NO_OUT_REFERENCES_TO_START__EEXPRESSION = "\n" +
		"\t\t\tself.tasks->select(t | t.isStart = true)->size() = 0";

	/**
	 * Validates the noOutReferencesToStart constraint of '<em>If Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfElse_noOutReferencesToStart(IfElse ifElse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.IF_ELSE,
				 ifElse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOutReferencesToStart",
				 IF_ELSE__NO_OUT_REFERENCES_TO_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitch(Switch switch_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(switch_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validateSwitch_switchMustHaveOneIncomingTask(switch_, diagnostics, context);
		if (result || diagnostics != null) result &= validateSwitch_noOutReferencesToStart(switch_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the switchMustHaveOneIncomingTask constraint of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SWITCH__SWITCH_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION = "\n" +
		"\t\t\tself.previousTask->size() = 1";

	/**
	 * Validates the switchMustHaveOneIncomingTask constraint of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitch_switchMustHaveOneIncomingTask(Switch switch_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.SWITCH,
				 switch_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "switchMustHaveOneIncomingTask",
				 SWITCH__SWITCH_MUST_HAVE_ONE_INCOMING_TASK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noOutReferencesToStart constraint of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SWITCH__NO_OUT_REFERENCES_TO_START__EEXPRESSION = "\n" +
		"\t\t\tself.tasks->select(t | t.isStart = true)->size() = 0";

	/**
	 * Validates the noOutReferencesToStart constraint of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwitch_noOutReferencesToStart(Switch switch_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.SWITCH,
				 switch_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOutReferencesToStart",
				 SWITCH__NO_OUT_REFERENCES_TO_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaitForOne(WaitForOne waitForOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(waitForOne, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaitForOne_waitForOneMustHaveTwoIncomingTasks(waitForOne, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaitForOne_noOutReferencesToStart(waitForOne, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the waitForOneMustHaveTwoIncomingTasks constraint of '<em>Wait For One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAIT_FOR_ONE__WAIT_FOR_ONE_MUST_HAVE_TWO_INCOMING_TASKS__EEXPRESSION = "\n" +
		"\t\t\tself.previousTask->size() > 1";

	/**
	 * Validates the waitForOneMustHaveTwoIncomingTasks constraint of '<em>Wait For One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaitForOne_waitForOneMustHaveTwoIncomingTasks(WaitForOne waitForOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.WAIT_FOR_ONE,
				 waitForOne,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "waitForOneMustHaveTwoIncomingTasks",
				 WAIT_FOR_ONE__WAIT_FOR_ONE_MUST_HAVE_TWO_INCOMING_TASKS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noOutReferencesToStart constraint of '<em>Wait For One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAIT_FOR_ONE__NO_OUT_REFERENCES_TO_START__EEXPRESSION = "\n" +
		"\t\t\tself.task->select(t | t.isStart = true)->size() = 0";

	/**
	 * Validates the noOutReferencesToStart constraint of '<em>Wait For One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaitForOne_noOutReferencesToStart(WaitForOne waitForOne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EnginePackage.Literals.WAIT_FOR_ONE,
				 waitForOne,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noOutReferencesToStart",
				 WAIT_FOR_ONE__NO_OUT_REFERENCES_TO_START__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainSystem(MainSystem mainSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserGroup(UserGroup userGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermission(Permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(permission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskState(TaskState taskState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EngineValidator
