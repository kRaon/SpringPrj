package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.UsersVO;

public interface UsersDAO {
	
	int insertUsers(UsersVO vo);
	int deleteUsers(String id);
	List<UsersVO> selectAllUsers();
	UsersVO loginUser(String id, String pw);
}
