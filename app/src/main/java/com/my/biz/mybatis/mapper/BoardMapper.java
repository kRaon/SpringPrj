package com.my.biz.mybatis.mapper;

import java.sql.Date;
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
	String billscontents;
	Date reg_date;
*/	
	@Insert("INSERT INTO BOARD (board_id,id,contents,billscontents,reg_date) VALUES(#{board_id},#{id},#{contents},#{billscontents},SYSDATE)")
	public int insertBoard(BoardVO vo);
	
	@Delete("DELETE FROM BOARD WHERE=#{board_id}")
	public int deleteBoard(BoardVO vo);

	@Update("UPDATE BOARD SET CONTENTS=#{contents}, ACTIVITY_NUMBERS=#{activity_numbers} WHERE=#{board_id}")
	public int updateBoard(BoardVO vo);
	
	@Select("SELECT * FROM BOARD")
	public List<BoardVO> selectAllBoard();
	
	@Select("SELECT * FROM BOARD WHERE BOARD_ID=#{board_id}")
	public BoardVO getBoard(String board_id);
	
	@Select("SELECT * FROM BOARD WHERE id=#{id}")
	public List<BoardVO> getAllBoard(String id); 
	
	
}
