package com.my.biz.vo;


public class Asset_CounselorVO2 {
	String birth_date;//DB에서 받아올 놈
	String amount;//DB에서 받아올 월평균소득*12
	int age;//컨트롤러에서 출력으로 나갈 놈
	String income;//컨트롤러에서 출력으로 나갈 놈
	String disposable;//컨트롤러에서 출력으로 나갈 놈
	String fund;//컨트롤러에서 출력으로 나갈 놈
	String assetsum;//컨트롤러에서 출력으로 나갈 놈


	public Asset_CounselorVO2() {
		super();
	}

	public Asset_CounselorVO2(String birth_date, String amount, int age, String income, String disposable, String fund,
			String assetsum) {
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



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getIncome() {
		return income;
	}



	public void setIncome(String income) {
		this.income = income;
	}



	public String getDisposable() {
		return disposable;
	}



	public void setDisposable(String disposable) {
		this.disposable = disposable;
	}



	public String getFund() {
		return fund;
	}



	public void setFund(String fund) {
		this.fund = fund;
	}



	public String getAssetsum() {
		return assetsum;
	}



	public void setAssetsum(String assetsum) {
		this.assetsum = assetsum;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asset_CounselorVO2 [birth_date=");
		builder.append(birth_date);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", age=");
		builder.append(age);
		builder.append(", income=");
		builder.append(income);
		builder.append(", disposable=");
		builder.append(disposable);
		builder.append(", fund=");
		builder.append(fund);
		builder.append(", assetsum=");
		builder.append(assetsum);
		builder.append("]");
		return builder.toString();
	}

}
