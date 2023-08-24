package dev.kristi4n90.aniverse.repositories;

import dev.kristi4n90.aniverse.models.anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<anime,Long> {
}
