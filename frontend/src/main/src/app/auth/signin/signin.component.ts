import {Component, OnInit} from '@angular/core';
import {AuthenticationService} from "../../services/authentication.service";
import {Router} from '@angular/router';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.scss']
})
export class SigninComponent implements OnInit {

  constructor(private authService: AuthenticationService, private router: Router) {
  }

  ngOnInit() {
  }

  onLogin() {
    this.authService.login();
    this.router.navigate(['/']);
  }


}
