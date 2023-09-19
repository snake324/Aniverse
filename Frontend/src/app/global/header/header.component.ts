import { Component, OnInit } from '@angular/core';
import { AuthService } from '../service/auth.service';
import { ProfileService } from '../service/profile/profile.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit{

  isLoggedIn: boolean = false;

  constructor(
    private authService: AuthService
  ) {}

  ngOnInit() {
    this.authService.isLoggedIn$().subscribe((loggedIn) => {
      this.isLoggedIn = loggedIn;
    });
  }
}
