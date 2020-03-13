import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { UserDTO } from 'src/dto/userdto';
import { HttpClient } from '@angular/common/http';
import { LoginDTO } from 'src/dto/logindto';
import{SignUpDTO} from 'src/dto/signUpdto';
import { Observable } from 'rxjs';
import { NewTeamDTO } from 'src/dto/NewTeamdto';
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
  signUp(userDTO: UserDTO): Observable<UserDTO> {
    return this.http.post<any>('http://localhost:8080/' + this.insert + '/insert', userDTO)  //aggiunto io
  }
  NewTeam(TeamDTO: TeamDTO): Observable<TeamDTO>{
  return this.http.post<any>('http://localhost:8080'+this.insert + '/insert', TeamDTO )
}
}
