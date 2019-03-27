package com.example.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
      @Value("${my.name}")
      private String name;
      @Value("${my.age}")
      private int age;
      @Value("${my.number}")
      private int number;
      private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
		@RequestMapping("/hello")
		public String Hello() {
			logger.debug("Sample Debug Message");
			logger.info("Sample Info Message");
			logger.trace("Sample trace Message");
			logger.error("Sample error Message");
	        logger.warn("Sample warn Message");
			return "你是谁："+name+"age:"+age+"number:"+number;
		}
		

	

}
