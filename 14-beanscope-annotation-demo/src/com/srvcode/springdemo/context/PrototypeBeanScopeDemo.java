package com.srvcode.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srvcode.springdemo.service.Coach;

public class PrototypeBeanScopeDemo {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-context.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);

		Coach alphaCoach = context.getBean("baseballCoach", Coach.class);

		// check if they are the same
		boolean result = (theCoach == alphaCoach);

		// print out the results
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach + "\n");

		// close the context
		context.close();

	}

}
