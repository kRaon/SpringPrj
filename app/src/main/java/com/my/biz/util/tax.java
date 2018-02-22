package com.my.biz.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.my.biz.vo.Asset_CounselorVO;

public class tax {
	long income;

	public tax() {
		super();
	}
	public tax(long income) {
		super();
		this.income = income;
	}

	public double calctax(long income) {
		double tax = 0;

		if (income < 0) {
			System.out.println("Wrong State : income is '-' ");
			return tax;
		}

		if (income <= 12000000) {
			tax = income * 0.06;
		} else if (income > 12000000 && income <= 46000000) {
			tax = (income - 12000000) * 0.15 + 720000;
		} else if (income > 46000000 && income <= 88000000) {
			tax = (income - 46000000) * 0.24 + 5820000;
		} else if (income > 88000000 && income <= 150000000) {
			tax = (income - 88000000) * 0.35 + 15900000;
		} else if (income > 150000000 && income <= 300000000) {
			tax = (income - 150000000) * 0.38 + 37600000;
		} else if (income > 300000000 && income <= 500000000) {
			tax = (income - 300000000) * 0.40 + 94600000;
		} else {
			tax = (income - 500000000) * 0.42 + 174600000;
		}

		return tax;
	}
	public List<Asset_CounselorVO> makedata(int birth_date,int amount,int untilyear,int savingrate,int interestrate,int increaserate)
	{
		List<Asset_CounselorVO> list=new ArrayList<Asset_CounselorVO>();
		Calendar c = Calendar.getInstance();

		birth_date = 1992;
		amount = 50000000;
		untilyear = 30;
		savingrate = 40;
		interestrate = 5;
		increaserate = 5;
		
		long assetsum = 0;

		for (int i = 0; i <= untilyear; i++) {
			int age = (1 + c.get(Calendar.YEAR) - birth_date + i);
			int income = (int) (amount * Math.pow((increaserate + 100) * 0.01, i));
			double tax = new tax().calctax(income);
			long disposable = income - (long)tax;
			long fund = (long) (disposable * (savingrate * 0.01));
			long asset = (long) (fund * Math.pow((interestrate + 100) * 0.01, i));

			assetsum += asset;
			/*
		public Asset_CounselorVO(int age, int income, long disposable, long fund, long assetsum) {
		super();
		this.age = age;
		this.income = income;
		this.disposable = disposable;
		this.fund = fund;
		this.assetsum = assetsum;
	}
			 */
			list.add(new Asset_CounselorVO(age,income,disposable,fund,assetsum));
			/*System.out.println("========= " + i + " 년 =========");
			System.out.println("나이 : " + (age));
			System.out.println("소득 : " + income);
			System.out.println("가처분소득 : " + disposable);
			System.out.println("자본금 : " + fund);
			System.out.println("나의 자산 : " + asset);
			System.out.println("나의 자산 총액 : " + assetsum);
*/
		}
		return list;	
	}
	
	
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();

		int birth_date = 1992;
		int amount = 50000000;
		int untilyear = 30;
		int savingrate = 40;
		int interestrate = 5;
		int increaserate = 5;
		
		long assetsum = 0;

		for (int i = 0; i <= untilyear; i++) {
			int age = (1 + c.get(Calendar.YEAR) - birth_date + i);
			long income = (long) (amount * Math.pow((increaserate + 100) * 0.01, i));
			double tax = new tax().calctax(income);
			long disposable = income - (long)tax;
			long fund = (long) (disposable * (savingrate * 0.01));
			long asset = (long) (fund * Math.pow((interestrate + 100) * 0.01, i));

			assetsum += asset;
			
			System.out.println("========= " + i + " 년 =========");
			System.out.println("나이 : " + (age));
			System.out.println("소득 : " + income);
			System.out.println("가처분소득 : " + disposable);
			System.out.println("자본금 : " + fund);
			System.out.println("나의 자산 : " + asset);
			System.out.println("나의 자산 총액 : " + assetsum);

		}

	}
}
