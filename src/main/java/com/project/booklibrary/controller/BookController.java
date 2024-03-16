package com.project.booklibrary.controller;

import com.project.booklibrary.domain.entity.Book;
import com.project.booklibrary.repository.BookRepo;
import com.project.booklibrary.service.BookService;
import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    BookService service;

    BookController(BookService service){
        this.service= service;
    }

    @GetMapping(path="/book")
    public List<Book> findAllBooks(){
        return service.findAll();
    }

    @PostMapping(path="/book")
    public Book addBook(@RequestBody Book book){
        return service.addBook(book);
    }
}
