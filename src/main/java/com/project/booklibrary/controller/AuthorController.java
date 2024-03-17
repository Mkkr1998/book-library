package com.project.booklibrary.controller;


import com.project.booklibrary.domain.entity.Author;
import com.project.booklibrary.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
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

    @GetMapping("/author/{authId}")
    public void deleteAuthor(@PathVariable int authId){
        service.delete(authId);
    }

}
