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
	public UsersVO searchUser(String id) {
		return mapper.searchUser(id);
	}


	public UsersVO loginUser(String id, String pw) {
		//System.out.println("UserDAO_mybatis: "+id+pw);
		UsersVO vo = new UsersVO();
		vo.setId(id);
		vo.setPw(pw);
		return mapper.loginUser(vo);
	}

	/*@Override
	public boolean loginIdSearch(String id) {
		String[] ids = mapper.loginIdSearch(id);
		for(String d :ids) {
			if(id.equals(d)) {
				return false;
			}else {
				return true;
			}
		}
		return false;
	}*/
	
	@Override
	public boolean loginIdSearch(String id) {
		UsersVO vo = mapper.searchUser(id);
		
		if(vo!=null) {
			System.out.println("아이디있다.");
			return false;
		}else {
			System.out.println("없다.");
			return true;
		}
	}

	@Override
	public UsersVO searchUserdate(String id) {
		// TODO Auto-generated method stub
		return mapper.searchUserdate(id);
	}
}

