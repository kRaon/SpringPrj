package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.BoardVO;
public interface BoardDAO {
	public int insertBoard(BoardVO vo);

	public int deleteBoard(BoardVO vo);

	public int updateBoard(BoardVO vo);

	public List<BoardVO> selectAllBoard();
	
	public BoardVO getBoard(String board_id);
}
