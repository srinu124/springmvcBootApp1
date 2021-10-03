package com.soft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.soft.controller.SreenuController;

@SpringBootApplication
public class SpringMvcBootApplication {
	private static final Logger log=LoggerFactory.getLogger(SpringMvcBootApplication.class);        

	public static void main(String[] args) {
		
		log.info("inside main method");
		SpringApplication.run(SpringMvcBootApplication.class, args);
	}

}
