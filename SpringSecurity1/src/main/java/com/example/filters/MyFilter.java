package com.example.filters;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.bean.User;

public class MyFilter implements Filter {

	private static Logger logger = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		logger.info("init");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		/*
		logger.info("begin");
		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse res = (HttpServletResponse) servletResponse;
		HttpSession session = req.getSession();		
        logger.info(session.toString());
		if (session.getAttribute("username").equals("admin") && session.getAttribute("password").equals("admin")) {
			res.sendRedirect("/aa");

		} else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
      */
	}

	@Override
	public void destroy() {
        
		logger.info("destory");
	}

}
