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
	
	public Asset_CounselorVO(String birth_date, int amount, int age, int income, long disposable, long fund,
			long assetsum) {
		super();
		this.birth_date = birth_date;
		this.amount = amount;
		this.age = age;
		this.income = income;
		this.disposable = disposable;
		this.fund = fund;
		this.assetsum = assetsum;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public long getDisposable() {
		return disposable;
	}

	public void setDisposable(long disposable) {
		this.disposable = disposable;
	}

	public long getFund() {
		return fund;
	}

	public void setFund(long fund) {
		this.fund = fund;
	}

	public long getAssetsum() {
		return assetsum;
	}

	public void setAssetsum(long assetsum) {
		this.assetsum = assetsum;
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
