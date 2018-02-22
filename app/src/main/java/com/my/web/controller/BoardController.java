package com.my.web.controller;


import java.util.ArrayList;


import java.util.List;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.biz.service.Asset_activityService;
import com.my.biz.service.BoardService;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService service;
	
	@Autowired
	@Qualifier("ActivityService")
	Asset_activityService aservice;
	
	
	@RequestMapping("/showallreceipt.do")
	public ModelAndView showallrecipt(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		String id=(String) req.getSession().getAttribute("userid");
		
		List<ActivityCategoriesVO> list=aservice.selectAllActivityCatrgories();
		mav.addObject("list", list);
		mav.setViewName("tables2");
		return mav;
	}
	
	
	@RequestMapping(value= { "listboard.do","listBoard.do"})
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", service.selectAllBoard());
		mav.setViewName("board/index.jsp");
		return mav;
	}
	
	@RequestMapping(value= {"indexCard.do"})
	public ModelAndView indexCard() {
		ModelAndView mav = new ModelAndView();
		List<BoardVO> list = new ArrayList<BoardVO>(); 
		list = service.selectAllBoard();
		List<BoardVO> list2 = new ArrayList<BoardVO>();
		
		int listNum = list.size();
		
		for(int i=1;i<7;i++) {
			list2.add(list.get(listNum-i));
		}

			

	
		
		for(int i=0;i<6;i++) {
		String[] bills=list2.get(i).getBillscontents().split(",");	
		//한사람의 bill 들을 가져옴
				String result="";
		for(int j=0;j<bills.length;j++) {
				String[] eachvalues=bills[0].split(":");
				eachvalues[0]=eachvalues[0].substring(1);//맨앞의 [ 제거				
				String temp="<tr><td>"+eachvalues[5]+"</td><td>"+eachvalues[3]+"</td><td>"+eachvalues[0]+"</td><td>"+eachvalues[1]+"</td><td>"+eachvalues[4]+"</td><td>"+eachvalues[2]+"</td> </tr>";				
				//한사람의 bill의 개수만큼 루프를 돌아서 하나의 계산내역을 항목별로 분리해서 밖아놓음
				result+=temp;
			}
		list2.get(i).setBillscontents(result);
		System.out.println(result);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		mav.addObject("list",list2);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value= { "deleteBoard.do"})
	public String deleteBoard(BoardVO vo) {
		   service.deleteBoard(vo);
		return "redirect:board.do";
	}
	@RequestMapping(value= {"updateBoard.do"})
	public String updateBoard(BoardVO vo) {
		service.updateBoard(vo);
		return "redirect:listboard.do";
	}
	
	@RequestMapping(value= {"/insertBoard.do"})
	public ModelAndView insertBoard(HttpServletRequest req,HttpServletResponse res) {
	
		ModelAndView mav=new ModelAndView();
		
		BoardVO vo=new BoardVO();
		
		String id=(String) req.getSession().getAttribute("userid");
		String contents=req.getParameter("contents");
		String board_id=new Date().toString()+id;
		String billscontents=req.getParameter("billscontents");
		
		System.out.println(id);
		System.out.println(contents);
		System.out.println(billscontents);
		System.out.println();
		System.out.println(board_id);
		
	
		vo.setBillscontents(billscontents);
		vo.setBoard_id(board_id);
		vo.setContents(contents);
		vo.setId(id);
		
		System.out.println("인서트전까지가능");
		service.insertBoard(vo);
		System.out.println("인서트까지가능");
		
		
		List<ActivityCategoriesVO> list=aservice.selectAllActivityCatrgories_id(id);
		mav.addObject("list", list);

		mav.setViewName("tables");
		return mav;
		
	}
}	

