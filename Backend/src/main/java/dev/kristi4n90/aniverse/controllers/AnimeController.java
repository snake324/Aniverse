package dev.kristi4n90.aniverse.controllers;

import dev.kristi4n90.aniverse.models.Anime;
import dev.kristi4n90.aniverse.services.AnimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimeController {

    AnimeService service;

    public AnimeController(AnimeService service) {
        this.service = service;
    }

    @GetMapping(path = "/animes")
    public List<Anime> index() {

        List<Anime> animes = service.getAll();
        return animes;
    }

    @GetMapping(path = "/animes/{id}")
    public Anime show(@PathVariable("id") Long id) {
        Anime anime = service.findById(id);
        return anime;
    }
}
