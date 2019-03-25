package com.example.controller;

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
	
		@RequestMapping("/hello")
		public String Hello() {
			
			return "你是谁："+name+"age:"+age+"number:"+number;
		}
		

	

}
