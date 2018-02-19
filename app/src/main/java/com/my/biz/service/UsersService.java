package com.my.biz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.my.biz.vo.UsersVO;

@Service("userService")
public interface UsersService {

	int insertUsers(UsersVO vo);
	int deleteUsers(String id);
	List<UsersVO> selectAllUsers();
		
}
