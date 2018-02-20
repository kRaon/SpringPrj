package com.my.web.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		System.out.println("service 진입");
		
		boolean req = false;
		String id = request.getParameter("id");
		System.out.println(id);
		req = service.loginIdSearch(id);
		System.out.println("req: "+req);
		
		JSONObject jsonObject = new JSONObject();
		PrintWriter out = response.getWriter();
		jsonObject.put("flag", req);
	
			out.print(jsonObject.toJSONString());
			out.flush();
			out.close();
	}
}
