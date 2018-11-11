package com.thinkdo.opensource.designmode.mediator;

import java.util.List;

import com.thinkdo.opensource.designmode.mediator.bean.Teacher;
import com.thinkdo.opensource.designmode.mediator.service.TeachService;
import com.thinkdo.opensource.designmode.mediator.service.TeachServiceImpl;

public class Test {
	public static void main(String[] args) {
		TeachService instance = TeachServiceImpl.getInstance();
		instance.printAllSubjects();
		List<Teacher> teachers = instance.printAllTeachers();
		instance.printSubjectsForTeacher(teachers.get(0).getTeacherid());
	}
}
