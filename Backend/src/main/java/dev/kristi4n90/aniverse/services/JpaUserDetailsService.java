package dev.kristi4n90.aniverse.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dev.kristi4n90.aniverse.models.SecurityUser;
import dev.kristi4n90.aniverse.repositories.UserRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService{

    UserRepository repo;

    public JpaUserDetailsService(UserRepository repo){
        this.repo = repo;
    }

   @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repo.findByMail(username).map(SecurityUser::new).orElseThrow(()-> new UsernameNotFoundException("User not found"+ username));
    }
    
}