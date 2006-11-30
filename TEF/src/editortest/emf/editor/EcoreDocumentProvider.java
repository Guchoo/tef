package editortest.emf.editor;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.text.IDocument;

public class EcoreDocumentProvider extends EMFDocumentProvider {

	private final EPackage fEcorePackage = EcorePackage.eINSTANCE;
	private final EFactory fEcoreFactory = EcoreFactory.eINSTANCE;
	@Override
	protected EFactory getFactory() {
		return fEcoreFactory;
	}
	@Override
	protected EPackage getPackage() {
		return fEcorePackage;
	}
	
	@Override
	protected IDocument createEmptyDocument()  {
		return new EcoreDocument();		
	}
}
