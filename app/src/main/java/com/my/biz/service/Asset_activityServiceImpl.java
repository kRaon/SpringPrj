package com.my.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.Asset_activityDAO;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_activityVO;

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
		// TODO Auto-generated method stub
		return dao.selectActivityNum(category_name);
	}

	@Override
	public List<ActivityCategoriesVO> selectAllActivityCatrgories() {
		return dao.selectAllActivityCatrgories();
	}

	@Override
	public List<ActivityCategoriesVO> selectAllActivityCatrgories_id(String id) {
		// TODO Auto-generated method stub
		return dao.selectAllActivityCatrgories_id(id);
	}


	
	


	
}
