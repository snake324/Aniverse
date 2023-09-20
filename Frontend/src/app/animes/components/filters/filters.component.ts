import { Component, OnInit } from '@angular/core';
import { AnimeService } from '../../service/anime.service';

@Component({
  selector: 'app-filters',
  templateUrl: './filters.component.html',
  styleUrls: ['./filters.component.scss']
})
export class FiltersComponent implements OnInit {
  availableGenres: string[] = [];
  activeGenres: string[] = []; 

  constructor(private animeService: AnimeService) {}

  ngOnInit(): void {
    this.animeService.getAnimes().subscribe(animes => {
      this.availableGenres = [...new Set(animes.flatMap(anime => anime.genres.map(genre => genre.genre)))];
    });
  }

  toggleGenre(genre: string): void {
    const index = this.activeGenres.indexOf(genre);

    if (index !== -1) {
      this.activeGenres.splice(index, 1);
    } else {
      this.activeGenres.push(genre);
    }
  }
}
