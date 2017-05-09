package com.lvshun.vo.logVO;

public class SystemInfoVO {
	 private String hostname;
	 private int limitSize;
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public int getLimitSize() {
		return limitSize;
	}
	public void setLimitSize(int limitSize) {
		this.limitSize = limitSize;
	}
	@Override
	public String toString() {
		return "SystemInfoVO [hostname=" + hostname + ", limitSzie="
				+ limitSize + "]";
	}
	public SystemInfoVO() {
	}
	public SystemInfoVO(String hostname, int limitSize) {
		this.hostname = hostname;
		this.limitSize = limitSize;
	}
	
	
}
