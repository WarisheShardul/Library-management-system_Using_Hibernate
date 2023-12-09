package com.jsp.controller;

import com.jsp.libraryDto.Student;
import com.jsp.libraryService.StudentService;

public class StudentSave {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = new Student();

		student.setName("Sujit");
		student.setMail("sujit@mail.com");

		studentService.saveStudent(student);
	}
}
