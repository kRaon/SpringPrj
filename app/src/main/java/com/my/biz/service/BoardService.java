package com.my.biz.service;

import java.util.List;

import com.my.biz.vo.BoardVO;

public interface BoardService {
	public int insertBoard(BoardVO vo);

	public int deleteBoard(BoardVO vo);

	public int updateBoard(BoardVO vo);

	public List<BoardVO> selectAllBoard();
}
