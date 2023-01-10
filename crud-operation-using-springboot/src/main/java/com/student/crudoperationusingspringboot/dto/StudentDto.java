package com.student.crudoperationusingspringboot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDto {

	@Id
	private int studentRollNo;
	private String studentName;
	private double english;
	private double maths;
	private double science;
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	@Override
	public String toString() {
		return "StudentDto [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", english=" + english
				+ ", maths=" + maths + ", science=" + science + "]";
	}
	
}
