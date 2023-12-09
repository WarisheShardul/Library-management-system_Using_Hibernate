package com.jsp.controller;

import com.jsp.libraryDto.Book;
import com.jsp.libraryService.BookService;

public class BookGet {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book = bookService.getBookById(1);
		System.out.println("==============================");
		System.out.print(book.getId() + " " + "| ");
		System.out.print(book.getName() + " " + "| ");
		System.out.println(book.getStatus() + " " + "| ");
		System.out.println("==============================");

	}
}
