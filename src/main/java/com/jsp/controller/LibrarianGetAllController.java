package com.jsp.controller;

import com.jsp.libraryService.LibrarianService;

public class LibrarianGetAllController {
public static void main(String[] args) {
	
	LibrarianService librarianService=new LibrarianService();
librarianService.getAllLibrarians();
}
}
