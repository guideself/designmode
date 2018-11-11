package com.thinkdo.opensource.designmode.mediator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.thinkdo.opensource.designmode.mediator.bean.Subject;
import com.thinkdo.opensource.designmode.mediator.bean.Teacher;
import com.thinkdo.opensource.designmode.mediator.bean.TeacherSubject;

public class TeachServiceImpl implements TeachService {
	
	private static TeachServiceImpl impl = new TeachServiceImpl();
	
	private List<TeacherSubject> teacherSubjects;
	
	private List<Teacher> teachers;
	
	private List<Subject> subjects;
	
	public static TeachService getInstance(){
		return impl;
	}

	private TeachServiceImpl() {
		teachers = new ArrayList<Teacher>();
		subjects = new ArrayList<Subject>();
		teacherSubjects = new ArrayList<TeacherSubject>();
		init();
	}

	public void printSubjectsForTeacher(String teacherid) {
		boolean exist = false;
		for (Teacher teacher : teachers) {
			if(teacher.getTeacherid().equals(teacherid)){
				exist = true;
				break;
			}
		}
		
		if(exist==false){
			System.out.println("老师不存在");
			return;
		}

		if(teacherSubjects==null || teacherSubjects.size()==0){
			System.out.println("该老师下无课程");
			return;
		}
		
		List<Subject> temp = new ArrayList<Subject>();
		for (TeacherSubject teacherSubject : teacherSubjects) {
			if(teacherSubject.getTeacherid().equals(teacherid)){
				String subjectid = teacherSubject.getSubjectid();
				temp.add(new Subject(subjectid, searchSubject(subjectid).getName()));
			}
		}
		System.out.println(temp); 
	}

	public void printTeachersForSubject(String subjectid) {
		// TODO 未实现

	}

	public void addSubjectForTeacher(String subjectid, String teacherid) {
		teacherSubjects.add(new TeacherSubject(UUID.randomUUID().toString(), teacherid, subjectid));
	}

	public void deleteSubjectForTeacher(String subjectid, String teacherid) {
		// TODO 未实现

	}

	public void addSubject(Subject subject) {
		subjects.add(subject);
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	private void init() {
		Subject subject1 = new Subject(UUID.randomUUID().toString(),"语文");
		addSubject(subject1);
		Subject subject2 = new Subject(UUID.randomUUID().toString(),"数学");
		addSubject(subject2);
		Subject subject3 = new Subject(UUID.randomUUID().toString(),"英语");
		addSubject(subject3);
		
		Teacher teacher1 = new Teacher(UUID.randomUUID().toString(),"甄淑万");
		addTeacher(teacher1);
		Teacher teacher2 = new Teacher(UUID.randomUUID().toString(),"黎小姐");
		addTeacher(teacher2);
		Teacher teacher3 = new Teacher(UUID.randomUUID().toString(),"冯琳琳");
		addTeacher(teacher3);
		
		addSubjectForTeacher(subject1.getSubjectid(),teacher1.getTeacherid());
		addSubjectForTeacher(subject2.getSubjectid(),teacher2.getTeacherid());
		addSubjectForTeacher(subject3.getSubjectid(),teacher3.getTeacherid());
	}

	public Subject searchSubject(String subjectid) {
		for (Subject subject : subjects) {
			if(subjectid.equals(subject.getSubjectid())){
				return subject;
			}
		}
		return null;
	}

	public Teacher searchTeacher(String teacherid) {
		for (Teacher teacher : teachers) {
			if(teacherid.equals(teacher.getTeacherid())){
				return teacher;
			}
		}
		return null;
	}

	public List<Teacher> printAllTeachers() {
		System.out.println(teachers);
		return teachers;
	}

	public List<Subject> printAllSubjects() {
		System.out.println(subjects);
		return subjects;
	}

}
