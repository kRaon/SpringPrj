package com.my.web.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.biz.service.Asset_activityService;
import com.my.biz.util.tax;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_CounselorVO;
import com.my.biz.vo.Asset_CounselorVO2;
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
		Asset_CounselorVO vo=service.selectAsset_data(id);
		int birth_date=Integer.parseInt(vo.getBirth_date());
		
		System.out.println(birth_date);
		
		int amount=vo.getAmount();
		int untilyear=Integer.parseInt(req.getParameter("untilyear"));
		int increaserate=Integer.parseInt(req.getParameter("increaserate"));
		int savingrate=Integer.parseInt(req.getParameter("savingrate"));
		int interestrate=Integer.parseInt(req.getParameter("interestrate"));
		
		List<Asset_CounselorVO2> list =makedata(birth_date, amount, untilyear, savingrate, interestrate, increaserate);
		
		for(Asset_CounselorVO2 data: list) {
			System.out.println(data);
		}
		
		mav.setViewName("Asset_Counselor");
		mav.addObject("list", list);
		return mav;
	}
	/*여기까지 인생재무설계 파트 && Asset_Counselor Part End*/

	public double calctax(long income) {
		double tax = 0;
		if (income < 0) {
			System.out.println("Wrong State : income is '-' ");
			return tax;
		}
		if (income <= 12000000) {
			tax = income * 0.06;
		} else if (income > 12000000 && income <= 46000000) {
			tax = (income - 12000000) * 0.15 + 720000;
		} else if (income > 46000000 && income <= 88000000) {
			tax = (income - 46000000) * 0.24 + 5820000;
		} else if (income > 88000000 && income <= 150000000) {
			tax = (income - 88000000) * 0.35 + 15900000;
		} else if (income > 150000000 && income <= 300000000) {
			tax = (income - 150000000) * 0.38 + 37600000;
		} else if (income > 300000000 && income <= 500000000) {
			tax = (income - 300000000) * 0.40 + 94600000;
		} else {
			tax = (income - 500000000) * 0.42 + 174600000;
		}
		return tax;
	}
	public static List<Asset_CounselorVO2> makedata(int birth_date,int amount,int untilyear,int savingrate,int interestrate,int increaserate)
	{
		List<Asset_CounselorVO2> list=new ArrayList<Asset_CounselorVO2>();
		Calendar c = Calendar.getInstance();

		long assetsum = 0;
		for (int i = 0; i <= untilyear; i++) {
			int age = (1 + c.get(Calendar.YEAR) - birth_date + i);
			int income = (int) (amount * Math.pow((increaserate + 100) * 0.01, i));
			double tax = new tax().calctax(income);
			long disposable = income - (long)tax;
			long fund = (long) (disposable * (savingrate * 0.01));
			long asset = (long) (fund * Math.pow((interestrate + 100) * 0.01, i));
			assetsum += asset;
			/*String birth_date, int amount, int age, int income, long disposable, long fund,long assetsum)*/
				
			list.add(new Asset_CounselorVO2(Integer.toString(birth_date),String.format("%,d", amount),age,String.format("%,d", income),String.format("%,d", disposable),String.format("%,d", fund),String.format("%,d", assetsum)));
		}
		return list;	
	}
}
