import{UserDTO} from './userdto';
import { from } from 'rxjs';
import { ProjectDTO } from './projectdto';

export class TeamDTO{
    
    idt: number;
    idc: ProjectDTO;/**id del progetto */
    nometeam: string;

    descrizione: string;
    username: UserDTO;
    numeroutenti: string;
   /**teamUser: UserDTO = new UserDTO();
    teamProj: ProjectDTO =new ProjectDTO();*/
}