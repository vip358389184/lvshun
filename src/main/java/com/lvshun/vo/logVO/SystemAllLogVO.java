package com.lvshun.vo.logVO;

import java.sql.Timestamp;

public class SystemAllLogVO {
	 private String hostname;
	 private String hostip;
	 private Timestamp scantime;
	 private String cpu_used;
	 private String mem_total;
	 private String mem_used;
	 private String net_name;
	 private String net_used;
	 private String net_err;
	 private String net_drop;
	 private String hd_name1;
	 private String hd_used1;
	 private String hd_name2;
	 private String hd_used2;
	 private String hd_name3;
	 private String hd_used3;
	 private int status;
	/**
	 * @return the 主机名
	 */
	public String getHostname() {
		return hostname;
	}
	/**
	 * @param hostname the 主机名 to set
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	/**
	 * @return the 主机IP
	 */
	public String getHostip() {
		return hostip;
	}
	/**
	 * @param hostip the 主机IP to set
	 */
	public void setHostip(String hostip) {
		this.hostip = hostip;
	}
	/**
	 * @return the 扫描时间
	 */
	public Timestamp getScantime() {
		return scantime;
	}
	/**
	 * @param scantime the 扫描时间 to set
	 */
	public void setScantime(Timestamp scantime) {
		this.scantime = scantime;
	}
	/**
	 * @return the CPU使用率
	 */
	public String getCpu_used() {
		return cpu_used;
	}
	/**
	 * @param cpu_used the CPU使用率 to set
	 */
	public void setCpu_used(String cpu_used) {
		this.cpu_used = cpu_used;
	}
	/**
	 * @return the 内存总量（GB）
	 */
	public String getMem_total() {
		return mem_total;
	}
	/**
	 * @param mem_total the 内存总量（GB） to set
	 */
	public void setMem_total(String mem_total) {
		this.mem_total = mem_total;
	}
	/**
	 * @return the 内存使用率
	 */
	public String getMem_used() {
		return mem_used;
	}
	/**
	 * @param mem_used the 内存使用率 to set
	 */
	public void setMem_used(String mem_used) {
		this.mem_used = mem_used;
	}
	/**
	 * @return the 网卡名称
	 */
	public String getNet_name() {
		return net_name;
	}
	/**
	 * @param net_name the 网卡名称 to set
	 */
	public void setNet_name(String net_name) {
		this.net_name = net_name;
	}
	/**
	 * @return the 网口数据流量（Mb/s)
	 */
	public String getNet_used() {
		return net_used;
	}
	/**
	 * @param net_used the 网口数据流量（Mb/s) to set
	 */
	public void setNet_used(String net_used) {
		this.net_used = net_used;
	}
	/**
	 * @return the 网口错误包数据
	 */
	public String getNet_err() {
		return net_err;
	}
	/**
	 * @param net_err the 网口错误包数据 to set
	 */
	public void setNet_err(String net_err) {
		this.net_err = net_err;
	}
	/**
	 * @return the 网口丢弃包数据
	 */
	public String getNet_drop() {
		return net_drop;
	}
	/**
	 * @param net_drop the 网口丢弃包数据 to set
	 */
	public void setNet_drop(String net_drop) {
		this.net_drop = net_drop;
	}
	/**
	 * @return the 硬盘分区1
	 */
	public String getHd_name1() {
		return hd_name1;
	}
	/**
	 * @param hd_name1 the 硬盘分区1 to set
	 */
	public void setHd_name1(String hd_name1) {
		this.hd_name1 = hd_name1;
	}
	/**
	 * @return the 硬盘分区1使用率
	 */
	public String getHd_used1() {
		return hd_used1;
	}
	/**
	 * @param hd_used1 the 硬盘分区1使用率 to set
	 */
	public void setHd_used1(String hd_used1) {
		this.hd_used1 = hd_used1;
	}
	/**
	 * @return the 硬盘分2
	 */
	public String getHd_name2() {
		return hd_name2;
	}
	/**
	 * @param hd_name2 the 硬盘分2 to set
	 */
	public void setHd_name2(String hd_name2) {
		this.hd_name2 = hd_name2;
	}
	/**
	 * @return the 硬盘分区2使用率
	 */
	public String getHd_used2() {
		return hd_used2;
	}
	/**
	 * @param hd_used2 the 硬盘分区2使用率 to set
	 */
	public void setHd_used2(String hd_used2) {
		this.hd_used2 = hd_used2;
	}
	/**
	 * @return the 硬盘分区3
	 */
	public String getHd_name3() {
		return hd_name3;
	}
	/**
	 * @param hd_name3 the 硬盘分区3 to set
	 */
	public void setHd_name3(String hd_name3) {
		this.hd_name3 = hd_name3;
	}
	/**
	 * @return the 硬盘分区3使用率
	 */
	public String getHd_used3() {
		return hd_used3;
	}
	/**
	 * @param hd_used3 the 硬盘分区3使用率 to set
	 */
	public void setHd_used3(String hd_used3) {
		this.hd_used3 = hd_used3;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public SystemAllLogVO(String hostname, String hostip, Timestamp scantime,
			String cpu_used, String mem_total, String mem_used,
			String net_name, String net_used, String net_err, String net_drop,
			String hd_name1, String hd_used1, String hd_name2, String hd_used2,
			String hd_name3, String hd_used3, int status) {
		this.hostname = hostname;
		this.hostip = hostip;
		this.scantime = scantime;
		this.cpu_used = cpu_used;
		this.mem_total = mem_total;
		this.mem_used = mem_used;
		this.net_name = net_name;
		this.net_used = net_used;
		this.net_err = net_err;
		this.net_drop = net_drop;
		this.hd_name1 = hd_name1;
		this.hd_used1 = hd_used1;
		this.hd_name2 = hd_name2;
		this.hd_used2 = hd_used2;
		this.hd_name3 = hd_name3;
		this.hd_used3 = hd_used3;
		this.status = status;
	}
	public SystemAllLogVO() {


	}
	@Override
	public String toString() {
		return "SystemAllLogVO [hostname=" + hostname + ", hostip=" + hostip
				+ ", scantime=" + scantime + ", cpu_used=" + cpu_used
				+ ", mem_total=" + mem_total + ", mem_used=" + mem_used
				+ ", net_name=" + net_name + ", net_used=" + net_used
				+ ", net_err=" + net_err + ", net_drop=" + net_drop
				+ ", hd_name1=" + hd_name1 + ", hd_used1=" + hd_used1
				+ ", hd_name2=" + hd_name2 + ", hd_used2=" + hd_used2
				+ ", hd_name3=" + hd_name3 + ", hd_used3=" + hd_used3
				+ ", status=" + status + "]";
	}
	
}
