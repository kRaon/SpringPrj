package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.activityVO;

public interface ActivityDAO {
	public int insertActivity(activityVO vo);

	public int deleteActivity(activityVO vo);
	
	public int updateActivity(activityVO vo);
	
	public List<activityVO> selectAllActivities();
	
}
