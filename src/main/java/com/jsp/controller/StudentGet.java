package com.jsp.controller;

import com.jsp.libraryDto.Student;
import com.jsp.libraryService.StudentService;

public class StudentGet {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(1);
		System.out.println("==============================");
		System.out.print(student.getId() + " " + "| ");
		System.out.print(student.getName() + " " + "| ");
		System.out.println(student.getMail() + " " + "| ");
		System.out.println("==============================");
	}
}
