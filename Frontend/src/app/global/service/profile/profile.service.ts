import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Profile } from '../../models/profile.model';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
  private baseUrl = 'http://localhost:4000/profile';

  constructor(private http: HttpClient) {}

  getProfileById(id: number): Observable<Profile> {
    const url = `${this.baseUrl}/${id}`;
    return this.http.get<Profile>(url);
  }

  updateProfile(id: number, updatedProfile: Profile): Observable<Profile> {
    const url = `${this.baseUrl}/${id}`;
    return this.http.put<Profile>(url, updatedProfile);
  }
}
