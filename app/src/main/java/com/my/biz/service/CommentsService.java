package com.my.biz.service;

import java.util.List;

import com.my.biz.vo.BoardVO;
import com.my.biz.vo.CommentsVO;

public interface CommentsService {
	public int insertComment(CommentsVO vo);

	public int deleteComment(CommentsVO vo);

	public int updateComment(CommentsVO vo);

	public List<CommentsVO> selectAllComments();

	public List<CommentsVO> selectComments(String board_id);
}
