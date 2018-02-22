package com.my.biz.mybatis.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.my.biz.vo.CommentsVO;

public interface CommentsMapper {
/*	int indexnumber;
	String board_id;
	String id;
	String contents;
	Date reg_date;
	int accept;*/
	
	@Insert("INSERT INTO COMMENTS (INDEXNUMBER,BOARD_ID,ID,CONTENTS,REG_DATE,ACCEPT) VALUES(SEQUENCE3.NEXTVAL,#{board_id},#{id},#{contents},sysdate,#{accept})")
	int insertComment(CommentsVO vo);

	@Delete("DELETE FROM COMMENTS WHERE INDEXNUMBER = #{indexnumber}")
	int deleteComment(int indexnumber);

	@Update("UPDATE COMMENTS SET CONTENTS=#{contents} WHERE INDEXNUMBER=#{indexnumber}")
	int updateComment(CommentsVO vo);

	@Select("SELECT * FROM COMMENTS")
	List<CommentsVO> selectAllComments();
	
	@Select("SELECT * FROM COMMENTS WHERE BOARD_ID=#{board_id} order by indexnumber desc")
	List<CommentsVO> selectComments(String board_id);
	
	
}
