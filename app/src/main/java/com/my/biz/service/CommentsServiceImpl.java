package com.my.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.biz.dao.CommentsDAO;
import com.my.biz.vo.CommentsVO;

@Service("CommentsService")
public class CommentsServiceImpl implements CommentsService{
	
	@Autowired
	@Qualifier("Comments_mybatis")
	CommentsDAO dao=null;
	
	
	@Override
	public int insertComment(CommentsVO vo) {
		
		return dao.insertComment(vo);
	}

	@Override
	public int deleteComment(int indexnumber) {
		// TODO Auto-generated method stub
		return dao.deleteComment(indexnumber);
	}

	@Override
	public int updateComment(CommentsVO vo) {
		// TODO Auto-generated method stub
		return dao.updateComment(vo);
	}

	@Override
	public List<CommentsVO> selectAllComments() {
		// TODO Auto-generated method stub
		return dao.selectAllComments();
	}

	@Override
	public List<CommentsVO> selectComments(String board_id) {
		// TODO Auto-generated method stub
		return dao.selectComments(board_id);
	}


}
