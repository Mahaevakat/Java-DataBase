package com.iasa.ka23.ManagementSystem.bl.service;

public class User {	
	

	private UserRole role;

	private Integer id;

	private String username;

	private String password;	

	private static final String ERR_DENIED = "Access denied for following user:";

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

	public void setRoleByName(String role2) {	
		try {
			role = UserRole.valueOf(role2); 
		}	catch (Exception e){
			throw new IllegalArgumentException(ERR_DENIED + role2);
		}
	}
}
