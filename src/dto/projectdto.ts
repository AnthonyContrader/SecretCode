import{TeamDTO} from './teamdto';
import { from } from 'rxjs';

export class ProjectDTO {

    idc: number; /**id del progetto in relazione con il team  */

    nome: string;
     team_id: number;
     project_id: number;
    descrizione: string;
    /**teamProj: TeamDTO = new TeamDTO();*/
}