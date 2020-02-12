package it.contrader.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.User;


 public class SignUpDAO {
	 private String QUERY_INSERT = "INSERT INTO user (username, password) VALUES (?,?)";
		public boolean SignUp(User userToInsert) {
			Connection connection = ConnectionSingleton.getInstance();
			try {	
				PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
				preparedStatement.setString(1, userToInsert.getUsername());
				preparedStatement.setString(2, userToInsert.getPassword());
				
				preparedStatement.execute();
				return true;
			} catch (SQLException e) {
				return false;
			}

		}

		
		}