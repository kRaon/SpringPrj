package com.my.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonObject;
import com.my.biz.service.UsersService;
import com.my.biz.vo.UsersVO;

//@Controller
public class LoginController_backup {

	@Autowired
	@Qualifier("UsersService")
	UsersService service;

	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "login";
	}
	/*@RequestMapping("/home.do")
	public String gohome() {
		return "index";*/

	@RequestMapping("/login.do")
	public String loginProcess(UsersVO vo, HttpServletRequest req,
			HttpSession session,HttpServletResponse response) throws IOException {
		
		//Gson
		
		JsonObject jsonObject = new JsonObject();
		PrintWriter out = response.getWriter();

		UsersVO user = service.loginUser(vo.getId(), vo.getPw());
		
		if(user!=null) {
			req.getSession().setAttribute("userid", user.getId());
			return "redirect:indexCard.do";
		}else {			
			return "login";
		}
		
	}
	
	@RequestMapping("/logout.do")
		public String logoutProcess(HttpSession session) {
				session.invalidate();
				return "login";
	}
		
		@RequestMapping("/gomain.do")
		public String gomain() {
			return "index";
		}
}
	
	

