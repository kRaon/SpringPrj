package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.Asset_activityVO;

public interface Asset_activityDAO {
	public int insertActivity(Asset_activityVO vo);

	//public int deleteActivity(Asset_activityVO vo);
	public int deleteActivity(int indexnumber);
	
	public int updateActivity(Asset_activityVO vo);
	
	public List<Asset_activityVO> selectAllActivities();
	
	public int selectActivityNum(String category_name);
	
}
