package com.my.biz.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_activityVO;

public interface Asset_activityMapper {
	/*
	int indexnumber;
	String id;
	int category_num;
	String contents;
	int amount;
	String fixed;
	Date a_date;
	String a_type;
	String category_name;
*/
//crud
	//indexnumber=0, id=qwq713, category_num=2, contents=11, amount=125555, fixed=yes, a_date=2018-02-21, a_type=expense
	@Insert("INSERT INTO ASSET_ACTIVITY (INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE) VALUES ((select MAX(NVL(INDEXNUMBER,0))+1 from ASSET_ACTIVITY),#{id},#{category_num},#{contents},#{amount},#{fixed},#{a_date},#{a_type})")
	int insertActivity(Asset_activityVO vo);
	
	@Delete("DELETE FROM ASSET_ACTIVITY WHERE INDEXNUMBER=#{indexnumber}")
	//int deleteActivity(Asset_activityVO vo);
	int deleteActivity(int num);
	
	@Update("UPDATE ASSET_ACTIVITY SET CATEGORY_NUM=#{category_num}, FIXED=#{fixed}, A_DATE=#{a_date},A_TYPE=#{a_type} WHERE INDEXNUMBER=#{indexnumber}")
	int updateActivity(Asset_activityVO vo);
	
	@Select("SELECT * FROM ASSET_ACTIVITY")
	List<Asset_activityVO> selectAllActivities();
	/*
	@Select("SELECT INDEXNUMBER,ID,A.CATEGORY_NUM AS CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM;")
	List<Asset_activityVO2> selectAllActivitiesName();*/
	
	@Select("SELECT INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM ")
	List<ActivityCategoriesVO> selectAllActivityCatrgories();
 
	
	/*select INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME
	from(SELECT INDEXNUMBER,ID,A.CATEGORY_NUM AS CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME
			FROM ASSET_ACTIVITY A,CATEGORIES C
			WHERE A.CATEGORY_NUM=C.CATEGORY_NUM);*/

	@Select("SELECT CATEGORY_NUM FROM ASSET_ACTIVITY WHERE CATEGORY_NAME=#{category_name}")
	int selectActivityNum(String category_name);
	
	@Select("SELECT * FROM ASSET_ACTIVITY WHERE ID=#{id}")
	List<Asset_activityVO> selectIdActivity();
	
	//@Select("SELECT * FROM ACTIVITY WHERE ID=#{id}")
	
}
