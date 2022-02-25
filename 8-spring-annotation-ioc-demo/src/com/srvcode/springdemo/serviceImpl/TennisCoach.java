package com.srvcode.springdemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.Coach;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "This is Tennis Coach.";
	}

}
