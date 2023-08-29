import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Anime } from '../models/anime.model'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AnimeService {

  private apiUrl = 'http://localhost:4000/events';

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
}
