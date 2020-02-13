package it.contrader.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.NewTeamModel;
import it.contrader.service.NewTeamService;


 public class NewTeamDAO {
	 private String QUERY_INSERT = "INSERT INTO utentiteam(idteam, iduser, usertype ) VALUES (?,?,?)";
	 private String QUERY_DELETE = "DELETE FROM utentiteam WHERE iduser=? AND idteam=?";
	 private String QUERY_READ = "INSERT INTO utentiteam(idteam, iduser, usertype ) VALUES (?,?,?)";
	 private String QUERY_UP = "INSERT INTO utentiteam(idteam, iduser, usertype ) VALUES (?,?,?)";
	 public boolean newTeam(NewTeamModel us) {
			Connection connection = ConnectionSingleton.getInstance();
			try {	
				//System.out.println(us.toString());
				// debugging scrrivi in console cosa arriva 
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
				preparedStatement.setString(2, Integer.toString(us.getIduser()));
				preparedStatement.setString(1, Integer.toString(us.getIdteam()));
				preparedStatement.setString(3, us.getUsertype());
				preparedStatement.execute();
				return true;
			} catch (SQLException e) {
				return false;
			}

		}
}