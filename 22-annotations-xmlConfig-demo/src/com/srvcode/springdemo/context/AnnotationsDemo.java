package com.srvcode.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srvcode.springdemo.model.Employee;

public class AnnotationsDemo {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		Employee theEmployee = context.getBean("emp", Employee.class);

		// Call methods on the bean
		System.out.println(theEmployee.getEmpId() + " - " + theEmployee.getEmpName() + " - " + theEmployee.getSalary());
		System.out.println(theEmployee.getAddress().getDoorNum() + " - "
				+ theEmployee.getAddress().getStreetName() + " - " + theEmployee.getAddress().getCity()  );
		
		System.out.println("Complete Address : " + theEmployee.getCompleteAddress());
		
		System.out.println("Personal Info: " + theEmployee.getPersonalInfo().getHometown() + " - " + theEmployee.getPersonalInfo().getAadharNo());
		// close the context
		context.close();
	}

}
