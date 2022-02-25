package com.srvcode.springdemo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srvcode.springdemo.service.Coach;

public class BeanLifecycleMethodsAnnotationDemo {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-context.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();

	}

}
