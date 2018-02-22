package com.my.biz.vo;

import java.sql.Date;

public class UsersVO {

	String id;
	String pw;
	Date user_date;
	String gender;
	String job;
	int point;
	
	public UsersVO() {
		super();
	}
	public UsersVO(String id, String pw, Date user_date, String gender, String job, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.user_date = user_date;
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
	public Date getUser_date() {
		return user_date;
	}
	public void setUser_date(Date user_date) {
		this.user_date = user_date;
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
		builder.append("UsersVO [id=");
		builder.append(id);
		builder.append(", pw=");
		builder.append(pw);
		builder.append(", user_date=");
		builder.append(user_date);
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
