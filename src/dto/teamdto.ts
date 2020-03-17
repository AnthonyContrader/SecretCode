import{UserDTO} from './userdto';
import { from } from 'rxjs';
import { ProjectDTO } from './projectdto';

export class TeamDTO{
    
    idt: number;

    nometeam: string;

    descrizione: string;

    numeroutenti: string;
    teamUser: UserDTO = new UserDTO();
    teamProj: ProjectDTO =new ProjectDTO();
}