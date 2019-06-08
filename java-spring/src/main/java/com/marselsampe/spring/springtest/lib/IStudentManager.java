package com.marselsampe.spring.springtest.lib;

import java.util.List;

import com.marselsampe.spring.springtest.model.Student;

public interface IStudentManager {
	List<Student> retrieve(String name, String gender);
	int countAll();
	Student create(Student student);
	Student update(Student student);
	Student delete(Student student);
}
