package com.jsp.controller;

import com.jsp.libraryDto.Book;
import com.jsp.libraryService.BookService;

public class BookSave {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book = new Book();
		book.setName("Book3");
		book.setStatus("Issued");
		bookService.saveBook(book); //librarian service
	}
}
