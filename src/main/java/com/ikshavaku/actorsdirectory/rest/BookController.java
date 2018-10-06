package com.ikshavaku.actorsdirectory.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ikshavaku.actorsdirectory.model.Book;
import com.ikshavaku.actorsdirectory.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
	@RequestMapping(name="getBooks", method=RequestMethod.GET)
	public Book getBooks(@RequestParam("id") long bookId) {
		return service.getBooks(bookId);
	}
	@RequestMapping(name="book", method=RequestMethod.POST)
	public Book addBooks(@RequestBody Book book) {
		return service.addBook(book);
	}
}
