package com.my.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, 
			           HttpServletResponse response, Object handler)
		 	                                                 throws Exception {
         
		 HttpSession session = request.getSession();
         if(session.getAttribute("login") != null) {
             return true;        	 
         }else {
        	 ModelAndView mav = new ModelAndView();
        	 mav.setViewName("redirect:login.html");
        	 throw new ModelAndViewDefiningException(mav);
         }
	}
}
