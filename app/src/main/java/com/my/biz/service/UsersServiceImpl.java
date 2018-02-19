package com.my.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.UsersDAO;
import com.my.biz.vo.usersVO;

@Service("UsersService")
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	@Qualifier("Users_mybatis")
	UsersDAO dao = null;

	
	
	@Override
	public int insertUsers(usersVO vo) {
		return dao.insertUsers(vo);
	}

	@Override
	public int deleteUsers(String id) {
		return dao.deleteUsers(id);
	}

	@Override
	public List<usersVO> selectAllUsers() {

		return dao.selectAllUsers();
	}

	
}
