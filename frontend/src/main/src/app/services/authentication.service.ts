import {Injectable} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/delay';

@Injectable()
export class AuthenticationService {
  private token: string;

  constructor() {
  }

  // store the URL so we can redirect after logging in
  redirectUrl: string;

  // login(): Observable<boolean> {
  //   return Observable.of(true).delay(1000).do(val => this.token = 'test');
  // }
  login() {
   this.token = 'test';
  }

  // logout(): Observable<boolean> {
  //   return Observable.of(false).do(val => this.token = null);
  // }
 logout() {
   this.token = null;
  }

  register(): Observable<boolean> {
    return Observable.of(true).delay(1000).do(val => this.token = 'test');
  }

  isAuthenticated(): boolean {
    return this.token != null;
  }
}
