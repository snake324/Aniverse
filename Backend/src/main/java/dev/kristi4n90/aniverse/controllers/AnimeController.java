package dev.kristi4n90.aniverse.controllers;

import dev.kristi4n90.aniverse.models.Anime;
import dev.kristi4n90.aniverse.services.AnimeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private final AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping
    public ResponseEntity<List<Anime>> getAllAnime() {
        List<Anime> animeList = animeService.getAllAnime();
        return new ResponseEntity<>(animeList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> getAnimeById(@PathVariable Long id) {
        Anime anime = animeService.getAnimeById(id);
        if (anime != null) {
            return new ResponseEntity<>(anime, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/search")
    public List<Anime> searchAnime(@RequestParam("term") String searchTerm) {
        List<Anime> foundAnimes = animeService.searchByTerm(searchTerm);
        return foundAnimes;
    }

    @PostMapping("/create")
    public ResponseEntity<Anime> createAnime(@RequestBody Anime anime) {
        Anime createdAnime = animeService.createAnime(anime);
        return new ResponseEntity<>(createdAnime, HttpStatus.CREATED);
    }    

    @PutMapping("/update/{id}")
    public ResponseEntity<Anime> updateAnime(@PathVariable Long id, @RequestBody Anime anime) {
        Anime updatedAnime = animeService.updateAnime(id, anime);
        if (updatedAnime != null) {
            return new ResponseEntity<>(updatedAnime, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAnime(@PathVariable Long id) {
        boolean deleted = animeService.deleteAnime(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}



