import {Component, OnInit} from '@angular/core';
import {AuthenticationService} from "../../services/authentication.service";
import {Router} from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {

  constructor(private authService: AuthenticationService, private router: Router) {
  }


  ngOnInit() {
  }

  onRegister() {
    this.authService.register();
    this.router.navigate(['/']);

  }

}
