package com.my.biz.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.my.biz.vo.CategoriesVO;

public interface CategoriesMapper {
/*	int category_num; // index임 걍
	String category_name;*/

	@Insert("INSERT INTO CATEGORIES (CATEGORY_NUM, CATEGORY_NAME) VALUES (#{category_num},#{category_name})")
	int insertCategories(CategoriesVO vo);
	
	@Delete("DELETE FROM CATEGORIES WHERE CATEGORY_NUM=#{category_num}")
	int deleteCategories(int category_num);
	
	@Select("SELECT * FROM CATEGORIES")
	List<CategoriesVO> selectAllcategories();
		
}
