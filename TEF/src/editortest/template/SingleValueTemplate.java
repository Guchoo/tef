package editortest.template;

import editortest.model.IModelElement;
import editortest.model.ModelEventListener;
import editortest.text.Text;

public abstract class SingleValueTemplate<ModelType> extends PropertyTemplate<ModelType> {
	
	private final ValueTemplate<ModelType> fValueTemplate;
	
	public SingleValueTemplate(ElementTemplate elementTemplate, String property) {
		super(elementTemplate, property);
		fValueTemplate = createValueTemplate();
		fValueTemplate.setPropertyTemplate(this);
	}

	protected abstract ValueTemplate<ModelType> createValueTemplate();
	
	class MyModelEventListener extends ModelEventListener {
		private final IModelElement fModel;
		private final Text valueView;
		
		public MyModelEventListener(final IModelElement model, final Text valueView) {
			super();
			fModel = model;
			this.valueView = valueView;
		}

		@Override
		public void propertyChanged(Object element, String property) {
			if (property == getProperty()) {
				fValueTemplate.updateView(valueView, (ModelType)fModel.getValue(property));
			}
		}	
	}
	
	class ValueChangeListener implements IValueChangeListener<ModelType> {
		private final IModelElement fModel;
		public ValueChangeListener(final IModelElement model) {
			super();
			fModel = model;
		}
		public void valueChanges(ModelType newValue) {
			fModel.setValue(getProperty(), newValue);
		}		
	}
	
	@Override
	public Text createView(final IModelElement model) {
		ModelType value = (ModelType)model.getValue(getProperty());
		final Text result = fValueTemplate.createView(value, new ValueChangeListener(model));
		model.addChangeListener(new MyModelEventListener(model, result));
		return result;
	}
		
}
