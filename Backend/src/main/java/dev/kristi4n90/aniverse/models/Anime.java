package dev.kristi4n90.aniverse.models;

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


    public Anime(String name, String synopsis, String imgUrl, String trailer){
        this.name = name;
        this.synopsis = synopsis;
        this.imgUrl = imgUrl;
        this.trailer = trailer;
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

    public Long getTrailer() {
        return trailer;
    }

    public void setTrailer(Long trailer) {
        this.trailer = trailer;
    }
}
