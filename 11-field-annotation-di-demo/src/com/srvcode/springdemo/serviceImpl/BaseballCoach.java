package com.srvcode.springdemo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println(">> BaseballCoach: inside default constructor.");
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
