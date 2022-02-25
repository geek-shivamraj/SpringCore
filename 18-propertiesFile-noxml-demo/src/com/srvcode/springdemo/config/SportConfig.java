package com.srvcode.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.srvcode.springdemo.service.Coach;
import com.srvcode.springdemo.service.FortuneService;
import com.srvcode.springdemo.serviceImpl.CricketCoach;
import com.srvcode.springdemo.serviceImpl.HappyFortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	// define bean for our sad fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}

	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach(happyFortuneService());
	}
}
