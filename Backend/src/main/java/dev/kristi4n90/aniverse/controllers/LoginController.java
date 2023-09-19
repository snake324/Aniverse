package dev.kristi4n90.aniverse.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping(path = "/login")
    public ResponseEntity<Map<String, String>> login() {
        System.out.println("Received login request");
        SecurityContext contextHolder = SecurityContextHolder.getContext();
        Authentication auth = contextHolder.getAuthentication();
        Map<String, String> json = new HashMap<>();
        json.put("message", "Logged");
        json.put("email", auth.getName());
        json.put("roles", auth.getAuthorities().iterator().next().toString());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(json);
    }
}
