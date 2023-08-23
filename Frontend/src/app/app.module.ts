import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimecardsComponent } from './animes/components/animecards/animecards.component';
import { SearchComponent } from './animes/components/search/search.component';
import { AnimedetailsComponent } from './animes/components/animedetails/animedetails.component';
import { ProfileComponent } from './animes/components/profile/profile.component';
import { MylistsComponent } from './animes/components/mylists/mylists.component';
import { HeaderComponent } from './global/header/header.component';
import { FooterComponent } from './global/footer/footer.component';
import { GuardiansComponent } from './core/guardians/guardians.component';
import { LoginformComponent } from './user-forms/components/loginform/loginform.component';
import { RegisterformComponent } from './user-forms/components/registerform/registerform.component';
import { LoginbuttonComponent } from './user-forms/components/loginbutton/loginbutton.component';
import { SignupbuttonComponent } from './user-forms/components/signupbutton/signupbutton.component';
import { DictionaryComponent } from './global/dictionary/dictionary.component';
import { HomeComponent } from './animes/views/home/home.component';
import { DetailsComponent } from './animes/views/details/details.component';
import { FavoritesComponent } from './animes/views/favorites/favorites.component';
import { UpcomingComponent } from './animes/views/upcoming/upcoming.component';
import { Top100Component } from './animes/views/top100/top100.component';
import { LoginComponent } from './user-forms/views/login/login.component';
import { RegisterComponent } from './user-forms/views/register/register.component';
import { AdmindetailsComponent } from './animes/views/admindetails/admindetails.component';
import { AdminhomeComponent } from './animes/views/adminhome/adminhome.component';
import { AddanimeComponent } from './animes/views/addanime/addanime.component';
import { AddnewanimebuttonComponent } from './animes/components/addnewanimebutton/addnewanimebutton.component';
import { AddnewanimeformComponent } from './animes/components/addnewanimeform/addnewanimeform.component';
import { EditdetailsformComponent } from './animes/components/editdetailsform/editdetailsform.component';
import { EditdetailsbuttonComponent } from './animes/components/editdetailsbutton/editdetailsbutton.component';
import { DeleteanimebuttonComponent } from './animes/components/deleteanimebutton/deleteanimebutton.component';
import { FiltersComponent } from './animes/components/filters/filters.component';
import { ProfilemodalComponent } from './global/profilemodal/profilemodal.component';

@NgModule({
  declarations: [
    AppComponent,
    AnimecardsComponent,
    SearchComponent,
    AnimedetailsComponent,
    ProfileComponent,
    MylistsComponent,
    HeaderComponent,
    FooterComponent,
    GuardiansComponent,
    LoginformComponent,
    RegisterformComponent,
    LoginbuttonComponent,
    SignupbuttonComponent,
    DictionaryComponent,
    HomeComponent,
    DetailsComponent,
    FavoritesComponent,
    UpcomingComponent,
    Top100Component,
    LoginComponent,
    RegisterComponent,
    AdmindetailsComponent,
    AdminhomeComponent,
    AddanimeComponent,
    AddnewanimebuttonComponent,
    AddnewanimeformComponent,
    EditdetailsformComponent,
    EditdetailsbuttonComponent,
    DeleteanimebuttonComponent,
    FiltersComponent,
    ProfilemodalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
