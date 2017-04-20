package com.lvshun.vo.logVO;


public class LogVO {
	private  long id;
	private String userName;
	private String description;
	private long time;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public LogVO(long id, String userName, String description, long time) {
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.time = time;
	}
	public LogVO() {}
	
	
	@Override
	public String toString() {
		return "Log [id=" + id + ", userName=" + userName + ", description="
				+ description + ", time=" + time + "]";
	}
	
}
