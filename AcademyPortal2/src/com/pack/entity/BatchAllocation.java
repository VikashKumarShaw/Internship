package com.pack.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BATCHALLOCATATION")
public class BatchAllocation {

	@Id
	private String batchid;
	private String facultyid;
	private Date startdate;
	private Date enddate;
	private Date closedate;
	
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
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Date getClosedate() {
		return closedate;
	}
	public void setClosedate(Date closedate) {
		this.closedate = closedate;
	}
	
	
	
}
