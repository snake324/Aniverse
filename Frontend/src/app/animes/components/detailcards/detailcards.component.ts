import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AnimeService } from '../../service/anime.service';
import { Anime } from '../../models/anime.model';
import { GenreService } from '../../service/genre/genre.service';
import { Genre } from '../../models/genre.model';

@Component({
  selector: 'app-detailcards',
  templateUrl: './detailcards.component.html',
  styleUrls: ['./detailcards.component.scss']
})
export class DetailcardsComponent {

  anime: Anime | undefined;
  genres: Genre[] | undefined;
  formattedGenres: string | undefined; // Nueva propiedad para la cadena de géneros formateada

  constructor(
    private route: ActivatedRoute,
    private animeService: AnimeService,
    private genreService: GenreService
  ) {}

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const animeId = params.get('id');
      if (animeId) {
        this.getAnimeDetails(animeId);
      }
    });
  }

  getAnimeDetails(animeId: string): void {
    this.animeService.getAnime(animeId)
      .subscribe(anime => {
        this.anime = anime;

        if (anime.idanime) {
          this.genreService.getGenresByAnimeId(anime.idanime)
            .subscribe(genres => {
              this.genres = genres;
              this.formattedGenres = this.genres.map(genre => genre.genre).join(', ');
            });
        }
      });
  }

}