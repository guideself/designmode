package com.thinkdo.opensource.designmode.mediator.service;

import java.util.List;

import com.thinkdo.opensource.designmode.mediator.bean.Subject;
import com.thinkdo.opensource.designmode.mediator.bean.Teacher;

/**
 * 中介者对象
 * @author Administrator
 *
 */
public interface TeachService {
	
	/**
	 *一个老师下的课程
	 */
	void printSubjectsForTeacher(String teacherid);
	
	/**
	 * 一个课程下的老师
	 */
	void printTeachersForSubject(String subjectid);
	
	/**
	 *为老师添加一个课程 
	 */
	void addSubjectForTeacher(String subjectid,String teacherid);
	
	/**
	 * 为老师删除一个课程
	 */
	void deleteSubjectForTeacher(String subjectid,String teacherid);
	
	/**
	 *增加科目 
	 */
	void addSubject(Subject subject);
	
	/**
	 * 增加老师
	 * @param teacher
	 */
	void addTeacher(Teacher teacher);
	
	/**
	 * 查询科目
	 */
	Subject searchSubject(String subjectid);
	
	/**
	 * 查询老师
	 */
	Teacher searchTeacher(String teacherid);
	
	/**
	 *打印所有老师
	 * @return 
	 */
	List<Teacher> printAllTeachers();
	
	/**
	 * 打印所有科目
	 * @return 
	 */
	List<Subject> printAllSubjects();
	
}
