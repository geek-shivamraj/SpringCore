package com.srvcode.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.srvcode.springdemo.model.Address;
import com.srvcode.springdemo.model.Employee;

@Configuration
public class BeanConfiguration {

	@Bean(name="addr")
	public Address createAddress() {
		Address address = new Address();
		address.setCity("City-1");
		address.setStreetName("Street-1");
		address.setDoorNum("Door-1");;
		return address;
	}
	
	@Bean(name="emp")
	public Employee createEmployee(Address addr) {
		Employee emp = new Employee();
		emp.setEmpId(11);
		emp.setEmpName("Shivam");
		emp.setSalary(20000);
		emp.setAddress(addr);
		return emp;
	}
}
