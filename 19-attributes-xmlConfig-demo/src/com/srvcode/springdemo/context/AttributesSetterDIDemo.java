package com.srvcode.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srvcode.springdemo.model.Employee;

public class AttributesSetterDIDemo {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setter-injection-config.xml");

		// Retrieve bean from spring container
		Employee theEmployee = context.getBean("emp", Employee.class);

		// Call methods on the bean
		System.out.println(theEmployee.getEmpId() + " - " + theEmployee.getEmpName() + " - " + theEmployee.getSalary());
		System.out.println(theEmployee.getAddress().getCity() + " - " + theEmployee.getAddress().getDoorNum() + " - "
				+ theEmployee.getAddress().getStreetName());

		// close the context
		context.close();
	}

}
