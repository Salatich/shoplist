import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { ListCreatingComponent } from './list-creating/list-creating.component';
import { ListsComponent } from './lists/lists.component';


import { AppRoutingModule } from './app-routing.module';
import {DataService} from "./services/data.service";
import { EntryComponent } from './entry/entry.component';
import {AuthenticationService} from "./services/authentication.service";
import {AuthGuard} from "./guards/auth.guard";

@NgModule({
  declarations: [
    AppComponent,
    ListCreatingComponent,
    ListsComponent,
    EntryComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [DataService,AuthenticationService,AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
