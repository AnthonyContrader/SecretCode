import { AbstractService } from "./abstractservice";
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TeamDTO } from 'src/dto/teamdto';
import { UserDTO } from 'src/dto/userdto';
import { Observable } from 'rxjs';


 

@Injectable({
    providedIn: 'root'
})

export class TeamService extends AbstractService<TeamDTO>{


    constructor(http: HttpClient) {
        super(http);
        this.type = 'team';
    }

    NewTeam(userDTO: UserDTO): Observable<UserDTO>{
        return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', UserDTO )
      }
}