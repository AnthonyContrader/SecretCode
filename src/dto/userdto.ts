import {Usertype} from './usertype';
import{TeamDTO} from'./teamdto';
import { from } from 'rxjs';
/**
 * Classe DTO di User. DEVE essere uguale (stesso nome classe, stessi attributi e stessi nomi) a
 * quello nel backend. 
 * 
 * @see Usertype
 * 
 * @author Vittorio Valent
 */
export class UserDTO {

   id: number;

   username: string;

   password: string;

   usertype: Usertype;
   getSearchString() : string{
      return this.id.toString()+this.username+this.password+this.usertype;
   }
   teamUser: TeamDTO = new TeamDTO();
}

