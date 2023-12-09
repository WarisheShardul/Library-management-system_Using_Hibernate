package com.jsp.controller;

import com.jsp.libraryService.LibrarianService;

public class LibrarianDeleteController {
public static void main(String[] args) {
	
	LibrarianService librarianService=new LibrarianService();
librarianService.deleteLibrarianById(2);
}
}
