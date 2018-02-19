package com.my.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.CategoriesDAO;
import com.my.biz.vo.CategoriesVO;

@Service("CategoriesService")
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	@Qualifier("Categories_mybatis")
	CategoriesDAO dao = null;
	
	
	@Override
	public int insertCategories(CategoriesVO vo) {
		// TODO Auto-generated method stub
		return dao.insertCategories(vo);
	}

	@Override
	public int deleteCategories(int category_num) {
		// TODO Auto-generated method stub
		return dao.deleteCategories(category_num);
	}

	@Override
	public List<CategoriesVO> selectAllcategories() {
		// TODO Auto-generated method stub
		return dao.selectAllcategories();
	}
	

	
}
