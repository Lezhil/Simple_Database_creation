package Crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class pro_3 {

	public static void main(String arg[])throws Exception{
		
		String jdbcURL ="jdbc:mySql://127.0.0.1:3306/sampledb?serverTimezone=UTC";
		String dbusername="root";
		String dbpassword="";
		int user_id=1;
		String username="MSD";
		String password ="ms1234";
		String fullname =" M.S.Dhoni";
		String email ="mr.ipl@gmail.com";
		Connection con=DriverManager.getConnection(jdbcURL,dbusername,dbpassword);
		/*String sql="UPDATE users SET password='lezhil'WHERE username='john'";// this is one method
		Statement state= con.createStatement();
		int rows=state.executeUpdate(sql);
		if(rows>0) {
			System.out.println("The users information has been updated");
		}*/
		
		String Sql= " UPDATE users SET username=?,password=? , fullname=? ,email=? WHERE user_id=?";
		PreparedStatement statement =con.prepareStatement(Sql);
		statement.setString(1, password);
		statement.setString(2, fullname);
		statement.setString(3, email);
		statement.setString(4, username);
		statement.setInt(5, user_id);
		int rows=statement.executeUpdate();
		if(rows>0) {
			System.out.println("The Users's information has been updated.");
		}
		con.close();
	}
}
