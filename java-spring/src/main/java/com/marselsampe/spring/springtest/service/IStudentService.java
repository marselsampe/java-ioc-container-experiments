package com.marselsampe.spring.springtest.service;

import java.util.List;

import com.marselsampe.spring.springtest.model.Student;

public interface IStudentService {
	Student createStudent( Student student );
	List<Student> retrieveStudentsByGender( String gender );
	int countAllStudents();
}