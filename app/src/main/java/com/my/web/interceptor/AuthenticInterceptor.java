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
		 
		 String uri=request.getRequestURI();
		 uri=uri.substring(uri.lastIndexOf("/"));
		 System.out.println(uri);
        	 
		 if(session.getAttribute("userid") != null) {
             return true;        	 
         }else {
        	 if(uri.equals("/login.do")) {
        		 return true;
        	 }
        	 ModelAndView mav = new ModelAndView();
        	 mav.setViewName("login");
        	 throw new ModelAndViewDefiningException(mav);
         }
	}
}
