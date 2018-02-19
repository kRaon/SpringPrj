package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.ActivityVO;

public interface ActivityDAO {
	public int insertActivity(ActivityVO vo);

	public int deleteActivity(ActivityVO vo);
	
	public int updateActivity(ActivityVO vo);
	
	public List<ActivityVO> selectAllActivities();
	
}
