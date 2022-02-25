package com.srvcode.springdemo.serviceImpl;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress.");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor.");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService.");
		this.fortuneService = fortuneService;
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
