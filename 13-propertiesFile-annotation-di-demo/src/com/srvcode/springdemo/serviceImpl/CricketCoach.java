package com.srvcode.springdemo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

@Component
public class CricketCoach implements Coach {

	@Autowired
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
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor.");
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
