package editortest.mof.model;

import cmof.common.ReflectiveCollection;
import cmof.common.ReflectiveSequence;
import editortest.model.ModelEventListener;
import editortest.model.ISequence;

public class MofSequenceImpl<E> extends MofSetImpl<E> implements ISequence<E> {	
	
	public MofSequenceImpl(ReflectiveCollection<? extends E> collection) {
		super(collection); 
	}
	
	protected ReflectiveSequence<E> getSequence() {
		return (ReflectiveSequence<E>)getCollection();
	}

	public void insert(int index, E value) {
		getSequence().add(index, mofObjectFromObject(value));
	}		
}
