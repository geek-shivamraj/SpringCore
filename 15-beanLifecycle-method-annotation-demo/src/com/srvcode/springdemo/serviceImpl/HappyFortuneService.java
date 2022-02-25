package com.srvcode.springdemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Fortune Service.";
	}

}
