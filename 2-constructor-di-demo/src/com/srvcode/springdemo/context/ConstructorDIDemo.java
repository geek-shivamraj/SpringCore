package com.srvcode.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srvcode.springdemo.service.Coach;

public class ConstructorDIDemo {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
