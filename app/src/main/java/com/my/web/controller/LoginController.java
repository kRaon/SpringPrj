package com.my.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.my.biz.service.UsersService;
import com.my.biz.vo.UsersVO;

@Controller
public class LoginController {

	@Autowired
	@Qualifier("UsersService")
	UsersService service;

	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "redirect:login.jsp";
	}
	
	@RequestMapping("/login.do")
	public String loginProcess(UsersVO vo, HttpServletRequest req,
									HttpSession session) {
			UsersVO user = service.loginUser(vo.getId(), vo.getPw());
			if(user!=null) {
				req.getSession().setAttribute("login", user);
				return "redirect:index.jsp";
			}else {			
				return "redirect:login.html";
			}
		}
		
		@RequestMapping("/logout.do")
		public String logoutProcess(HttpSession session) {
				session.invalidate();
				return "redirect:login.html";
			}
}
	
	

