package dev.kristi4n90.aniverse.services;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import dev.kristi4n90.aniverse.models.Role;
import dev.kristi4n90.aniverse.models.User;
import dev.kristi4n90.aniverse.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleService roleService;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        Optional<User> opt = userRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

    public User addUser(User user) throws Throwable {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        this.assignDefaultRole(user);

        user.setRegisterDate(new Timestamp(System.currentTimeMillis()));

        return userRepository.save(user);
    }

    public void assignDefaultRole(User user) throws Throwable {

        Role defauRole = roleService.getRoleById(2L);
        Set<Role> roles = new HashSet<>();
        roles.add(defauRole);

        user.setRoles(roles);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    

}
