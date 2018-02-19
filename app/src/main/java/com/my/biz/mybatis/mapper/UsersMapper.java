package com.my.biz.mybatis.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.my.biz.vo.UsersVO;

public interface UsersMapper {
/*	String id;
	String pw;
	int age;
	String gender;
	String job;
	int point;*/
	
	@Insert("INSERT INTO USERS (ID,PW,AGE,GENDER,JOB,POINT) VALUES (#{id},#{pw},#{age},#{gender},#{job},#{point})")
	int insertUsers(UsersVO vo);
	
	@Delete("DELETE FROM USERS WHERE ID=#{id}")
	int deleteUsers(String id);
	
	@Select("SELECT * FROM USERS")
	List<UsersVO> selectAllUsers();
		
	//@Update("UPDATE USERS SET ")
	
}
