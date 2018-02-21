package com.my.web.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/Chart.do")
public class Chart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		

		int[] nums = {10000, 1162, 2263, 8394, 8287, 2682, 3274, 3259, 5849, 4159, 2651, 1984, 8451};
		JSONArray tmp = new JSONArray();
		for(int d :nums) {
			tmp.put(d);
		}
		
		System.out.println(tmp.toList());
		out.println(tmp.toList());
		out.close();
	}

}
