import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AnimesRoutingModule } from './animes-routing.module';
import { AnimecardsComponent } from './components/animecards/animecards.component';
import { SearchComponent } from './components/search/search.component';
import { AnimedetailsComponent } from './components/animedetails/animedetails.component';
import { HomeComponent } from './views/home/home.component';
import { DetailsComponent } from './views/details/details.component';
import { FavoritesComponent } from './views/favorites/favorites.component';
import { UpcomingComponent } from './views/upcoming/upcoming.component';
import { Top100Component } from './views/top100/top100.component';
import { AdmindetailsComponent } from './views/admindetails/admindetails.component';
import { AdminhomeComponent } from './views/adminhome/adminhome.component';
import { AddanimeComponent } from './views/addanime/addanime.component';
import { AddnewanimebuttonComponent } from './components/addnewanimebutton/addnewanimebutton.component';
import { AddnewanimeformComponent } from './components/addnewanimeform/addnewanimeform.component';
import { EditdetailsformComponent } from './components/editdetailsform/editdetailsform.component';
import { EditdetailsbuttonComponent } from './components/editdetailsbutton/editdetailsbutton.component';
import { DeleteanimebuttonComponent } from './components/deleteanimebutton/deleteanimebutton.component';
import { FiltersComponent } from './components/filters/filters.component';
import { ListsComponent } from './components/lists/lists.component';
import { MylistsComponent } from './views/mylists/mylists.component';
import { UserdetailsComponent } from './components/userdetails/userdetails.component';
import { AllanimesComponent } from './views/allanimes/allanimes.component';

@NgModule({
  declarations: [
    AnimecardsComponent,
    SearchComponent,
    AnimedetailsComponent,
    HomeComponent,
    DetailsComponent,
    FavoritesComponent,
    UpcomingComponent,
    Top100Component,
    AdmindetailsComponent,
    AdminhomeComponent,
    AddanimeComponent,
    AddnewanimebuttonComponent,
    AddnewanimeformComponent,
    EditdetailsformComponent,
    EditdetailsbuttonComponent,
    DeleteanimebuttonComponent,
    FiltersComponent,
    ListsComponent,
    MylistsComponent,
    UserdetailsComponent,
    AllanimesComponent
  ],
  imports: [
    CommonModule,
    AnimesRoutingModule
  ]
})
export class AnimesModule { }