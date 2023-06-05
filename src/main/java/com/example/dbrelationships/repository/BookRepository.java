package com.example.dbrelationships.repository;

import com.example.dbrelationships.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
