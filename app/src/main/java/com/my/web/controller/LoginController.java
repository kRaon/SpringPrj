package com.my.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonObject;
import com.my.biz.service.UsersService;
import com.my.biz.vo.UsersVO;

@Controller
public class LoginController {

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

	
	
	@RequestMapping("/loginConfirm.do")
	public void loginConfirm(UsersVO vo, HttpServletRequest req,
			HttpSession session,HttpServletResponse response) throws IOException {
		
		//Gson
		JsonObject jsonObject = new JsonObject();
		PrintWriter out = response.getWriter();

		UsersVO userConfirm = service.searchUser(vo.getId());

		if(userConfirm != null) {//아이디만 있고 비밀번호 틀린 경우
			if(!(vo.getPw().equals(userConfirm.getPw()))) {
				jsonObject.addProperty("flag", "pwerror");
				out.print(jsonObject.toString());
				out.flush();
				out.close();
			}
		}else{//아이디 및 비밀번호가 틀린 경우 
			jsonObject.addProperty("flag", "error");
			out.print(jsonObject.toString());
			out.flush();
			out.close();
		}
		
	}
	
	@RequestMapping("/login.do")
	public String loginProcess(UsersVO vo, HttpServletRequest req,
			HttpSession session,HttpServletResponse response) throws IOException {
		
		response.setHeader("Content-Type", "application/xml");
		response.setContentType("text/xml;charset=UTF-8");
		response.setCharacterEncoding("utf-8"); 

		//Gson
		JsonObject jsonObject = new JsonObject();
		PrintWriter out = response.getWriter();

		UsersVO user = service.loginUser(vo.getId(), vo.getPw());
		
		if(user!=null) {
			req.getSession().setAttribute("userid", user.getId());
			return "redirect:indexCard.do";
		}else {			
			req.setAttribute("loginid", vo.getId());
			req.setAttribute("errorMsg", "아이디 비밀번호 확인해주세요.");
		}
		return "login";
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
	
	

