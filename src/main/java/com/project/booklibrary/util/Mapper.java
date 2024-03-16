package com.project.booklibrary.util;

import com.project.booklibrary.domain.dto.AuthorDTO;
import com.project.booklibrary.domain.dto.BookDTO;
import com.project.booklibrary.domain.entity.Author;
import com.project.booklibrary.domain.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Author toAuthorMap(AuthorDTO authorDTO){
        return Author.builder()
                .authName(authorDTO.getAuthName())
                .build();
    }
    public AuthorDTO toAuthorDTOMap(Author author){
        return AuthorDTO.builder()
                .authId(author.getAuthId())
                .authName(author.getAuthName())
                .build();
    }
    public Book toBookMap(BookDTO bookDTO){
        return Book.builder()
                .bookId(bookDTO.getBookId())
                .bookName(bookDTO.getBookName())
                .author(bookDTO.getAuthor())
                .build();
    }
    public BookDTO toBookDTOMap(Book book){
        return BookDTO.builder()
                .bookId(book.getBookId())
                .bookName(book.getBookName())
                .author(book.getAuthor())
                .build();
    }
}
