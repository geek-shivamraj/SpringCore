package com.srvcode.springdemo.serviceImpl;

import com.srvcode.springdemo.service.Coach;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "This is Track Coach.";
	}

}
