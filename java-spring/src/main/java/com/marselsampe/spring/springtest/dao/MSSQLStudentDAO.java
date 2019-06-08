package com.marselsampe.spring.springtest.dao;

import java.util.ArrayList;
import java.util.List;

import com.marselsampe.spring.springtest.model.Student;

public class MSSQLStudentDAO implements IStudentDAO {
	List<Student> students = new ArrayList<Student>();
	
	public MSSQLStudentDAO() {
		// dummy codes
		Student student1 = new Student();
		student1.setName("Student 1");
		student1.setGender("Male");
		students.add(student1);

		Student student2 = new Student();
		student2.setName("Student 2");
		student2.setGender("Female");
		students.add(student2);
	}

	@Override
	public List<Student> retrieveAll() {
		return students;
	}

	@Override
	public Student create(Student student) {
		students.add(student);
		return student;
	}

	@Override
	public Student update(Student student) {
		return null;
	}

	@Override
	public Student delete(Student student) {
		return null;
	}

}
