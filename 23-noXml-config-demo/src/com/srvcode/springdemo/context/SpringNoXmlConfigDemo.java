package com.srvcode.springdemo.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srvcode.springdemo.config.BeanConfiguration;
import com.srvcode.springdemo.model.Employee;

public class SpringNoXmlConfigDemo {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Retrieve bean from spring container
		Employee theEmployee = context.getBean("emp", Employee.class);

		// Call methods on the bean
		System.out.println(theEmployee.getEmpId() + " - " + theEmployee.getEmpName() + " - " + theEmployee.getSalary());
		System.out.println(theEmployee.getAddress().getDoorNum() + " - "
				+ theEmployee.getAddress().getStreetName() + " - " + theEmployee.getAddress().getCity());
		
		// close the context
		context.close();
	}

}
