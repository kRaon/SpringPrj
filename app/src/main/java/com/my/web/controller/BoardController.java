package com.my.web.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.biz.service.BoardService;
import com.my.biz.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	BoardService service;
	
	@RequestMapping(value= { "listboard.do","listBoard.do"})
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", service.selectAllBoard());
		mav.setViewName("board/boardlist");
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
	@RequestMapping(value= {"insertBoard"})
	public String insertBoard(BoardVO vo) {
		service.insertBoard(vo);
		return "redirect: board.do";
	}
	
}	

