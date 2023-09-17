import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Genre } from '../../models/genre.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GenreService {

  private apiUrl = 'http://localhost:4000/genre';

  constructor(private http: HttpClient) { }

  getGenres(): Observable<Genre[]> {
    return this.http.get<Genre[]>(this.apiUrl);
  }

  getGenre(idgenre: number): Observable<Genre> {
    const url = `${this.apiUrl}/${idgenre}`; 
    return this.http.get<Genre>(url);
  }

  saveGenre(genreData: Genre): Observable<Genre> {
    return this.http.post<Genre>(`${this.apiUrl}/create`, genreData);
  }

  deleteGenre(genreId: string): Observable<Genre> {
    return this.http.delete<Genre>(`${this.apiUrl}/delete/${genreId}`);
  }

  getGenresByAnimeId(animeId: number): Observable<Genre[]> {
    const url = `${this.apiUrl}?animeId=${animeId}`;
    return this.http.get<Genre[]>(url);
  }
  
}