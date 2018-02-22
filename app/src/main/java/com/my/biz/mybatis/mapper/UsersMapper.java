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
	
	@Insert("INSERT INTO USERS (ID,PW,USER_DATE,GENDER,JOB,POINT) VALUES (#{id},#{pw},#{user_date},#{gender},#{job},0)")
	int insertUsers(UsersVO vo);
	
	@Delete("DELETE FROM USERS WHERE ID=#{id}")
	int deleteUsers(String id);
	
	@Select("SELECT * FROM USERS")
	List<UsersVO> selectAllUsers();
	
	@Select("SELECT * FROM USERS WHERE ID=#{id}")
	UsersVO searchUser(String id);

	@Select("SELECT birth_date FROM USERS WHERE ID=#{id}")
	UsersVO searchUserdate(String id);
	
	@Select("SELECT * FROM USERS WHERE ID=#{id} and PW=#{pw}")
	//public UsersVO loginUser(String id, String pw); //parameter로 인식하지 못함
	public UsersVO loginUser(UsersVO vo);
	
	/*@Select("SELECT ID FROM USERS")
	public String[] loginIdSearch(String id);*/
	
	@Select("SELECT ID FROM USERS")
	//select id from users where id='qwq713'
	public List<String> loginIdSearch(String id);
}
