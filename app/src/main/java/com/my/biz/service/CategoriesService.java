package com.my.biz.service;

import java.util.List;

import com.my.biz.vo.categoriesVO;

public interface CategoriesService {
	
	int insertCategories(categoriesVO vo);
	int deleteCategories(int category_num);
	List<categoriesVO> selectAllcategories();
		
}
