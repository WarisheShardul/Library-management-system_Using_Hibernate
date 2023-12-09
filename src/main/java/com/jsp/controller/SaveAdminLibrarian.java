package com.jsp.controller;

import com.jsp.libraryDto.Librarian;
import com.jsp.libraryService.LibrarianService;

public class SaveAdminLibrarian {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		Librarian librarian=new Librarian();
		librarian.setName("Bappa");
		librarian.setMail("bappa@mail.com");
		librarian.setStatus("Authorized");

		librarianService.saveLibrarian(librarian);
	}
}
