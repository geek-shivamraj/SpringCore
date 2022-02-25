package com.srvcode.springdemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.srvcode.springdemo.service.FortuneService;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune Service.";
	}

}
