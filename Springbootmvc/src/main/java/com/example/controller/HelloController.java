package com.example.controller;

import java.io.File;
import java.io.IOException;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.bean.User;









@Controller
@RequestMapping(value="/hello")
public class HelloController {
	

	@PostMapping("/json")
	@ResponseBody
	public String json(@RequestParam String name,@RequestParam int age) {
		
		return "hello"+name+age;
		
	}
	/*
	@GetMapping("/index")
	 public String index(String name,Model model){
		model.addAttribute("username", name);
	   return "hello"; //当浏览器输入/index时，会返回 /templates/home.html页面
	}
	*/
	
	
	
	@RequestMapping("/index")
	public String index(ModelMap map){
	   

	    User user = new User();
	    user.setAge(1);
	    user.setName("test");

	    map.put("user", user);
	    return "hello";
	}
	
	
	
	@GetMapping("/tiao")
	 public String tiao(){
		
	   return "home"; //当浏览器输入/index时，会返回 /templates/home.html页面
	}
	
	@PostMapping("/fileupload")
	public String FileUpload(MultipartFile file) throws IllegalStateException, IOException {
		File uploadfile = new File("E://test/"+file.getOriginalFilename());
		file.transferTo(uploadfile);
		return "success";
		
	}
	
	
	
	
	@PostMapping("/add")
	public String add(User user,Model model){
	    String name = user.getName();
	    Integer age = user.getAge();
	    model.addAttribute("name",name);
	    model.addAttribute("age",age);
	    System.out.println(666666);
	    return "home";
	}
	

}
