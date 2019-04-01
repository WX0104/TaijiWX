package com.example.intercepetor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
//À¹½ØÆ÷
public class LoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle login in");
		if ("/hello/login".equals(request.getServletPath())||"/hello/join".equals(request.getServletPath())) {
			return true;
		}
		else if (StringUtils.isEmpty(request.getSession().getAttribute("username"))) {
			System.out.println(request.getServletPath());
			System.out.println(request.getContextPath());
			response.sendRedirect("/login");
			return false;
		}
		else {
			return false;
		}
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle comming");
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion comming");
	}

}
