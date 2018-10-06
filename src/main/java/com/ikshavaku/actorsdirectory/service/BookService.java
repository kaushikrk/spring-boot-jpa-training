package com.ikshavaku.actorsdirectory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikshavaku.actorsdirectory.model.Book;
import com.ikshavaku.actorsdirectory.repository.AuthorRepository;
import com.ikshavaku.actorsdirectory.repository.BookRepository;
import com.ikshavaku.actorsdirectory.repository.PublisherRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repo;
	@Autowired
	AuthorRepository authorRepo;
	@Autowired
	PublisherRepository publisherRepo;
	
	public Book getBooks(long id){
		return repo.findById(id).get();
	}
	public Book addBook(Book book) {
		publisherRepo.save(book.getPublisher());
		authorRepo.save(book.getAuthor());
		return repo.save(book);
		
	}
}
