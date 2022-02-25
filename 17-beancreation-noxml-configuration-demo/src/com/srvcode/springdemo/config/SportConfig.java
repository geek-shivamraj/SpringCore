package com.srvcode.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;
import com.srvcode.springdemo.serviceImpl.BaseballCoach;
import com.srvcode.springdemo.serviceImpl.HappyFortuneService;
import com.srvcode.springdemo.serviceImpl.SwimCoach;

@Configuration
public class SportConfig {

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new HappyFortuneService();
	}

	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

	@Bean
	public Coach baseballCoach() {
		return new BaseballCoach(sadFortuneService());
	}

}
