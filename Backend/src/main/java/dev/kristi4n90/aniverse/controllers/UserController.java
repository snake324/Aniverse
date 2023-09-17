package dev.kristi4n90.aniverse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.kristi4n90.aniverse.models.User;
import dev.kristi4n90.aniverse.services.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    
    @Autowired
    UserService service;

    @GetMapping
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return service.getUserById(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id){
        User userToUpdate = service.getUserById(id);
        service.updateUser(userToUpdate);
        return ResponseEntity.ok(userToUpdate);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody User user){
        service.deleteUser(user);
    }

}
