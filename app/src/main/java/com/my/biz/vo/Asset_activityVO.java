package com.my.biz.vo;

import java.sql.Date;

public class Asset_activityVO {

	/*
	 * CREATE TABLE ASSET_ACTIVITY( INDEXNUMBER NUMBER(10) NULL , ID VARCHAR2(30)
	 * NULL , CATEGORY_NUM NUMBER(10) NULL , FIXED VARCHAR2(20) NULL , A_DATE DATE
	 * NULL , A_TYPE VARCHAR2(20) NULL );
	 */

	int indexnumber;
	String id;
	int category_num;
	String fixed;
	Date a_date;
	String a_type;

	public Asset_activityVO() {
		super();
	}

	public Asset_activityVO(int indexnumber, String id, int category_num, String fixed, Date a_date, String a_type) {
		super();
		this.indexnumber = indexnumber;
		this.id = id;
		this.category_num = category_num;
		this.fixed = fixed;
		this.a_date = a_date;
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

	public String getFixed() {
		return fixed;
	}

	public void setFixed(String fixed) {
		this.fixed = fixed;
	}

	public Date getA_date() {
		return a_date;
	}

	public void setA_date(Date a_date) {
		this.a_date = a_date;
	}

	public String getA_type() {
		return a_type;
	}

	public void setA_type(String a_type) {
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
		builder.append(", fixed=");
		builder.append(fixed);
		builder.append(", a_date=");
		builder.append(a_date);
		builder.append(", a_type=");
		builder.append(a_type);
		builder.append("]");
		return builder.toString();
	}
}
