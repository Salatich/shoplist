import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
// import { Observable } from 'rxjs/Observable';
// import { AppRoutingModule } from '../app-routing.module';
import { AuthenticationService } from '../services/authentication.service';

@Injectable()
export class AuthGuard implements CanActivate {

  constructor( private router: Router , private auth: AuthenticationService  ){}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
    // if (this.auth.isLoggedIn('currentUser')) {
    //   return true;
    // }
    //
    // // not logged in so redirect to login page with the return url
    // this.router.navigate(['/login'], { queryParams: { returnUrl: state.url }});
    // return false;

    let url: string = state.url;

    return this.checkLogin(url);
  }

  checkLogin(url: string): boolean {
    if (this.auth.isLoggedIn) { return true; }

    // Store the attempted URL for redirecting
    this.auth.redirectUrl = url;

    // Navigate to the login page with extras
    this.router.navigate(['/entry']);
    return false;
  }

}
