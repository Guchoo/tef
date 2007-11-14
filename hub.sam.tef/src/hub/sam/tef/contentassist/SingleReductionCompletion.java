package hub.sam.tef.contentassist;

import hub.sam.tef.modelcreating.ParseTreeRuleNode;
import hub.sam.tef.rcc.syntax.Rule;

/**
 * Is a completion computer that is based on a single syntax rule.
 */
public abstract class SingleReductionCompletion implements ICompletionComputer {
	
	/** 
	 * @return The symbols that must lay on top of the stack in order for this completion to apply.
	 */
	public abstract String[] getRulePrefix();
	
	/**
	 * @return The rule that describes the completion node of this completion.
	 */
	public abstract hub.sam.tef.tsl.Rule getRule();
	
	public boolean reduceParseStack(RccCompletionParser parser) {
		String[] rulePrefix = getRulePrefix();
		for (int i = 0; i < rulePrefix.length; i++) {
			Object parseResult = parser.getParseResult(rulePrefix.length - i - 1);
			if (parseResult instanceof ParseTreeRuleNode) {
				if (!((ParseTreeRuleNode)parseResult).getRule().getLhs().getName().equals(rulePrefix[i])) {
					return false;
				}
			} else if (parseResult instanceof String) {
				if (Rule.isTerminal(rulePrefix[i])) {
					if (Rule.isScanTerminal(rulePrefix[i])) {
						// TODO complex terminal symbols ala `identifier` or `number`							
					} else {
						if (!("'" + parseResult + "'").equals(rulePrefix[i])) {
							return false;
						}
					}
				} else {
					return false;
				}
				
			} else {
				throw new RuntimeException("assert");
			}					
		}
		parser.reduce(getRule().getRCCRule(), rulePrefix.length);
		return true;
	}

}