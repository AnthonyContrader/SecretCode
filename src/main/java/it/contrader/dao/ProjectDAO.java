package it.contrader.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Project;

public class ProjectDAO {
	//Query Strings
	private final String QUERY_ALL    = "SELECT * FROM project";
	private final String QUERY_CREATE = "INSERT INTO project (name, url, description) VALUES (?,?,?)";
	private final String QUERY_READ   = "SELECT * FROM project WHERE id=?";
	private final String QUERY_UPDATE = "UPDATE project SET name=?, url=?, description=? WHERE id=?";
	private final String QUERY_DELETE = "DELETE FROM project WHERE id=?";
	//Projects
	public List<Project> getAll() {
		List<Project> projectList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Project project;
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name        = resultSet.getString("name");
				String url 		   = resultSet.getString("url");
				String description = resultSet.getString("description");
				project = new Project(name, url, description);
				project.setId(id);
				projectList.add(project);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return projectList;
	}
	//Create
	public boolean create(Project project) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setString(1, project.getName());
			preparedStatement.setString(2, project.getUrl());
			preparedStatement.setString(3, project.getDescription());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	//Read
	public Project read(int id) {
		Connection connection = ConnectionSingleton.getInstance();
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			String name, url, description;
	
			name            = resultSet.getString("username");
			url             = resultSet.getString("password");
			description     = resultSet.getString("usertype");
			Project project = new Project(name, url, description);
			project.setId(resultSet.getInt("id"));
	
			return project;	
		}catch (SQLException e) {
			return null;
		}
	}
	//Update
	public boolean update(Project project) {

		Connection connection = ConnectionSingleton.getInstance();

		if (project.getId() == 0)
			return false;

		Project rProject = read(project.getId());
		if (!rProject.equals(project)) {
			try {
				if (project.getName() == null || project.getName().equals("")) {
					project.setName(project.getName());
				}

				if (project.getUrl() == null || project.getUrl().equals("")) {
					project.setUrl(project.getUrl());
				}

				if (project.getDescription() == null || project.getDescription().equals("")) {
					project.setDescription(project.getDescription());
				}

				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setString(1, project.getName());
				preparedStatement.setString(2, project.getUrl());
				preparedStatement.setString(3, project.getDescription());
				preparedStatement.setInt(4, project.getId());
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
	//Delete
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
