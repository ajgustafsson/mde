/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Engine.validation;

import Engine.ResultTask;
import Engine.Task;

/**
 * A sample validator interface for {@link Engine.Merge}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MergeValidator {
	boolean validate();

	boolean validateTask(ResultTask value);

	boolean validateTask(Task value);
}
