import { Component, OnInit } from '@angular/core';
import {  TeamService } from 'src/service/team.service';
import {  TeamDTO  } from 'src/dto/teamdto';
import {  NewTeamService } from 'src/service/newteamservice';
import {  NewTeamDTO  } from 'src/dto/newteamdto';
import { UserDTO } from 'src/dto/userdto';

@Component({
  selector: 'app-new-team',
  templateUrl: './new-team.component.html',
  styleUrls: ['./new-team.component.css']
})
export class NewTeamComponent implements OnInit {

  Newteams: NewTeamDTO[];
  newteaminsert: NewTeamDTO = new NewTeamDTO();
  newteamtoinsert: NewTeamDTO;

  constructor(private service: NewTeamService) { }

  ngOnInit() {
    this.getNewTeams();
  }

  getNewTeams() {
      this.service.getAll().subscribe(newteam => this.Newteams = newteam);
  }

  delete(newteam: NewTeamDTO) {
      this.service.delete(newteam.id).subscribe(()  =>  this.getNewTeams());
  }

  update(newteam: NewTeamDTO) {
      this.service.update(newteam).subscribe(()  => this.getNewTeams());
  }

  insert(newteam: NewTeamDTO) {
      this.service.insert(newteam).subscribe(()  => this.getNewTeams());
  }

  clear(){
      this.newteamtoinsert = new NewTeamDTO();
  }
}


