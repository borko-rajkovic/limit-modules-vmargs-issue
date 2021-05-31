package com.proba.demo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger LOGGER = LogManager.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		List<String> listString = List.of("one");

		listString.forEach(item -> LOGGER.info(String.format("Hello %s", item)));

		SpringApplication.run(DemoApplication.class, args);
	}

}
