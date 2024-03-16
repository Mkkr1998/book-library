package com.project.booklibrary.repository;

import com.project.booklibrary.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
