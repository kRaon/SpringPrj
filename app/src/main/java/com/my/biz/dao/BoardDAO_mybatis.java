package com.my.biz.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.my.biz.mybatis.mapper.BoardMapper;
import com.my.biz.vo.BoardVO;

@Repository("Board_mybatis")
public class BoardDAO_mybatis implements BoardDAO {

	@Autowired
	@Qualifier("sqlSession")
	SqlSession mybatis;
	BoardMapper mapper;

	public BoardDAO_mybatis() {
		super();
	}

	public BoardDAO_mybatis(SqlSession mybatis, BoardMapper mapper) {
		super();
		this.mybatis = mybatis;
		this.mapper = mapper;
	}

	@PostConstruct
	void init() {
		mapper = mybatis.getMapper(BoardMapper.class);
	}

	@Override
	public int insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.insertBoard(vo);
	}

	@Override
	public int deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.deleteBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.updateBoard(vo);
	}

	
	@Override
	public List<BoardVO> selectAllBoard() {
		// TODO Auto-generated method stub
		return mapper.selectAllBoard();
	}

	
	@Override
	public BoardVO getBoard(String board_id) {
		// TODO Auto-generated method stub
		return mapper.getBoard(board_id);
	}

	@Override
	public List<BoardVO> getAllBoard(String id) {
		
		return mapper.getAllBoard(id);
	}

	

}
