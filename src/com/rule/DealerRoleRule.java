package com.rule;

public class DealerRoleRule implements IRule {
	private String userRole;
	public DealerRoleRule(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public boolean validate() {
		return "COMMITWRITE".equals(userRole);
	}

}
