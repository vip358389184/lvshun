package com.lvshun.vo.logVO;

import java.sql.Timestamp;

public class SystemProcessLogVO {
	
	
	private int id;
	private Timestamp time;
	private String hostname;
	private String process;
	private int status;
	
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
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public SystemProcessLogVO(int id, Timestamp time, String hostname,
			String process, int status) {
		this.id = id;
		this.time = time;
		this.hostname = hostname;
		this.process = process;
		this.status = status;
	}
	
	public SystemProcessLogVO() {
	}
	
	@Override
	public String toString() {
		return "SystemProcessLogVO [id=" + id + ", time=" + time
				+ ", hostname=" + hostname + ", process=" + process
				+ ", status=" + status + "]";
	}	
	
}
