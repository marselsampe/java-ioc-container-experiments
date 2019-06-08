package com.marselsampe.springtest.service;

import java.util.List;

import com.marselsampe.springtest.lib.IStudentManager;
import com.marselsampe.springtest.model.Student;

public class StudentService implements IStudentService {
	IStudentManager studentManager;

	public void setStudentManager(IStudentManager studentManager) {
		this.studentManager = studentManager;
	}

	@Override
	public List<Student> retrieveStudentsByGender(String gender) {
		return studentManager.retrieve("", gender);
	}
	
	@Override
	public int countAllStudents() {
		return studentManager.countAll();
	}

	@Override
	public Student createStudent(Student student) {
		return studentManager.create(student);
	}
}
