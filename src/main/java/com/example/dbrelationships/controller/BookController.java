package com.example.dbrelationships.controller;

import com.example.dbrelationships.model.Book;
import com.example.dbrelationships.model.Photo;
import com.example.dbrelationships.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Long id){
        return bookService.getBook(id);
    }

    @PostMapping
    public Book postBook(@RequestBody Book book){
        return bookService.postBook(book);
    }
}
