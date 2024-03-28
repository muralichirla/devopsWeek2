package com.springdemo.springjenkinsss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjenkinsssApplication implements CommandLineRunner {

	public static final Logger logger=LoggerFactory.getLogger(SpringjenkinsssApplication.class);
	
	public static void main(String[] args) {
		logger.info("Its a continuous integration job");
		SpringApplication.run(SpringjenkinsssApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Second one");
		
	}

}
