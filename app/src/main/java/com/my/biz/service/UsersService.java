package com.my.biz.service;

import java.util.List;

import com.my.biz.vo.UsersVO;

public interface UsersService {

	int insertUsers(UsersVO vo);
	int deleteUsers(String id);
	List<UsersVO> selectAllUsers();
	UsersVO searchUser(String id);
	UsersVO loginUser(String id, String pw);
}
