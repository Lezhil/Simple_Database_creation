package Crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class pro_2 {

	public static void main(String[] args) throws Exception
	{
		String jdbcURL ="jdbc:mysql://localhost:3306/sampledb";
		String dbusername ="root";
		String dbpassword="";
		
		Connection con=DriverManager.getConnection(jdbcURL,dbusername,dbpassword);
		String sql="SELECT*FROM users";
		Statement stt = con.createStatement();
		ResultSet result = stt.executeQuery(sql);
		
		while(result.next())
		{
			int user_id=result.getInt("user_id");
			String username =result.getString("username");
			String fullname=result.getString("fullname");
			String email=result.getString("email");
			String password=result.getString("password");
			System.out.println(user_id+":"+username+":"+fullname+":"+email+":"+password+":"); 
		
		}
		
		
		con.close();
	}

}
