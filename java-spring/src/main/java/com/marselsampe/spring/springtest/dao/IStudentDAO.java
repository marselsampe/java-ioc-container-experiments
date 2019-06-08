package com.marselsampe.spring.springtest.dao;

import java.util.List;

import com.marselsampe.spring.springtest.model.Student;

public interface IStudentDAO {
	List<Student> retrieveAll();
	Student create(Student student);
	Student update(Student student);
	Student delete(Student student);
}
