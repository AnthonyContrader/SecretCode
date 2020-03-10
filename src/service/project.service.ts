import { Injectable } from "@angular/core";
import { AbstractService } from './abstractservice';
import { HttpClient } from '@angular/common/http';
import { ProjectDTO } from 'src/dto/projectdto';




@Injectable({
    providedIn: 'root'
})

export class ProjectService extends AbstractService<ProjectDTO>{


    constructor(http: HttpClient) {
        super(http);
        this.type = 'project';
    }

    
}