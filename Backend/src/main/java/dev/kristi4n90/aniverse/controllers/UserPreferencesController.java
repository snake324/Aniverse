package dev.kristi4n90.aniverse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dev.kristi4n90.aniverse.models.UserPreferences;
import dev.kristi4n90.aniverse.services.UserPreferencesService;

import java.util.List;

@RestController
@RequestMapping(path = "/user-preferences")
public class UserPreferencesController {
    
    @Autowired
    private UserPreferencesService userPreferencesService;

    @GetMapping
    public List<UserPreferences> getAllUserPreferences() {
        return userPreferencesService.getAllUserPreferences();
    }

    @GetMapping("/{id}")
    public UserPreferences getUserPreferencesById(@PathVariable Long id) {
        return userPreferencesService.getUserPreferencesById(id);
    }

    @PostMapping
    public ResponseEntity<UserPreferences> createUserPreferences(@RequestBody UserPreferences userPreferences) {
        UserPreferences createdUserPreferences = userPreferencesService.createUserPreferences(userPreferences);
        return ResponseEntity.ok(createdUserPreferences);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserPreferences> updateUserPreferences(@RequestBody UserPreferences userPreferences, @PathVariable Long id) {
        UserPreferences updatedUserPreferences = userPreferencesService.updateUserPreferences(id, userPreferences);
        return ResponseEntity.ok(updatedUserPreferences);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserPreferences(@PathVariable Long id) {
        userPreferencesService.deleteUserPreferences(id);
        return ResponseEntity.noContent().build();
    }
}
