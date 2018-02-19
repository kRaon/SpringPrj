package com.my.biz.users.service;

import java.util.List;

import com.my.biz.vo.usersVO;

public interface UsersService {

	int insertUsers(usersVO vo);
	int deleteUsers(String id);
	List<usersVO> selectAllUsers();
		
}
