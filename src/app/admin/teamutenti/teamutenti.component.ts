import {  Component, OnInit  } from '@angular/core';
import {  TeamUtentiService } from 'src/service/teamutenti';
import {  TeamUtentiDTO  } from 'src/dto/teamutenti';

@Component({
    selector: 'app-teamutenti',
    templateUrl: './teamutenti.component.html',
    styleUrls: ['./teamutenti.component.css']
})

export class TeamUtentiComponent implements OnInit {

    teamutentis: TeamUtentiDTO[];
    teamutentitoinsert: TeamUtentiDTO = new TeamUtentiDTO();

    constructor(private service: TeamUtentiService) { }

    ngOnInit() {
        this.getTeamUtentis();
    }

    getTeamUtentis() {
        this.service.getAll().subscribe(teamutenti => this.teamutentis = teamutenti);
    }

    delete(teamutenti: TeamUtentiDTO) {
        this.service.delete(teamutenti.id).subscribe(()  =>  this.getTeamUtentis());
    }

    update(teamutenti: TeamUtentiDTO) {
        this.service.update(teamutenti).subscribe(()  => this.getTeamUtentis());
    }

    insert(teamutenti: TeamUtentiDTO) {
        this.service.insert(teamutenti).subscribe(()  => this.getTeamUtentis());
    }

    clear(){
        this.teamutentitoinsert = new TeamUtentiDTO();
    }
  }