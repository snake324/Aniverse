package dev.kristi4n90.aniverse.services;

import dev.kristi4n90.aniverse.models.Anime;
import dev.kristi4n90.aniverse.repositories.AnimeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public List<Anime> getAllAnime() {
        return animeRepository.findAll();
    }

    public Anime getAnimeById(Long id) {
        Optional<Anime> optionalAnime = animeRepository.findById(id);
        return optionalAnime.orElse(null);
    }

    public Anime createAnime(Anime anime) { return animeRepository.save(anime);}

    public Anime updateAnime(Long id, Anime anime) {
        Anime existingAnime = getAnimeById(id);
        if (existingAnime != null) {
            anime.setIdanime(existingAnime.getIdanime());
            return animeRepository.save(anime);
        } else {
            return null;
        }
    }

    public boolean deleteAnime(Long id) {
        if (getAnimeById(id) != null) {
            animeRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @PostConstruct
    public void insertInitialData() {
        List<Anime> animeList = Arrays.asList(
                new Anime("One Piece"),
                new Anime("Naruto: Shippuden"),
                new Anime("FullMetal Alchemist: Brotherhood"),
                new Anime("Dragon Ball"),
                new Anime("Dragon Ball Z"),
                new Anime("Evangelion"),
                new Anime("Cowboy Bebop"),
                new Anime("Rurouni Kenshin"),
                new Anime("Yu Yu Hakusho"),
                new Anime("Kimetsu no Yaiba"),
                new Anime("Jujutsu Kaisen"),
                new Anime("Bleach")
        );
        animeRepository.saveAll(animeList);
    }
}
