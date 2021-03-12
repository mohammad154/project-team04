package gui;


import config.databaseConfig;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.User;


public class Database {
    public static Connection connection = null;
    public Database() throws SQLException{
        try{
         connection = DriverManager.getConnection(databaseConfig.CONNECTION_URL, databaseConfig.USERNAME, databaseConfig.PASSWORD);
    }
        catch (SQLException throwables) {
			throwables.printStackTrace();
		}
    }
    
    public static ArrayList<User> sellectAllUsers(){
        try{
            var users = new ArrayList<User>();
         Statement statement = (Statement) connection.createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
         
         while(resultSet.next())
         {
             User user = new User(resultSet.getString("username"), resultSet.getString("password"));
             users.add(user);
         }
         
         return users;
        }
        catch (SQLException throwables)
        {
              throwables.printStackTrace();
              return new ArrayList<>();
        }
        
        
    }
    
    public static void insertIntoUser(User user) {
		try {
			PreparedStatement statement = connection.prepareStatement("INSERT INTO user VALUES(?, ?)");
			statement.setString(1, user.Username);
			statement.setString(2, user.Password);
			
			statement.executeUpdate();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
    
    public static User getUserByUsername(String username) {
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE username = ?");
			statement.setString(1, username);
			
			ResultSet resultSet = statement.executeQuery();
			
			if (resultSet.next())
				return new User(resultSet.getString("username"), resultSet.getString("password"));
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		
		return null;
	}
}
