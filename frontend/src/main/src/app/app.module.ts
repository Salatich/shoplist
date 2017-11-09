import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { ListCreatingComponent } from './list-creating/list-creating.component';
import { ListsComponent } from './lists/lists.component';


import { AppRoutingModule } from './/app-routing.module';
import {DataService} from "./services/data.service";

@NgModule({
  declarations: [
    AppComponent,
    ListCreatingComponent,
    ListsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
