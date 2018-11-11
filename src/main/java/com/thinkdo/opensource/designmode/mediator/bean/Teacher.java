package com.thinkdo.opensource.designmode.mediator.bean;

/**
 * 老师
 * @author Administrator
 *
 */
public class Teacher {
	
	private String  teacherid;
	
	private String name;

	public String getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(String teacherid, String name) {
		super();
		this.teacherid = teacherid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [teacherid=" + teacherid + ", name=" + name + "]";
	}
	
}
