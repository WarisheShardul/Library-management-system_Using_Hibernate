package com.jsp.controller;

import com.jsp.libraryService.LibrarianService;

public class ReturnBook {
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		librarianService.returnBookById(5);
	}
}
