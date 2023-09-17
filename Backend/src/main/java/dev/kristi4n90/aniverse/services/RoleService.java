package dev.kristi4n90.aniverse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.kristi4n90.aniverse.models.Role;
import dev.kristi4n90.aniverse.repositories.RoleRepository;

@Service
public class RoleService {
    
    RoleRepository roleRepository;

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id){
        Optional<Role> opt = roleRepository.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }else{
            return null;
        }
    }
    
}
