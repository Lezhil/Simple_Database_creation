package Crud_operations;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class pro_1 {

	public static void main(String[] args) throws Exception 
	{
		
		
		String jdbcUrl ="jdbc:mysql://127.0.0.1:3306/sampledb?serverTimezone=UTC";
		String userName = "root";
		String dbpassword = "";
		// Another to insert data into the table
		int user_id=01;
		String username= "john";
		String email = "john123@gmail.com";
		String fullname = " john mirssion";
		String password ="12345678";
		Connection connection=DriverManager.getConnection(jdbcUrl,userName,dbpassword);
		String sql ="INSERT INTO users(user_id,username,email,fullname,password)"
				+"VALUES(?,?,?,?,?)";
		PreparedStatement state = connection.prepareStatement(sql);
		state.setInt(1, user_id);
		state.setString(2, username);
		state.setString(3, email);
		state.setString(4, fullname);
		state.setString(5, password);
		int rows = state.executeUpdate();
		
		// one way to insert method
		/*String sql = "INSERT INTO users  (user_id,username,email,fullname,password)"
				+" VALUES( 01,'lezhil','lezhil898@gmail.com','Lezhilarasan','mysecret')";
		
		Statement statement = connection.createStatement();
		int rows=statement.executeUpdate(sql);*/
		
		if(rows>0) {
			System.out.println("A new user has been inserted successfully");
		}
		connection.close();
		
//			if(connection !=null)  //this is for check a connection
//			{
//				System.out.println("Connected to the database");
//				connection.close();
//			}
	}

}
