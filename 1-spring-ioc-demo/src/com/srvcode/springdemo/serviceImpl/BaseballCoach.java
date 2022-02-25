package com.srvcode.springdemo.serviceImpl;

import com.srvcode.springdemo.service.Coach;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "This is Baseball Coach.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
