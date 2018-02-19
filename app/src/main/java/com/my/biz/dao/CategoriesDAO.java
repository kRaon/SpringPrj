package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.categoriesVO;

public interface CategoriesDAO {

	
	int insertCategories(categoriesVO vo);
	int deleteCategories(int category_num);
	List<categoriesVO> selectAllcategories();
		
}
