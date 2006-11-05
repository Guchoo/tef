package editortest.template;

import java.util.Collections;
import java.util.List;

import editortest.model.IModelElement;
import editortest.text.Proposal;
import editortest.text.Text;

public abstract class ValueTemplate<ModelType> extends Template {
	
	private PropertyTemplate fPropertyTemplate = null;
	
	public ValueTemplate(Template template) {
		super(template);
	}
	
	public abstract Text createView(ModelType model, IModelElement propagateValueTo);
	
	public boolean isTemplateFor(ModelType model) {
		return true;
	}
	
	public void updateView(Text view, ModelType value) {
		
	}
	
	public List<Proposal> getProposals() {
		return Collections.EMPTY_LIST;
	}
	
	public ModelType createModelFromProposal(Proposal proposal) {
		return null;
	}
		
	protected void setPropertyTemplate(PropertyTemplate propertyTemplate) {
		fPropertyTemplate = propertyTemplate;
	}
	
	protected final PropertyTemplate getPropertyTemplate() {
		return fPropertyTemplate;
	}	
}