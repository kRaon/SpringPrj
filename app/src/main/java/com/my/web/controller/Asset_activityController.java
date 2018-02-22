package com.my.web.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.biz.service.Asset_activityService;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_CounselorVO;
import com.my.biz.vo.Asset_activityVO;

@Controller
public class Asset_activityController {

	@Autowired
	@Qualifier("ActivityService")
	Asset_activityService service;

	@RequestMapping("/receipt.do")
	public ModelAndView getReceipt(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mav = new ModelAndView();
		String id = (String) req.getSession().getAttribute("userid");

		return mav;
	}

	@RequestMapping("/insertReceipt.do")
	public ModelAndView insertReceipt(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mav = new ModelAndView();

		String category_name = req.getParameter("category_name");
		String id = (String) req.getSession().getAttribute("userid");
		String contents = req.getParameter("contents");
		int category_num = Integer.parseInt(req.getParameter("category_num"));
		String fixed = req.getParameter("fixed");
		int amount = Integer.parseInt(req.getParameter("amount"));
		String tmp_a_date = req.getParameter("a_date");
		String a_type = req.getParameter("a_type");
		String[] datas = tmp_a_date.split("-");

		Date a_date = new Date(Integer.parseInt(datas[0]) - 1900, Integer.parseInt(datas[1]) - 1,
				Integer.parseInt(datas[2]));

		Asset_activityVO vo = new Asset_activityVO();
		vo.setA_date(a_date);
		vo.setA_type(a_type);
		vo.setCategory_num(category_num);
		vo.setAmount(amount);
		vo.setContents(contents);
		vo.setFixed(fixed);
		vo.setId(id);
		service.insertActivity(vo);

		System.out.println(vo + "hi1");

		List<ActivityCategoriesVO> list = service.selectAllActivityCatrgories_id(id);

		mav.setViewName("tables");
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping("/gotodayreceipt.do")
	public ModelAndView gotodayreceipt(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mav = new ModelAndView();
		String id = (String) req.getSession().getAttribute("userid");

		List<ActivityCategoriesVO> list = service.selectAllActivityCatrgories_id(id);
		mav.setViewName("tables");
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping("/deleteassetactivities.do")
	public ModelAndView deleteassetactivities(HttpServletRequest req) {

		ModelAndView mav = new ModelAndView();

		String[] indexnumbers = req.getParameterValues("indexnumber");

		for (String data : indexnumbers) {
			service.deleteActivity(Integer.parseInt(data));
		}

		String id = (String) req.getSession().getAttribute("userid");
		List<ActivityCategoriesVO> list = service.selectAllActivityCatrgories_id(id);
		mav.setViewName("tables");
		mav.addObject("list", list);
		return mav;
	}
	
	/*여기부터 인생 재무설계 파트 && Asset_Counselor Part Start*/
	@RequestMapping("/assetcounselorhome.do")
	public String assetcounselorhome() {
		return "Asset_Counselor";
	}
	
	@RequestMapping("/assetcounselor.do")
	public ModelAndView assetcounselor(HttpServletRequest req) {

		ModelAndView mav = new ModelAndView();
		String id = (String) req.getSession().getAttribute("userid");
		String date = (String) req.getParameter("date");

		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("date", date);

		List<Asset_CounselorVO> list = service.selectCounselorDataByID(map);
		mav.setViewName("Asset_Counselor");
		mav.addObject("list", list);
		return mav;
	}
	/*여기까지 인생재무설계 파트 && Asset_Counselor Part End*/

}
