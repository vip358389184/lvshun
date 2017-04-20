package com.lvshun.vo.logVO;

import java.sql.Timestamp;

public class SystemALertVO {
	
	private int id;
	private Timestamp time;
	private String hostname;
	private String value;
	private String text;
	private int status;
	private Timestamp starttime;
	private Timestamp endtime;
	private String remarks;
	private int level;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Timestamp getStarttime() {
		return starttime;
	}
	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}
	public Timestamp getEndtime() {
		return endtime;
	}
	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public SystemALertVO() {
	}
	public SystemALertVO(int id, Timestamp time, String hostname, String value,
			String text, int status, Timestamp starttime, Timestamp endtime,
			String remarks, int level) {
		this.id = id;
		this.time = time;
		this.hostname = hostname;
		this.value = value;
		this.text = text;
		this.status = status;
		this.starttime = starttime;
		this.endtime = endtime;
		this.remarks = remarks;
		this.level = level;
	}
	@Override
	public String toString() {
		return "SystemALertVO [id=" + id + ", time=" + time + ", hostname="
				+ hostname + ", value=" + value + ", text=" + text
				+ ", status=" + status + ", starttime=" + starttime
				+ ", endtime=" + endtime + ", remarks=" + remarks + ", level="
				+ level + "]";
	}

}
