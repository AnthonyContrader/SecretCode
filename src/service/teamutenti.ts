import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { TeamUtentiDTO } from 'src/dto/teamutenti';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { tap, catchError } from 'rxjs/operators';
import { UserDTO } from 'src/dto/userdto';

@Injectable({
  providedIn: 'root'
})
export class TeamUtentiService extends AbstractService<TeamUtentiDTO>{
  
  constructor(http: HttpClient) {
    super(http);
    this.type = 'teamutenti';
  }
  findByName(nome:string):Observable<any>{
    return this.http.get<UserDTO>('http://localhost:' + this.port + '/' + this.type + '/findByName?username=' + nome);
}
  
  

}