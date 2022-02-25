package com.srvcode.springdemo.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srvcode.springdemo.config.SportConfig;
import com.srvcode.springdemo.service.Coach;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
