package com.munimjee.controllers.test;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	final static Logger log = Logger.getLogger(TestController.class);
	@RequestMapping("/")
	public String test()
	{
		log.info("Hitting test service");
		return "This is Munimjee Rest service v1.0!!!site under maintainance!!!";
	}
}
