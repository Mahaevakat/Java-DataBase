package com.iasa.ka23.ManagementSystem.bl.service;

public class User {	
	
	private UserRole role;

	private Integer id;

	private String username;

	private String password;	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public void setRole(String role2) {	
		if ("admin_role".equals(role2)){
			role = UserRole.ADMIN;
		}
		else {
			if ("operator_role".equals(role2)){
				role =UserRole.OPERATOR;
			}
			else throw new IllegalArgumentException("Inonsistence respond from database: \""
			+ role + "\"");
		}
	}
}
