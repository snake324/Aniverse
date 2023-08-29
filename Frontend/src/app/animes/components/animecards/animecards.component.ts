import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Anime } from '../../models/anime.model';
import { AnimeService } from '../../service/anime.service';

@Component({
  selector: 'app-animecards',
  templateUrl: './animecards.component.html',
  styleUrls: ['./animecards.component.scss']
})
export class AnimecardsComponent implements OnInit{
  
  animeData: Anime[] = [];

  constructor(private router: Router, private animeService: AnimeService) { }

  ngOnInit() {
    this.fetchEventsData();
  }

  fetchEventsData() {
    this.animeService.getAnimes().subscribe(
      (data: Anime[]) => {
        this.animeData = data;
      },
      (error) => {
        console.log('Error fetching events data: ', error);
      }
    );
  }
}
