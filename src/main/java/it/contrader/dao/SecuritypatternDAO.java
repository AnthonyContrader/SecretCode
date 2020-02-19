package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import it.contrader.utils.ConnectionSingleton;
import it.contrader.model.Securitypattern;

public class SecuritypatternDAO {
	
		private final String QUERY_ALL = "SELECT * FROM securitypattern";
		private final String QUERY_CREATE = "INSERT INTO securitypattern (nome, tipo) VALUE (?,?)";
		private final String QUERY_READ = "SELECT * FROM securitypattern WHERE id=?";
		private final String QUERY_UPDATE = "UPDATE securitypattern SET nome=?, tipo=? where id=?";
		private final String QUERY_DELETE = "DELETE FROM securitypattern WHERE id=?";
		
		public SecuritypatternDAO() {
			
		}
		
		public List<Securitypattern> getall() {
			List<Securitypattern> securitypatternList = new ArrayList<>();
			Connection connection = ConnectionSingleton.getInstance();
			try {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(QUERY_ALL);
				Securitypattern securitypattern;
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String nome = resultSet.getString("nome");
					String tipo = resultSet.getString("tipo");
					securitypattern = new Securitypattern(nome, tipo);
					securitypattern.setId(id);
					securitypatternList.add(securitypattern);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return securitypatternList;
		}
		
		public boolean insert(Securitypattern securitypatternToInsert) {
			Connection connection = ConnectionSingleton.getInstance();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
				preparedStatement.setString(1, securitypatternToInsert.getNome());
				preparedStatement.setString(2, securitypatternToInsert.getTipo());
				preparedStatement.execute();
				return true;
			}catch (SQLException e) {
				return false;
				}
			}
			
			
			public Securitypattern read(int Id) {
				Connection connection = ConnectionSingleton.getInstance();
				try {
	
					PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
					preparedStatement.setInt(1, Id);
					ResultSet resultSet = preparedStatement.executeQuery();
					resultSet.next();
					String nome, tipo;
			
					nome = resultSet.getString("nome");
					tipo = resultSet.getString("tipo");
					Securitypattern securitypattern = new Securitypattern(nome, tipo);
					securitypattern.setId(resultSet.getInt("id"));
					
					return securitypattern;
					}catch (SQLException e) {
						return null;
					}
			}
		
		public boolean update(Securitypattern securitypatternToUpdate) {
			Connection connection = ConnectionSingleton.getInstance();
			
			if(securitypatternToUpdate.getId() == 0)
				return false;
			
			Securitypattern securitypatternRead = read(securitypatternToUpdate.getId());
			if (!securitypatternRead.equals(securitypatternToUpdate)) {
				try {
					
					if (securitypatternToUpdate.getNome() == null || securitypatternToUpdate.getNome().equals("")) {
						securitypatternToUpdate.setNome(securitypatternRead.getNome());
					}
					
					if (securitypatternToUpdate.getTipo() == null || securitypatternToUpdate.getTipo().equals("")) {
						securitypatternToUpdate.setTipo(securitypatternRead.getTipo());
					}
				
					
					PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
					preparedStatement.setString(1, securitypatternToUpdate.getNome());
					preparedStatement.setString(2, securitypatternToUpdate.getTipo());
					preparedStatement.setInt(3, securitypatternToUpdate.getId());
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

	