import { Injectable } from "@angular/core";
import { AbstractService } from './abstractservice';
import { HttpClient } from '@angular/common/http';
import { ProjectDTO } from 'src/dto/projectdto';
import { TeamDTO } from 'src/dto/teamdto';
import { from, Observable } from 'rxjs';



@Injectable({
    providedIn: 'root'
})

export class ProjectService extends AbstractService<ProjectDTO>{


    constructor(http: HttpClient) {
        super(http);
        this.type = 'project';
    }
    Team(TeamDTO: TeamDTO): Observable<TeamDTO>{
        return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', TeamDTO )
    }
}