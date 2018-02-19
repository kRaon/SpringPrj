package com.my.biz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.Asset_activityDAO;
import com.my.biz.vo.Asset_activityVO;

@Service("ActivityService")
public class Asset_activityServiceImpl implements Asset_activityService{
	
	@Autowired
	@Qualifier("Activity_mybatis")
	Asset_activityDAO dao=null;

	@Override
	public int insertActivity(Asset_activityVO vo) {
		return dao.insertActivity(vo);
	}

	@Override
	public int deleteActivity(Asset_activityVO vo) {
		return dao.deleteActivity(vo);
	}

	@Override
	public int updateActivity(Asset_activityVO vo) {
		return dao.updateActivity(vo);
	}

	@Override
	public List<Asset_activityVO> selectAllActivities() {
		return dao.selectAllActivities();
	}
	
}
