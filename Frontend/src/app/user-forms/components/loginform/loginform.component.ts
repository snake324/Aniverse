import { Component } from '@angular/core';
import { UserService } from '../../service/user.service';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/global/service/auth.service';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.scss']
})
export class LoginformComponent {
  email: string = '';
  password: string = '';

  constructor(
    private userService: UserService, 
    private router: Router, 
    private authService: AuthService
    ) {}

  onSubmit() {
    if (this.email && this.password) {
      this.userService.login(this.email, this.password)
        .subscribe(
          (user) => {
            console.log('Inicio de sesión exitoso:', user);
            this.authService.setLoggedIn(true);
            this.router.navigate(['/animes/home']);
          },
          (error) => {
            console.error('Error al iniciar sesión:', error);
          }
        );
    }
  }
}
