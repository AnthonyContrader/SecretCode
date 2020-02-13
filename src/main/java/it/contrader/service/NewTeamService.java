package it.contrader.service;//controller-Dao
import it.contrader.dao.NewTeamDAO;
import it.contrader.model.NewTeamModel;
import it.contrader.dto.NewTeamDTO;
import it.contrader.converter.NewTeamConverter;
public class NewTeamService {

	private NewTeamDAO newTeamDAO;
	private NewTeamConverter newTeamConverter;
	public NewTeamService() {
		this.newTeamConverter=new NewTeamConverter();
		this.newTeamDAO = new NewTeamDAO();
	}

	public boolean insert(NewTeamDTO newTeamDTO) {
		NewTeamModel newTeamModel = this.newTeamConverter.toEntity(newTeamDTO);
		return this.newTeamDAO.newTeam(newTeamModel);
	}
}
