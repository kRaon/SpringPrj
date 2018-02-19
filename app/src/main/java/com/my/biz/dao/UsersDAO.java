package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.usersVO;

public interface UsersDAO {
	
	int insertUsers(usersVO vo);
	int deleteUsers(String id);
	List<usersVO> selectAllUsers();
		
}
