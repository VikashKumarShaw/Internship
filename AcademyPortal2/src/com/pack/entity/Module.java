package com.pack.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MODULE")
public class Module {
	@Id
private String moduleid;
private String skillid;
private String modulename;

public String getSkillid() {
	return skillid;
}
public String getModuleid() {
	return moduleid;
}
public void setModuleid(String moduleid) {
	this.moduleid = moduleid;
}
public void setSkillid(String skillid) {
	this.skillid = skillid;
}
public String getModulename() {
	return modulename;
}
public void setModulename(String modulename) {
	this.modulename = modulename;
}
} 