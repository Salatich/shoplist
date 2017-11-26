import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListsComponent }   from './lists/lists.component';
import { ListCreatingComponent }      from './list-creating/list-creating.component';
import {AuthGuard} from "./guards/auth.guard";
import {SigninComponent} from "./auth/signin/signin.component";
import {SignupComponent} from "./auth/signup/signup.component";

const routes: Routes = [
  { path: '',component: ListsComponent , canActivate: [AuthGuard] },
  // { path: 'lists', component: ListsComponent },
  { path: 'creating-list', component: ListCreatingComponent },
  { path: 'signin', component: SigninComponent },
  { path: 'signup', component: SignupComponent },

  // otherwise redirect to home
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
