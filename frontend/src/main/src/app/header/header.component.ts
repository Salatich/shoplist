import { Component, OnInit } from '@angular/core';
import {AuthenticationService} from "../services/authentication.service";
import {Router} from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  constructor(private authService:AuthenticationService,private router: Router) { }

  ngOnInit() {
  }

  onLogout(){
   this.authService.logout();
   this.router.navigate(['/signin']);

  }

}
