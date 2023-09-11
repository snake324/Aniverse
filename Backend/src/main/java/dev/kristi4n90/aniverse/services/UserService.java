package dev.kristi4n90.aniverse.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import dev.kristi4n90.aniverse.models.Role;
import dev.kristi4n90.aniverse.models.User;
import dev.kristi4n90.aniverse.repositories.UserRepository;

@Service
public class UserService {
    
    UserRepository repository;
    RoleService roleService;

    public UserService(UserRepository repository, RoleService roleService) {
        this.repository = repository;
        this.roleService = roleService;
    }

    public User save(User user) throws Throwable {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        this.assignDefaultRole(user);

        return repository.save(user);
    }

    public void assignDefaultRole(User user) throws Throwable {

        Role defauRole = roleService.show(2L);
        Set<Role> roles = new HashSet<>();
        roles.add(defauRole);

        user.setRoles(roles);
    }
}
