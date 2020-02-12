package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Team;

public class TeamDAO {
		private final String QUERY_ALL = "SELECT * FROM team";
		private final String QUERY_CREATE = "INSERT INTO team (nometeam, descrizione, numeroutenti) VALUE (?,?,?)";
		private final String QUERY_READ = "SELECT * FROM team WHERE id=?";
		private final String QUERY_UPDATE = "UPDATE team SET nometeam=?, descrizione=?";
		private final String QUERY_DELETE = "DELETE FROM team WHERE od=?";
		
		public TeamDAO() {
			
		}
		
		public List<Team> getall() {
			List<Team> teamList = new ArrayList<>();
			Connection connection = ConnectionSingleton.getInstance();
			try {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QUERY_ALL);
				Team team;
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String nometeam = resultSet.getString("nometeam");
					String descrizione = resultSet.getString("descrizione");
					String numeroutenti = resultSet.getString("numeroutenti");
					team = new Team(nometeam, descrizione, numeroutenti);
					team.setId(id);
					teamList.add(team);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return teamList;
		}
		
		public boolean insert(Team teamToInsert) {
			Connection connection = ConnectionSingleton.getInstance();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
				preparedStatement.setString(1, teamToInsert.getNometeam());
				preparedStatement.setString(2, teamToInsert.getDescrizione());
				preparedStatement.setString(3, teamToInsert.getNumeroutenti());
				preparedStatement.execute();
				return true;
			}catch (SQLException e) {
				return false;
				}
			}
			
			
			public Team read(int teamId) {
				Connection connection = ConnectionSingleton.getInstance();
				try {
	
					PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
					preparedStatement.setInt(1, teamId);
					ResultSet resultSet = preparedStatement.executeQuery();
					resultSet.next();
					String nometeam, descrizione, numeroutenti;
			
					nometeam = resultSet.getString("nometeam");
					descrizione = resultSet.getString("descrizione");
					numeroutenti = resultSet.getString("numeroutenti");
					Team team = new Team(nometeam, descrizione, numeroutenti);
					team.setId(resultSet.getInt("id"));
					
					return team;
					}catch (SQLException e) {
						return null;
					}
			}
		
		public boolean update(Team teamToUpdate) {
			Connection connection = ConnectionSingleton.getInstance();
			
			if(teamToUpdate.getId() == 0)
				return false;
			
			Team teamRead = read(teamToUpdate.getId());
			if (!teamRead.equals(teamToUpdate)) {
				try {
					
					if (teamToUpdate.getNometeam() == null || teamToUpdate.getNometeam().equals("")) {
						teamToUpdate.setNometeam(teamRead.getNometeam());
					}
					
					if (teamToUpdate.getDescrizione() == null || teamToUpdate.getDescrizione().equals("")) {
						teamToUpdate.setDescrizione(teamRead.getDescrizione());
					}
					
					if(teamToUpdate.getNumeroutenti() == null || teamToUpdate.getNumeroutenti().equals("")) {
					   teamToUpdate.setNumeroutenti(teamRead.getNumeroutenti());
					}
					
					PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
					preparedStatement.setString(1, teamToUpdate.getNometeam());
					preparedStatement.setString(2, teamToUpdate.getDescrizione());
					preparedStatement.setString(3, teamToUpdate.getNumeroutenti());
					preparedStatement.setInt(4, teamToUpdate.getId());
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
		
		public boolean delete(int id) {
			Connection connection = ConnectionSingleton.getInstance();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
				preparedStatement.setInt(1, id);
				int n = preparedStatement.executeUpdate();
				if (n != 0)
					return true;
			}catch (SQLException e) {
				
			}
			return false;
			
		}
		
			
}
