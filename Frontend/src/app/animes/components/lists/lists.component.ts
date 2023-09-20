import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AnimeService } from '../../service/anime.service';
import { Anime } from '../../models/anime.model';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Review } from '../../models/review.model';

@Component({
  selector: 'app-lists',
  templateUrl: './lists.component.html',
  styleUrls: ['./lists.component.scss']
})
export class ListsComponent {

  anime: Anime | undefined;
  safeTrailerUrl: SafeResourceUrl | undefined;
  reviewForm: FormGroup;
  reviews: Review[] = [];

  constructor(
    private route: ActivatedRoute,
    private animeService: AnimeService,
    private sanitizer: DomSanitizer,
    private formBuilder: FormBuilder // Inyecta FormBuilder
  ) {
    this.reviewForm = this.formBuilder.group({
      rating: ['', Validators.required],
      reviewText: ['', Validators.required],
      status: ['', Validators.required]
    });
  }

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

  getAnimeReviews(animeId: string): void {
    this.animeService.getAnimeReviews(animeId).subscribe(reviews => {
      this.reviews = reviews;
    });
  }

  onSubmitReview() {
    if (this.reviewForm.valid) {
      const reviewData = this.reviewForm.value;
      const animeId = this.anime?.idanime;
  
      if (animeId !== undefined) { 
        this.animeService.createReview(animeId.toString(), reviewData).subscribe(
          (response) => {
            console.log('Revisión creada con éxito:', response);
          },
          (error) => {
            console.error('Error al crear la revisión:', error);
          }
        );
      } else {
        console.error('ID del anime es undefined');
      }
    }
  }
  
  
  
}
