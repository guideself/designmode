package com.thinkdo.opensource.designmode.mediator.bean;

/**
 * 老师、科目中间表
 * @author Administrator
 *
 */
public class TeacherSubject {
	
	private String teachersubjectid;
	
	private String  teacherid;
	
	private String subjectid;

	public String getTeachersubjectid() {
		return teachersubjectid;
	}

	public void setTeachersubjectid(String teachersubjectid) {
		this.teachersubjectid = teachersubjectid;
	}

	public String getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}

	public String getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(String subjectid) {
		this.subjectid = subjectid;
	}

	public TeacherSubject(String teachersubjectid, String teacherid, String subjectid) {
		super();
		this.teachersubjectid = teachersubjectid;
		this.teacherid = teacherid;
		this.subjectid = subjectid;
	}
	
}
