package com.ikshavaku.actorsdirectory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ikshavaku.actorsdirectory.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
