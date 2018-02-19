package com.my.biz.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;

import com.my.biz.vo.activityVO;

public interface ActivityMapper {
/*	int indexnumber;
	String id;
	int category_num;
	Date con_date;
	int fixed; // 0 : 변동 1: 고정
	int type; // 0 : 수입 1: 지출
*/
//crud
	
	@Insert("INSERT INTO ACTIVITY (INDEXNUMBER,ID,CATEGORY_NUM,CON_DATE,FIXED,A_TYPE) VALUES (#{indexnumber},#{id},#{category_num},#{con_date},#{fixed},#{a_type})")
	int insertActivity(activityVO vo);
	
	//@Delete("DELETE FROM ACTIBITY WHERE INDEXNUMBER=#{indexnumber}")
	
	//@Update("UPDATE ACTIVITY SET ")
	
	//@Select("SELECT * FROM ACTIVITY")
	
	//@Select("SELECT * FROM ACTIVITY WHERE ID=#{id}")

}
