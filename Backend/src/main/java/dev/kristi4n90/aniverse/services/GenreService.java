package dev.kristi4n90.aniverse.services;

import dev.kristi4n90.aniverse.models.Genre;
import dev.kristi4n90.aniverse.repositories.GenreRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {this.genreRepository = genreRepository; }

    public List<Genre> getAllGenre() { return genreRepository.findAll();}

    public Genre getGenreById(Long id) {
        Optional<Genre> optionalGenre = genreRepository.findById(id);
        return optionalGenre.orElse(null);
    }

    public Genre createGenre(Genre genre) { return genreRepository.save(genre);}

    public Genre updateGenre(Long id, Genre genre) {
        Genre existingGenre = getGenreById(id);
        if (existingGenre != null) {
            genre.setIdgenre(existingGenre.getIdgenre());
            return genreRepository.save(genre);
        } else {
            return null;
        }
    }

    public boolean deleteGenre(Long id){
        if (getGenreById(id) != null) {
            genreRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    @PostConstruct
    public void insertInitialData() {
        List<Genre> genreList = Arrays.asList(
                new Genre("Action"),
                new Genre("Adventure"),
                new Genre("Avant Garde"),
                new Genre("Award Winning"),
                new Genre("Boys Love"),
                new Genre("Comedy"),
                new Genre("Drama"),
                new Genre("Fantasy"),
                new Genre("Girls Love"),
                new Genre("Gourmet"),
                new Genre("Horror"),
                new Genre("Mystery"),
                new Genre("Romance"),
                new Genre("Sci-Fi"),
                new Genre("Slice of Life"),
                new Genre("Sports"),
                new Genre("Supernatural"),
                new Genre("Suspense")
        );
        genreRepository.saveAll(genreList);
    }
}
