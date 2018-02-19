package com.my.biz.service;

import java.util.List;

import com.my.biz.vo.ActivityVO;

public interface ActivityService {
	public int insertActivity(ActivityVO vo);

	public int deleteActivity(ActivityVO vo);
	
	public int updateActivity(ActivityVO vo);
	
	public List<ActivityVO> selectAllActivities();
}
