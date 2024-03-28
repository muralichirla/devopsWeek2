package com.springdemo.springjenkinsss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringjenkinsssApplicationTests {
	public static final Logger logger=LoggerFactory.getLogger(SpringjenkinsssApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Its a test job");
		assertEquals(true,true);
	}

}
