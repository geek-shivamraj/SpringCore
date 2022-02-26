package com.srvcode.springdemo.model;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	private Address address;
	
	public Employee() {
		System.out.println("Employee object is created");
	}
	
	// getters & setters
	
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
}
