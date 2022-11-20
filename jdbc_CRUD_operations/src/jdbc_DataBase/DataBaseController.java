package jdbc_DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseController {

	public DataBaseController(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getconnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
		
	}
}
