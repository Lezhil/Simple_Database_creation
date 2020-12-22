package Crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class pro_4 {
					
				public static void main(String arg[]) throws Exception
				{
					String jdbcURL="jdbc:mysql://localhost:3306/sampledb";
					String dbUsername ="root";
					String dbPassword ="";
					int user_id=1;
					Connection con=DriverManager.getConnection(jdbcURL,dbUsername,dbPassword);
					
					String sql="DELETE FROM users WHERE user_id=?";
					PreparedStatement statement = con.prepareStatement(sql);
					statement.setInt(1, user_id);
					int rows = statement.executeUpdate();
					if(rows>0)
					{
						System.out.println("The users information has been deleted ");
					}
					con.close();
				}
}
