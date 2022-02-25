package com.srvcode.springdemo.serviceImpl;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Track Coach.";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach Coach wishes you !! " + fortuneService.getFortune();
	}

}
