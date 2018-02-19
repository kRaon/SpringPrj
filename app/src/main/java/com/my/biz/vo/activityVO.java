package com.my.biz.vo;

import java.sql.Date;

public class activityVO {

	int indexnumber;
	String id;
	int category_num;
	Date con_date;
	int fixed; // 0 : 변동 1: 고정
	int a_type; // 0 : 수입 1: 지출
	public activityVO() {
		super();
	}
	public activityVO(int indexnumber, String id, int category_num, Date con_date, int fixed, int a_type) {
		super();
		this.indexnumber = indexnumber;
		this.id = id;
		this.category_num = category_num;
		this.con_date = con_date;
		this.fixed = fixed;
		this.a_type = a_type;
	}
	public int getIndexnumber() {
		return indexnumber;
	}
	public void setIndexnumber(int indexnumber) {
		this.indexnumber = indexnumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCategory_num() {
		return category_num;
	}
	public void setCategory_num(int category_num) {
		this.category_num = category_num;
	}
	public Date getCon_date() {
		return con_date;
	}
	public void setCon_date(Date con_date) {
		this.con_date = con_date;
	}
	public int getFixed() {
		return fixed;
	}
	public void setFixed(int fixed) {
		this.fixed = fixed;
	}
	public int getA_type() {
		return a_type;
	}
	public void setA_type(int a_type) {
		this.a_type = a_type;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("activityVO [indexnumber=");
		builder.append(indexnumber);
		builder.append(", id=");
		builder.append(id);
		builder.append(", category_num=");
		builder.append(category_num);
		builder.append(", con_date=");
		builder.append(con_date);
		builder.append(", fixed=");
		builder.append(fixed);
		builder.append(", a_type=");
		builder.append(a_type);
		builder.append("]");
		return builder.toString();
	}

	
}
