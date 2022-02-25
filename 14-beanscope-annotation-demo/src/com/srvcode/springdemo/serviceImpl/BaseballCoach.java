package com.srvcode.springdemo.serviceImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

@Component
@Scope("prototype")
public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "This is Baseball Coach.";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return "Baseball Coach wishes you !! " + fortuneService.getFortune();
	}

}
