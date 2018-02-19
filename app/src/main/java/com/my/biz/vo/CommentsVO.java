package com.my.biz.vo;

import java.util.Date;

public class CommentsVO {

	int indexnumber;
	String board_id;
	String id;
	String contents;
	Date reg_date;
	int accept;

	public CommentsVO() {
		super();
	}

	public CommentsVO(int indexnumber, String board_id, String id, String contents, Date reg_date, int accept) {
		super();
		this.indexnumber = indexnumber;
		this.board_id = board_id;
		this.id = id;
		this.contents = contents;
		this.reg_date = reg_date;
		this.accept = accept;
	}

	public int getIndexnumber() {
		return indexnumber;
	}

	public void setIndexnumber(int indexnumber) {
		this.indexnumber = indexnumber;
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

	public int getAccept() {
		return accept;
	}

	public void setAccept(int accept) {
		this.accept = accept;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("commentsVO [indexnumber=");
		builder.append(indexnumber);
		builder.append(", board_id=");
		builder.append(board_id);
		builder.append(", id=");
		builder.append(id);
		builder.append(", contents=");
		builder.append(contents);
		builder.append(", reg_date=");
		builder.append(reg_date);
		builder.append(", accept=");
		builder.append(accept);
		builder.append("]");
		return builder.toString();
	}

}
