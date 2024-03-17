package com.project.booklibrary.service;

import com.project.booklibrary.entity.Author;
import com.project.booklibrary.entity.Book;
import com.project.booklibrary.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepo repo;
    BookService(BookRepo repo){
        this.repo=repo;
    }

    public Book addBook(Book book){
        return repo.save(book);
    }

    public void deleteBook(int bookId){
        repo.delete(repo.getReferenceById(bookId));
    }

    public Book update(int bookId,Book book){
        Book temp = repo.getReferenceById(bookId);
        temp.setBookName(book.getBookName());
        temp.setAuthor(book.getAuthor());
        return repo.save(temp);

    }

    public List<Book> findByAuthor(Author author){
        return repo.findByAuthor(author);
    }

    public Book findById(int bookId){
        return repo.getReferenceById(bookId);
    }
    public List<Book> findAll(){
        return repo.findAll();
    }

}
