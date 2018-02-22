package com.my.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.BoardDAO;
import com.my.biz.vo.BoardVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	@Qualifier("Board_mybatis")
	BoardDAO dao=null;
	
	@Override
	public int insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return dao.insertBoard(vo);
	}

	@Override
	public int deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return dao.deleteBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return dao.updateBoard(vo);
	}

	@Override
	public List<BoardVO> selectAllBoard() {
		// TODO Auto-generated method stub
		return dao.selectAllBoard();
	}

	@Override
	public BoardVO getBoard(String board_id) {
		// TODO Auto-generated method stub
		return dao.getBoard(board_id);
	}

	@Override
	public List<BoardVO> getAllBoard(String id) {
		return dao.getAllBoard(id);
	}

}
