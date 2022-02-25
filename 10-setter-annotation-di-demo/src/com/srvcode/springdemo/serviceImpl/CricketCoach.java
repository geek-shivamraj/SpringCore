package com.srvcode.springdemo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println(">> CricketCoach: inside default constructor.");
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> CricketCoach: inside setFortuneService() method.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Cricket Coach.";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach wishes !! " + fortuneService.getFortune();
	}

}
