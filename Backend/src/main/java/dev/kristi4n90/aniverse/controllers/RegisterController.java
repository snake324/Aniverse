package dev.kristi4n90.aniverse.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kristi4n90.aniverse.models.User;
import dev.kristi4n90.aniverse.services.UserService;

@RestController
@RequestMapping(path = "/register")
public class RegisterController {

    UserService service;

    public RegisterController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> register(@RequestBody User user) throws Throwable {

        try {
            User userStored = service.save(user);
            return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(userStored);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
