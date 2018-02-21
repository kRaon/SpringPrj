package com.my.biz.vo;

import java.sql.Date;

public class ActivityCategoriesVO {

	int indexnumber;
	String id;
	String category_name;
	String contents;
	int amount;
	String fixed;
	Date a_date;
	String a_type;

	public ActivityCategoriesVO() {
		super();
	}

	public ActivityCategoriesVO(int indexnumber, String id, String category_name, String contents, int amount,
			String fixed, Date a_date, String a_type) {
		super();
		this.indexnumber = indexnumber;
		this.id = id;
		this.category_name = category_name;
		this.contents = contents;
		this.amount = amount;
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

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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
		return "ActivityCategoriesVO [indexnumber=" + indexnumber + ", id=" + id + ", category_name=" + category_name
				+ ", contents=" + contents + ", amount=" + amount + ", fixed=" + fixed + ", a_date=" + a_date
				+ ", a_type=" + a_type + "]";
	}

}
