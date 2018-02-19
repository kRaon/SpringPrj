package com.my.biz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.biz.dao.ActivityDAO;
import com.my.biz.vo.ActivityVO;

@Service("ActivityService")
public class ActivityServiceImpl implements ActivityService{
	
	@Resource(name="Activity_mybatis")
	ActivityDAO dao=null;

	@Override
	public int insertActivity(ActivityVO vo) {
		return dao.insertActivity(vo);
	}

	@Override
	public int deleteActivity(ActivityVO vo) {
		return dao.deleteActivity(vo);
	}

	@Override
	public int updateActivity(ActivityVO vo) {
		return dao.updateActivity(vo);
	}

	@Override
	public List<ActivityVO> selectAllActivities() {
		return dao.selectAllActivities();
	}
	
}
