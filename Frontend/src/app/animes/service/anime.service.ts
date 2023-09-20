import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Anime } from '../models/anime.model'
import { Observable } from 'rxjs';
import { Review } from '../models/review.model';

@Injectable({
  providedIn: 'root'
})
export class AnimeService {

  private apiUrl = 'http://localhost:4000/anime';

  constructor(private http: HttpClient) { }

  getAnimes(): Observable<Anime[]> {
    return this.http.get<Anime[]>(this.apiUrl);
  }

  getAnime(animeId: string): Observable<Anime> {
    const url = `${this.apiUrl}/${animeId}`; 
    return this.http.get<Anime>(url);
  }

  saveAnime(animeData: Anime): Observable<Anime> {
    return this.http.post<Anime>(`${this.apiUrl}/create`, animeData);
  }

  deleteAnime(animeId: string): Observable<Anime> {
    return this.http.delete<Anime>(`${this.apiUrl}/delete/${animeId}`);
  }

  getAnimeReviews(animeId: string): Observable<Review[]> {
    return this.http.get<Review[]>(`http://localhost:4000/user-preferences/${animeId}`);
  }

  createReview(animeId: string, reviewData: any): Observable<any> {
    const url = `http://localhost:4000/user-preferences`;
    return this.http.post(url, { animeId, reviewData });
  }

  getGenres(): Observable<string[]> {
    return this.http.get<string[]>(`http://localhost:4000/genre`);
  }
  
  
}
