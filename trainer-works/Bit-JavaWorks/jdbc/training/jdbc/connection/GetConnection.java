package training.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {

	static Connection connection; 
	public ResultSet rs, rs1, rs2; 
	public PreparedStatement ps, ps1, ps2; 
	
	
	
	public static Connection getMysqlConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			connection = DriverManager.getConnection("jdbc:mysql://localhost/sapientdb",
						"root", "kanchan");
			
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null; 
	}
	
	public static Connection getOracleConnection() {
		return null; 
	}
}
