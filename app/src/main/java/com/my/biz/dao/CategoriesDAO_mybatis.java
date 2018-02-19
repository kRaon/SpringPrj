package com.my.biz.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.my.biz.mybatis.mapper.CategoriesMapper;
import com.my.biz.vo.categoriesVO;

@Repository("Categories_mybatis")
public class CategoriesDAO_mybatis implements CategoriesDAO{

	@Autowired
	@Qualifier("sqlSession")
	SqlSession mybatis;
	CategoriesMapper mapper;
	
	
	
	public SqlSession getMybatis() {
		return mybatis;
	}

	public void setMybatis(SqlSession mybatis) {
		this.mybatis = mybatis;
	}

	public CategoriesMapper getMapper() {
		return mapper;
	}

	public void setMapper(CategoriesMapper mapper) {
		this.mapper = mapper;
	}

	public CategoriesDAO_mybatis(SqlSession mybatis, CategoriesMapper mapper) {
		super();
		this.mybatis = mybatis;
		this.mapper = mapper;
	}

	public CategoriesDAO_mybatis() {
		super();
	}
	@PostConstruct
	void init() {
		mapper = mybatis.getMapper(CategoriesMapper.class);
		
	}
	
	@Override
	public int insertCategories(categoriesVO vo) {
		// TODO Auto-generated method stub
		return mapper.insertCategories(vo);
	}

	@Override
	public int deleteCategories(int category_num) {
		// TODO Auto-generated method stub
		return mapper.deleteCategories(category_num);
	}

	@Override
	public List<categoriesVO> selectAllcategories() {
		// TODO Auto-generated method stub
		return mapper.selectAllcategories();
	}

}
