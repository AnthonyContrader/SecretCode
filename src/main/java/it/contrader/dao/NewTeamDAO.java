package it.contrader.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.NewTeamModel;


//BARBARA: DAO per il CRUD degli utenti del team
 public class NewTeamDAO {
	 private String QUERY_INSERT = "INSERT INTO utentiteam(idteam, iduser, usertype ) VALUES (?,?,?)";
	 private String QUERY_DELETE = "DELETE FROM utentiteam WHERE iduser=? AND idteam=?";
	 private String QUERY_UP = "UPDATE utentiteam SET idteam=idteam, iduser=iduser, usertype=? WHERE idteam = ? AND iduser = ?";
	 private final String QUERY_READ   = "SELECT * FROM utentiteam WHERE iduser=?";
	 public boolean insert(NewTeamModel newTeamDAO) {
			Connection connection = ConnectionSingleton.getInstance();
			try {	
				//System.out.println(NewTeamDAO.toString());
				// debugging scrrivi in console cosa arriva 
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
				preparedStatement.setString(2, Integer.toString(newTeamDAO.getIduser()));
				preparedStatement.setString(1, Integer.toString(newTeamDAO.getIdteam()));
				preparedStatement.setString(3, newTeamDAO.getUsertype());
				preparedStatement.execute();
				return true;
			} catch (SQLException e) {
				return false;
			}

		}
	 public boolean delete(NewTeamModel newTeamDAO) {
			Connection connection = ConnectionSingleton.getInstance();
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
				preparedStatement.setString(1, Integer.toString(newTeamDAO.getIduser()));
				preparedStatement.setString(2,Integer.toString(newTeamDAO.getIdteam()));
				preparedStatement.execute();
				return true;
			}catch (SQLException e) {
			}
			return false;
		}
	 
	 public NewTeamModel read(int iduser) {
		 Connection connection = ConnectionSingleton.getInstance();
			try{
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
				preparedStatement.setInt(1, iduser);
				ResultSet resultSet = preparedStatement.executeQuery();
				resultSet.next();
				
				String usertype;
		
				int idteam = resultSet.getInt("idteam");
			    iduser          = resultSet.getInt("iduser");
				usertype     = resultSet.getString("usertype");
				NewTeamModel newTeamModel = new NewTeamModel(iduser,idteam, usertype);
				return newTeamModel;	
			}catch (SQLException e) {
				return null;
			}
	 }

	 public boolean update(NewTeamModel newTeamModel) {
		 
			Connection connection = ConnectionSingleton.getInstance();

			if (newTeamModel.getIduser() == 0 || newTeamModel.getIdteam()==0)
				return false;
            
			NewTeamModel rnewTeamModel = read(newTeamModel.getIduser());
			if (!rnewTeamModel.equals(newTeamModel)) {
				try {
					if (newTeamModel.getIduser() == 0) {
						newTeamModel.setIduser(newTeamModel.getIduser());
					}

					if (newTeamModel.getIdteam() == 0) {
						newTeamModel.setIdTeam(newTeamModel.getIdteam());
					}

					if (newTeamModel.getUsertype() == null || newTeamModel.getUsertype().equals("")) {
						newTeamModel.setUsertype(newTeamModel.getUsertype());
					}

					PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UP);
					preparedStatement.setInt(2, newTeamModel.getIdteam());
					preparedStatement.setInt(3, newTeamModel.getIduser());
					preparedStatement.setString(1, newTeamModel.getUsertype());
					int a = preparedStatement.executeUpdate();
					if (a > 0)
						return true;
					else
						return false;

				}catch (SQLException e) {
					return false;
				}
			}
			return false;
		}

	 
}