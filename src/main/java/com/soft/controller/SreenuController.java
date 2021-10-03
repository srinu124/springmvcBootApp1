package com.soft.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
 @RequestMapping("/api")
public class SreenuController {
	
	private static final Logger log=LoggerFactory.getLogger(SreenuController.class);        

	
	@PostMapping("/wish")
	public String whsi1() {
		
		log.info("this in inside sreenucontroller");
		
		return "this is wish1";
	}

}
