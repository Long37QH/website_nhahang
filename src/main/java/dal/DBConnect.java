package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	protected Connection connection;
	public DBConnect() {
		String name = "root";
		String pass = "123456789";
		String url = "jdbc:mysql://localhost:3308/nhahang";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,name,pass);
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (SQLException e) {
			e.printStackTrace();
			}
	}

}
