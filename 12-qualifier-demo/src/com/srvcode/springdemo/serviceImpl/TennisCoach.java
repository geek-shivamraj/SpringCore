package com.srvcode.springdemo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		System.out.println("Inside TennisCoach Constructor");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "This is Tennis Coach.";
	}

	@Override
	public String getDailyFortune() {
		return "Tennis Coach wishes !! " + fortuneService.getFortune();
	}

}
