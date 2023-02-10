package utilities;

import java.sql.*;

public class ConnectionFactory 
{
	Connection con = null;
	public Connection getConn()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","anky","anky");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
