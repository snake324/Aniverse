package dev.kristi4n90.aniverse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.kristi4n90.aniverse.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
