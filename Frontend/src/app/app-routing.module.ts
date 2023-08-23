import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'animes', pathMatch: 'full' },
  { path: 'animes', loadChildren: () => import('./animes/animes.module').then(m => m.AnimesModule) },
  { path: 'user-forms', loadChildren: () => import('./user-forms/user-forms.module').then(m => m.UserFormsModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
