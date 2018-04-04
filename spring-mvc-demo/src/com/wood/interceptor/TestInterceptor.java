package com.wood.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("处理之前");
		return true;
	}

	public void postHandle(HttpServletRequest httpservletrequest,
			HttpServletResponse httpservletresponse, Object obj,
			ModelAndView modelandview) throws Exception {
		System.out.println("处理中");
	}

	public void afterCompletion(HttpServletRequest httpservletrequest,
			HttpServletResponse httpservletresponse, Object obj,
			Exception exception) throws Exception {
		System.out.println("处理后");
	}

}
