import { AbstractService } from "./abstractservice";
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NewTeamDTO } from 'src/dto/Newteamdto';
import { Observable } from 'rxjs';
import { TeamDTO } from 'src/dto/teamdto';
import { UserDTO } from 'src/dto/userdto';


 

@Injectable({
    providedIn: 'root'
})

export class NewTeamService extends AbstractService<NewTeamDTO>{


    constructor(http: HttpClient) {
        super(http);
        this.type = 'newteam';
    }
    Team(NewTeamDTO: NewTeamDTO): Observable<NewTeamDTO>{
        return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', TeamDTO )
      }
   User(NewTeamDTO: NewTeamDTO): Observable<NewTeamDTO>{
        return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', UserDTO )
      }
}