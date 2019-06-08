package com.marselsampe.spring.sprinttest.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marselsampe.spring.springtest.model.Student;
import com.marselsampe.spring.springtest.service.IStudentService;

public class StudentServiceTest {
	@Test
	public void testRetrieveStudentsByGender() {	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
		IStudentService studentService = (IStudentService) context.getBean("studentService");
		
		List<Student> maleStudents = studentService.retrieveStudentsByGender("Male");
		assertEquals(1, maleStudents.size());
		
		List<Student> femaleStudents = studentService.retrieveStudentsByGender("Female");
		assertEquals(1, femaleStudents.size());
		
		System.out.println(maleStudents.size());
		System.out.println(femaleStudents.size());
	}
	
	@Test
	public void testAddStudent() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
		IStudentService studentService = (IStudentService) context.getBean("studentService");
		
		Student newStudent = new Student();
		newStudent.setName("New Student");
		newStudent.setGender("Male");
		studentService.createStudent(newStudent);

		int totalStudent = studentService.countAllStudents();
		assertEquals(3, totalStudent);
		
		System.out.println(totalStudent);
	}
}
