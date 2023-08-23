import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginComponent } from './views/login/login.component';
import { RegisterComponent } from './views/register/register.component';
import { UserFormsRoutingModule } from './user-forms-routing.module';
import { LoginbuttonComponent } from './components/loginbutton/loginbutton.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { RegisterformComponent } from './components/registerform/registerform.component';
import { SignupbuttonComponent } from './components/signupbutton/signupbutton.component';



@NgModule({
  declarations: [
    LoginComponent,
    RegisterComponent,
    LoginbuttonComponent,
    LoginformComponent,
    RegisterformComponent,
    SignupbuttonComponent
  ],
  imports: [
    CommonModule,
    UserFormsRoutingModule
  ]
})
export class UserFormsModule { }