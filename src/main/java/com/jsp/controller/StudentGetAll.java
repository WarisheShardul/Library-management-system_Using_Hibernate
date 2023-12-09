package com.jsp.controller;

import java.util.List;

import com.jsp.libraryDto.Student;
import com.jsp.libraryService.StudentService;

public class StudentGetAll {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		List<Student> students = studentService.getAllStudents();

		for (Student s : students) {
			System.out.println("==============================");
			System.out.print(s.getId() + " " + "| ");
			System.out.print(s.getName() + " " + "| ");
			System.out.println(s.getMail() + " " + "| ");
			System.out.println("==============================");

		}

	}
}
