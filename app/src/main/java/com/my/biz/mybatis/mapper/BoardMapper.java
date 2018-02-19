package com.my.biz.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.my.biz.vo.BoardVO;


public interface BoardMapper {

/*	String board_id;
	String id;
	String contents;
	Date reg_date;
	String activity_numbers; // 영수증 첨부
*/	
	@Insert("INSERT INTO BOARD (board_id,id,contents,reg_date,activity_numbers) VALUES(#{board_id},#{id},#{contents},SYSDATE,#{activity_numbers})")
	public int insertBoard(BoardVO vo);
	
	@Delete("DELETE FROM BOARD WHERE=#{board_id}")
	public int deleteBoard(BoardVO vo);

	@Update("UPDATE BOARD SET CONTENTS=#{contents}, ACTIVITY_NUMBERS=#{activity_numbers} WHERE=#{board_id}")
	public int updateBoard(BoardVO vo);
	
	@Select("SELECT * FROM BOARD")
	public List<BoardVO> selectAllBoard();
	

	
	

	
	
	
}
