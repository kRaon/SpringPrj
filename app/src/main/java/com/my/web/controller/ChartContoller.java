package com.my.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.my.biz.service.Asset_activityService;
import com.my.biz.vo.ChartVO;

@Controller
public class ChartContoller {

	@Autowired
	@Qualifier("ActivityService")
	Asset_activityService service;

	@RequestMapping("/barchart.do")
	public void getbarchart(String fromdate, String todate, HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("application/json;charset=UTF-8");
		String id=(String) req.getSession().getAttribute("userid");
		Map<String,String> map=new HashMap<String,String>();
		map.put("id", "qwq713");
		map.put("fromdate",  fromdate);
		map.put("todate", todate);
		List<ChartVO> list = service.selectBarChart(map);
		JsonObject obj = new JsonObject();
		JsonObject obj2 = new JsonObject();
		JsonObject obj3 = new JsonObject();
		JsonObject obj4 = new JsonObject();
		JsonObject obj5 = new JsonObject();
		JsonArray arr = new JsonArray();
		JsonArray arr2 = new JsonArray();
		JsonArray arr3 = new JsonArray();
		for(ChartVO vo:list) {
			arr.add(vo.getMonth());
			arr2.add(vo.getAmount());
		}
		obj2.add("labels", arr);
		
		obj3.addProperty("label", "Revenue");
		obj3.addProperty("backgroundColor", "rgba(2,117,216,1)");
		obj3.add("data", arr2);
		arr3.add(obj3);
		obj2.add("datasets", arr3);
		
		
		/*
		{
			labels : [ "January", "February", "March", "April", "May", "June" ],
			datasets : [ {
				label : "Revenue",
				backgroundColor : "rgba(2,117,216,1)",
				borderColor : "rgba(2,117,216,1)",
				data : data
			} ]
		}
		*/
		
		try {
			res.getWriter().write(obj2.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("/piechart.do")
	public void getPiechart(String fromdate, String todate, HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("application/json;charset=UTF-8");
		String id=(String) req.getSession().getAttribute("userid");
		Map<String,String> map=new HashMap<String,String>();
		map.put("id", "qwq713");
		map.put("fromdate",  fromdate);
		map.put("todate", todate);
		List<ChartVO> list = service.selectPieChart(map);
		JsonObject obj2 = new JsonObject();
		JsonObject obj4 = new JsonObject();
		JsonArray arr = new JsonArray();
		JsonArray arr2 = new JsonArray();
		JsonArray arr3 = new JsonArray();
		JsonArray arr4 = new JsonArray();
		for(ChartVO vo : list) {
			arr.add(vo.getCategory_name());
			arr2.add(vo.getAmount());
		}
		obj2.add("labels", arr);
		obj4.add("data", arr2);
		String[] color= {"#007bff", "#dc3545", "#ffc107", "#28a745"};
		for(String d:color) {
			arr3.add(d);
		}
		obj4.add("backgroundColor", arr3);
		arr4.add(obj4);
		obj2.add("datasets",arr4);
		
		try {
			res.getWriter().write(obj2.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}