package dev.kristi4n90.aniverse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.kristi4n90.aniverse.models.UserPreferences;
import dev.kristi4n90.aniverse.repositories.UserPreferencesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserPreferencesService {
    
    @Autowired
    private UserPreferencesRepository userPreferencesRepository;

    public List<UserPreferences> getAllUserPreferences() {
        return userPreferencesRepository.findAll();
    }

    public UserPreferences getUserPreferencesById(Long id) {
        Optional<UserPreferences> userPreferences = userPreferencesRepository.findById(id);
        return userPreferences.orElse(null);
    }

    public UserPreferences createUserPreferences(UserPreferences userPreferences) {
        return userPreferencesRepository.save(userPreferences);
    }

    public UserPreferences updateUserPreferences(Long id, UserPreferences userPreferences) {
        Optional<UserPreferences> existingUserPreferences = userPreferencesRepository.findById(id);
        if (existingUserPreferences.isPresent()) {
            userPreferences.setIdPreferences(id);
            return userPreferencesRepository.save(userPreferences);
        }
        return null;
    }

    public void deleteUserPreferences(Long id) {
        userPreferencesRepository.deleteById(id);
    }
}
