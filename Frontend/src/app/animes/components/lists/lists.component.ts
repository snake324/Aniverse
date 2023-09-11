import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AnimeService } from '../../service/anime.service';
import { Anime } from '../../models/anime.model';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

@Component({
  selector: 'app-lists',
  templateUrl: './lists.component.html',
  styleUrls: ['./lists.component.scss']
})
export class ListsComponent {

  anime: Anime | undefined;
  safeTrailerUrl: SafeResourceUrl | undefined;

  constructor(
    private route: ActivatedRoute,
    private animeService: AnimeService,
    private sanitizer: DomSanitizer
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
        if (this.anime && this.anime.trailer) {
          this.safeTrailerUrl = this.sanitizer.bypassSecurityTrustResourceUrl(this.anime.trailer);
        }
      });
  }
}
