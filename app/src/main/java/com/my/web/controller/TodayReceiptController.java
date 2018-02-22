package com.my.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.biz.service.BoardService;
import com.my.biz.service.UsersService;

@Controller
public class TodayReceiptController {
	@Autowired
	@Qualifier("BoardService")
	BoardService service;
	
	
}
