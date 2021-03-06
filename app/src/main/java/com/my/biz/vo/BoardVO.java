package com.my.biz.vo;

import java.sql.Date;
import java.util.ArrayList;

public class BoardVO {

	String board_id;
	String id;
	String contents;
	String billscontents;
	Date reg_date;
	int count; 
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public BoardVO(String board_id, String id, String contents, String billscontents, Date reg_date) {
		super();
		this.board_id = board_id;
		this.id = id;
		this.contents = contents;
		this.billscontents = billscontents;
		this.reg_date = reg_date;
	}

	public BoardVO() {
		super();
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

	public String getBillscontents() {
		return billscontents;
	}

	public void setBillscontents(String billscontents) {
		this.billscontents = billscontents;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "BoardVO [board_id=" + board_id + ", id=" + id + ", contents=" + contents + ", billscontents="
				+ billscontents + ", reg_date=" + reg_date + ", count=" + count + "]";
	}

	

	// String commentsnumbers;

}
