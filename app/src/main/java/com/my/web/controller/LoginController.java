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


	@RequestMapping("/home.do")
	public String gohome() {
		return "index";
	}
	
	/*@RequestMapping("/login.do")
	public String loginProcess(UsersVO vo, HttpServletRequest req) {
		UsersVO user = service.login(vo.getId(), vo.getPw());
		if(user != null) {
			req.getSession().setAttribute("login", user);
			return "redirect:index.html";
		}else {
			return "redirect:index.html";
		}
	}*/
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login.html";
	}
	
	
}
