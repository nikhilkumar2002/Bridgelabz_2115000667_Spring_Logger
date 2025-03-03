package com.example.SpringLogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringConceptsApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.info("Info Message");
		logger.debug("Debug Message");
		logger.warn("Warning Message");
		logger.error("Error Message");
	}
}

