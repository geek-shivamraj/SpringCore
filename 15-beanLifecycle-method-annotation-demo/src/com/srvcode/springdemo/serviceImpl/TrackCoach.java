package com.srvcode.springdemo.serviceImpl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

@Component
public class TrackCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println(">> TrackCoach: inside default constructor.");
	}

	@Override
	public String getDailyWorkout() {
		return "This is Track Coach.";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach Coach wishes you !! " + fortuneService.getFortune();
	}
	
	// add an init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	// add a destroy
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
	
}
