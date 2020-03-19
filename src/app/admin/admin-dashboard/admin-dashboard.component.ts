import { Component, OnInit } from '@angular/core';
import { UserDTO } from 'src/dto/userdto';
import { TeamDTO } from 'src/dto/teamdto';
import { ProjectDTO } from 'src/dto/projectdto';
import { SecuritypatternDTO } from 'src/dto/securitypatterndto';
import { TeamUtentiDTO } from 'src/dto/teamutenti';

/**
 * Componente della dashboard admin. Nell'ngOnInit recupera
 * l'utente loggato per il messaggio di benvenuto.
 */
@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  user: UserDTO;
  
  team: TeamDTO;
   
  teamUtenti: TeamUtentiDTO;
  project: ProjectDTO;

  securitypattern: SecuritypatternDTO;

  constructor() { }

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('currentUser'));
    this.team = JSON.parse(localStorage.getItem('currentTeam'));
    this.project = JSON.parse(localStorage.getItem('currentProject'));
    this.securitypattern = JSON.parse(localStorage.getItem('currentSecuritypattern'));
    this.teamUtenti = JSON.parse(localStorage.getItem('currentTeamUtenti'));
  }

}
