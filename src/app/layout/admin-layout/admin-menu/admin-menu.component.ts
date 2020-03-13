import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-menu',
  templateUrl: './admin-menu.component.html',
  styleUrls: ['./admin-menu.component.css']
})
export class AdminMenuComponent implements OnInit {

  isUserCollapsed = false;
  isClientCollapsed = false;
  isAccountCollapsed = false;
  isTeamCollapsed = false;
  isProjectCollapsed = false;
  isSecuritypatternCollapsed = false;
  isNewTeamCollapsed: boolean;

  constructor(private router: Router) {
  }

  ngOnInit() {
  }

  logout() {
    localStorage.clear();
    this.router.navigateByUrl('');
  }

  userscollapse() {
    if (this.isUserCollapsed === false) {
      this.isUserCollapsed = true;
    } else { this.isUserCollapsed = false; }
  }

  accountcollapse() {
    if (this.isAccountCollapsed === false) {
      this.isAccountCollapsed = true;
    } else { this.isAccountCollapsed = false; }
  }

  teamscollapse() {
    if(this.isTeamCollapsed === false) {
      this.isTeamCollapsed = true;
    } else { this.isTeamCollapsed = false; }
  }

  projectscollapse() {
    if(this.isProjectCollapsed === false){
      this.isProjectCollapsed = true;
    }else { this.isProjectCollapsed = false; }
  }

  securitypatternscollapse(){
    if(this.isSecuritypatternCollapsed === false) {
      this.isSecuritypatternCollapsed = true;
    }else { this.isSecuritypatternCollapsed = false; }
  }
  newTeamcollapse(){
    if(this.isNewTeamCollapsed === false) {
      this.isNewTeamCollapsed = true;
    }else { this.isNewTeamCollapsed = false; }
  }
}
