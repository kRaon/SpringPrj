package com.my.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
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
	

	@RequestMapping("/idCompare.do")
	protected void service(HttpServletRequest request, 
							HttpServletResponse response) throws IOException
						{
				
		boolean req = false;
		String id = request.getParameter("id");
		req = service.loginIdSearch(id);
		//Gson
		JsonObject jsonObject = new JsonObject();
		PrintWriter out = response.getWriter();
		jsonObject.addProperty("flag", req);
		
			out.print(jsonObject.toString());
			out.flush();
			out.close();
	}
}
