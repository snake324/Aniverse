package dev.kristi4n90.aniverse.repositories;

import dev.kristi4n90.aniverse.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
