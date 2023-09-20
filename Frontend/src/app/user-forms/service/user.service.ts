import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private apiUrl = 'http://localhost:4000';

  constructor(private httpClient: HttpClient) { }

  public loginUser(mail: string, password: string, headers: HttpHeaders): Observable<any> {
    return this.httpClient.post<any>(`${this.apiUrl}/login`, {}, { headers, withCredentials: true  });
  }

  register(email: string, password: string): Observable<User> {
    return this.httpClient.post<User>(`${this.apiUrl}/register`, { email, password });
  }

}
