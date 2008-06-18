/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.sdl.validation;

import hub.sam.sdl.CoreAbstractionsGeneralizationsClassifier;

/**
 * A sample validator interface for {@link hub.sam.sdl.CoreAbstractionsGeneralizationsGeneralization}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CoreAbstractionsGeneralizationsGeneralizationValidator {
	boolean validate();

	boolean validateSpecific(CoreAbstractionsGeneralizationsClassifier value);
	boolean validateGeneral(CoreAbstractionsGeneralizationsClassifier value);
}