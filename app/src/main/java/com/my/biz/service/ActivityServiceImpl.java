package com.my.biz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.biz.dao.ActivityDAO;
import com.my.biz.vo.activityVO;

@Service("ActivityService")
public class ActivityServiceImpl implements ActivityService{
	
	@Resource(name="Activity_mybatis")
	ActivityDAO dao=null;

	@Override
	public int insertActivity(activityVO vo) {
		return dao.insertActivity(vo);
	}

	@Override
	public int deleteActivity(activityVO vo) {
		return dao.deleteActivity(vo);
	}

	@Override
	public int updateActivity(activityVO vo) {
		return dao.updateActivity(vo);
	}

	@Override
	public List<activityVO> selectAllActivities() {
		return dao.selectAllActivities();
	}
	
}
