package com.project.booklibrary.repository;

import com.project.booklibrary.entity.Author;
import com.project.booklibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    List<Book> findByAuthor(Author author);
}
