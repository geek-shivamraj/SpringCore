package com.srvcode.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	@Value("11")
	private int empId;
	
	@Value("Shivam")
	private String empName;
	
	@Value("20000")
	private double salary;
	
	@Value("#{address}")
	private Address address;
	
	@Value("#{address.doorNum + ' - ' + address.getStreetName() + ' - ' + address.getCity()}")
	private String completeAddress;
	
	@Autowired
	@Qualifier("pi1")
	private PersonalInfo personalInfo;
	
	public Employee() {
		System.out.println("Employee object is created");
	}
	
	// getters & setters
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	
}
