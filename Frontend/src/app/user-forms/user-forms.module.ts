import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginComponent } from './views/login/login.component';
import { RegisterComponent } from './views/register/register.component';
import { UserFormsRoutingModule } from './user-forms-routing.module';
import { LoginformComponent } from './components/loginform/loginform.component';
import { RegisterformComponent } from './components/registerform/registerform.component';



@NgModule({
  declarations: [
    LoginComponent,
    RegisterComponent,
    LoginformComponent,
    RegisterformComponent
  ],
  imports: [
    CommonModule,
    UserFormsRoutingModule
  ]
})
export class UserFormsModule { }