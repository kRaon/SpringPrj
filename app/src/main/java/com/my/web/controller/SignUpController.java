package com.my.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.biz.service.UsersService;
import com.my.biz.vo.UsersVO;

@Controller
public class SignUpController {
	@Autowired
	@Qualifier("UsersService")
	UsersService service;

	
	@RequestMapping("/gosignup.do")
	public String gosignup() {
		return "register";	
	}
	@RequestMapping("/signup.do")
	public String signup(UsersVO vo,HttpServletRequest request,HttpServletResponse response) {
		UsersVO temp=service.searchUser(vo.getId());
		if(temp == null) {
		service.insertUsers(vo);
		return "login";	
		}else {
			return "register";
		}
	}
}
