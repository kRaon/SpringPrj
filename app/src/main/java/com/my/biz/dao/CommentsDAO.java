package com.my.biz.dao;

import java.util.List;

import com.my.biz.vo.CommentsVO;

public interface CommentsDAO {
	public int insertComment(CommentsVO vo);

	public int deleteComment(CommentsVO vo);

	public int updateComment(CommentsVO vo);

	public List<CommentsVO> selectAllComments();

	public List<CommentsVO> selectComments(String board_id);
}
