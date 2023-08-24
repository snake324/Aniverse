package dev.kristi4n90.aniverse.services;

import dev.kristi4n90.aniverse.models.Anime;
import dev.kristi4n90.aniverse.repositories.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    AnimeRepository repository;

    public AnimeService(AnimeRepository repository){
        this.repository = repository;
    }

    public List<Anime> getAll() {
        List<Anime> animes = repository.findAll();
        return animes;
    }

    public Anime findById(Long id) {
        Anime anime = repository.findById(id).orElseThrow();
        return anime;
    }
}
