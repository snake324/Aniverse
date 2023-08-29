package dev.kristi4n90.aniverse.services;

import dev.kristi4n90.aniverse.models.Anime;
import dev.kristi4n90.aniverse.repositories.AnimeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public List<Anime> getAllAnime() {
        return animeRepository.findAll();
    }

    public Anime getAnimeById(Long id) {
        Optional<Anime> optionalAnime = animeRepository.findById(id);
        return optionalAnime.orElse(null);
    }

    public Anime createAnime(Anime anime) { return animeRepository.save(anime);}

    public Anime updateAnime(Long id, Anime anime) {
        Anime existingAnime = getAnimeById(id);
        if (existingAnime != null) {
            anime.setIdanime(existingAnime.getIdanime());
            return animeRepository.save(anime);
        } else {
            return null;
        }
    }

    public boolean deleteAnime(Long id) {
        if (getAnimeById(id) != null) {
            animeRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @PostConstruct
    public void insertInitialData() {
        List<Anime> animeList = Arrays.asList(
                new Anime("One Piece", "One Piece narra la historia de un joven llamado Monkey D. Luffy, que inspirado por su amigo pirata Shanks, comienza un viaje para alcanzar su sueño, ser el Rey de los piratas, para lo cual deberá encontrar el tesoro One Piece dejado por el anterior rey de los piratas Gol D. Roger.",
                        "/images/onepiece.jpg", "https://www.youtube.com/watch?v=6_OuVgpigfU", "Toei Animation", "1073", "24", "Fall 1999", "TV"),
                new Anime("Naruto: Shippuden", "Narra la historia de un ninja adolescente llamado Naruto Uzumaki, quien aspira a convertirse en Hokage, líder de su aldea, con el propósito de ser reconocido como alguien importante dentro de la aldea y entre sus compañeros.",
                        "/images/narutoshippuden.jpg", "https://www.youtube.com/watch?v=2upuBiEiXDk", "Pierrot", "500", "23", "Winter 2007", "TV"),
                new Anime("FullMetal Alchemist: Brotherhood", "Este anime nos cuenta la historia de los hermanos Edward (15 años) y Alphonse (14), quienes después de la muerte de su madre (cuando tenían la tierna edad que podéis ver en el gif superior), rompieron el mayor tabú de la alquimia al querer resucitarla: la transmutación humana.",
                        "/images/fullmetall.jpg", "https://www.youtube.com/watch?v=cGcoZh3MIiY", "Bones", "64", "24", "Spring 2009", "TV"),
                new Anime("Dragon Ball", "Dragon Ball narra la historia de Goku, un excepcional niño que llegó a la Tierra en una cápsula durante una noche tormentosa. Sin saber nada de su pasado, un anciano lo cuidó como su nieto hasta los ocho años.",
                        "/images/db.jpg", "https://www.youtube.com/watch?v=L4auFrAK-mQ", "Toei Animation", "153", "24", "Winter 1986", "TV"),
                new Anime("Dragon Ball Z", "La trama de Dragon Ball Z se centra en la vida adulta de Son Goku, quien tendrá que defender la tierra de los numerosos villanos que amenazan con destruirla. Además, la serie trama de forma paralela la madurez de su hijo Gohan. La producción destaca por tener un tono más serio que su predecesora.",
                        "/images/dbz.jpg", "https://www.youtube.com/watch?v=sjeAl6RQILM", "Toei Animation", "291", "24", "Spring 1989", "TV"),
                new Anime("Neon Genesis Evangelion", "La historia de la obra se da lugar en un mundo futurista en el que una organización paramilitar llamada NERV protege a la humanidad de los ataques de seres de origen y naturaleza desconocidos, los «Ángeles», utilizando para ello bio mechas humanoides llamados Evangelion (acortado a EVA).",
                        "/images/evangelion.jpg", "https://www.youtube.com/watch?v=3bdjDmYc8J4", "Gainax", "26", "24", "Fall 1995", "TV"),
                new Anime("Cowboy Bebop", "Cuenta la historia de un grupo de cazarrecompensas que en 2071 viaja por todo el sistema solar a la búsqueda de misiones con la que aumentar su fortuna.",
                        "/images/cowboybebop.jpg", "https://www.youtube.com/watch?v=EL-D9LrFJd4", "Sunrise", "26", "24", "Spring 1998", "TV"),
                new Anime("Rurouni Kenshin (2023)", "Kenshin Himura es un samurái conocido por su destreza con la catana y su frialdad a la hora de matar. En el pasado estuvo al servicio de los Ishin Shishi (patriotas que luchaban para devolver el poder al Emperador), pero, tras terminar los enfrentamientos, Kenshin juró no volver a matar y viajar por el país como un vagabundo, ayudando a quien lo necesitase como penitencia por todas sus muertes.",
                        "/images/kenshin2023.jpg", "https://www.youtube.com/watch?v=V83Kxuvt9Jc", "LIDENFILMS", "24", "22", "Summer 2023", "TV"),
                new Anime("Yu Yu Hakusho", "Cuenta la historia de Yusuke Urameshi, un delincuente juvenil que es atropellado por un automóvil al intentar salvar la vida de un niño. En el otro mundo, es nombrado Detective Espiritual por Koenma y Botan, y debe investigar casos acerca de demonios y apariciones.",
                        "/images/yuyu.jpg", "https://www.youtube.com/watch?v=UQltPgNYDXM", "Pierrot", "112", "24", "Fall 1992", "TV"),
                new Anime("Kimetsu no Yaiba", "Narra las desventuras de Tanjiro, un joven de un Japón feudal fantástico que se ve abocado a la venganza después de que un demonio acabe con toda su familia, a excepción de su hermana, Nezuko, también demoníaca y sedienta de sangre.",
                        "/images/kimetsu.jpg", "https://www.youtube.com/watch?v=VQGCKyvzIM4", "ufotable", "26", "23", "Spring 2019", "TV"),
                new Anime("Jujutsu Kaisen", "Nos cuenta la historia de Yuji Itadori, un estudiante de instituto que pasa sus días con sus amigos en el club de ocultismo de su escuela pero todo esto cambiara cuando descubre que los espíritus realmente existen y deberá reunir un objeto para salvar a sus amigos.",
                        "/images/jujutsu.jpg", "https://www.youtube.com/watch?v=pkKu9hLT-t8", "MAPPA", "24", "23", "Fall 2020", "TV"),
                new Anime("Bleach: Thousand-Year Blood War", "'Bleach' se centra en Ichigo Kurosaki, un joven que puede ver a los espíritus. Cuando una shinigami llamada Rukia Kuchiki es herida al intentar protegerle de un monstruo conocido como Hollow, sin querer le traspasa sus poderes a Ichigo.",
                        "images/bleach2.jpg", "https://www.youtube.com/watch?v=1sygUhb8Q2Y", "Pierrot", "13", "24", "Fall 2022", "TV")
        );
        animeRepository.saveAll(animeList);
    }
}
