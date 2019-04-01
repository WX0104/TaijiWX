package com.example.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;



@RestController
public class ParamsController {

	/**
	 * 单一参数
	 */
	@RequestMapping("/one")
	public Integer oneParam(Integer id) {
		return id;
	}
	/**
	 * 多个参数
	 */
	@RequestMapping("/more")
	public String TwoParam(String name,Integer id) {
		return name+"  "+id;
	}
	/**
	 * 路径
	 */
	@RequestMapping("/path/{id}")
	public Integer pathParam(@PathVariable Integer id) {
		return id;
	}
	/**
	 * 对象
	 */
	@RequestMapping("/user")
	public User getUser(User user) {
		return user;
	}
	/**
	 * map传key-value值 
	 */
	@RequestMapping("/map")
	public Map<String, Object> getMap(@RequestParam Map<String, Object> map) {
		return map;
	}
	/**
	 * 请求参数
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/requ")
	public String getRequ(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		return name;
	}
}
