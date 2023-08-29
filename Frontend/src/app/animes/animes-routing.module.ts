import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './views/home/home.component';
import { DetailsComponent } from './views/details/details.component';
import { AddanimeComponent } from './views/addanime/addanime.component';
import { AdmindetailsComponent } from './views/admindetails/admindetails.component';
import { AdminhomeComponent } from './views/adminhome/adminhome.component';
import { FavoritesComponent } from './views/favorites/favorites.component';
import { MylistsComponent } from './views/mylists/mylists.component';
import { ProfileComponent } from './views/profile/profile.component';
import { Top100Component } from './views/top100/top100.component';
import { UpcomingComponent } from './views/upcoming/upcoming.component';
import { AllanimesComponent } from './views/allanimes/allanimes.component';

const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'home', component: HomeComponent},
    { path: 'details/:id', component: DetailsComponent },
    { path: 'addanime', component: AddanimeComponent},
    { path: 'admindetails/:id', component: AdmindetailsComponent},
    { path: 'adminhome', component: AdminhomeComponent},
    { path: 'favorites/:id', component: FavoritesComponent},
    { path: 'mylists/:id', component: MylistsComponent},
    { path: 'profile/:id', component: ProfileComponent},
    { path: 'top100', component: Top100Component},
    { path: 'upcoming', component: UpcomingComponent},
    { path: 'allanimes', component: AllanimesComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AnimesRoutingModule { }