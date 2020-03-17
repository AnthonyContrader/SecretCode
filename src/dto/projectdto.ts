import{TeamDTO} from './teamdto';
import { from } from 'rxjs';

export class ProjectDTO {

    idc: number;

    nome: string;
     
    descrizione: string;
    teamProj: TeamDTO = new TeamDTO();
}