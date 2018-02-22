package com.my.biz.vo;

public class Asset_CounselorVO {
	private int age;
	private int amount;
	
	
	public Asset_CounselorVO() {
		super();
	}

	public Asset_CounselorVO(int age, int amount) {
		super();
		this.age = age;
		this.amount = amount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Asset_CounselorVO [age=" + age + ", amount=" + amount + "]";
	}
	
	
	
}
