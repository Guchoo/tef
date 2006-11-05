package editortest.template;

import editortest.model.IModelElement;
import editortest.text.ChangeText;
import editortest.text.ITextEventListener;
import editortest.text.Text;
import editortest.text.TextEvent;

public class StringTemplate extends ValueTemplate<String>{

	public StringTemplate(Template template) {
		super(template);	
	}
	
	protected boolean verify(String model) {
		return true;
	}

	@Override
	public Text createView(String model, final IModelElement propageteValueTo) {
		ChangeText result = new ChangeText();
		result.setText(model);
		result.addEventHandler(new ITextEventListener() {
			public boolean handleEvent(Text text, TextEvent event) {
				StringBuffer value = new StringBuffer(text.getContent());
				value.replace(event.getBegin(), event.getEnd(), event.getText());
				getPropertyTemplate().updateProperty(text, propageteValueTo, value.toString());
				return true;
			}
			public boolean verifyEvent(Text text, TextEvent event) {
				return verify(event.getText());
			}			
		});
		return result;
	}

	@Override
	public void updateView(Text view, String value) {
		((ChangeText)view).setText(value);
	}		

}