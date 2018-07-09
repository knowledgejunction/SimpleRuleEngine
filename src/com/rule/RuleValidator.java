package com.rule;

import java.util.List;

public class RuleValidator {
	private List<IRule> rulebook;
	private boolean validRule = true;
	public RuleValidator(List<IRule> rulebook) {
		this.rulebook = rulebook;
	}
	
	public boolean validateRule() {
		for(IRule rule : rulebook) {
			validRule = validRule && rule.validate();
		}
		return validRule;
	}

}
