package com.my.biz.dao;


import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.my.biz.mybatis.mapper.Asset_activityMapper;
import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_CounselorVO;
import com.my.biz.vo.Asset_activityVO;
import com.my.biz.vo.ChartVO;

@Repository("Asset_activity_mybatis")
public class Asset_activityDAO_mybatis implements Asset_activityDAO{
	
	@Autowired
	@Qualifier("sqlSession")
	SqlSession mybatis;
	Asset_activityMapper mapper;
	
	
	public Asset_activityDAO_mybatis() {
	}

	public Asset_activityDAO_mybatis(SqlSession mybatis, Asset_activityMapper mapper) {
		this.mybatis = mybatis;
		//this.mapper = mapper;
	}
	
	@PostConstruct
	void init() {
		mapper=mybatis.getMapper(Asset_activityMapper.class);
	}

	public SqlSession getMybatis() {
		return mybatis;
	}

	public void setMybatis(SqlSession mybatis) {
		this.mybatis = mybatis;
	}

	public Asset_activityMapper getMapper() {
		return mapper;
	}

	public void setMapper(Asset_activityMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public int insertActivity(Asset_activityVO vo) {
		return mapper.insertActivity(vo);
	}

	@Override
	public int deleteActivity(int indexnumber) {
		return mapper.deleteActivity(indexnumber);
	}

	@Override
	public int updateActivity(Asset_activityVO vo) {
		return mapper.updateActivity(vo);
	}

	@Override
	public List<Asset_activityVO> selectAllActivities() {
		return mapper.selectAllActivities();
	}

	@Override
	public int selectActivityNum(String category_name) {
		return mapper.selectActivityNum(category_name);
	}

	@Override
	public List<ActivityCategoriesVO> selectAllActivityCatrgories() {
		return mapper.selectAllActivityCatrgories();
	}

	@Override
	public List<ActivityCategoriesVO> selectAllActivityCatrgories_id(String id) {
		return mapper.selectAllActivityCatrgories_id(id);
	}

	@Override
	public List<ChartVO> selectPieChart(Map<String, String> map) {
		return mapper.selectPieChart(map);
	}

	@Override
	public List<ChartVO> selectBarChart(Map<String, String> map) {
		return mapper.selectBarChart(map);
	}

	@Override
	public List<ActivityCategoriesVO> selectDateActivityCatrgories_id(Map<String, String> map) {
		return mapper.selectDateActivityCatrgories_id(map);
	}
	
	@Override
	public List<Asset_CounselorVO> selectCounselorDataByID(Map<String, String> map) {
		return mapper.selectCounselorDataByID(map);
	}

	@Override
	public Asset_CounselorVO selectAsset_data(String id) {
		return mapper.selectAsset_data(id);
	}

	@Override
	public List<ActivityCategoriesVO> selectActivityCatrgories_id_Date(Map<String,String> map){
		return mapper.selectActivityCatrgories_id_Date(map);
	}

	
}
