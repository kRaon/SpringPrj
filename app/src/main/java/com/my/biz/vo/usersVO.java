package com.my.biz.vo;

public class usersVO {

	String id;
	String pw;
	int age;
	String gender;
	String job;
	int point;

	public usersVO() {
		super();
	}

	public usersVO(String id, String pw, int age, String gender, String job, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.gender = gender;
		this.job = job;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("usersVO [id=");
		builder.append(id);
		builder.append(", pw=");
		builder.append(pw);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", job=");
		builder.append(job);
		builder.append(", point=");
		builder.append(point);
		builder.append("]");
		return builder.toString();
	}

}
