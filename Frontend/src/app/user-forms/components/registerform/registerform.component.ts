import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../../service/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registerform',
  templateUrl: './registerform.component.html',
  styleUrls: ['./registerform.component.scss']
})
export class RegisterformComponent {
  formregister!: FormGroup;

  constructor(
    private formBuilder: FormBuilder, 
    private userService: UserService,
    private router: Router
    ) { }

  ngOnInit() {
    this.formregister = this.formBuilder.group({
      mail: ['', [ Validators.email]],
      password: ['', [Validators.required, Validators.minLength(4)]]
    });
  }

  registerUser() {
    if (this.formregister.valid) {
      const mail = this.formregister.get('mail')?.value;
      const password = this.formregister.get('password')?.value;

      this.userService.registerUser(mail, password)
        .subscribe(
          (response) => {
            console.log('Usuario registrado con éxito', response);
            this.router.navigate(['/user-forms/login']);
          },
          (error) => {
            console.error('Error al registrar usuario', error);
          }
        );
    }
  }
}


