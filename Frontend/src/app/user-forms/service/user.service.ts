import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:4000';

  private actualUser!: User;
  constructor(private httpClient: HttpClient) {}
  public registerUser(mail: string, password: string): Observable<any> {
    const status = true;

    const user = {
      mail,
      password,
      status: status
    };

    return this.httpClient.post<any>(`${this.baseUrl}/register`, user);
  }
  public loginUser(mail: string, password: string, headers: HttpHeaders): Observable<any> {
    return this.httpClient.post<any>(`${this.baseUrl}/login`, {}, { headers, withCredentials: true  });
  }

  setUser(user: any) {
    this.actualUser = user;
  }
  getUser(): User {
    return this.actualUser;
  }

}
