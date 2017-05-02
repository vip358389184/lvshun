package com.lvshun.po;

import java.math.BigDecimal;

public class Users {
	private String ecId;//
	private String userId;//
	private String type;
	private String password;
	private String nickName;
	private String email;
	private String userName;
	private String phone;
	private String integral;
	private String grade;
	private String joindate;
	private String collect;
	private BigDecimal monetary;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Users() {
		super();
	}

	@Override
	public String toString() {
		return "Users{" +
				"ecId='" + ecId + '\'' +
				", userId='" + userId + '\'' +
				", type='" + type + '\'' +
				", password='" + password + '\'' +
				", nickName='" + nickName + '\'' +
				", email='" + email + '\'' +
				", userName='" + userName + '\'' +
				", phone='" + phone + '\'' +
				", integral='" + integral + '\'' +
				", grade='" + grade + '\'' +
				", joindate='" + joindate + '\'' +
				", collect='" + collect + '\'' +
				", monetary=" + monetary +
				'}';
	}

	public String getEcId() {
		return ecId;
	}
	public void setEcId(String ecId) {
		this.ecId = ecId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIntegral() {
		return integral;
	}
	public void setIntegral(String integral) {
		this.integral = integral;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getCollect() {
		return collect;
	}
	public void setCollect(String collect) {
		this.collect = collect;
	}
	public BigDecimal getMonetary() {
		return monetary;
	}
	public void setMonetary(BigDecimal monetary) {
		this.monetary = monetary;
	} 
	
}
