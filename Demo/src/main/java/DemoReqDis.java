

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

 
public class DemoReqDis extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	/*RequestDispatcher rd=request.getRequestDispatcher("DemoDis");
		rd.forward(request, response);*/
		String str="Haridas Namedev Mane";
		/*response.sendRedirect("DemoDis?str="+str);*/
		
		HttpSession session=request.getSession();
		session.setAttribute("Name",str);
		response.sendRedirect("DemoDis");
		
	}

	 

}
