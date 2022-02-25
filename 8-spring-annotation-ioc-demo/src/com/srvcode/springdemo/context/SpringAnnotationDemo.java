package com.srvcode.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srvcode.springdemo.service.Coach;

public class SpringAnnotationDemo {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-context.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
