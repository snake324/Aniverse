import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AnimeService } from '../../service/anime.service';
import { Anime } from '../../models/anime.model';

@Component({
  selector: 'app-detailcards',
  templateUrl: './detailcards.component.html',
  styleUrls: ['./detailcards.component.scss']
})
export class DetailcardsComponent implements OnInit {

  anime: Anime | undefined;
  formattedGenres: string | undefined;

  constructor(
    private route: ActivatedRoute,
    private animeService: AnimeService
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
    this.animeService.getAnime(animeId).subscribe(anime => {
      this.anime = anime;
      if (this.anime && this.anime.genres) {
        this.formattedGenres = this.anime.genres.map(genre => genre.genre).join(', ');
      }
    });
  }
}
