package com.my.biz.vo;

import java.sql.Date;

public class TargetVO {
	int indexnumber;
	String id;
	String reason;
	int amount;
	Date deadline;
	public TargetVO() {
		super();
	}
	public TargetVO(int indexnumber, String id, String reason, int amount, Date deadline) {
		super();
		this.indexnumber = indexnumber;
		this.id = id;
		this.reason = reason;
		this.amount = amount;
		this.deadline = deadline;
	}
	public int getIndexnumber() {
		return indexnumber;
	}
	public void setIndexnumber(int indexnumber) {
		this.indexnumber = indexnumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("targetVO [indexnumber=");
		builder.append(indexnumber);
		builder.append(", id=");
		builder.append(id);
		builder.append(", reason=");
		builder.append(reason);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", deadline=");
		builder.append(deadline);
		builder.append("]");
		return builder.toString();
	}
	
	
}
