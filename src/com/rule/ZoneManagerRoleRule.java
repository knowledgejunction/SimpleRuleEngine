package com.rule;

public class ZoneManagerRoleRule implements IRule{
	private String userRole;
	public  ZoneManagerRoleRule(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public boolean validate() {
		return "COMMITOVERRIDE".equals(userRole);
	}

}
