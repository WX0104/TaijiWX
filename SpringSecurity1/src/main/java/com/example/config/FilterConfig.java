package com.example.config;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.example.filters.LogoutFilter;
import com.example.filters.LoginFilter;
import com.example.filters.AccessControlFilter;
@Configuration
public class FilterConfig {

	@Bean
	@Order(1)
	public FilterRegistrationBean logoutFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		// 设置过滤器拦截请求
		registrationBean.setFilter(LogoutFilter()); 
		//当前过滤器要通过拦截哪些端口
		registrationBean.addUrlPatterns("*");
		registrationBean.setName("logoutFilter");
		return registrationBean;
	}

	@Bean
	@Order(2)
	public FilterRegistrationBean loginFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		// 设置过滤器拦截请求
		registrationBean.setFilter(LoginFilter()); 
		//当前过滤器要通过拦截哪些端口
		registrationBean.addUrlPatterns("/a","/b");
		registrationBean.setName("loginFilter");
		return registrationBean;
	}
	
	@Bean
	@Order(3)
	public FilterRegistrationBean accessControlFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		// 设置过滤器拦截请求
		registrationBean.setFilter(AccessControlFilter()); 
		//当前过滤器要通过拦截哪些端口
		registrationBean.addUrlPatterns("/a","/b");
		registrationBean.setName("accessFilter");
		return registrationBean;
	}
	
	@Bean
	public Filter AccessControlFilter() {
		// TODO Auto-generated method stub
		return new AccessControlFilter();
	}

	
    @Bean
	public Filter LoginFilter() {
		// TODO Auto-generated method stub
		return new LoginFilter();
	}

    @Bean
	public Filter LogoutFilter() {
		// TODO Auto-generated method stub
		return new LogoutFilter();
	}
}
