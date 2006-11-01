package editortest.mof.model;

import cmof.common.ReflectiveCollection;
import cmof.common.ReflectiveSequence;
import editortest.model.IModelElement;

public class Mof {

	protected Object mofObjectFromObject(Object object) {
		if (object instanceof IModelElement) {
			return ((MofModelElementImpl)object).getMofObject();
		} else {
			return object;
		}
	}
	
	protected Object objectFromMofObject(Object object) {
		if (object instanceof cmof.reflection.Object) {
			return new MofModelElementImpl((cmof.reflection.Object)object);
		} else if (object instanceof ReflectiveSequence) {
			return new MofSequenceImpl((ReflectiveSequence)object);
		} else if (object instanceof ReflectiveCollection) {		
			return new MofSetImpl((ReflectiveCollection)object);
		} else {
			return object;
		}
	}
}