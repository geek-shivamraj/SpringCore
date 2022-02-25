package com.srvcode.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srvcode.springdemo.serviceImpl.CricketCoach;

public class PropertiesFileDIDemo {

	public static void main(String[] args) {

		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
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
