package com.project.booklibrary.repository;

import com.project.booklibrary.domain.entity.Author;
import com.project.booklibrary.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {
    List<Book> findByAuthor(Author author);
}
