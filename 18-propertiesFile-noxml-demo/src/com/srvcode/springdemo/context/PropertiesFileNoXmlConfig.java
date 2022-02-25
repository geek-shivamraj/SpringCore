package com.srvcode.springdemo.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srvcode.springdemo.config.SportConfig;
import com.srvcode.springdemo.serviceImpl.CricketCoach;

public class PropertiesFileNoXmlConfig {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Retrieve bean from spring container
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
