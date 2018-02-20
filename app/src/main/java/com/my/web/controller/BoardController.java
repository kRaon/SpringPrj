package com.my.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	@RequestMapping(value= { "deleteBoard.do"})
	public String deleteBoard(BoardVO vo) {
		   service.deleteBoard(vo);
		return "redirect:board.do";
	}
	@RequestMapping(value= {"updateBoard.do"})
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		service.updateBoard(vo);
		return "redirect:listboard.do";
	}
	
}
