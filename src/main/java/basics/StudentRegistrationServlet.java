package basics;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import utilities.ConnectionFactory;


public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentRegistrationServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection conn;
		try {
			ConnectionFactory con = new ConnectionFactory();
		    conn = con.getConn();
		    
			String s1 = request.getParameter("suname");
			String s2 = request.getParameter("phno");
			String s3 = request.getParameter("uname");
			String s4 = request.getParameter("semail");
			String s5 = request.getParameter("spwd");
			
			PreparedStatement pstmt = conn.prepareStatement("insert into stud_reg values(?,?,?,?,?)");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			pstmt.setString(3, s3);
			pstmt.setString(4, s4);
			pstmt.setString(5, s5);
			pstmt.executeUpdate();
		
			response.sendRedirect("studentlogin.jsp");
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
