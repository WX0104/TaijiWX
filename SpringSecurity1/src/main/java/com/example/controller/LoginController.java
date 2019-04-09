package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.filters.LoginFilter;
import com.example.mock.Mock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
// @RequestMapping("/login")
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	

	// 登录
	@PostMapping("/login")
	public String login(HttpServletRequest request, String username, String password) {
		HttpSession session = request.getSession();

		// 判断用户名密码是否正确的逻辑
		if (Mock.userList.contains(new HashMap() {
			{
				put(username, password);
			}
		})) {
			// 如果有这个用户那么登录成功
			session.setAttribute(Mock.User_Key, username);
			return "登录成功,您可以访问接口了";
		}

		return "登录失败，请求检查您的用户名和密码";
	}

	// // 退出
	// @PostMapping("/logout")
	// public String logout(HttpServletRequest request, String username) {
	// HttpSession session = request.getSession();
	// session.removeAttribute(LoginFilter.User_Key);
	// return "登出成功";
	// }

}
