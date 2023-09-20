import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Anime } from '../../models/anime.model';
import { AnimeService } from '../../service/anime.service';

@Component({
  selector: 'app-animecards',
  templateUrl: './animecards.component.html',
  styleUrls: ['./animecards.component.scss']
})
export class AnimecardsComponent implements OnInit {
  animeData: Anime[] = [];
  animeGroupedByGenre: { [key: string]: Anime[] } = {}; // Declaración de la propiedad
  activeGenres: string[] = []; // Géneros activos

  constructor(private router: Router, private animeService: AnimeService) { }

  ngOnInit() {
    this.fetchAnimesData();
  }

  fetchAnimesData() {
    this.animeService.getAnimes().subscribe(
      (data: Anime[]) => {
        this.animeData = data;
        this.groupAnimeByGenre(); // Llamar a la función de agrupamiento
      },
      (error) => {
        console.log('Error fetching events data: ', error);
      }
    );
  }

  // Filtrar y agrupar animes por género
  groupAnimeByGenre() {
    this.animeGroupedByGenre = {};

    for (const anime of this.animeData) {
      for (const genre of anime.genres) {
        if (this.activeGenres.length === 0 || this.activeGenres.includes(genre.genre)) {
          if (!this.animeGroupedByGenre[genre.genre]) {
            this.animeGroupedByGenre[genre.genre] = [];
          }
          this.animeGroupedByGenre[genre.genre].push(anime);
        }
      }
    }
  }
}

