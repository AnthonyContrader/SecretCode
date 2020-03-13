
import { TeamDTO } from './teamdto';
import { UserDTO } from './userdto';



export class NewTeamDTO {
	id: number;
	username: string;
	nometeam:string;
	teamRole: string;
	location: UserDTO = new UserDTO();
	location1: TeamDTO = new TeamDTO();


}
