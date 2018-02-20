package com.my.biz.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.my.biz.mybatis.mapper.UsersMapper;
import com.my.biz.vo.UsersVO;

@Repository("Users_mybatis")
public class UsersDAO_mybatis implements UsersDAO{

	@Autowired
	@Qualifier("sqlSession")
	SqlSession mybatis;
	
	UsersMapper mapper;
	
	
	
	
	public SqlSession getMybatis() {
		return mybatis;
	}

	public void setMybatis(SqlSession mybatis) {
		this.mybatis = mybatis;
	}

	public UsersMapper getMapper() {
		return mapper;
	}

	public void setMapper(UsersMapper mapper) {
		this.mapper = mapper;
	}

	public UsersDAO_mybatis(SqlSession mybatis, UsersMapper mapper) {
		super();
		this.mybatis = mybatis;
		this.mapper = mapper;
	}

	public UsersDAO_mybatis() {
		super();
	}
	@PostConstruct
	void init() {
		mapper = mybatis.getMapper(UsersMapper.class);
		
	}
	
	@Override
	public int insertUsers(UsersVO vo) {
		return mapper.insertUsers(vo);
	}

	@Override
	public int deleteUsers(String id) {
		// TODO Auto-generated method stub
		return mapper.deleteUsers(id);
	}

	@Override
	public List<UsersVO> selectAllUsers() {
		// TODO Auto-generated method stub
		return mapper.selectAllUsers();
	}

	@Override
	public UsersVO loginUser(String id, String pw) {
		// TODO Auto-generated method stub
		return mapper.loginUser(id,pw);
	}

}
