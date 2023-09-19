package dev.kristi4n90.aniverse.services;

import dev.kristi4n90.aniverse.models.Genre;
import dev.kristi4n90.aniverse.repositories.GenreRepository;
import org.springframework.stereotype.Service;

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

}
