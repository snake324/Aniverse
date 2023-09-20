import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './global/header/header.component';
import { FooterComponent } from './global/footer/footer.component';
import { GuardiansComponent } from './core/guardians/guardians.component';
import { ProfilemodalComponent } from './global/profilemodal/profilemodal.component';
import { AnimesModule } from './animes/animes.module';
import { UserFormsModule } from './user-forms/user-forms.module';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    GuardiansComponent,
    ProfilemodalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AnimesModule,
    UserFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
