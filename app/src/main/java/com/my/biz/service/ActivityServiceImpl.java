package com.my.biz.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.biz.dao.ActivityDAO;
import com.my.biz.vo.activityVO;

@Service("ActivityService")
public class ActivityServiceImpl implements ActivityService{
	
	@Resource(name="Activity_mybatis")
	ActivityDAO dao=null;
	
	
	
	public ActivityServiceImpl() {
		super();
	}



	public ActivityServiceImpl(ActivityDAO dao) {
		super();
		this.dao = dao;
	}



	@Override
	public int activityInsert(activityVO vo) {
		
		return dao.activityInsert(vo);
	}

}
