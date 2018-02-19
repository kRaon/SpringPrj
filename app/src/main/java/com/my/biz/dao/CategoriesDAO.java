package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.CategoriesVO;

public interface CategoriesDAO {

	
	int insertCategories(CategoriesVO vo);
	int deleteCategories(int category_num);
	List<CategoriesVO> selectAllcategories();
		
}
