package basics;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.*;
import java.sql.SQLException;
import utilities.ConnectionFactory;
import basics.*;

public class StudentLoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			String uname = request.getParameter("uname");
			String spwd = request.getParameter("spwd");
			
			HttpSession session = request.getSession();
			session.setAttribute("uname", spwd);
			
			StudentLoginDAO sdao = new StudentLoginDAO();
			boolean flag = sdao.checkLogin(uname, spwd);
			
			if(uname.equals("uname") && spwd.equals("spwd")) 
			{
				response.sendRedirect("Admin.jsp");
				session.setAttribute("uname", uname);
			}
			else
			{
				if(flag==true) {
					response.sendRedirect("studentmain.jsp");
				} else {
					response.sendRedirect("error.jsp");
				}
			}
	}
}
