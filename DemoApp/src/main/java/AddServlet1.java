

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;


public class AddServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 String userid=request.getParameter("txtuserid");
		 String password=request.getParameter("txtpassword");
		 
		 
		 
		DBCon db=new DBCon();
		try
		{
		ResultSet rs=db.ResultSetCon();
		while(rs.next())
		{
			String uid=rs.getString(1);
			String pass=rs.getString(2);
			if(userid.equals(uid)&& password.equals(pass))
					{
					response.sendRedirect("Cust_H");
					}
		}
		}
		catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

}
