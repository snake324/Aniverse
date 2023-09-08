package dev.kristi4n90.aniverse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.kristi4n90.aniverse.models.User;
import dev.kristi4n90.aniverse.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    
    @Autowired
    UserRepository repository;

    @GetMapping
    public List<User> index() {
        List<User> users = repository.findAll();
        return users;
    }
}
