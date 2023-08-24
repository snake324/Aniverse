package dev.kristi4n90.aniverse.models;

import jakarta.persistence.*;

@Entity
@Table(name = "anime")
public class Anime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_anime")
    private Long id;
    private String name;
    public Anime(){
    }

    public Anime(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
