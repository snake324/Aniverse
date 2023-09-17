package dev.kristi4n90.aniverse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kristi4n90.aniverse.models.Profile;
import dev.kristi4n90.aniverse.repositories.ProfileRepository;

@Service
public class ProfileService {
    
    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Profile getProfilebyId(Long id) {
        Optional<Profile> opt = profileRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

    public Profile addProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile updateProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public void deleteProfile(Profile profile) {
        profileRepository.delete(profile);
    }
    
}