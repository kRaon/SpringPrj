package com.my.biz.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.my.biz.mybatis.mapper.ActivityMapper;
import com.my.biz.vo.activityVO;

@Repository("Activity_mybatis")
public class ActivityDAO_mybatis implements ActivityDAO{
	
	@Autowired
	@Qualifier("sqlSession")
	SqlSession mybatis;
	ActivityMapper mapper;
	
	
	public ActivityDAO_mybatis() {
		super();
	}

	public ActivityDAO_mybatis(SqlSession mybatis, ActivityMapper mapper) {
		super();
		this.mybatis = mybatis;
		this.mapper = mapper;
	}
	
	@PostConstruct
	void init() {
		mapper=mybatis.getMapper(ActivityMapper.class);
	}

	public SqlSession getMybatis() {
		return mybatis;
	}

	public void setMybatis(SqlSession mybatis) {
		this.mybatis = mybatis;
	}

	public ActivityMapper getMapper() {
		return mapper;
	}

	public void setMapper(ActivityMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public int insertActivity(activityVO vo) {
		return mapper.insertActivity(vo);
	}

	@Override
	public int deleteActivity(activityVO vo) {
		// TODO Auto-generated method stub
		return mapper.deleteActivity(vo);
	}

	@Override
	public int updateActivity(activityVO vo) {
		// TODO Auto-generated method stub
		return mapper.updateActivity(vo);
	}

	@Override
	public List<activityVO> selectAllActivities() {
		// TODO Auto-generated method stub
		return mapper.selectAllActivities();
	}

	
}
