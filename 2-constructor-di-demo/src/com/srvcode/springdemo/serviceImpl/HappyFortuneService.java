package com.srvcode.springdemo.serviceImpl;

import com.srvcode.springdemo.service.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Fortune Service.";
	}

}
