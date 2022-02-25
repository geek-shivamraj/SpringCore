package com.srvcode.springdemo.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srvcode.springdemo.config.SportConfig;
import com.srvcode.springdemo.service.Coach;

public class BeanCreationNoXmlDemo {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Retrieve bean from spring container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
