package hub.sam.tef.primitivetypes;

import java.util.Collection;

import hub.sam.tef.contentassist.ContentAssistContext;
import hub.sam.tef.contentassist.ContentAssistProposal;
import hub.sam.tef.modelcreating.IModelCreatingContext;
import hub.sam.tef.modelcreating.ModelCreatingException;
import hub.sam.tef.modelcreating.ParseTreeNode;
import hub.sam.tef.semantics.IContentAssistSemantics;
import hub.sam.tef.semantics.IValueCreationSemantics;
import hub.sam.tef.tsl.ValueBinding;

import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.NumberRule;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class IntegerDescriptor extends PrimitiveTypeDescriptor {
	
	private static final IValueCreationSemantics valueCreationSemantics = new IValueCreationSemantics() {
		@Override
		public Object createValue(ParseTreeNode parseTreeNode,
				IModelCreatingContext context, ValueBinding binding)
				throws ModelCreatingException {
			String stringValue = parseTreeNode.getNodeText();
			return new Integer(stringValue);
		}		
	};

	@Override
	public String getNonTerminalName() {
		return "INTEGER";
	}

	@Override
	public String getRCCSymbol() {
		return "`integer`";
	}

	@Override
	public IValueCreationSemantics getValueCreationSemantics() {
		return valueCreationSemantics;
	}
	
	@Override
	public IContentAssistSemantics getContentAssistSemantics() {
		return new IContentAssistSemantics() {
			@Override
			public Collection<ContentAssistProposal> createProposals(
					ContentAssistContext context) {
				return ContentAssistProposal.createProposals(
						new String[] { "<number>" }, context, 
						null, ContentAssistProposal.PRIMITIVE_IMAGE, ContentAssistProposal.PRIMITIVE);
			}			
		};
	}
	
	@Override
	public IRule getHighlightRule() {	
		return new NumberRule(new Token(new TextAttribute(new Color(Display.getCurrent(), 
				new RGB(0,0,160)), 
				null, SWT.NORMAL)));
	}	
}
