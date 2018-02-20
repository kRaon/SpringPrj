package com.my.web.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.biz.service.Asset_activityService;
import com.my.biz.vo.Asset_activityVO;

@Controller
public class Asset_activityController {
	@Autowired
	@Qualifier("ActivityService")
	Asset_activityService service;
	
	@RequestMapping("/insertReceipt.do")
	public String insertReceipt(HttpServletRequest req,HttpServletResponse res) {
		String category_name=req.getParameter("category_name");

		String id=(String) req.getSession().getAttribute("userid");
		String contents=req.getParameter("contents");
		int category_num=service.selectActivityNum(category_name);
		String fixed=req.getParameter("fixed");
		String tmp_a_date=req.getParameter("a_date");
		String a_type=req.getParameter("a_type");
		
		String[] datas=tmp_a_date.split("-");
		
		Date a_date=new Date(Integer.parseInt(datas[0])-1900,Integer.parseInt(datas[1])-1,Integer.parseInt(datas[2]));
		
		Asset_activityVO vo=new Asset_activityVO();
		vo.setA_date(a_date);
		vo.setA_type(a_type);
		vo.setCategory_num(category_num);
		vo.setFixed(fixed);
		vo.setId(id);
		
		service.insertActivity(vo);
		
		return "tables";
	}
	
}
