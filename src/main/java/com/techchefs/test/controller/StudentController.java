package com.techchefs.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.test.model.Student;
import com.techchefs.test.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	@Qualifier(value="studentService")
	private StudentService studentService;

	@RequestMapping(value = "/students", method = RequestMethod.POST, consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public Student createNewStudent(@RequestBody @Valid Student student) {
		return studentService.createStudent(student);
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteStudentById(@PathVariable Long id) {
		studentService.deleteByRollNumber(id);
	}
}
