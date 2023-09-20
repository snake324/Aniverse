import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../../service/user.service';

@Component({
  selector: 'app-registerform',
  templateUrl: './registerform.component.html',
  styleUrls: ['./registerform.component.scss']
})
export class RegisterformComponent {
  registrationForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private userService: UserService) {
    this.registrationForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(8)]]
    });
  }

  onSubmit() {
    if (this.registrationForm.valid) {
      const email = this.registrationForm.value.email;
      const password = this.registrationForm.value.password;

      this.userService.register(email, password).subscribe(
        (user) => {
          // Registro exitoso, puedes manejar la respuesta del servidor aquí
          console.log('Registro exitoso', user);
          // También puedes redirigir o mostrar un mensaje de éxito
        },
        (error) => {
          // Manejar errores en caso de que ocurra un problema durante el registro
          console.error('Error durante el registro', error);
        }
      );
    }
  }
}


