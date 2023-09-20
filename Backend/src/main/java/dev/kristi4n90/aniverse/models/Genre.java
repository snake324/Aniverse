package dev.kristi4n90.aniverse.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "genre")
@NoArgsConstructor

public  class Genre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idgenre;

    @Column(name = "genre")
    public String genre;

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JsonIgnore
    @JoinTable(
        name = "anime_genre",
        joinColumns = @JoinColumn(name = "genre_id"),
        inverseJoinColumns = @JoinColumn(name = "anime_id")
    )
    private List<Anime> animes = new ArrayList<>();


    public List<Anime> getAnimes() {
        return animes;
    }

    public void setAnimes(List<Anime> animes) {
        this.animes = animes;
    }

    public Genre(String genre){
        this.genre= genre;
    }

    public Long getIdgenre() {
        return idgenre;
    }

    public void setIdgenre(Long idgenre) {
        this.idgenre = idgenre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
