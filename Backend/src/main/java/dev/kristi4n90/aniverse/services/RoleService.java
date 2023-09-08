package dev.kristi4n90.aniverse.services;

import org.springframework.stereotype.Service;

import dev.kristi4n90.aniverse.models.Role;
import dev.kristi4n90.aniverse.repositories.RoleRepository;

@Service
public class RoleService {
    
    RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public Role show(Long id) throws Throwable {
        return repository.findById(id).orElseThrow(() -> new Throwable("Role not found"));
    }
    
}
