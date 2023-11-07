package dev.kristi4n90.aniverse.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kristi4n90.aniverse.models.Profile;
import dev.kristi4n90.aniverse.models.User;
import dev.kristi4n90.aniverse.services.ProfileService;
import dev.kristi4n90.aniverse.services.UserService;

@RestController
@RequestMapping(path = "/register")
public class RegisterController {

    private final UserService userService;
    private final ProfileService profileService;

    public RegisterController(UserService userService, ProfileService profileService) {
        this.userService = userService;
        this.profileService = profileService;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) throws Throwable {

        User savedUser = userService.addUser(user);

        Profile profile = new Profile();
        profile.setUser(savedUser);

        Profile savedProfile = profileService.addProfile(profile);

        savedUser.setProfile(savedProfile);
        userService.updateUser(savedUser);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

}
