package com.my.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.UsersDAO;
import com.my.biz.vo.UsersVO;

@Service("UsersService")
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	@Qualifier("Users_mybatis")
	UsersDAO dao = null;
	
	@Override
	public int insertUsers(UsersVO vo) {
		return dao.insertUsers(vo);
	}

	@Override
	public int deleteUsers(String id) {
		return dao.deleteUsers(id);
	}

	@Override
	public List<UsersVO> selectAllUsers() {

		return dao.selectAllUsers();
	}

	@Override
	public UsersVO searchUser(String id) {
		return dao.searchUser(id);
	}

	public UsersVO loginUser(String id, String pw) {
		return dao.loginUser(id,pw);
	}

	@Override
	public boolean loginIdSearch(String id) {
		return dao.loginIdSearch(id);
	}

}
