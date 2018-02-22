package DAO_TEST;

public class tax {
	long income;

	public tax(long income) {
		super();
		this.income = income;
	}

	public double calctax() {
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

	public static void main(String[] args) {

		int year = 20;
		int savingrate = 40;
		int interestrate = 5;
		int increaserate = 10;
		long assetsum = 0;
		
		double test = (increaserate+100)*0.01;
		double test2 = Math.pow((increaserate+100)*0.01, 2);
		long income2 = (long)(30000000 * Math.pow((increaserate+100)*0.01, 2));
		System.out.println("income2 : "+income2);
		System.out.println("test2 : "+test2);
		System.out.println("test : "+test);

		for (int i = 1; i <= year; i++) {
			System.out.println("========= " + i + " 년 =========");
			long income = (long)(30000000 * Math.pow((increaserate+100)*0.01, i));
			tax tax = new tax(income);
			long disposable = tax.income - (long) tax.calctax();
			long fund = (long) (disposable * (savingrate * 0.01));
			long asset = (long) (fund * Math.pow((interestrate + 100) * 0.01, i));

				assetsum += asset;
			
			System.out.println("가처분소득 : " + disposable);
			System.out.println("자본금 : " + fund);
			System.out.println("나의 자산 : " + asset);
			System.out.println("나의 자산 총액 : " + assetsum);

		}

	}
}
