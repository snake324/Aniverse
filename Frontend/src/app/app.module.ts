import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './global/header/header.component';
import { FooterComponent } from './global/footer/footer.component';
import { GuardiansComponent } from './core/guardians/guardians.component';
import { DictionaryComponent } from './global/dictionary/dictionary.component';
import { ProfilemodalComponent } from './global/profilemodal/profilemodal.component';
import { AnimesModule } from './animes/animes.module';
import { UserFormsModule } from './user-forms/user-forms.module';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    GuardiansComponent,
    DictionaryComponent,
    ProfilemodalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AnimesModule,
    UserFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
