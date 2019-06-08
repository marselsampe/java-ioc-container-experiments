package com.marselsampe.springtest.lib;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.marselsampe.springtest.dao.IStudentDAO;
import com.marselsampe.springtest.model.Student;

public class StudentManager implements IStudentManager {
	private IStudentDAO studentDAO;

	public void setStudentDAO(IStudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public List<Student> retrieve(String name, String gender) {
		List<Student> students = new ArrayList<Student>(studentDAO.retrieveAll());

		Iterator<Student> studentsIterator = students.iterator();
		while (studentsIterator.hasNext()) {
			Student student = studentsIterator.next();
			if (!student.getGender().equals(gender)) {
				studentsIterator.remove();
			}
		}

		return students;
	}

	@Override
	public int countAll() {
		return studentDAO.retrieveAll().size();
	}

	@Override
	public Student create(Student student) {
		// TODO : add logging mechanism here
		return studentDAO.create(student);
	}

	@Override
	public Student update(Student student) {
		// TODO : add logging mechanism here
		return studentDAO.update(student);
	}

	@Override
	public Student delete(Student student) {
		// TODO : add logging mechanism here
		return studentDAO.delete(student);
	}
}
