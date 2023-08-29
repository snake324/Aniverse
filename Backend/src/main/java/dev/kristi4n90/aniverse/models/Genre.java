package dev.kristi4n90.aniverse.models;

import jakarta.persistence.*;

@Entity
@Table(name = "genre")
public  class Genre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idgenre;

    @Column(name = "genre")
    public String genre;

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
