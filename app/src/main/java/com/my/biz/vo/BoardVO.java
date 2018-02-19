package com.my.biz.vo;

import java.sql.Date;

public class BoardVO {

	String board_id;
	String id;
	String contents;
	Date reg_date;
	String filesrc; // ?ŒŒ?¼ ì²¨ë??•œ?‹¤ë©? ?•´?‹¹ ?ŒŒ?¼?˜ ì£¼ì†Œ

	public BoardVO() {
		super();
	}

	public BoardVO(String board_id, String id, String contents, Date reg_date, String filesrc) {
		super();
		this.board_id = board_id;
		this.id = id;
		this.contents = contents;
		this.reg_date = reg_date;
		this.filesrc = filesrc;
	}

	public String getBoard_id() {
		return board_id;
	}

	public void setBoard_id(String board_id) {
		this.board_id = board_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getFilesrc() {
		return filesrc;
	}

	public void setFilesrc(String filesrc) {
		this.filesrc = filesrc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("boardVO [board_id=");
		builder.append(board_id);
		builder.append(", id=");
		builder.append(id);
		builder.append(", contents=");
		builder.append(contents);
		builder.append(", reg_date=");
		builder.append(reg_date);
		builder.append(", filesrc=");
		builder.append(filesrc);
		builder.append("]");
		return builder.toString();
	}

}
