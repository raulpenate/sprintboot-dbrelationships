package com.example.dbrelationships.service;

import com.example.dbrelationships.model.Book;
import com.example.dbrelationships.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public ArrayList<Book> getBooks(){
        return (ArrayList<Book>) bookRepository.findAll();
    }

    public Optional<Book> getBook(Long id){
        return bookRepository.findById(id);
    }

    public Book postBook(Book book){
        return bookRepository.save(book);
    }
}
