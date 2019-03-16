package com.techchefs.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Long rollNumber;
	private String name;
	private String gender;
	private String grade;

	public String getGender() {
		return gender;
	}

	public String getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

}
