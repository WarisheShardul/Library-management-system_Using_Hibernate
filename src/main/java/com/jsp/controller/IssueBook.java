package com.jsp.controller;

import com.jsp.libraryService.LibrarianService;

public class IssueBook {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueBookById(2,1,3);
		System.out.println(res);
	}
}
