package com.pack.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCHALLOCATE")
public class BatchAllocate {

	@Id
	private String batchid;
	private String facultyid;
	private String startdate;
	private String enddate;
	private String closedate;
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public String getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getClosedate() {
		return closedate;
	}
	public void setClosedate(String closedate) {
		this.closedate = closedate;
	}
	
	
	
}
