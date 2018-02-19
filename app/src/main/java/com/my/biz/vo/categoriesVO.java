package com.my.biz.vo;

public class categoriesVO {
	int category_num; // index임 걍
	String category_name;

	public categoriesVO() {
		super();
	}

	public categoriesVO(int category_num, String category_name) {
		super();
		this.category_num = category_num;
		this.category_name = category_name;
	}

	public int getCategory_num() {
		return category_num;
	}

	public void setCategory_num(int category_num) {
		this.category_num = category_num;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("categoriesVO [category_num=");
		builder.append(category_num);
		builder.append(", category_name=");
		builder.append(category_name);
		builder.append("]");
		return builder.toString();
	}

}
