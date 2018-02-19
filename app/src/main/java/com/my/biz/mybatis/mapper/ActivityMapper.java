package com.my.biz.mybatis.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.my.biz.vo.activityVO;

public interface ActivityMapper {
	/*int indexnumber;
	String id;
	int category_num;
	String fixed;
	Date a_date;
	String a_type;
*/
//crud
	
	@Insert("INSERT INTO ASSET_ACTIVITY (INDEXNUMBER,ID,CATEGORY_NUM,FIXED,A_DATE,A_TYPE) VALUES (#{indexnumber},#{id},#{category_num},#{fixed},#{a_date},#{a_type})")
	int insertActivity(activityVO vo);
	
	@Delete("DELETE FROM ASSET_ACTIVITY WHERE INDEXNUMBER=#{indexnumber}")
	int deleteActivity(activityVO vo);
	
	@Update("UPDATE ASSET_ACTIVITY SET CATEGORY_NUM=#{category_num}, FIXED=#{fixed}, A_DATE=#{a_date},A_TYPE=#{a_type} WHERE INDEXNUMBER=#{indexnumber}")
	int updateActivity(activityVO vo);
	
	@Select("SELECT * FROM ASSET_ACTIVITY")
	List<activityVO> selectAllActivities();
	
	//@Select("SELECT * FROM ACTIVITY WHERE ID=#{id}")
	
}
