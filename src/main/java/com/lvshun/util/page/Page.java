package com.lvshun.util.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author 于文扬
 * @version 1.0
 */

public class Page<T> {
	  	private int pageNo;//页码，默认是第一页  
	    private int pageSize;//每页显示的记录数，默认是15  
	    private int totalRecord;//总记录数  
	    private int totalPage;//总页数  
	    private List<T> results;//对应的当前页记录  
	    private Map<String, Object> params = new HashMap<String, Object>();//其他的参数分装成一个Map对象  
		
	    
	   
		public int getPageNo() {
			return pageNo;
		}
		public void setPageNo(int pageNo) {
			this.pageNo = pageNo;
		}
		public int getPageSize() {
			return pageSize;
		}
		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}
		public int getTotalRecord() {
			return totalRecord;
		}
		public void setTotalRecord(int totalRecord) {
			this.totalRecord = totalRecord;
		}
		public int getTotalPage() {
			return totalPage;
		}
		public void setTotalPage(int totalPage) {
			this.totalPage = totalPage;
		}
		public List<T> getResults() {
			return results;
		}
		public void setResults(List<T> results) {
			this.results = results;
		}
		public Map<String, Object> getParams() {
			return params;
		}
		public void setParams(Map<String, Object> params) {
			this.params = params;
		}
	
		public Page(int pageNo, int pageSize, int totalRecord, int totalPage,
				List<T> results, String field, String value, String sort,
				Map<String, Object> params) {
			this.pageNo = pageNo;
			this.pageSize = pageSize;
			this.totalRecord = totalRecord;
			this.totalPage = totalPage;
			this.results = results;
			this.params = params;
		}
		public Page() {
		}
	    
}
