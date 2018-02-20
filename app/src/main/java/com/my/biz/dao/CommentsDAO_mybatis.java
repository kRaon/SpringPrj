package com.my.biz.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.my.biz.mybatis.mapper.BoardMapper;
import com.my.biz.mybatis.mapper.CommentsMapper;
import com.my.biz.vo.CommentsVO;

@Repository("Comments_mybatis")
public class CommentsDAO_mybatis implements CommentsDAO{
	@Autowired
	@Qualifier("sqlSession")
	SqlSession mybatis;
	CommentsMapper mapper;
	
	
	
	public CommentsDAO_mybatis() {
		super();
	}	
	public CommentsDAO_mybatis(SqlSession mybatis, CommentsMapper mapper) {
		super();
		this.mybatis = mybatis;
		this.mapper = mapper;
	}

	@PostConstruct
	void init() {
		mapper = mybatis.getMapper(CommentsMapper.class);
	}
	
	@Override
	public int insertComment(CommentsVO vo) {
		// TODO Auto-generated method stub
		return mapper.insertComment(vo);
	}

	@Override
	public int deleteComment(int indexnumber) {
		// TODO Auto-generated method stub
		return mapper.deleteComment(indexnumber);
	}

	@Override
	public int updateComment(CommentsVO vo) {
		// TODO Auto-generated method stub
		return mapper.updateComment(vo);
	}

	@Override
	public List<CommentsVO> selectAllComments() {
		// TODO Auto-generated method stub
		return mapper.selectAllComments();
	}

	@Override
	public List<CommentsVO> selectComments(String board_id) {
		// TODO Auto-generated method stub
		return mapper.selectComments(board_id);
	}

}
