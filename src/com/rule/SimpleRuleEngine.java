package com.rule;

import java.util.ArrayList;
import java.util.List;

public class SimpleRuleEngine {

	public static void main(String[] args) {
	List<IRule> rules = new ArrayList<>();
	SaveOperationRule saveOperationRule = new SaveOperationRule("C");
	rules.add(saveOperationRule);
	ZoneManagerRoleRule roleRule = new ZoneManagerRoleRule(null);
	rules.add(roleRule);
	RuleValidator ruleValidator = new RuleValidator(rules);
	System.out.println("After Rule Validation : "+ruleValidator.validateRule());
	}

}
