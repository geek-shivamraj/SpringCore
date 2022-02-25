package com.srvcode.springdemo.serviceImpl;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "This is Baseball Coach.";
	}

	@Override
	public String getDailyFortune() {
		return "Baseball Coach wishes !! " + fortuneService.getFortune();
	}

}
