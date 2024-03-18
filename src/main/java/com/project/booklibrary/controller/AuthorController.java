package com.project.booklibrary.controller;


import com.project.booklibrary.entity.Author;
import com.project.booklibrary.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    private AuthorService service;
    AuthorController(AuthorService service){
        this.service=service;
    }

    @PostMapping("/author")
    public Author addauthor(@RequestBody Author author){
        return service.addAuthor(author);
    }
    @GetMapping("/author")
    public List<Author> getAuthors(){
        return service.findAll();
    }

    @DeleteMapping("/author/{authId}")
    public void deleteAuthor(@PathVariable int authId){
        service.delete(authId);
    }

    @PutMapping("/author/{authId}")
    public Author update(@PathVariable int authId,@RequestBody Author author){
        return service.update(authId,author);
    }
}
