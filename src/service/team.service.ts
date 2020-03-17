import { AbstractService } from "./abstractservice";
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TeamDTO } from 'src/dto/teamdto';
import { UserDTO } from 'src/dto/userdto';
import { Observable } from 'rxjs';
import { ProjectDTO } from 'src/dto/projectdto';


 

@Injectable({
    providedIn: 'root'
})

export class TeamService extends AbstractService<TeamDTO>{


    constructor(http: HttpClient) {
        super(http);
        this.type = 'team';
    }

    User(userDTO: UserDTO): Observable<UserDTO>{
        return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', UserDTO )
      }
    Project(projectDTO: ProjectDTO): Observable<ProjectDTO>{
        return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', ProjectDTO )
      }
}