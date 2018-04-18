package com.aspiresys.bankingservice.dto;

import javax.validation.constraints.NotNull;

public class UserDTO {
	
	@NotNull
	private String fullName;
	
	@NotNull
	private String phoneNo;
	
	@NotNull
	private String emailId;
	
	@NotNull
	private String aadharNumber;
	
	@NotNull
	private char gender;
	
	private String status = "pending";

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
