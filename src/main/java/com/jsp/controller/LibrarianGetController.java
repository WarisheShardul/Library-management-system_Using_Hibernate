package com.jsp.controller;

import com.jsp.libraryService.LibrarianService;

public class LibrarianGetController {
public static void main(String[] args) {
	
	LibrarianService librarianService=new LibrarianService();
librarianService.getLibrarianById(4);
}
}
