import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private isLoggedIn = new BehaviorSubject<boolean>(false);

  constructor() {
    this.isLoggedIn.next(localStorage.getItem('isLoggedIn') === 'true');
  }

  setLoggedIn(value: boolean) {
    this.isLoggedIn.next(value);
    localStorage.setItem('isLoggedIn', value.toString());
  }

  public isLoggedIn$(): Observable<boolean> {
    return this.isLoggedIn.asObservable();
  }
}
