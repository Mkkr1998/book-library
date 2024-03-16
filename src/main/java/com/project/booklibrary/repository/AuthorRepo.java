package com.project.booklibrary.repository;

import com.project.booklibrary.domain.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
