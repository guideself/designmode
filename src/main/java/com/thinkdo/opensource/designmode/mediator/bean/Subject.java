package com.thinkdo.opensource.designmode.mediator.bean;

/**
 * 科目
 * @author Administrator
 *
 */
public class Subject {
	
	private String subjectid;
	
	private String name;

	public String getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject(String subjectid, String name) {
		super();
		this.subjectid = subjectid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", name=" + name + "]";
	}
	
}
