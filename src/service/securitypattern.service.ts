import { Injectable } from "@angular/core";
import { AbstractService } from './abstractservice';
import { SecuritypatternDTO } from 'src/dto/securitypatterndto';
import { HttpClient } from '@angular/common/http';





@Injectable({
    providedIn: 'root'
})

export class SecuritypatternService extends AbstractService<SecuritypatternDTO>{


    constructor(http: HttpClient) {
        super(http);
        this.type = 'securitypattern';
    }
}