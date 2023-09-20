import { Component } from '@angular/core';
import { AnimeService } from '../../service/anime.service';
import { Anime } from '../../models/anime.model';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent {
  searchTerm: string = ''; 
  searchResults: Anime[] = [];

  constructor(private animeService: AnimeService) {}

  searchAnimes(): void {
    this.animeService.searchAnimes(this.searchTerm).subscribe(
      (results: Anime[]) => {
        this.searchResults = results;
      },
      (error) => {
        console.log('Error searching anime: ', error);
      }
    );
  }
}
