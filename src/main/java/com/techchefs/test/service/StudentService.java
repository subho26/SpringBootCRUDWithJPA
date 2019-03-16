package com.techchefs.test.service;

import com.techchefs.test.model.Student;

public interface StudentService {
	public Student createStudent(final Student student);

	public Student getStudentById(final Long id);

	public void deleteByRollNumber(final Long id);
}
