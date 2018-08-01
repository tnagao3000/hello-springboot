package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringbootController {

	private final static Logger logger = LoggerFactory.getLogger(HelloSpringbootController.class);

	@RequestMapping({ "/" })
	public String index() {

		logger.info("Hello");
		return "Hello Springboot on GAE!";
	}
}
