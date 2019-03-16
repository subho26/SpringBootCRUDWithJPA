package com.techchefs.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techchefs.test.model.Student;
import com.techchefs.test.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(final Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(final Long id) {
		return studentRepository.findOne(id);
	}

	@Override
	public void deleteByRollNumber(final Long id) {
		studentRepository.deleteByRollNumber(id);
	}

}
