package dev.kristi4n90.aniverse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "anime")
@NoArgsConstructor

public class Anime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idanime;

    @Column(name = "name")
    public String name;

    @Column(name = "synopsis", columnDefinition = "VARCHAR(3000)")
    public String synopsis;

    @Column(name ="imgUrl")
    public String imgUrl;

    @Column(name = "trailer")
    public String trailer;

    @Column(name = "studios")
    public String studios;

    @Column(name = "episodes")
    public String episodes;

    @Column(name = "duration")
    public String duration;

    @Column(name = "premiered")
    public String premiered;

    @Column(name = "type")
    public  String type;

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
        name = "anime_genre",
        joinColumns = @JoinColumn(name = "anime_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )

    private List<Genre> genres = new ArrayList<>();

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Anime(String name, String synopsis, String imgUrl, String trailer, String studios, String episodes, String duration, String premiered, String type){
        this.name = name;
        this.synopsis = synopsis;
        this.imgUrl = imgUrl;
        this.trailer = trailer;
        this.studios = studios;
        this.episodes = episodes;
        this.duration = duration;
        this.premiered = premiered;
        this.type = type;
    }

    public Long getIdanime() {
        return idanime;
    }

    public void setIdanime(Long idanime) {
        this.idanime = idanime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getStudios() {
        return studios;
    }

    public void setStudios(String studios) {
        this.studios = studios;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPremiered() {
        return premiered;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
