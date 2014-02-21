/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Engine.validation;

import Engine.Permission;
import Engine.ResultTask;
import Engine.Task;
import Engine.TaskState;
import Engine.Transition;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link Engine.Task}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TaskValidator {
	boolean validate();

	boolean validateState(TaskState value);
	boolean validateEnd(boolean value);

	boolean validateStart(boolean value);

	boolean validateIsEnd(boolean value);
	boolean validateIsStart(boolean value);
	boolean validatePermission(Permission value);
	boolean validateTransition(EList<Transition> value);
	boolean validateDescription(String value);
	boolean validateResult(int value);

	boolean validateResult(BigInteger value);
	boolean validateData(String value);

	boolean validatePreviousTasks(EList<Task> value);

	boolean validateResultTasks(EList<ResultTask> value);

	boolean validateChoice(String value);
}
