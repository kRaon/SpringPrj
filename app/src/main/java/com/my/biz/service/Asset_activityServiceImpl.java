package com.my.biz.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.Asset_activityDAO;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_CounselorVO;
import com.my.biz.vo.Asset_activityVO;
import com.my.biz.vo.ChartVO;

@Service("ActivityService")
public class Asset_activityServiceImpl implements Asset_activityService{
	
	@Autowired
	@Qualifier("Asset_activity_mybatis")
	Asset_activityDAO dao=null;

	@Override
	public int insertActivity(Asset_activityVO vo) {
		return dao.insertActivity(vo);
	}

	@Override
	public int deleteActivity(int indexnumber) {
		return dao.deleteActivity(indexnumber);
	}

	@Override
	public int updateActivity(Asset_activityVO vo) {
		return dao.updateActivity(vo);
	}

	@Override
	public List<Asset_activityVO> selectAllActivities() {
		return dao.selectAllActivities();
	}

	@Override
	public int selectActivityNum(String category_name) {
		return dao.selectActivityNum(category_name);
	}


	@Override
	public List<ChartVO> selectPieChart(Map<String, String> map) {
		return dao.selectPieChart(map);
	}

	@Override
	public List<ChartVO> selectBarChart(Map<String, String> map) {
		return dao.selectBarChart(map);
	}

	@Override
	public List<ActivityCategoriesVO> selectAllActivityCatrgories() {
		return dao.selectAllActivityCatrgories();
	}

	@Override
	public List<ActivityCategoriesVO> selectAllActivityCatrgories_id(String id) {
		return dao.selectAllActivityCatrgories_id(id);
	}

	@Override
	public List<Asset_CounselorVO> selectCounselorDataByID(Map<String, String> map) {
		return dao.selectCounselorDataByID(map);
	}


	
	


	
}
