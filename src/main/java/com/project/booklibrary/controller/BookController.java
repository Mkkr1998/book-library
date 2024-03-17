package com.project.booklibrary.controller;

import com.project.booklibrary.entity.Book;
import com.project.booklibrary.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookService service;

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


    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
        service.deleteBook(bookId);
    }

    @PutMapping("/book/{bookId}")
    public Book updateBook(@PathVariable("bookId") int bookId,@RequestBody Book book){
        return service.update(bookId, book);
    }

}
