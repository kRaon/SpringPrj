package com.my.biz.vo;

public class ChartVO implements Comparable<ChartVO>{
	String month;
	int amount;
	
	String category_name;
	
	public ChartVO() {
		super();
	}
	public ChartVO(String month, int amount, String category_name) {
		this.month = month;
		this.amount = amount;
		this.category_name = category_name;
	}
	public ChartVO(String month, int amount) {
		this.month = month;
		this.amount = amount;
	}
	public ChartVO(int amount, String category_name) {
		this.category_name = category_name;
		this.amount = amount;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
	public String toString() {
		return "ChartVO [month=" + month + ", amount=" + amount + ", category_name=" + category_name + "]";
	}

	@Override
	public int compareTo(ChartVO vo) {
		
		
		return this.getMonth().compareTo(vo.getMonth());
	}
	
}
