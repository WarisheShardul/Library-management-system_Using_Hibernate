package com.jsp.controller;

import com.jsp.libraryDto.Librarian;
import com.jsp.libraryService.LibrarianService;

public class LibrarianSaveController {
	public static void main(String[] args) {
	LibrarianService librarianService=new LibrarianService();
	Librarian librarian=new Librarian();
	librarian.setName("shivani");
	librarian.setMail("shivani@mail.com");
	librarian.setStatus("approved");

	librarianService.saveLibrarian(librarian);
	}
}
