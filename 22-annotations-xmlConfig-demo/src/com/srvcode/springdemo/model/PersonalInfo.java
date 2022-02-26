package com.srvcode.springdemo.model;

import org.springframework.beans.factory.annotation.Value;

public class PersonalInfo {

	@Value("Muz")
	private String hometown;

	@Value("789678")
	private String aadharNo;
	
	public PersonalInfo() {
		System.out.println("Personal Info object is created.");
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	
}
