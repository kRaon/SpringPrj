package com.my.biz.service;

import java.util.List;

import com.my.biz.vo.CategoriesVO;

public interface CategoriesService {
	
	int insertCategories(CategoriesVO vo);
	int deleteCategories(int category_num);
	List<CategoriesVO> selectAllcategories();
		
}
