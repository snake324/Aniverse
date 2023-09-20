package dev.kristi4n90.aniverse.repositories;

import dev.kristi4n90.aniverse.models.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByMail(String email);
}
