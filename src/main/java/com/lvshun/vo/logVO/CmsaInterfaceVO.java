package com.lvshun.vo.logVO;

public class CmsaInterfaceVO {
	private String name;
	private int enable;
	private int filecount;
	private int error_count;
	private String tag;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	public int getFilecount() {
		return filecount;
	}
	public void setFilecount(int filecount) {
		this.filecount = filecount;
	}
	public int getError_count() {
		return error_count;
	}
	public void setError_count(int error_count) {
		this.error_count = error_count;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public CmsaInterfaceVO() {
	}
	public CmsaInterfaceVO(String name, int enable, int filecount,
			int error_count, String tag) {
		this.name = name;
		this.enable = enable;
		this.filecount = filecount;
		this.error_count = error_count;
		this.tag = tag;
	}
	
	
	
}
