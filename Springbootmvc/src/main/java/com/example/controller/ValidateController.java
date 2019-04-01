package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bean.User;

@Controller
@RequestMapping("/validator")
public class ValidateController {

	@GetMapping("/index")
	public String index(@ModelAttribute("user") User user) {
		return "hello";
	}
	@PostMapping("/join")
	public String join(@Validated User user,BindingResult result,Model model) {
		System.out.println("user");
		if(result.hasErrors()) {
			System.out.println(model);
			return "hello";
		}
		return "home";
	}
}
