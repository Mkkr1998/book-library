package com.project.booklibrary.service;

import com.project.booklibrary.entity.Author;
import com.project.booklibrary.repository.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private AuthorRepo repo;
    AuthorService(AuthorRepo repo){
        this.repo=repo;
    }

    public Author addAuthor(Author author){
        return repo.save(author);
    }
    public void delete(int authId){
        repo.delete(repo.getReferenceById(authId));
    }
    public Author findById(int authId){
        return repo.findById(authId).get();
    }
    public Author update(int authId,Author author){
        Author temp = repo.getReferenceById(authId);
        temp.setAuthName(author.getAuthName());
        return repo.save(temp);
    }

    public List<Author> findAll(){
        return repo.findAll();
    }


}
