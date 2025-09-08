

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

/**
 * Servlet implementation class Cust_H
 */
public class Cust_H extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		 
		 
		 
		DBCon db=new DBCon();
		try
		{
		out.print("<table border='1'>");
		out.print("<th>Emp ID</th>");
		out.print("<th>Emp Name</th>");
		ResultSet rs=db.ResultSetCon();
		
		 
		while(rs.next())
		{
			
			out.print("<tr><td>"+rs.getString(1)+"</td>");
			out.print("<td>"+rs.getString(2)+"</td></tr>");
			 
		}
		out.print("</table>");
		}
		catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

}
