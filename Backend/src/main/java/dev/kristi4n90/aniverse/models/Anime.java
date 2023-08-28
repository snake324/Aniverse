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
    public Anime(String name){
        this.name = name;
        this.synopsis = synopsis;
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
}
