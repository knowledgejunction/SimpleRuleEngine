package com.rule;

public class SaveOperationRule implements IRule {
	private String operationType;
	public SaveOperationRule(String operationType) {
		this.operationType = operationType;
	}

	@Override
	public boolean validate() {
		return "SAVE".equals(operationType);
	}

}
