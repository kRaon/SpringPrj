package com.my.biz.dao;

import java.util.List;
import java.util.Map;

import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_activityVO;
import com.my.biz.vo.ChartVO;

public interface Asset_activityDAO {
	public int insertActivity(Asset_activityVO vo);

	//public int deleteActivity(Asset_activityVO vo);
	public int deleteActivity(int indexnumber);
	
	public int updateActivity(Asset_activityVO vo);
	
	public List<Asset_activityVO> selectAllActivities();
	
	public int selectActivityNum(String category_name);
	

	public List<ChartVO> selectBarChart(Map<String,String> map);
	
	public List<ChartVO> selectPieChart(Map<String,String> map);
	//public selectIdActivity(String id);

	public List<ActivityCategoriesVO> selectAllActivityCatrgories();

	public List<ActivityCategoriesVO> selectAllActivityCatrgories_id(String id);

}
