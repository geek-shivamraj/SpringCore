package com.srvcode.springdemo.serviceImpl;

import org.springframework.beans.factory.annotation.Value;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	// create a no-arg constructor
	public CricketCoach(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside no-arg constructor.");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "This is Cricket Coach.";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach wishes you !! " + fortuneService.getFortune();
	}

}
