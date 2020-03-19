import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { UserDTO } from 'src/dto/userdto';
import { HttpClient } from '@angular/common/http';
import { LoginDTO } from 'src/dto/logindto';
import { Observable } from 'rxjs';
import { TeamDTO } from 'src/dto/teamdto';

/**
 * I service sono decorati da @Injectable. 
 * Qui trovate, oltre ai metodi ereditati dall'Abstract,
 *  il metodo per il login (in mirror con il backend). 
 * 
 * @author Vittorio Valent
 * 
 * @see AbstractService
 */
@Injectable({
  providedIn: 'root'
})
export class UserService extends AbstractService<UserDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'user';
  }

  login(loginDTO: LoginDTO): Observable<UserDTO> {
    return this.http.post<any>('http://localhost:8080/' + this.type + '/login', loginDTO)
  }
  
 Team(TeamDTO: TeamDTO): Observable<TeamDTO>{
  return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', TeamDTO )
}
findByName(nome:string):Observable<any>{
  return this.http.get<UserDTO>('http://localhost:' + this.port + '/' + this.type + '/findByName?username=' + name);
}

}
