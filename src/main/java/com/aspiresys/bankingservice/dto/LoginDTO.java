package com.aspiresys.bankingservice.dto;

import javax.validation.constraints.NotNull;

public class LoginDTO {
	
	@NotNull
    private String userName;
	@NotNull
    private String password;
	
	private String status = "confirmed";
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String role = "user";
	
	private boolean authorized;
    
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean getAuthorized() {
		return authorized;
	}
	public void setAuthorized(boolean authorized) {
		this.authorized = authorized;
	}
}
