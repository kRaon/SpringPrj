package com.my.biz.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.my.biz.vo.ActivityCategoriesVO;
import com.my.biz.vo.Asset_activityVO;
import com.my.biz.vo.ChartVO;

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
*/
//crud
	//indexnumber=0, id=qwq713, category_num=2, contents=11, amount=125555, fixed=yes, a_date=2018-02-21, a_type=expense
	@Insert("INSERT INTO ASSET_ACTIVITY (INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE) VALUES (SEQUENCE1.NEXTVAL,#{id},#{category_num},#{contents},#{amount},#{fixed},#{a_date},#{a_type})")
	int insertActivity(Asset_activityVO vo);
	
	@Delete("DELETE FROM ASSET_ACTIVITY WHERE INDEXNUMBER=#{indexnumber}")
	//int deleteActivity(Asset_activityVO vo);
	int deleteActivity(int num);
	
	@Update("UPDATE ASSET_ACTIVITY SET CATEGORY_NUM=#{category_num}, FIXED=#{fixed}, A_DATE=#{a_date},A_TYPE=#{a_type} WHERE INDEXNUMBER=#{indexnumber}")
	int updateActivity(Asset_activityVO vo);
	
	@Select("SELECT * FROM ASSET_ACTIVITY")
	List<Asset_activityVO> selectAllActivities();

	

	
	@Select("select to_char(A_DATE,'mon') as \"month\", SUM(AMOUNT) as \"amount\" from ASSET_ACTIVITY where id = #{id} and A_TYPE = 'expense' and to_char(a_date,'yyyymmdd') BETWEEN #{fromdate} and #{todate} GROUP by to_char(A_DATE,'mon') order by 'month' desc")
	List<ChartVO> selectBarChart(Map<String,String> map);
	
	@Select("select SUM(AMOUNT) as \"amount\", C.CATEGORY_NAME as \"category_name\" from ASSET_ACTIVITY A, CATEGORIES C where id = #{id} and A.CATEGORY_NUM = C.CATEGORY_NUM and A_TYPE = 'expense' and to_char(A.A_DATE,'YYYYMMDD') BETWEEN #{fromdate} and #{todate} GROUP by C.CATEGORY_NAME")
	List<ChartVO> selectPieChart(Map<String,String> map);
	

	@Select("SELECT INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME " + 
			"FROM(SELECT INDEXNUMBER,ID,A.CATEGORY_NUM AS CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME " + 
			"FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM)")
	List<ActivityCategoriesVO> selectAllActivityCatrgories();


	@Select("SELECT CATEGORY_NUM FROM ASSET_ACTIVITY WHERE CATEGORY_NAME=#{category_name}")
	int selectActivityNum(String category_name);
	
	@Select("SELECT * FROM ASSET_ACTIVITY WHERE ID=#{id}")
	List<Asset_activityVO> selectIdActivity();
	
	@Select("SELECT INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME " + 
			"FROM(SELECT INDEXNUMBER,ID,A.CATEGORY_NUM AS CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME " + 
			"FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM AND ID=#{id})")
	List<ActivityCategoriesVO> selectAllActivityCatrgories_id(String id);
	
	@Select("SELECT INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME FROM(SELECT INDEXNUMBER,ID,A.CATEGORY_NUM AS CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM AND ID=#{id} and to_char(A.A_DATE,'YYYYMMDD') BETWEEN #{fromdate} and #{todate})")
	List<ActivityCategoriesVO> selectDateActivityCatrgories_id(Map<String,String> map);
	
}