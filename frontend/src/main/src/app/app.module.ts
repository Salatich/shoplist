import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { ListCreatingComponent } from './list-creating/list-creating.component';
import { ListsComponent } from './lists/lists.component';


import { AppRoutingModule } from './app-routing.module';
import {DataService} from "./services/data.service";
import {AuthenticationService} from "./services/authentication.service";
import {AuthGuard} from "./guards/auth.guard";
import { HeaderComponent } from './header/header.component';
import { SigninComponent } from './auth/signin/signin.component';
import { SignupComponent } from './auth/signup/signup.component';

@NgModule({
  declarations: [
    AppComponent,
    ListCreatingComponent,
    ListsComponent,
    HeaderComponent,
    SigninComponent,
    SignupComponent
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
