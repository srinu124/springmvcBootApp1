package com.soft;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class SpringMvcBootApplicationTests {
	
	private static final Logger log=LoggerFactory.getLogger(SpringMvcBootApplicationTests.class);        


	@Test
	void contextLoads() {
		log.info("inside test class");
		 assertEquals(true,true);
		
	}


	

}
