import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListsComponent }   from './lists/lists.component';
import { ListCreatingComponent }      from './list-creating/list-creating.component';

const routes: Routes = [
  { path: '', redirectTo: '/lists', pathMatch: 'full' },
  { path: 'lists', component: ListsComponent },
  { path: 'creating-list', component: ListCreatingComponent },
  // { path: 'heroes', component: HeroesComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
