package basics;
import java.sql.*;
import utilities.ConnectionFactory;

public class StudentLoginDAO 
{
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	public boolean checkLogin(String uname, String spwd) 
	{
		boolean flag = false;
		String select_query = "select * from stud_reg where uname='"+ uname +"'and spwd = '"+spwd+"'"; 
		try {
			ConnectionFactory con = new ConnectionFactory();
			conn = con.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(select_query);
			
			if(rs.next()) {
				flag = true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
}
