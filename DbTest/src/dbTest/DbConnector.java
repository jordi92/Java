package dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public DbConnector(){
		try {
			String url = "jdbc:mysql://localhost:3306/java";
			String login = "root";
			String password = "";
			con = DriverManager.getConnection(url, login, password);
			stmt = con.createStatement();
			
			ResultSet result = stmt.executeQuery("SELECT * FROM test");
			ResultSetMetaData md = result.getMetaData();
			int columnCount = md.getColumnCount();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
