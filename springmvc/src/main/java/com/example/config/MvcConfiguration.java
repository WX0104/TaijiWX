package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.intercepetor.LoginInterceptor;
import com.example.intercepetor.TimeInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan("com.example.controller")
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new LoginInterceptor());
		registry.addInterceptor(new TimeInterceptor());
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		registry.jsp("/WEB-INF/jsp/",".jsp");
	}
	

}
