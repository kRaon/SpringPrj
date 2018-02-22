package com.my.biz.vo;


public class Asset_CounselorVO {
	String birth_date;//DB에서 받아올 놈
	int amount;//DB에서 받아올 월평균소득*12
	int age;//컨트롤러에서 출력으로 나갈 놈
	int income;//컨트롤러에서 출력으로 나갈 놈
	long disposable;//컨트롤러에서 출력으로 나갈 놈
	long fund;//컨트롤러에서 출력으로 나갈 놈
	long assetsum;//컨트롤러에서 출력으로 나갈 놈

	
	
	public Asset_CounselorVO() {
		super();
	}

	//db에서 받아올 때 쓸 놈
	public Asset_CounselorVO(String birth_date, int amount) {
		super();
		this.birth_date = birth_date;
		this.amount = amount;
	}
	
	//controller에서 보낼때 쓸 놈
	public Asset_CounselorVO(int age, int income, long disposable, long fund, long assetsum) {
		super();
		this.age = age;
		this.income = income;
		this.disposable = disposable;
		this.fund = fund;
		this.assetsum = assetsum;
	}

	@Override
	public String toString() {
		return "Asset_CounselorVO [birth_date=" + birth_date + ", amount=" + amount + ", age=" + age + ", income="
				+ income + ", disposable=" + disposable + ", fund=" + fund + ", assetsum=" + assetsum + "]";
	}
	
	
}
